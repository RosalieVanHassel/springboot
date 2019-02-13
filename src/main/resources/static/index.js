function versturen(){

    var bootnaam = document.getElementById("bootnaamvak").value;
    alert(bootnaam);
}
$(document).on('click', '#test', function(){
    $.ajax({
            type:'get',
            url: '/api',
            success: function(result) {
                document.getElementById("test").innerHTML = result;

            }
        });


})
