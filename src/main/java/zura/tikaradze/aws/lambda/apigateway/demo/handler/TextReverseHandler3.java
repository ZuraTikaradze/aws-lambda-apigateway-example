package zura.tikaradze.aws.lambda.apigateway.demo.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class TextReverseHandler3 implements RequestHandler<Object, String> {
    @Override
    public String handleRequest(Object o, Context context) {
        return new StringBuilder(o.toString()).reverse().toString();
    }
}
