package learn.design.dbserver.storage;

import learn.design.model.task.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {
}
