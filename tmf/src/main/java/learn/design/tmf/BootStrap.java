package learn.design.tmf;

import learn.design.tmf.database.DatabaseConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class BootStrap {
    private static Logger logger = LoggerFactory.getLogger(BootStrap.class);

    @Bean
    public JdbcTemplate getJdbcTemplate(@Autowired DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }

    @Bean
    public InitializingBean bootstrap(@Autowired DatabaseConfig dbConfig){
        return ()->{
            logger.info("In Bootstrap {}", dbConfig.getTaskTableCreateQuery());
        };
    }
}
