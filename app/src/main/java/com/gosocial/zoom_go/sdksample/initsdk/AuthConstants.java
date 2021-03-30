package com.gosocial.zoom_go.sdksample.initsdk;

public interface AuthConstants {

    // TODO Change it to your web domain
    public final static String WEB_DOMAIN = "zoom.us";

    /**
     * We recommend that, you can generate jwttoken on your own server instead of hardcore in the code.
     * We hardcore it here, just to run the demo.
     * <p>
     * You can generate a jwttoken on the https://jwt.io/
     * with this payload:
     * {
     * <p>
     * "appKey": "string", // app key
     * "iat": long, // access token issue timestamp
     * "exp": long, // access token expire time
     * "tokenExp": long // token expire time
     * }
     */
    public final static String SDK_JWTTOKEN = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhdWQiOm51bGwsImlzcyI6ImN0WXhiVE95U0VheEpNX2t6dVNXR2ciLCJleHAiOjI1MjQ2NzQ1NDAsImlhdCI6MTYxNjQ3NzU3M30.YwHZ3mpgqKQkjezJXeyxHg8faXKwLB1cdAF3L7Yqk64";
}
