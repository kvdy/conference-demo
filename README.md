Handle Different Environments

application-{profile}.properties
application-dev.properties
application-prod.properties

by passing

-Dspring.profiles.active=dev || prod




@Configuration
public class PersistenceConfiguration {

    @Bean
    public DataSource dataSource() {
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url("jdbc:postgresql://localhost:5432/conference_app");
        System.out.println("My custom datasource bean has been initialized and set ");
        return builder.build();
    }

    
}


