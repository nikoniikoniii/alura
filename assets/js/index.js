const input = document.querySelector("#entery");
const label = document.querySelector('label');
const res = document.querySelector('.resultado');

document.addEventListener ('click', e => {
    e.preventDefault();
    const el = e.target;
    if (el.classList.contains('criptografar')) pegaConteudo(input.value, criptografar);
    if (el.classList.contains('descriptografar')) pegaConteudo(input.value, descriptografar);
    if (el.classList.contains('copy')) document.execCommand('copy');
});

function pegaConteudo (content, funcao) {
    if (!content) {
        const erro = 'ERRO: Insira um texto para ser Criptografado';
        label.innerHTML = erro;
    } else {
        if(!res.classList.contains('limpo')) {
            res.innerHTML = '';
            res.classList.add('limpo');
            label.innerHTML = 'Criptografe ou Descriptografe seu texto';
            criaBtn(res);
        }
        const textCrip = funcao(content.toLowerCase());
        criaElemento(textCrip, res);
        input.value = '';
        input.focus();
    }
}

function criaElemento(text, el) {
    const div = document.createElement('div');
    const content = document.createTextNode(text);
    div.setAttribute('class', 'res');
    div.appendChild(content);
    el.appendChild(div);
}

function criaBtn(el) {
    const btn = document.createElement('button');
    const content = document.createTextNode('Copiar');
    btn.setAttribute('type', 'button');
    btn.setAttribute('class', 'copy');
    btn.appendChild(content);
    el.appendChild(btn);
}

function criptografar(conteudo) {
  const text = document.getElementById("entery").value;
  const chars = text.split("");

  const encryptedChars = chars.map(char => {
    switch (char) {
      case "a":
        return "ai";
      case "e":
        return "enter";
      case "i":
        return "imes";
      case "o":
        return "ober";
      case "u":
        return "ufat";
      default:
        return char;
    }
  });

  const encryptedText = encryptedChars.join("");
  document.getElementById("output").innerHTML = encryptedText;
}

function descriptografar(conteudo) {
  const textoCriptografado = document.getElementById("output").innerHTML;
  if (!textoCriptografado) {
    return "";
  }
  let chars = textoCriptografado;

  chars = chars.replace(/ai/g, 'a');
  chars = chars.replace(/enter/g, 'e');
  chars = chars.replace(/imes/g, 'i');
  chars = chars.replace(/ober/g, 'o');
  chars = chars.replace(/ufat/g, 'u');

  document.getElementById("output").innerHTML = chars;
}

