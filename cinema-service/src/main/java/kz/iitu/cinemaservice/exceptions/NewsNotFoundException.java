package kz.iitu.cinemaservice.exceptions;

import org.postgresql.util.PSQLException;
import org.postgresql.util.PSQLState;

public class NewsNotFoundException extends PSQLException {

    public NewsNotFoundException(){
        super("News not found", PSQLState.DATA_ERROR);
    }

    public NewsNotFoundException(String s){
        super(s, PSQLState.UNKNOWN_STATE);
    }
}
