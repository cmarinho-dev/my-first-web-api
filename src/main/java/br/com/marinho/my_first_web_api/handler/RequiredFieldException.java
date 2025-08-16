package br.com.marinho.my_first_web_api.handler;

import java.util.Locale;

public class RequiredFieldException extends BusinessException{
    public RequiredFieldException(String fieldName) {
        super("The %s field is required",fieldName.toUpperCase());
    }
}
