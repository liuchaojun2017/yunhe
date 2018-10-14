<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <title>table模块快速使用</title>
    <link rel="stylesheet" href="/LayerUi/layui/css/layui.css" media="all">
	<script type="text/javascript" src="/LayerUi/jq/jquery.js"></script>
</head>
<body>
书籍信息战展示
<hr>
<div class="demoTable">
    搜索商户：
    <div class="layui-inline">
        <input class="layui-input" name="keyword" id="demoReload" autocomplete="off">
    </div>
    <button class="layui-btn" data-type="reload">搜索</button>
</div>


<table id="demo" lay-filter="test"></table>

 
<script src="/LayerUi/layui/layui.js"></script>
<script>
layui.use('table', function(){
  var table = layui.table;
  
  //第一个实例
  table.render({
     elem: '#demo'
    ,height: 600
    ,url: '/LayerUi/Showbook' //数据接口
    ,page: true //开启分页
    ,cols: [[ //表头
      {field: 'Book_id', title: 'ID', width:80,sort: true, fixed: 'left'}
      ,{field: 'Book_des', title: '书名', width:80}
      ,{field: 'Book_name', title: '书籍描述', width:80, sort: true}
      ,{field:'right', title: '操作', width:300,toolbar:"#barDemo"}
    ]]
  , done: function(re, curr, count){
	    //如果是异步请求数据方式，res即为你接口返回的信息。
	    //如果是直接赋值的方式，res即为：{data: [], count: 99} data为当前页数据、count为数据总长度
	    console.log(re);
	    //得到当前页码
	    console.log("jjff:"+curr);
	    //得到数据总量
	    console.log(count);
	    }
  ,id:'testReload'
  });
  
  
  
  
  
//监听行工具事件
  table.on('tool(test)', function(obj){ //注：tool 是工具条事件名，test 是 table 原始容器的属性 lay-filter="对应的值"
    var data = obj.data //获得当前行数据
    ,layEvent = obj.event; //获得 lay-event 对应的值
    if(layEvent === 'detail'){
      layer.msg('查看操作');
    } else if(layEvent === 'del'){
      layer.confirm('真的删除行么', function(index){
           //obj.del(); //删除对应行（tr）的DOM结构
        layer.close(index);
        //向服务端发送删除指令
        $.ajax({
            url: "/LayerUi/shanchu",
            type: "POST",
            data:{"id":data.Book_id}, // data:{"id":data.Book_id,"memthodname":"deleteuv","aid":data.aid},
            dataType: "json",
            success: function(data){

                if(data.state==1){
                    obj.del();
                    layer.close(index);
                    layer.msg("删除成功", {icon: 6});
                }else{
                    layer.msg("删除失败", {icon: 5});
                }
            }

        });
        
        
      });
    } else if(layEvent === 'edit'){
      layer.msg('编辑操作');
    }
    
    
  });
});







</script>

<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="detail">查看</a>
  <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>


</body>
</html>