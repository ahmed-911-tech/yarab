package com.example.demo;


import com.sourceforge.snap7.moka7.S7Client;
import si.trina.moka7.live.PLC;
import com.sourceforge.snap7.moka7.S7;





public class js {
    S7Client client = new S7Client();
    byte [] Buffer = new byte [65535];





    public void SA(){

     client.SetConnectionType(S7.OP);
    client.ConnectTo("192.168.0.1",0,0);
        System.out.println("XDbf");

    }
}
