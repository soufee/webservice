<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <script src="https://code.jquery.com/jquery-3.2.1.min.js"
            integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
            crossorigin="anonymous"></script>
    <link rel="stylesheet"
          href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.2/css/materialize.min.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.2/js/materialize.min.js"></script>
    <script src="https://use.fontawesome.com/8916abdc27.js"></script>
    <script>
        function sayHello() {
            var resp = null;
            var request = new XMLHttpRequest();
            request.open('GET', "/webservice/rest/hello?nickname=Виктор&age=47", true);
            request.onreadystatechange = function () {
                if (request.readyState === XMLHttpRequest.DONE && request.status === 200) {
                    resp = request.responseText;
                    var label = document.getElementById("label_result");
                    label.innerText = resp;
                }
            };
            request.send();
        }

        function callPost() {
            var request = new XMLHttpRequest();
            var json = JSON.stringify({
                nickname: "Виктория",
                age: 32
            });

            request.open("POST", "/webservice/rest/create", true);
            request.setRequestHeader('Content-Type', 'application/json; charset=UTF-8');
            var resp = null;
            request.onreadystatechange = function () {
                if (request.readyState === XMLHttpRequest.DONE && request.status === 200) {
                    resp = request.responseText;
                    var label = document.getElementById("label_result");
                    label.innerText = resp;
                }
            };
            request.send(json);
        }

    </script>
</head>
<body>
<div class="section"></div>
<main>
    <div class="center-align">
        <div class="section"></div>

        <h5 class="indigo-text">Do you want to get or post?</h5>
        <div class="section"></div>

        <div class="container">
            <div class="z-depth-1 grey lighten-4 row"
                 style="display: inline-block; padding: 32px 48px 0px 48px; border: 1px solid #EEE;">

                <form class="col s12" method="post" action="/">
                    <div class="row">
                        <div class="input-field col s12" id="label_result">

                        </div>
                    </div>


                    <br/>
                    <div class="row">
                        <button type="button" value="get" class="col s12 btn btn-large waves-effect indigo"
                                onclick="sayHello()">GET
                        </button>

                    </div>
                    <div class="row">
                        <button type="button" value="post" class="col s12 btn btn-large waves-effect indigo"
                                onclick="callPost()">POST
                        </button>
                    </div>
                </form>


            </div>
        </div>
    </div>

    <div class="section"></div>
    <div class="section"></div>
</main>
</body>
</html>


