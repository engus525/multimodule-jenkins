package gogi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class BoardController {

    @GetMapping("/board")
    public ResponseEntity<String> board() {
        return ResponseEntity.ok("대충 게시판 API");
    }
}
