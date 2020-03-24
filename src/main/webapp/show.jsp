<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath() %>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
<table>
  <tr>
    <th>编号</th>
    <th>英文名字</th>
    <th>中文名字</th>
    <th>品牌</th>
    <th>种类</th>
    <th>尺寸</th>
    <th>价格</th>
    <th>数量</th>
    <th>标签</th>
    <th>图片</th>
    <th>操作</th>
  </tr>
  <c:forEach items="${plist.list }" var="u">
  <tr>
    <td>${u.gid }</td>
    <td>${u.ename }</td>
    <td>${u.cname }</td>
    <td>${u.bname }</td>
    <td>${u.kname }</td>
    <td>${u.size }</td>
    <td>${u.price }</td>
    <td>${u.num }</td>
    <td>${u.label }</td>
    <td>
    <img alt="图片损坏" src="lookImg?path=${u.priurl }" width="70px" height="55px">
    </td>
    <td>操作</td>
  </tr>
  </c:forEach>
  <tr>
  <td colspan="11">
  <a href="show?pageNum=${plist.firstPage }">首页</a>
  <a href="show?pageNum=${plist.prePage }">上一页</a>
  <a href="show?pageNum=${plist.nextPage }">下一页</a>
  <a href="show?pageNum=${plist.lastPage }">尾页</a>
  </td>
  </tr>
  
</table>
<a href="toadd"><input type="button" value="添加"></a>
</body>
</html>