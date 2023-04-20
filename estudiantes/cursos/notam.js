$(document).ready(function () {
    $('#notam').on('click', function () {
      let tabla = document.querySelector('#tabla3 tbody');
      $.ajax({
        url: 'http://localhost:8080/buscarNotaMayor/9A',
        type: 'GET',
        dataType: 'JSON',
        success: function (respuesta) {
          console.log(respuesta);
          for (let i = 0; i < respuesta.length; i++) {
            tabla.innerHTML += 
              `<tr>
                <td>${respuesta[i].cedula}</td>
                <td>${respuesta[i].nombre}</td>
                <td>${respuesta[i].apellido}</td>
                <td>${respuesta[i].curso}</td>
                <td>${respuesta[i].nota_final}</td>
              </tr>`;
          }
        },
      });
    });
  });