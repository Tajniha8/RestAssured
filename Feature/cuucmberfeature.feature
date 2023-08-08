@restassure
Feature: Feature to test the rest api

	@getapi
		Scenario: Scenario to test the get api
			Given User open the dummy rest api website
			When user sends the request to the server
			Then User get the response from the server
		
	@postapi
		Scenario: Scenario to test the post api
			Given User open the dummy rest post api website
			When user creates the record 
			Then User sucessfully view the record in databse

	@Updateapi
		Scenario: Scenario to test the update api
			Given User open the dummy rest put api website
			When user updates the record 
			Then User sucessfully view the updated record in databse
			
	@deleteapi
		Scenario: Scenario to test the delete api
			Given User open the dummy rest delete api website
			When user delete the record 
			Then User sucessfully view the delete record in databse