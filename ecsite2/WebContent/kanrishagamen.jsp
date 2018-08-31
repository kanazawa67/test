<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />

<title>管理者画面</title>

<style type="text/css">
/*========TAG LAYOUT========*/
body{
margin:0;
padding:0;
line-height:1.6;
letter-spacing:1px;
font-family:Verdana,Helvetica,sans-serif;
font-size:12px;
color:#333;
background:#fff;
}

table{
text-align:center;
margin:0 auto;
}

/*========ID LAYOUT========*/
#top{
width:780px;
margin:30px auto;
border:1px solid #333;
}

#heade1r{
width:100%;
height:80px;
background-color:black;
}

#main{
width:100%;
height:500px;
text-align:center;
}

#left{
margin-left:300px;
float:left;
width:100px;
height:100px;
}

#right{
margin-right:300px;
float:right;
width:100px;
height:100px;
}

#footer{
clear:both;
width:100%;
height:80px;
background-color:black;
clear:both;
}

#text-link{
display:inline-block;
text-align:right;
}
</style>
</head>
<body>

	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>管理者画面</p>
		</div>

		<div id="left">
			<h3>商品管理</h3>
			<s:form action="ShohinCreateAction">
				<s:submit value="商品追加画面"/>
			</s:form>
			<s:form action="ShohinIchiranAction">
				<s:submit value="商品一覧画面"/>
			</s:form>
		</div>

		<div id="right">
		<h3>ユーザー管理</h3>
			<s:form action="UserCreateAction2">
				<s:submit value="ユーザー追加画面"/>
			</s:form>
			<s:form action="UserIchiranAction">
				<s:submit value="ユーザー一覧画面"/>
			</s:form>
		</div>




	</div>
<div id="text-right">
<p>ログアウトする場合は<a href='<s:url action="LogoutAction"/>'>こちら</a></p>
</div>
</body>
</html>