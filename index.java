
console.log("Welcome to Akshay_1304!");

document.querySelectorAll("nav a").forEach(link => {
    link.addEventListener("click", function() {
        console.log("You opened: " + this.textContent);
    });
});

document.querySelector(".btn").addEventListener("click", function() {
    console.log("Contact section opened!");
});
