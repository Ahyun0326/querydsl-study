package study.querydsl.dto;

import lombok.Data;

@Data
public class MemberSearchCond {

  //회원명, 팀명, 나이(ageGoe, ageLoe)

  private String username;
  private String teamName;
  // 값이 null일 수도 있어서 Integer 사용
  private Integer ageGoe;   // 나이가 크거나 같음
  private Integer ageLoe;   // 나이가 작거나 같음
}
