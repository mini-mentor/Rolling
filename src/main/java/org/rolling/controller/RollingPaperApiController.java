package org.rolling.controller;

import lombok.RequiredArgsConstructor;
import org.rolling.domain.RollingPaper;
import org.rolling.dto.rollingpaper.AddRollingPaperRequest;
import org.rolling.dto.rollingpaper.RollingPaperResponse;
import org.rolling.dto.rollingpaper.UpdateRollingPaperRequest;
import org.rolling.service.RollingPaperService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class RollingPaperApiController {
    private final RollingPaperService rollingPaperService;

    @PostMapping("/api/rolling-papers")
    public ResponseEntity<RollingPaper> addRollingPaper(@RequestBody AddRollingPaperRequest request){
        RollingPaper savedRollingPaper = rollingPaperService.save(request);

        //요청한 자원이 성공적으로 생성되었으며 저장된 블로그 글 정보를 응답 객체에 담아 전송
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedRollingPaper);
    }



    @GetMapping("/api/rolling-papers")
    public ResponseEntity<List<RollingPaperResponse>> findAllPapers() {
        List<RollingPaperResponse> papers = rollingPaperService.findAll()
                .stream()
                .map(RollingPaperResponse::new)
                .toList();

        return ResponseEntity.ok()
                .body(papers);
    }

    // GET 요청이 오면 해당 id의 편지글 조회
    @GetMapping("/api/rolling-papers/{id}")
    public ResponseEntity<RollingPaperResponse> findPaper(@PathVariable long id) {
        RollingPaper rollingpaper = rollingPaperService.findById(id);

        return ResponseEntity.ok()
                .body(new RollingPaperResponse(rollingpaper));
    }

    @DeleteMapping("/api/papers/{id}")
    public ResponseEntity<Void> deletePaper(@PathVariable long id) {
        rollingPaperService.delete(id);

        return ResponseEntity.ok()
                .build();
    }

    @PutMapping("/api/rolling-papers/{id}")
    public ResponseEntity<RollingPaper> updatePaper(@PathVariable long id,
                                             @RequestBody UpdateRollingPaperRequest request) {
        RollingPaper updatePaper = rollingPaperService.update(id, request);

        return ResponseEntity.ok()
                .body(updatePaper);
    }
}