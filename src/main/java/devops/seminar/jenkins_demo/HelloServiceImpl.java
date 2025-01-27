package devops.seminar.jenkins_demo;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String getHello() {
        return "Hello World!";
    }
}
