package gr.aueb.cf.eduapp.core.exception;

public class EntityNotFoundException extends AppGenericException{

    private static final String DEFAULD_CODE = "NotFound";

    public EntityNotFoundException (String code, String message) {
        super(code + DEFAULD_CODE, message);
    }
}
