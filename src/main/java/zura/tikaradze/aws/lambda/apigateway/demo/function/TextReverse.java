package zura.tikaradze.aws.lambda.apigateway.demo.function;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class TextReverse {

    @Bean
    public Function<APIGatewayProxyRequestEvent, String> textReverser() {

        return (input) -> new StringBuilder(input.getQueryStringParameters().get("text")).reverse().toString();
    }


}
