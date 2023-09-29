$(document).on("click", "#btnagregar", function(){

    $("#txtnombre").val("");
    $("#txtdireccion").val("");

    $("#txtnumerotelefono").val("");
    $("#txtcorreoelectronico").val("");
    $("#txtfecha").val("2023-11-23 sigue este ejemplo");
    $("#txtmontopagado").val("");
    $("#txtmetodopago").val("");
    $("#txtestadopago").val("");

    $("#modalNuevo").modal("show");
});



$(document).on("click", "#btnguardar", function(){

		$.ajax({
			type: "POST",
			url: "/cliente/guardarcliente",
			contentType: "application/json",
			data: JSON.stringify({
				            nombre: $("#txtnombre").val(),
                            direccion: $("#txtdireccion").val(),
                            numerotelefono: $("#txtnumerotelefono").val(),
                            correoelectronico: $("#txtcorreoelectronico").val(),
                            fechapago: $("#txtfecha").val(),
                            montopagado: $("#txtmontopagado").val(),
                            metodopago: $("#txtmetodopago").val(),
                            estadopago: $("#txtestadopago").val()
			}),
			success: function(resultado){
				alert(resultado.mensaje);
			}
		});


		$("#modalNuevo").modal("hide");

setTimeout(function() {
    location.reload();
}, 2000); // 2000 milisegundos = 2 segundos

});