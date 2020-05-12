package com.lits.springboot.config;

public class SecurityConstants {
    public static final String SECRET = "SecretKeyToGenJWTs";
    public static final  long EXPIRATION_TIME = 864_000_000; //10 days
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String USER_ID_PARAM = "userId";
    public static final String USER_AUTHORITY_PARAM = "authority";
    public static final String SIGN_UP_URL = "/user/sign-up";

    private SecurityConstants() {
    }

}
