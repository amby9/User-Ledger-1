package com.make.my.trip.demo.platform.enums;

import lombok.Getter;

@Getter
public enum ErrorCodes {
    INTERNAL_SERVER_ERROR("Something went wrong","Please retry once and let us know if this happens again","Something went wrong"),
    NO_PATH_POSSIBLE_ERROR("No Path Found for this Route!","Please retry once with another Source & Destination Pair","No Path Found for this Route!"),
    WRONG_CREDENTIAL_ERROR("Wrong credentials provided","Please retry once with correct credentials","Wrong credentials provided");
    private final String message;
    private final String reason;
    private final String errorDescription;

    ErrorCodes(String message, String reason, String errorDescription){
        this.message = message;
        this.reason = reason;
        this.errorDescription = errorDescription;
    }

    public String getMessage() {
        return message;
    }

    public static ErrorCodes getValue(String errorCode){
        if(errorCode==null)
            return null;
        try {
            return ErrorCodes.valueOf(errorCode);
        }catch(IllegalArgumentException e){
            return null;
        }
    }
}
