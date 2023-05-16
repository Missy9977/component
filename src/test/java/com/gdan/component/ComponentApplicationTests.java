package com.gdan.component;

import com.gdan.component.chain.ChainManager;
import com.gdan.component.chain.test.ChainConstants;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ComponentApplicationTests {

    @Autowired
    private ChainManager chainManager;

    @Test
    void contextLoads() {
        chainManager.execute("test");
        chainManager.execute(ChainConstants.CHAIN_LOGIN);
        chainManager.execute(ChainConstants.CHAIN_STUDY);
    }

}
