package com.hrm.hrmprj.common.key;

public enum SessionAttributeKey {

    USER_DTO("user.info.session"),
    LOGIN_DTO("login.info.session");

    private final String SESS_KEY;

    SessionAttributeKey(String SESS_KEY) {
        this.SESS_KEY = SESS_KEY;
    }

    public String getSESS_KEY() {
        return SESS_KEY;
    }
}
