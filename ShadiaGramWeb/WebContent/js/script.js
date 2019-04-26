/*$("#formLogin").submit(function(event) {
    event.preventDefault();
    $.ajax({
        url: "https://jsonplaceholder.typicode.com/users",
        success: function(respuesta) {
            let datos = respuesta;
            let nombre;
            for (let item of datos) {
                if (item.email == $("#inputUsuarioL").val()) {
                    nombre = item.name;
                }
            }
            if (nombre != null) {
                alert("Usuario encontrado:" + nombre);
            } else {
                alert("Usuario no encontrado");
            }
        },
        error: function() {
            console.log("no se ha podido pbtener informacion");
        }
    });
});*/
/*      check Politicas        */
function check() {
    $("#checkTerminos").prop('checked', true);
}

function uncheck() {
    $("#checkTerminos").prop('checked', false);
}
/*function changeClass() {
    document.getElementById("open-hide").classList.toggle('show');
}
window.onload = function() {
    document.getElementById("open-hide").addEventListener('click', changeClass);
}*/
/*      Sacar Ruta      */
$(function() {
    // We can attach the `fileselect` event to all file inputs on the page
    $(document).on('change', ':file', function() {
        var input = $(this),
            numFiles = input.get(0).files ? input.get(0).files.length : 1,
            label = input.val().replace(/\\/g, '/').replace(/.*\//, '');
        input.trigger('fileselect', [numFiles, label]);
    });
    // We can watch for our custom `fileselect` event like this
    $(document).ready(function() {
        $(':file').on('fileselect', function(event, numFiles, label) {
            var input = $(this).parents('.input-group').find(':text'),
                log = numFiles > 1 ? numFiles + ' files selected' : label;
            if (input.length) {
                input.val(log);
            } else {
                if (log) alert(log);
            }
        });
    });
});
/*     boton mostrar contraseña     */
function mostrarPassword() {
    var cambio = document.getElementById("inputPasswordL");
    if (cambio.type == "password") {
        cambio.type = "text";
        $('.iconoPass').removeClass('fas fa-eye-slash').addClass('fas fa-eye');
    } else {
        cambio.type = "password";
        $('.iconoPass').removeClass('fas fa-eye').addClass('fas fa-eye-slash');
    }
}