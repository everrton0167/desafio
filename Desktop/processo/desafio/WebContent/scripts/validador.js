/**
 * validação de formulário
 *@author everton silva
 */

function validar(){
	let nome = frmUsuario.nome.value
	let email = frmUsuario.email.value
	let senha = frmUsuario.senha.value
	let fone = frmUsuario.fone.value
	if(nome === ""){
		alert("Preencha o campus nome")
		frmUsuario.nome.focus()
		return false
	}else if (email === ""){
		alert("Preencha o campus email")
		frmUsuario.email.focus()
		return false
	}else if (senha === ""){
		alert("Preencha o campus senha")
		frmUsuario.senha.focus()
		return false
	}else if (fone === ""){
		alert("Preencha o campus telefone")
		frmUsuario.fone.focus()
		return false
	} else {
		document.forms["frmUsuario"].submit()
	}
}
	