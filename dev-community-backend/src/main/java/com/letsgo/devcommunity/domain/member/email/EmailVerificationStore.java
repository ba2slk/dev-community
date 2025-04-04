package com.letsgo.devcommunity.domain.member.email;

import java.time.Duration;

public interface EmailVerificationStore {

    void saveCode(String email, String code, Duration ttl);

    void verifyCode(String email, String code);

    boolean isVerified(String email);
}
