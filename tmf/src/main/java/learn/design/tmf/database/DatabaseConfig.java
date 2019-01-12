package learn.design.tmf.database;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "tmf")
public class DatabaseConfig {

    private String taskTableCreateQuery;

    public void setTaskTableCreateQuery(String taskTableCreateQuery) {
        this.taskTableCreateQuery = taskTableCreateQuery;
    }

    public String getTaskTableCreateQuery() {
        return taskTableCreateQuery;
    }
}
