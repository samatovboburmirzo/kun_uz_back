package g46.kun.uz.exp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler({ServerBadRequestException.class})
    public ResponseEntity<?> handlerException(RuntimeException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }

    @ExceptionHandler({ItemNotFoundException.class})
    public ResponseEntity<?> handlerException(ItemNotFoundException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }
}
