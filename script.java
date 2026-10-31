
// MOBILE NAVIGATION

const menuBtn = document.getElementById("menuBtn");
const navMenu = document.getElementById("navMenu");

menuBtn.addEventListener("click", () => {
    const isOpen = navMenu.classList.toggle("active");

    menuBtn.textContent = isOpen ? "×" : "☰";
    menuBtn.setAttribute("aria-expanded", isOpen);
    menuBtn.setAttribute(
        "aria-label",
        isOpen ? "Close navigation" : "Open navigation"
    );
});


// CLOSE MENU AFTER SELECTING A LINK

const navLinks = document.querySelectorAll("#navMenu a");

navLinks.forEach(link => {
    link.addEventListener("click", () => {
        navMenu.classList.remove("active");
        menuBtn.textContent = "☰";
        menuBtn.setAttribute("aria-expanded", "false");
    });
});


// AUTOMATIC COPYRIGHT YEAR

document.getElementById("year").textContent =
    new Date().getFullYear();


// SCROLL REVEAL ANIMATION

const revealElements = document.querySelectorAll(
    ".section, .skill-card"
);

revealElements.forEach(element => {
    element.classList.add("reveal");
});

const observer = new IntersectionObserver((entries) => {
    entries.forEach(entry => {
        if (entry.isIntersecting) {
            entry.target.classList.add("visible");
            observer.unobserve(entry.target);
        }
    });
}, {
    threshold: 0.12
});

revealElements.forEach(element => {
    observer.observe(element);
});
