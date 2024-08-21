package steps;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class steps_currency

{
    public void set_up_the_endpoint_TC01v2() throws Exception
    {
        RestAssured.baseURI = "http://universities.hipolabs.com/search?country=South+Africa  ";
        System.out.println(2);
    }
    public void to_get_get_request_TC01v2() throws Exception
    {
        Response response = RestAssured.get();

        response =RestAssured.get();
        response.prettyPrint();
        System.out.println(3);
    }
    public void get_the_conversion_rate_for_a_given_currency_and_verify_it_TC01v2() throws Exception
    {
        Response response = RestAssured.get();

        JsonPath jsonPath = response.jsonPath();
        //x.conversion_rates_TWD
        double double1 = jsonPath.getDouble("conversation_rates.TWD");
        System.out.println(double1);
        System.out.println(4);
    }
}
