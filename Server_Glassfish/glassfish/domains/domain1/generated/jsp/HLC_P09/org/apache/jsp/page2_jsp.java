package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Issue;
import java.util.ArrayList;

public final class page2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setHeader("X-Powered-By", "JSP/2.3");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>IUS Lawyer</title>\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"00_resources/images/logoIcon.ico\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"00_resources/css/common.css\" rel='stylesheet'>      \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-dark navbar-custom p-4\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <a href=\"./index.jsp\">\n");
      out.write("                        <img src=\"00_resources/images/logo.png\" alt=\"Logo\" height=\"40\" class=\"d-inline-block align-text-top me-4\">\n");
      out.write("                    </a>\n");
      out.write("                    \n");
      out.write("                    <a class=\"navbar-brand mb-1\" href=\"./index.jsp\">\n");
      out.write("                        IUS Lawyer\n");
      out.write("                    </a>\n");
      out.write("\n");
      out.write("                    <button class=\"navbar-toggler \" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                        <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("                            <li class=\"nav-item me-4\">\n");
      out.write("                                <a class=\"nav-link active selected\" href=\"home.jsp\">Home</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link active selected\" href=\"NewServlet2\">Log Out</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>                        \n");
      out.write("        </header>\n");
      out.write("        <main class=\"container-fluid bg-main-2 p-5\">\n");
      out.write("            <div class=\"row d-flex justify-content-center\">\n");
      out.write("                <div class=\"col-10\">\n");
      out.write("                    <table class=\"table table-striped table-hover\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th class=\"dcf-txt-center\" scope=\"col\">COD</th>\n");
      out.write("                                <th class=\"dcf-txt-center\" scope=\"col\">DESCRIPCIÓN</th>\n");
      out.write("                                <th class=\"dcf-txt-center\" scope=\"col\">FECHA INICIO</th>\n");
      out.write("                                <th class=\"dcf-txt-center\" scope=\"col\">HORAS</th>\n");
      out.write("                                <th class=\"dcf-txt-center\" scope=\"col\">COSTE</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        ");
ArrayList<Issue> issueList = (ArrayList<Issue>) session.getAttribute("issue_list");
                            for(Issue issue : issueList) {
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"row\">");
out.print(issue.getId());
      out.write("</th>\n");
      out.write("                                    <td data-label=\"NAME\">");
out.print(issue.getIssueDescription());
      out.write("</td>\n");
      out.write("                                    <td data-label=\"NAME\">");
out.print(issue.getEntryDate());
      out.write("</td>\n");
      out.write("                                    <td data-label=\"NAME\">");
out.print(issue.getHoursNum());
      out.write("</td>\n");
      out.write("                                    <td data-label=\"NAME\">");
out.print(issue.getCost());
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
      out.write("        \n");
      out.write("        <footer class=\"text-center text-lg-start bg-card fg-card text-muted\">\n");
      out.write("            <!-- Section: Social media -->\n");
      out.write("            <section class=\"d-flex justify-content-center justify-content-lg-between p-4 border-bottom\">\n");
      out.write("                <!-- Left -->\n");
      out.write("                <div class=\"me-5 d-none d-lg-block\">\n");
      out.write("                    <span>Get connected with us on social networks:</span>\n");
      out.write("                </div>\n");
      out.write("                <!-- Left -->\n");
      out.write("            \n");
      out.write("                <!-- Right -->\n");
      out.write("                <div>\n");
      out.write("                    <a href=\"https://www.linkedin.com/in/miguel-m-v%C3%A1zquez-mart%C3%ADnez-5b7079112/\" class=\"me-4 text-reset\">\n");
      out.write("                        <i class='bx bxl-linkedin-square'></i>\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"https://github.com/DevLawyer\" class=\"me-4 text-reset\">\n");
      out.write("                        <i class='bx bxl-github'></i>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <!-- Right -->\n");
      out.write("            </section>\n");
      out.write("            <!-- Section: Social media -->\n");
      out.write("        \n");
      out.write("            <!-- Section: Links  -->\n");
      out.write("            <section class=\"\">\n");
      out.write("                <div class=\"container text-center text-md-start mt-5\">\n");
      out.write("                    <!-- Grid row -->\n");
      out.write("                    <div class=\"row mt-3\">\n");
      out.write("                        <!-- Grid column -->\n");
      out.write("                        <div class=\"col-md-3 col-lg-4 col-xl-3 mx-auto mb-4\">\n");
      out.write("                            <!-- Content -->\n");
      out.write("                            <h6 class=\"text-uppercase fw-bold mb-4\">\n");
      out.write("                                IUS Lawyer\n");
      out.write("                            </h6>\n");
      out.write("                            <p>\n");
      out.write("                            This website is a project to comply with the sixth practice of the HLC Module of High School El Majuelo.\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- Grid column -->\n");
      out.write("            \n");
      out.write("                        <!-- Grid column -->\n");
      out.write("                        <div class=\"col-md-2 col-lg-2 col-xl-2 mx-auto mb-4\">\n");
      out.write("                            <!-- Links -->\n");
      out.write("                            <h6 class=\"text-uppercase fw-bold mb-4\">\n");
      out.write("                                Pages\n");
      out.write("                            </h6>\n");
      out.write("                            <p>\n");
      out.write("                            <a href=\"home.jsp\" class=\"text-reset\">Home</a>\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- Grid column -->\n");
      out.write("            \n");
      out.write("                        <!-- Grid column -->\n");
      out.write("                        <div class=\"col-md-3 col-lg-2 col-xl-2 mx-auto mb-4\">\n");
      out.write("                            <!-- Links -->\n");
      out.write("                            <h6 class=\"text-uppercase fw-bold mb-4\">\n");
      out.write("                                Useful links\n");
      out.write("                            </h6>\n");
      out.write("                            <p>\n");
      out.write("                            <a href=\"http://www.iesmajuelo.com/\" class=\"text-reset\">I.E.S. El Majuelo</a>\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- Grid column -->\n");
      out.write("            \n");
      out.write("                        <!-- Grid column -->\n");
      out.write("                        <div class=\"col-md-4 col-lg-3 col-xl-3 mx-auto mb-md-0 mb-4\">\n");
      out.write("                            <!-- Links -->\n");
      out.write("                            <h6 class=\"text-uppercase fw-bold mb-4\">\n");
      out.write("                            Contact\n");
      out.write("                            </h6>\n");
      out.write("                            <p>C. Enrique Granados, 43, 41960 Gines, Sevilla</p>\n");
      out.write("                            <p>mvazmar625@g.educaand.es</p>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- Grid column -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Grid row -->\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            <!-- Section: Links  -->\n");
      out.write("        \n");
      out.write("            <!-- Section: License -->\n");
      out.write("            <div class=\"text-center p-4\" style=\"background-color: rgba(0, 0, 0, 0.05);\">\n");
      out.write("            License:\n");
      out.write("            <a class=\"text-reset fw-bold\" href=\"https://joinup.ec.europa.eu/collection/eupl/eupl-text-eupl-12\">EUPL-1.2</a>\n");
      out.write("            </div>\n");
      out.write("            <!-- Section: License -->\n");
      out.write("        </footer>\n");
      out.write("        <!-- SCRIPTS SECTION -->\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\" integrity=\"sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js\" integrity=\"sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
