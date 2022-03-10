<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>IUS Lawyer</title>
        <link rel="icon" type="image/x-icon" href="00_resources/images/logoIcon.ico">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link href="https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css" rel="stylesheet">
        <link href="00_resources/css/common.css" rel='stylesheet'>      
    </head>
    <body>
        <header>
            <nav class="navbar navbar-expand-lg navbar-dark navbar-custom p-4">
                <div class="container-fluid">
                    <a href="./index.jsp">
                        <img src="00_resources/images/logo.png" alt="Logo" height="40" class="d-inline-block align-text-top me-4">
                    </a>
                    
                    <a class="navbar-brand mb-1" href="./index.jsp">
                        IUS Lawyer
                    </a>

                    <button class="navbar-toggler " type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                            <li class="nav-item">
                                <a class="nav-link active selected" href="index.jsp">Home</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>                        
        </header>
        <main class="container-fluid bg-main-2 p-5">
            <div class="row d-flex justify-content-center">
                <div class="col-10">
                    <div class="container col-md-8 col-md-offset-3" style="overflow: auto">
                        <h1>Acceso a la intranet</h1>
                        <form action="NewServlet" method="post">
                            <div class="form-group m-2">
                                <label for="uname">User Name:</label> <input type="text" class="form-control" id="username" placeholder="User Name" name="username" required>
                            </div>
                            <div class="form-group m-2">
                                <label for="uname">Password:</label> <input type="password" class="form-control" id="password" placeholder="Password" name="password" required>
                            </div>
                            <button type="submit" class="btn btn-primary m-2">Acceder</button>
                        </form>
                    </div>
                </div>
            </div>
        </main>
        
        <footer class="text-center text-lg-start bg-card fg-card text-muted">
            <!-- Section: Social media -->
            <section class="d-flex justify-content-center justify-content-lg-between p-4 border-bottom">
                <!-- Left -->
                <div class="me-5 d-none d-lg-block">
                    <span>Get connected with us on social networks:</span>
                </div>
                <!-- Left -->
            
                <!-- Right -->
                <div>
                    <a href="https://www.linkedin.com/in/miguel-m-v%C3%A1zquez-mart%C3%ADnez-5b7079112/" class="me-4 text-reset">
                        <i class='bx bxl-linkedin-square'></i>
                    </a>
                    <a href="https://github.com/DevLawyer" class="me-4 text-reset">
                        <i class='bx bxl-github'></i>
                    </a>
                </div>
                <!-- Right -->
            </section>
            <!-- Section: Social media -->
        
            <!-- Section: Links  -->
            <section class="">
                <div class="container text-center text-md-start mt-5">
                    <!-- Grid row -->
                    <div class="row mt-3">
                        <!-- Grid column -->
                        <div class="col-md-3 col-lg-4 col-xl-3 mx-auto mb-4">
                            <!-- Content -->
                            <h6 class="text-uppercase fw-bold mb-4">
                                IUS Lawyer
                            </h6>
                            <p>
                            This website is a project to comply with the sixth practice of the HLC Module of High School El Majuelo.
                            </p>
                        </div>
                        <!-- Grid column -->
            
                        <!-- Grid column -->
                        <div class="col-md-2 col-lg-2 col-xl-2 mx-auto mb-4">
                            <!-- Links -->
                            <h6 class="text-uppercase fw-bold mb-4">
                                Pages
                            </h6>
                            <p>
                            <a href="./index.jsp" class="text-reset">Home</a>
                            </p>
                        </div>
                        <!-- Grid column -->
            
                        <!-- Grid column -->
                        <div class="col-md-3 col-lg-2 col-xl-2 mx-auto mb-4">
                            <!-- Links -->
                            <h6 class="text-uppercase fw-bold mb-4">
                                Useful links
                            </h6>
                            <p>
                            <a href="http://www.iesmajuelo.com/" class="text-reset">I.E.S. El Majuelo</a>
                            </p>
                        </div>
                        <!-- Grid column -->
            
                        <!-- Grid column -->
                        <div class="col-md-4 col-lg-3 col-xl-3 mx-auto mb-md-0 mb-4">
                            <!-- Links -->
                            <h6 class="text-uppercase fw-bold mb-4">
                            Contact
                            </h6>
                            <p>C. Enrique Granados, 43, 41960 Gines, Sevilla</p>
                            <p>mvazmar625@g.educaand.es</p>
                        </div>
                        <!-- Grid column -->
                    </div>
                    <!-- Grid row -->
                </div>
            </section>
            <!-- Section: Links  -->
        
            <!-- Section: License -->
            <div class="text-center p-4" style="background-color: rgba(0, 0, 0, 0.05);">
            License:
            <a class="text-reset fw-bold" href="https://joinup.ec.europa.eu/collection/eupl/eupl-text-eupl-12">EUPL-1.2</a>
            </div>
            <!-- Section: License -->
        </footer>
        <!-- SCRIPTS SECTION -->
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    </body>
</html>
