/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package netpay;

/**
 *
 * @author thhoo7460
 */
public class NetPay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double h = 40;
        double w = 5.00;
        double i = 2.00;
        double t = 0.22;
        double netPay = (h*w*i)-t*(h*w*i);
        System.out.println(netPay);
    }
    
}
