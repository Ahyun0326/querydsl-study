package study.querydsl.repository;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import study.querydsl.dto.MemberSearchCond;
import study.querydsl.dto.MemberTeamDto;

public interface MemberRepositoryCustom {

  List<MemberTeamDto> search(MemberSearchCond condition);
  Page<MemberTeamDto> searchWithPaging(MemberSearchCond condition, Pageable pageable);

}
