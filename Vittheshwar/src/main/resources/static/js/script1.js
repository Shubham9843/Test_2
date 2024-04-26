document.addEventListener("DOMContentLoaded", function() {
    var cards = document.querySelectorAll(".card");
    
    cards.forEach(function(card) {
        var readMoreButton = card.querySelector(".read-more-btn");
        var readLessButton = card.querySelector(".read-less-btn");
        var cardContent = card.querySelector(".card-content");
        
        readMoreButton.addEventListener("click", function() {
            cardContent.classList.add("expanded");
            readMoreButton.style.display = "none";
        });

        readLessButton.addEventListener("click", function() {
            cardContent.classList.remove("expanded");
            readMoreButton.style.display = "inline";
        });
    });
});
