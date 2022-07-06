function enviar(destino){
    document.formulario.action = destino;
}
function enviar2(destino){
    document.formulario.action = destino;
    document.formulario.submit();
}

function Validacion(){
    var user = document.getElementById("usuario").value;
    var pass = document.getElementById("password").value;
    if(user===""){
        alert("Por favor, COMPLETAR EL USUARIO ");
        return false;
    }
    if(pass===""){
        alert("Por favor, COMPLETAR LA CONTRASEÑA");
        return false;
    }
    
}
