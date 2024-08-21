package api_steps;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class SpotifyAPI_Test
{
    public static void main(String[] args)
    {
        //Mention endpoint
        RestAssured.baseURI = "https://developer.spotify.com/documentation/web-api";

        //To get existing response from the endpoint, hence we use the get() method
        Response response = RestAssured.get();
        //I want to print response in my console
        response.prettyPrint();

        JsonPath jsonPath = response.jsonPath();

    }
}
