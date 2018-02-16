package linked_list.exceptions;

public class MemoryLimitException extends Exception {
    @Override
    public String getMessage() {
        return "Memory Limit Exceed !";
    }
}
