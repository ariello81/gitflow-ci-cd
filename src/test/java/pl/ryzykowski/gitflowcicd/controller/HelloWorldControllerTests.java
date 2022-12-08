package pl.ryzykowski.gitflowcicd.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class HelloWorldControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnHelloAndName() throws Exception {
        String name = "Ariel";
        this.mockMvc
                .perform(get("/api/hello/{name}", name))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("Hello " + name));
    }

}
