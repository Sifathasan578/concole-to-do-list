package project;

public class Task {

    private long id;
    private String message;
    private String date;

    public Task(long id, String message, String date) {
        this.id = id;
        this.message = message;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }

    public long getId() {
        return id;
    }
}
