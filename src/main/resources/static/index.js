$(document).on('click', '#verhuurbutton', function(){
    $.ajax({
            type:'get',
            url: '/api',
            success: function(result) {
                returnfunction(result);
//                document.getElementById("test").innerHTML = result;
            }
        });
})

function returnfunction(antwoordserver){
    $('#naamschip').html(antwoordserver.naam)

}
$(document).on('click', '#bootnaamvak', function(){

    $.ajax({
            type:'get',
            url: '/allboots',
            success: function(result) {
                console.log(result);
                returnAll(result);
            }
        });
})

function returnAll(result){

                var content = '<table id = "allSchip" class="table table-bordered table-striped table-hover table-condensed">';
             content += '<thead id = tableHeader>';
             content += '<tr> <th> Boot ID </th>';
             content += '<th> model </th>';
             content += '<th> lengte </th>';
             content += '<th> aantalPassagiers </th>';
             content += '<th> bouwdatum </th>';
             content += '<th> naam </th>';
             content += '<th> topSnelheid</th>';
             content += '</thead>';
             content += '<tbody id = "tablebody">';


            $.each(result, function (index, result) {

                 content += "<tr id = 'schipRow'>";
                 content += "<td style='cursor: pointer;' id='schipId'> " + result.id + "</td>";
                 content += '<td>' + result.model + '</td>';
                 content += "<td>" + result.lengte + "</td>";
                 content += "<td>" + result.aantalPassagiers + "</td>";
                 content += "<td>" + result.bouwdatum + "</td>";
                 content += "<td>" + result.naam+ "</td>";
                 content += "<td>" + result.topSnelheid + "</td>";
                 content += "</tr>";
})
             content += '</tbody> </table> <div class = "row"></div>';

             $("#allSchipDiv").html(content);
             $('#allSchip').DataTable();
            }