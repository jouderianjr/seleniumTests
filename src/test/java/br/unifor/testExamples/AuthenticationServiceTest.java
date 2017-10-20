package br.unifor.testExamples;

import org.junit.jupiter.api.*;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class AuthenticationServiceTest {
    @Mock
    private Database database;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void signinSuccess() {

    }

    @Test
    public void signinFailed() {
    }
}
