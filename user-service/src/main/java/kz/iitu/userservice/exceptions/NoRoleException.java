package kz.iitu.userservice.exceptions;

public class NoRoleException extends NullPointerException{

    public NoRoleException() {
        super("Unknown Null Pointer Exception");
    }

    public NoRoleException(String s) {
        super(s);
    }
}
