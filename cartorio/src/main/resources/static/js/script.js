const headers = new Headers();
headers.append('Authorization', 'Basic ' + btoa('admin:admin123')); // Suas credenciais

fetch('http://localhost:8080/cidadaos', { headers: headers })
    .then(res => res.json())
    .then(data => {
        const corpo = document.querySelector("#tabelaCidadaos tbody");
        data.forEach(c => {
            corpo.innerHTML += `<tr><td>${c.nome}</td><td>${c.cpf}</td></tr>`;
        });
    });