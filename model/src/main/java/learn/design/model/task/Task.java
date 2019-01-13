package learn.design.model.task;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Task {

    public Task() {
    }

    @Id
    @GeneratedValue()
    private Long id;

    public Task(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
