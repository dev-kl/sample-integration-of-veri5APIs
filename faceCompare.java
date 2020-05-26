OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{\n      \"headers\": \n      {\n        \"client_code\": \"<<your client_code>>\",\n        \"sub_client_code\": \"<<your client_code>>\",\n        \"channel_code\": \"Android\",\n        \"channel_version\": \"1.1.0\",\n        \"stan\": \"<<unqiue alphanumeric value for every transaction>>\",\n        \"client_ip\": \"\",\n        \"transmission_datetime\": \"1587628237592\",\n        \"operation_mode\": \"SELF\",\n        \"run_mode\": \"SELF\",\n        \"actor_type\": \"Customer\",\n        \"user_handle_type\": \"Email\",\n        \"user_handle_value\": \"abc@gmail.com\",\n        \"location\": \"\",\n        \"function_code\": \"DEFAULT\",\n        \"function_sub_code\": \"DEFAULT\"\n      },\n      \"request\": {\n            \"api_key\": \"<<your API_key>>\",\n            \"request_id\": \"<<unique request_id for every transaction generated at your end>>\",\n            \"purpose\":\"test\",\n            \"hash\": \"<<hash generated>>\",\n            \"image_1\": \"<<image1 for comparision>>\",\n            \"image_2\": \"<<image2 for comparision>>\"\n                }\n}");
        Request request = new Request.Builder()
        .url("https://sandbox.veri5digital.com/video-id-kyc/api/1.0/faceCompare")
        .post(body)
        .addHeader("content-type", "application/json")
        .addHeader("cache-control", "no-cache")
        .addHeader("postman-token", "751498b6-40be-3b8e-0d0d-6f45007ea87b")
        .build();

        Response response = client.newCall(request).execute();