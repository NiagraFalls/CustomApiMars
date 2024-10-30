package org.example;

import com.grapecity.forguncy.serverapi.annotation.Get;
import com.grapecity.forguncy.serverapi.entity.ForguncyApi;

import java.io.IOException;
import java.io.PrintWriter;

public class CustomApiMars extends ForguncyApi {
    @Get
    public void helloWorld() throws IOException {
        this.getContext().getResponse().setContentType("text/plain");
        String message = "Hello World CustomApiMars";
        PrintWriter out = this.getContext().getResponse().getWriter();
        out.print(message);
        out.close();
    }
}
