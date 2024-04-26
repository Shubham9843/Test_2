/**
 * 
 */// script.js
var slideIndex = 0;
var slides = document.getElementsByClassName("mySlides");
var autoSlideInterval;

function showSlides() {
    for (var i = 0; i < slides.length; i++) {
        slides[i].style.display = "none";
    }

    slideIndex++;

    if (slideIndex > slides.length) {
        slideIndex = 1;
    }

    slides[slideIndex - 1].style.display = "block";
}

function plusSlides(n) {
    clearInterval(autoSlideInterval);
    showSlides(slideIndex += n);
}

function startAutoSlide() {
    autoSlideInterval = setInterval(showSlides, 2000); // Adjust the interval as needed (2000 milliseconds = 2 seconds)
}

// Initial slide display
showSlides();

// Start automatic slideshow
startAutoSlide();
