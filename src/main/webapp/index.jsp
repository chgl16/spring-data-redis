<%@ page contentType="text/html;charset=utf-8" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>简单学生对象CRUD</title>
    <link rel="stylesheet" type="text/css" href="css/index.css">
</head>
<body>
<div id="root">
    <h2 class="slogan">简单学生对象CRUD</h2>
    <div id="operation-selection">
        <label onclick="change(1)">添加</label>
        <label onclick="change(2)">修改</label>
        <label onclick="change(3)">删除</label>
        <label onclick="change(4)">查询</label>
        <label onclick="change(5)">所有</label>
    </div>
    <div id="operation-window">
        <div id="create-div">
            <form action="./create.do" method="post">
                <input type="text" name="id" placeholder="学号（必填）"><br>
                <input type="text" name="name" placeholder="名字（必填）"><br>
                <input type="text" name="grade" placeholder="分数（必填）"><br>
                <input type="radio" name="gender" value="MALE" >男
                <input type="radio" name="gender" value="FEMALE">女<br><br>
                <input type="submit" value="提交">
                <input type="reset" value="重置">
            </form>
        </div>
        <div id="all-div">
            <table>
                <thead>
                    <th>学号</th>
                    <th>名字</th>
                    <th>性别</th>
                    <th>分数</th>
                </thead>
                <tbody>
                    <c:forEach var="student" items="${students}">
                        <tr>
                            <td>${student.id}</td>
                            <td>${student.name}</td>
                            <td>${student.gender}</td>
                            <td>${student.grade}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
<script src="js/index.js"></script>
<script src="lib/jquery.js"></script>
</html>
