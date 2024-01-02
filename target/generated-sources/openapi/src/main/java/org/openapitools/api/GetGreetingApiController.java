package org.openapitools.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-03T02:26:42.068745+08:00[Asia/Singapore]")
@Controller
@RequestMapping("${openapi.sIMPLE.base-path:}")
public class GetGreetingApiController implements GetGreetingApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public GetGreetingApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
