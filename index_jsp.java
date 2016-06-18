package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>QR Code in Java Servlet</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<form action=\"qrservlet\" method=\"get\">\n");
      out.write("    <p>Enter Text to create QR Code</p>\n");
      out.write("    First Name : <input type=\"text\" name=\"name\" />\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    Last Name : <input type=\"text\" name=\"lname\" value=\"\" />\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    Date of Birth : <input type=\"date\" name=\"dob\" value=\"\" />\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    Home Address :\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    Street no. : <input type=\"text\" name=\"strt\" value=\"\" />\n");
      out.write("    Street name : <input type=\"text\" name=\"strtname\" value=\"\" />\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    Near Landmark(if any) : <input type=\"text\" name=\"lndmrk\" value=\"\" />\n");
      out.write("    City : <input type=\"text\" name=\"city\" value=\"\" />\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    Country :<select name=\"country\">\n");
      out.write("        <option>Select</option>\n");
      out.write("        <option value=\"Afghanistan\" >Afghanistan</option>\n");
      out.write("<option value=\"Albania\" >Albania</option>\n");
      out.write("<option value=\"Algeria\" >Algeria</option>\n");
      out.write("<option value=\"Andorra\" >Andorra</option>\n");
      out.write("<option value=\"Antigua and Barbuda\" >Antigua and Barbuda</option>\n");
      out.write("<option value=\"Argentina\" >Argentina</option>\n");
      out.write("<option value=\"Armenia\" >Armenia</option>\n");
      out.write("<option value=\"Australia\" >Australia</option>\n");
      out.write("<option value=\"Austria\" >Austria</option>\n");
      out.write("<option value=\"Azerbaijan\" >Azerbaijan</option>\n");
      out.write("<option value=\"Bahamas\" >Bahamas</option>\n");
      out.write("<option value=\"Bahrain\" >Bahrain</option>\n");
      out.write("<option value=\"Bangladesh\" >Bangladesh</option>\n");
      out.write("<option value=\"Barbados\" >Barbados</option>\n");
      out.write("<option value=\"Belarus\" >Belarus</option>\n");
      out.write("<option value=\"Belgium\" >Belgium</option>\n");
      out.write("<option value=\"Belize\" >Belize</option>\n");
      out.write("<option value=\"Benin\" >Benin</option>\n");
      out.write("<option value=\"Bhutan\" >Bhutan</option>\n");
      out.write("<option value=\"Bolivia\" >Bolivia</option>\n");
      out.write("<option value=\"Bosnia and Herzegovina\" >Bosnia and Herzegovina</option>\n");
      out.write("<option value=\"Botswana\" >Botswana</option>\n");
      out.write("<option value=\"Brazil\" >Brazil</option>\n");
      out.write("<option value=\"Brunei\" >Brunei</option>\n");
      out.write("<option value=\"Bulgaria\" >Bulgaria</option>\n");
      out.write("<option value=\"Burkina Faso\" >Burkina Faso</option>\n");
      out.write("<option value=\"Burundi\" >Burundi</option>\n");
      out.write("<option value=\"Cambodia\" >Cambodia</option>\n");
      out.write("<option value=\"Cameroon\" >Cameroon</option>\n");
      out.write("<option value=\"Canada\" >Canada</option>\n");
      out.write("<option value=\"Cape Verde\" >Cape Verde</option>\n");
      out.write("<option value=\"Central African Republic\" >Central African Republic</option>\n");
      out.write("<option value=\"Chad\" >Chad</option>\n");
      out.write("<option value=\"Chile\" >Chile</option>\n");
      out.write("<option value=\"China\" >China</option>\n");
      out.write("<option value=\"Colombia\" >Colombia</option>\n");
      out.write("<option value=\"Comoros\" >Comoros</option>\n");
      out.write("<option value=\"Congo\" >Congo</option>\n");
      out.write("<option value=\"Costa Rica\" >Costa Rica</option>\n");
      out.write("<option value=\"Côte d'Ivoire\" >Côte d'Ivoire</option>\n");
      out.write("<option value=\"Croatia\" >Croatia</option>\n");
      out.write("<option value=\"Cuba\" >Cuba</option>\n");
      out.write("<option value=\"Cyprus\" >Cyprus</option>\n");
      out.write("<option value=\"Czech Republic\" >Czech Republic</option>\n");
      out.write("<option value=\"Denmark\" >Denmark</option>\n");
      out.write("<option value=\"Djibouti\" >Djibouti</option>\n");
      out.write("<option value=\"Dominica\" >Dominica</option>\n");
      out.write("<option value=\"Dominican Republic\" >Dominican Republic</option>\n");
      out.write("<option value=\"East Timor\" >East Timor</option>\n");
      out.write("<option value=\"Ecuador\" >Ecuador</option>\n");
      out.write("<option value=\"Egypt\" >Egypt</option>\n");
      out.write("<option value=\"El Salvador\" >El Salvador</option>\n");
      out.write("<option value=\"Equatorial Guinea\" >Equatorial Guinea</option>\n");
      out.write("<option value=\"Eritrea\" >Eritrea</option>\n");
      out.write("<option value=\"Estonia\" >Estonia</option>\n");
      out.write("<option value=\"Ethiopia\" >Ethiopia</option>\n");
      out.write("<option value=\"Fiji\" >Fiji</option>\n");
      out.write("<option value=\"Finland\" >Finland</option>\n");
      out.write("<option value=\"France\" >France</option>\n");
      out.write("<option value=\"Gabon\" >Gabon</option>\n");
      out.write("<option value=\"Gambia\" >Gambia</option>\n");
      out.write("<option value=\"Georgia\" >Georgia</option>\n");
      out.write("<option value=\"Germany\" >Germany</option>\n");
      out.write("<option value=\"Ghana\" >Ghana</option>\n");
      out.write("<option value=\"Greece\" >Greece</option>\n");
      out.write("<option value=\"Grenada\" >Grenada</option>\n");
      out.write("<option value=\"Guatemala\" >Guatemala</option>\n");
      out.write("<option value=\"Guinea\" >Guinea</option>\n");
      out.write("<option value=\"Guinea-Bissau\" >Guinea-Bissau</option>\n");
      out.write("<option value=\"Guyana\" >Guyana</option>\n");
      out.write("<option value=\"Haiti\" >Haiti</option>\n");
      out.write("<option value=\"Honduras\" >Honduras</option>\n");
      out.write("<option value=\"Hong Kong\" >Hong Kong</option>\n");
      out.write("<option value=\"Hungary\" >Hungary</option>\n");
      out.write("<option value=\"Iceland\" >Iceland</option>\n");
      out.write("<option value=\"India\" >India</option>\n");
      out.write("<option value=\"Indonesia\" >Indonesia</option>\n");
      out.write("<option value=\"Iran\" >Iran</option>\n");
      out.write("<option value=\"Iraq\" >Iraq</option>\n");
      out.write("<option value=\"Ireland\" >Ireland</option>\n");
      out.write("<option value=\"Israel\" >Israel</option>\n");
      out.write("<option value=\"Italy\" >Italy</option>\n");
      out.write("<option value=\"Jamaica\" >Jamaica</option>\n");
      out.write("<option value=\"Japan\" >Japan</option>\n");
      out.write("<option value=\"Jordan\" >Jordan</option>\n");
      out.write("<option value=\"Kazakhstan\" >Kazakhstan</option>\n");
      out.write("<option value=\"Kenya\" >Kenya</option>\n");
      out.write("<option value=\"Kiribati\" >Kiribati</option>\n");
      out.write("<option value=\"North Korea\" >North Korea</option>\n");
      out.write("<option value=\"South Korea\" >South Korea</option>\n");
      out.write("<option value=\"Kuwait\" >Kuwait</option>\n");
      out.write("<option value=\"Kyrgyzstan\" >Kyrgyzstan</option>\n");
      out.write("<option value=\"Laos\" >Laos</option>\n");
      out.write("<option value=\"Latvia\" >Latvia</option>\n");
      out.write("<option value=\"Lebanon\" >Lebanon</option>\n");
      out.write("<option value=\"Lesotho\" >Lesotho</option>\n");
      out.write("<option value=\"Liberia\" >Liberia</option>\n");
      out.write("<option value=\"Libya\" >Libya</option>\n");
      out.write("<option value=\"Liechtenstein\" >Liechtenstein</option>\n");
      out.write("<option value=\"Lithuania\" >Lithuania</option>\n");
      out.write("<option value=\"Luxembourg\" >Luxembourg</option>\n");
      out.write("<option value=\"Macedonia\" >Macedonia</option>\n");
      out.write("<option value=\"Madagascar\" >Madagascar</option>\n");
      out.write("<option value=\"Malawi\" >Malawi</option>\n");
      out.write("<option value=\"Malaysia\" >Malaysia</option>\n");
      out.write("<option value=\"Maldives\" >Maldives</option>\n");
      out.write("<option value=\"Mali\" >Mali</option>\n");
      out.write("<option value=\"Malta\" >Malta</option>\n");
      out.write("<option value=\"Marshall Islands\" >Marshall Islands</option>\n");
      out.write("<option value=\"Mauritania\" >Mauritania</option>\n");
      out.write("<option value=\"Mauritius\" >Mauritius</option>\n");
      out.write("<option value=\"Mexico\" >Mexico</option>\n");
      out.write("<option value=\"Micronesia\" >Micronesia</option>\n");
      out.write("<option value=\"Moldova\" >Moldova</option>\n");
      out.write("<option value=\"Monaco\" >Monaco</option>\n");
      out.write("<option value=\"Mongolia\" >Mongolia</option>\n");
      out.write("<option value=\"Montenegro\" >Montenegro</option>\n");
      out.write("<option value=\"Morocco\" >Morocco</option>\n");
      out.write("<option value=\"Mozambique\" >Mozambique</option>\n");
      out.write("<option value=\"Myanmar\" >Myanmar</option>\n");
      out.write("<option value=\"Namibia\" >Namibia</option>\n");
      out.write("<option value=\"Nauru\" >Nauru</option>\n");
      out.write("<option value=\"Nepal\" >Nepal</option>\n");
      out.write("<option value=\"Netherlands\" >Netherlands</option>\n");
      out.write("<option value=\"New Zealand\" >New Zealand</option>\n");
      out.write("<option value=\"Nicaragua\" >Nicaragua</option>\n");
      out.write("<option value=\"Niger\" >Niger</option>\n");
      out.write("<option value=\"Nigeria\" >Nigeria</option>\n");
      out.write("<option value=\"Norway\" >Norway</option>\n");
      out.write("<option value=\"Oman\" >Oman</option>\n");
      out.write("<option value=\"Pakistan\" >Pakistan</option>\n");
      out.write("<option value=\"Palau\" >Palau</option>\n");
      out.write("<option value=\"Panama\" >Panama</option>\n");
      out.write("<option value=\"Papua New Guinea\" >Papua New Guinea</option>\n");
      out.write("<option value=\"Paraguay\" >Paraguay</option>\n");
      out.write("<option value=\"Peru\" >Peru</option>\n");
      out.write("<option value=\"Philippines\" >Philippines</option>\n");
      out.write("<option value=\"Poland\" >Poland</option>\n");
      out.write("<option value=\"Portugal\" >Portugal</option>\n");
      out.write("<option value=\"Puerto Rico\" >Puerto Rico</option>\n");
      out.write("<option value=\"Qatar\" >Qatar</option>\n");
      out.write("<option value=\"Romania\" >Romania</option>\n");
      out.write("<option value=\"Russia\" >Russia</option>\n");
      out.write("<option value=\"Rwanda\" >Rwanda</option>\n");
      out.write("<option value=\"Saint Kitts and Nevis\" >Saint Kitts and Nevis</option>\n");
      out.write("<option value=\"Saint Lucia\" >Saint Lucia</option>\n");
      out.write("<option value=\"Saint Vincent and the Grenadines\" >Saint Vincent and the Grenadines</option>\n");
      out.write("<option value=\"Samoa\" >Samoa</option>\n");
      out.write("<option value=\"San Marino\" >San Marino</option>\n");
      out.write("<option value=\"Sao Tome and Principe\" >Sao Tome and Principe</option>\n");
      out.write("<option value=\"Saudi Arabia\" >Saudi Arabia</option>\n");
      out.write("<option value=\"Senegal\" >Senegal</option>\n");
      out.write("<option value=\"Serbia and Montenegro\" >Serbia and Montenegro</option>\n");
      out.write("<option value=\"Seychelles\" >Seychelles</option>\n");
      out.write("<option value=\"Sierra Leone\" >Sierra Leone</option>\n");
      out.write("<option value=\"Singapore\" >Singapore</option>\n");
      out.write("<option value=\"Slovakia\" >Slovakia</option>\n");
      out.write("<option value=\"Slovenia\" >Slovenia</option>\n");
      out.write("<option value=\"Solomon Islands\" >Solomon Islands</option>\n");
      out.write("<option value=\"Somalia\" >Somalia</option>\n");
      out.write("<option value=\"South Africa\" >South Africa</option>\n");
      out.write("<option value=\"Spain\" >Spain</option>\n");
      out.write("<option value=\"Sri Lanka\" >Sri Lanka</option>\n");
      out.write("<option value=\"Sudan\" >Sudan</option>\n");
      out.write("<option value=\"Suriname\" >Suriname</option>\n");
      out.write("<option value=\"Swaziland\" >Swaziland</option>\n");
      out.write("<option value=\"Sweden\" >Sweden</option>\n");
      out.write("<option value=\"Switzerland\" >Switzerland</option>\n");
      out.write("<option value=\"Syria\" >Syria</option>\n");
      out.write("<option value=\"Taiwan\" >Taiwan</option>\n");
      out.write("<option value=\"Tajikistan\" >Tajikistan</option>\n");
      out.write("<option value=\"Tanzania\" >Tanzania</option>\n");
      out.write("<option value=\"Thailand\" >Thailand</option>\n");
      out.write("<option value=\"Togo\" >Togo</option>\n");
      out.write("<option value=\"Tonga\" >Tonga</option>\n");
      out.write("<option value=\"Trinidad and Tobago\" >Trinidad and Tobago</option>\n");
      out.write("<option value=\"Tunisia\" >Tunisia</option>\n");
      out.write("<option value=\"Turkey\" >Turkey</option>\n");
      out.write("<option value=\"Turkmenistan\" >Turkmenistan</option>\n");
      out.write("<option value=\"Tuvalu\" >Tuvalu</option>\n");
      out.write("<option value=\"Uganda\" >Uganda</option>\n");
      out.write("<option value=\"Ukraine\" >Ukraine</option>\n");
      out.write("<option value=\"United Arab Emirates\" >United Arab Emirates</option>\n");
      out.write("<option value=\"United Kingdom\" >United Kingdom</option>\n");
      out.write("<option value=\"United States\" >United States</option>\n");
      out.write("<option value=\"Uruguay\" >Uruguay</option>\n");
      out.write("<option value=\"Uzbekistan\" >Uzbekistan</option>\n");
      out.write("<option value=\"Vanuatu\" >Vanuatu</option>\n");
      out.write("<option value=\"Vatican City\" >Vatican City</option>\n");
      out.write("<option value=\"Venezuela\" >Venezuela</option>\n");
      out.write("<option value=\"Vietnam\" >Vietnam</option>\n");
      out.write("<option value=\"Yemen\" >Yemen</option>\n");
      out.write("<option value=\"Zambia\" >Zambia</option>\n");
      out.write("<option value=\"Zimbabwe\" >Zimbabwe</option>\n");
      out.write("    </select>\n");
      out.write("\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    Pincode : <input type=\"text\" name=\"code\" value=\"\" />\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    Mobile No. : <input type=\"text\" name=\"num\" value=\"\" />\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    Email : <input type=\"email\" name=\"email\" value=\"\" />\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <input type=\"submit\" value=\"Generate QR Code\" /> \n");
      out.write("</form> \n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
