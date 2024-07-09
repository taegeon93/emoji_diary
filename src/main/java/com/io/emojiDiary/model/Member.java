package com.io.emojiDiary.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Member {
    private long userNo;
    private String userId;
    private String userPw;
    private String userName;
    private String phone;
    private String nickName;
    private String deleteYn;

}
