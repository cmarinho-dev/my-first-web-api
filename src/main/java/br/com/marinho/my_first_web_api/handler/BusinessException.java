package br.com.marinho.my_first_web_api.handler;

public class BusinessException extends RuntimeException {
    public BusinessException(String msg) {
        super(msg);
    }
    public BusinessException(String msg, Object ... params) {
        super(String.format(msg, params));
    }
}
