function loadXML() {
    var XML_PATH = "./Cars.xml";
    var select = $('#make');
    alert("Hello");
    
    $.ajax({
        type: "GET",
        url: XML_PATH,
        dataType: "xml",
        success: function (xml) {
            $(xml).find('make').each(function () {
                var ou = $(this).text();
                alert(ou);
                select.append("<option/><option>" + ou + "</option>");
            });
        }
    });
}