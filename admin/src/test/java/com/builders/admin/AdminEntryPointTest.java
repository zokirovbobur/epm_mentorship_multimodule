package com.builders.admin;

import com.builders.utils.BuildersUtil;
import junit.framework.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.Properties;

public class AdminEntryPointTest {

    @Test
    public void testHello() {
        InputStream stream = BuildersUtil.class.getClassLoader().getResourceAsStream("admin_config_test.properties");
        Properties properties = new Properties();
        try {
            properties.load(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Assert.assertNotNull(properties.getProperty("test_hello"));
    }

    @Test
    public void testMaths(){
        BigInteger a = new BigInteger("1234567890");
        BigInteger b = new BigInteger("9876543210");
        BigInteger result = MathOperations.addLargeNumbers(a, b);
        assert(result.equals(new BigInteger("11111111100")));
    }

}
