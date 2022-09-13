package code.shubham.exceptions;

public class BackendAlreadyExistsException extends RuntimeException {
    public BackendAlreadyExistsException(String name) {
        super(String.format("Backend already exists with name: %s", name));
    }
}
