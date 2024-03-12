package app;

import io.javalin.http.Context;

import java.util.Map;

public class UserServices {
    protected static void login(Context ctx, Map<String,String> userMap) {
        String userName = ctx.formParam("username");
        String passWord = ctx.formParam("password");

        if (userMap.getOrDefault(userName, "90821492094").equals(passWord)) {
            ctx.render("tasks.html");
        } else {
            ctx.attribute("message","Desværre - no show");
            ctx.render("index.html");
        }
    }

    protected static void initUserMap(Map<String,String> userMap) {
        userMap.put("jon","1234");
        userMap.put("Lene","1234");
        userMap.put("Mateen","1234");
    }
}
