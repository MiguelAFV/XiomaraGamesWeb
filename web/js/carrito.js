$(function(){
    $('tr #deleteitem').click(function(e){
        e.preventDefault();
        var elemento = $(this);
        var idproducto = elemento.parent().find('#idarticulo').text();

        $.ajax({
            url : 'borraritem',
            type : 'post',
            data : {idproducto : idproducto},
            success: function(r){
                elemento.parent().parent().remove();
                var elementostabla = $('#shop-table tr');
                if(elementostabla.length <=1){
                    $('#cart-container').append("<h3 style='margin-left: 300px'>No hay Articulos en el Carro</h3>");
                }
                $('#txt-total').text(r);
            }
        });
    });
});