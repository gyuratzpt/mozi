
package mozi;

public class Seat {
    private String name;
    private Status status;

    public Seat(String name) {
        this.name = name;
        this.status = Status.URES;
    }

    @Override
    public String toString() {
        return this.name + ":" + this.status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    
}
