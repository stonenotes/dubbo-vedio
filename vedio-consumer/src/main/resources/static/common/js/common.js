// 一般直接写在一个js文件中
layui.use(['layer', 'form', 'element'], function () {
    var layer = layui.layer
        , form = layui.form
        , element = layui.element
        , $ = layui.jquery;
    //layer.msg('Hello World');
    console.log("---------------first----");
    $(".layui-nav-item").click(function () {
        var url = $(this).attr("url");
        console.log("-----url---" + url);
       loadContainer(url);
    });

    loadContainer("/login");

    function loadContainer(url) {
        $.ajax({
            url: url,
            success: function(data){
                $("#rightContainer").html(data);
            },
            error : function() {
                alert("error");
            }
        });
    }
});

