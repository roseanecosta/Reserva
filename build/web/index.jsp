<%-- 
    Document   : index
    Created on : 29/08/2014, 08:03:20
    Author     : Roseane
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
    <script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
    <script type="text/javascript" src="js/jquery.maskedinput.min.js"></script>    
    <script type="text/javascript" src ="js/jquery-ui.min.js"></script>
    <script type="text/javaScript" src ="js/index.js"> </script>
    <link rel="stylesheet" href="//code.jquery.com/ui/1.11.1/themes/smoothness/jquery-ui.css"> 
    <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
    <link href="css/style.css" rel="stylesheet">

    <head>
        <title>Reserva Hotel</title>
    </head>
    <body>
        <div class="container">
            <section id="forms">
                <header class="header">
                    <div class="container-fluid">
                        <div class="row-fluid">
                            <div class="span10">
                                <h3 class="page-title">Buscar Hotel</h3>
                            </div>
                        </div>
                    </div>
                </header>
                <div class="row">
                    <div class="span12">

                        <form action = "Consulta" id="form" method="post">
                            <fieldset><br><br>
                                <div class="control-group">
                                    <label for="input01" class="control-label">Tipo de Cliente:
                                        <input type="radio" name="tipoCliente" id="tipoCliente" value="REGULAR" />Regular
                                        <input type="radio" name="tipoCliente" id="tipoCliente" value="PREMIUM" />Premium</label>
                                </div>
                                <br>
                                <div class="control-group">
                                    <label for="input01" class="control-label">Data 1: </label>
                                    <div class="controls">
                                        <input type="text" id="data1" name="data1" class="input-xlarge">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label for="input01" class="control-label">Data 2: </label>
                                    <div class="controls">
                                        <input type="text" id="data2" name="data2" class="input-xlarge">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label for="input01" class="control-label">Data 3: </label>
                                    <div class="controls">
                                        <input type="text" id="data3" name="data3" class="input-xlarge">
                                    </div>
                                </div>
                                <br><br>
                                <div class="control-group">
                                    <label for="input01" class="control-label">Hotel Indicado: ${hotelIndicado}</label>
                                </div>
                                <br><br>
                                <div class="form-actions">
                                    <button class="btn btn-danger" type="submit" name="btnbuscar" id="btnbuscar">Buscar</button>
                                </div>
                            </fieldset>
                        </form>
                    </div>
                </div>
            </section>
        </div>
    </body>
</html>

