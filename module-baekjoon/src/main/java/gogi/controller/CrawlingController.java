package gogi.controller;


import com.querydsl.jpa.impl.JPAQueryFactory;
import gogi.domain.Member;
import gogi.domain.QMember;
import jakarta.persistence.EntityManager;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CrawlingController {

    @Autowired
    EntityManager em;
    JPAQueryFactory query;

    @GetMapping("/boj")
    public ResponseEntity<String> crawling() {
        query = new JPAQueryFactory(em);
        QMember m = new QMember("m");
        List<Member> fetch = query
            .selectFrom(m)
            .fetch();
        for (Member member : fetch) {
            System.out.println("member = " + member);
        }
        System.out.println("asdjgq;gjkoqj");
        return ResponseEntity.ok("대충 크롤링 API");
    }
}
