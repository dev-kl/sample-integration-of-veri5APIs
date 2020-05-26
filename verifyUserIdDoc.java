OkHttpClient client = new OkHttpClient();

MediaType mediaType = MediaType.parse("application/json");
RequestBody body = RequestBody.create(mediaType, "{\n                \"headers\":{\n                                \"client_code\": \"<<your_client_code>>\",\n                                \"sub_client_code\": \"<<your_client_code>>\",\n                                \"channel_code\": \"WEB\",\n                                \"channel_verison\": \"1\",\n                                \"stan\": \"<<unique_reference_key>>\",\n                                \"client_ip\": \"\",\n                                \"transmission_datetime\": \"12341234\",\n                                \"operation_mode\": \"SELF\",\n                                \"run_mode\": \"TEST\",\n                                \"actor_type\": \"TEST\",\n                                \"user_handle_type\":\"EMAIL\",\n                                \"user_handle_value\":\"abc@gmail.com\",\n                                \"location\":\"NA\",\n                                \"function_code\":\"VERIFY_PAN\",\n                                \"function_sub_code\":\"DATA\"\n                },\n                \"request\": {\n                                \"pan_details\":\n                                  {\n                                                \"pan_number\": \"AAAAA0000A\",\n                                                \"name\": \"<<name on PAN>>\",\n                                                \"dob\": \"<<date_of_birth>>\",\n                                                \"document\": \"\"\n                                  },\n                                  \"consent\": \"YES\",\n                                  \"consent_message\": \"\"\n                               \n                }\n}");
Request request = new Request.Builder()
  .url("https://sandbox.veri5digital.com/service/api/1.0/verifyUserIdDoc")
  .post(body)
  .addHeader("content-type", "application/json")
  .addHeader("cache-control", "no-cache")
  .addHeader("postman-token", "ea5a50b0-6701-baaa-bb1c-b33b9ad92bf7")
  .build();

Response response = client.newCall(request).execute();