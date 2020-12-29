package io.vertx.core.json;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class JsonTest {

  @Test
  public void testJsonFromString() {
    String simpleJson = "{\"testField:\" : \"testValue\", \"integerField:\" : 123}";
    TestPojo testPojo;
    try {
      testPojo = Json.decodeValue(simpleJson, TestPojo.class);
      assertEquals(testPojo.getTestField(), "testValue");
      assertEquals(testPojo.getIntegerField(), 123);
    } catch (Exception ex) {

      fail();
    }
  }

  public class TestPojo {

    private String testField;
    private int integerField;

    public String getTestField() {
      return testField;
    }

    public void setTestField(String testField) {
      this.testField = testField;
    }

    public int getIntegerField() {
      return integerField;
    }

    public void setIntegerField(int integerField) {
      this.integerField = integerField;
    }
  }
}
