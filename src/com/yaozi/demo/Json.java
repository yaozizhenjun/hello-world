package com.yaozi.demo;

import org.json.JSONArray;
import org.json.JSONObject;
public class Json {
//    json1 = "[{"type":"tag","udr":"aundiand"},{"type":""}]";
    String jsonData = "[{\"username\":\"arthinking\",\"userId\":001},{\"username\":\"Jason\",\"userId\":002}]";

    String jsonData1 = "[{ \"id\": \"27JpL~jd99w9nM01c000qc\", \"version\": \"abc\" },{ \"id\": \"27JpL~j6UGE0LX00s001AH\", \"version\": \"bbc\" },{ \"id\": \"27JpL~j7YkM0LX01c000gt\", \"version\": \"Wa_\" }]";
//    Type listType = new TypeToken<LinkedList<User>>(){}.getType();
//    Gson gson = new Gson();
//    LinkedList<User> users = gson.fromJson(jsonData, listType);
//    for (Iterator iterator = users.iterator(); iterator.hasNext();) {
//        User user = (User) iterator.next();
//        System.out.println(user.getUsername());
//        System.out.println(user.getUserId());
//    }

        JSONArray arr = new JSONArray(jsonData1);
        for (int i = 0; i < arr.length(); i++) {
            JSONObject temp = (JSONObject) arr.get(i);
            String id = temp.getString("id");
            String id = temp.getString("version");
        }
}
