package devops.seminar.jenkins_demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloServiceImplTest {

    @Test
    void getHello() {
        HelloService helloService = new HelloServiceImpl();
        String result = helloService.getHello();
        assertEquals("Hello World", result);
    }
}