/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;
public class qrservlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
                try
                {
		String name= "Name : " + request.getParameter("name")+ " " + request.getParameter("lname") + ";" + " " ;
                String dob = "Date of birth : " + request.getParameter("dob") + ";" + " ";
                String add = "Address : " + request.getParameter("strt")+ " " + "," + request.getParameter("strtname")+ " " + "," + request.getParameter("lndmrk")+ " " + "," + request.getParameter("city")+ " " + "," + request.getParameter("state") + " " + "," + request.getParameter("country")+ " " + ",";
                String code = request.getParameter("code") + ";" + " ";
                String num = "Mobile : " + request.getParameter("num") + ";" + " ";
                String email = "E-Mail : " + request.getParameter("email") + ";" + " ";
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql" , "root" , "password");
                PreparedStatement ps = con.prepareStatement("Insert into qr_table Values(? , ?, ?, ?, ?, ?)");
                String qrtext=String.format(name + dob + add + code + num + email);
                    ByteArrayOutputStream out = QRCode.from(qrtext).to(ImageType.PNG).stream();
                    response.setContentType("image/png");
                    response.setContentLengthLong(out.size());
                    OutputStream outStream = response.getOutputStream();
                    outStream.write(out.toByteArray());
                    outStream.flush();
                    outStream.close();
                    ps.setString(1, name);
                    ps.setString(2, dob);
                    ps.setString(3, add);
                    ps.setString(4, code);
                    ps.setString(5, num);
                    ps.setString(6, email);
                    int f = ps.executeUpdate();
                    if(f>0)
                    {
                        System.out.println("successfully uploaded");
                    }
                    else
                    {
                        System.out.println("not uploaded");
                    }
                }
                catch(Exception e)
                {
                    out.println(e);
                }
        }
}

		       

