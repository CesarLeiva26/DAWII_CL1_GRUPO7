$(document).on("click", "#btnagregarcliente", function(){

    $("#txtnombre").val("");
    $("#txtdireccion").val("");

    $("#txtnumerotelefono").val("");
    $("#txtcorreoelectronico").val("");
    $("#txtfecha").val("");
    $("#txtmontopagado").val("");
    $("#txtmetodopago").val("");
    $("#txtestadopago").val("");

    $("#modalNuevo").modal("show");
});



$(document).on("click", "#btnguardarcliente", function(){

		$.ajax({
			type: "POST",
			url: "/cliente/guardarcliente",
			contentType: "application/json",
			data: JSON.stringify({
			                idcliente: $("#hddidcliente").val(),
			                idpago: $("#hddidpago").val(),
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


$(document).on("click", ".btnactualizarCliente", function(){

	$("#hddidcliente").val($(this).attr("data-idcliente"));
	$("#hddidpago").val($(this).attr("data-idpago"));
	$("#txtnombre").val($(this).attr("data-nombre"));
	$("#txtdireccion").val($(this).attr("data-direccion"));
	$("#txtnumerotelefono").val($(this).attr("data-numerotelefono"));
	$("#txtcorreoelectronico").val($(this).attr("data-correoelectronico"));
	var fechaCompleta = $(this).attr("data-fechapago");
	var fechaSinHora = fechaCompleta.substring(0, 10);
	$("#txtfecha").val(fechaSinHora);
	$("#txtmontopagado").val($(this).attr("data-montopagado"));
	$("#txtmetodopago").val($(this).attr("data-metodopago"));
	$("#txtestadopago").val($(this).attr("data-estadopago"));


    $("#modalNuevo").modal("show");
});


