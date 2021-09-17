package zura.tikaradze.aws.lambda.apigateway.demo.handler;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

public class TextReverseHandler extends SpringBootRequestHandler<APIGatewayProxyRequestEvent, String> {
}
