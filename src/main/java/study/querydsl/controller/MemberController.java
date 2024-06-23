package study.querydsl.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import study.querydsl.dto.MemberSearchCond;
import study.querydsl.dto.MemberTeamDto;
import study.querydsl.repository.MemberJpaRepository;
import study.querydsl.repository.MemberRepository;

@RestController
@RequiredArgsConstructor
public class MemberController {

  private final MemberJpaRepository memberJpaRepository;
  private final MemberRepository memberRepository;

  @GetMapping("v1/members")
  public List<MemberTeamDto> searchMemberV1(MemberSearchCond condition) {
    return memberJpaRepository.search(condition);
  }

  @GetMapping("v2/members")
  public Page<MemberTeamDto> searchMemberV2(MemberSearchCond condition, Pageable pageable) {
    return memberRepository.searchWithPaging(condition, pageable);
  }
}
