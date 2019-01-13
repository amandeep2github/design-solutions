package learn.design.storage;

import learn.design.model.task.Task;

import java.util.List;
import java.util.Optional;

public interface TaskDao {
    public void save(Task task);
    public void save(List<Task> tasks);
    public Optional<Task> get(Long taskId);
}
