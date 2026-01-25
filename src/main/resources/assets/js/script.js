loadProdcuts();

function loadProdcuts(){

    let productRowBody = "";

    fetch("http://localhost:8080/products/")
    .then(res=> res.json())
    .then(data=>{
        data.forEach(element => {
            console.log(element)
            productRowBody+=`
            <div class="card" style="width: 18rem;">
                <img src="${element.image}" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">${element.name}</h5>
                    <p class="card-text">${element.description}</p>
                    <a href="#" class="btn btn-primary">${element.price}</a>
                </div>
            </div>`;
        });
        document.getElementById("product-row").innerHTML = productRowBody;
    })
}

