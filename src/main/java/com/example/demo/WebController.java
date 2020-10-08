package com.example.demo;


import com.sourceforge.snap7.moka7.S7;
import com.sourceforge.snap7.moka7.S7Client;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

@Controller
public class WebController {

    S7Client client = new S7Client();
    byte [] Buffer = new byte [65535];


    private js J = new js();

    @GetMapping ({"/"})
    public String AddUserInGroup()  {
        client.SetConnectionType(S7.OP);
        int Result= client.ConnectTo("192.168.0.1",0,0);

        if (Result==0)
        {
            System.out.println("Connected to  ");
            System.out.println("PDU negotiated : " + client.PDULength()+" bytes");
        }          System.out.println(S7Client.ErrorText(Result));
       return "index";
    }

}
