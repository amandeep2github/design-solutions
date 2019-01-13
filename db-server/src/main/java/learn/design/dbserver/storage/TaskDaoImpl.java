package learn.design.dbserver.storage;

import learn.design.model.task.Task;
import learn.design.storage.TaskDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class TaskDaoImpl implements TaskDao {

    @Autowired
    @Qualifier("taskRepository")
    private TaskRepository taskRepository;
    @Override
    public void save(Task task) {
        taskRepository.save(task);
    }

    @Override
    public void save(List<Task> tasks) {

    }

    @Override
    public Optional<Task> get(Long taskId) {
        return taskRepository.findById(taskId);
    }
}
