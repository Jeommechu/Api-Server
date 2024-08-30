package com.jmt.member.exceptions;

import com.jmt.global.exceptions.CommonException;
import org.springframework.http.HttpStatus;

public class MemberNotFoundException extends CommonException {
    public MemberNotFoundException() {
        super("NotFoun.member", HttpStatus.NOT_FOUND);
        setErrorCode(true);
    }
}
