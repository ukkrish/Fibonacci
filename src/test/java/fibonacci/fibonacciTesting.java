package fibonacci;

import io.restassured.response.ResponseBody;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/**
 * Created by krish on 21/02/2018.
 */
public class fibonacciTesting {

        @Test
        public void getDefaultFibonacciList() {

            int code =  given().contentType("application/json").
                    when().get("http://localhost:7003/fib").getStatusCode();
            System.out.println("\n\n********************************************************************************");
            System.out.println("Test Case 1.a: Status code for http://localhost:7003/fib is : "+code);
            System.out.println("----------------------------------------");
          //  Assert.assertEquals();
            Assert.assertEquals(code, 200);
            System.out.println("Test Case 1.b: Response body for GET method is : ");

            String resp =  given().contentType("application/json").
                    when().get("http://localhost:7003/fib").getBody().print();

            System.out.println("----------------------------------------");
            boolean match = resp.contains("[\"0\",\"1\",\"1\",\"2\",\"3\",\"5\",\"8\",\"13\",\"21\",\"34\"]");

            System.out.println("Test Case 1.c: Did the response data match to expected values >> " + match);
            System.out.println("********************************************************************************\n\n");
        }




        @Test
        public void getMaxFibonacciNumber() {


            int codes = given().
                    contentType("application/json").
                    when().
                    get("http://localhost:7003/fib/999999999/").getStatusCode();

            Assert.assertEquals(codes, 200);
            System.out.println("********************************************************************************");
            System.out.println("Test Case 2.a: Status code for http://localhost:7003/fib/999999999/ is : "+codes);
            System.out.println("----------------------------------------");
            System.out.println("{{  NOTE : after testing, the program seems to be showing output values from 0 index to 999999999.");
            System.out.println("  however, it shows wrong values after index number 93.  ");
            System.out.println("  so, this program shows valid values from index 0 - 93.  }}");
            System.out.println("----------------------------------------");

            ResponseBody resp = given().
                    contentType("application/json").
                    when().get("http://localhost:7003/fib/93/").getBody();

            System.out.println("Test Case 2.b: Response body for GET method with Index 93 is : ");
            Assert.assertEquals(resp.print(), "9223372036854775807");
        //    Assert.assertEquals(resp.print(), "9223372036854775807", "Response for index 93 is not 9223372036854775807");
            System.out.println("********************************************************************************\n\n");
            // System.out.println("MATCHED");
//        if (resp == "9223372036854775807") {
//            System.out.println("MATCHED"+resp);
//        };

        }






        @Test
        public void getFibonacciRanges() {


            int codes = given().
                    contentType("application/json").
                    when().
                    get("http://localhost:7003/fib/range?startIndex=10&finishIndex=15").getStatusCode();

            Assert.assertEquals(codes, 200);
            System.out.println("********************************************************************************");
            System.out.println("Test Case 3.a: Status code for http://localhost:7003/fib/range?startIndex=10&finishIndex=15  is : " + codes);
            System.out.println("----------------------------------------");
            System.out.println("{  NOTE : The Range values are showing valid values from StartIndex=0 to FinishIndex=94.");
            System.out.println("  For test purpose, I have used startIndex=10 and finishIndex=15 in this example.  } ");
            System.out.println("----------------------------------------");

            String resp = given().contentType("application/json").
                    when().get("http://localhost:7003/fib/range?startIndex=10&finishIndex=15").getBody().print();

            System.out.println("----------------------------------------");
            boolean match = resp.contains("[\"55\",\"89\",\"144\",\"233\",\"377\"]");

            System.out.println("Test Case 3.b: Did the response data match to expected values >> " + match);
            System.out.println("********************************************************************************\n\n");

        }

    }
