<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <meta content="text/html; charset=UTF-8" http-equiv="content-type" />
    <base href="<%=request.getContextPath() %>/">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" type="image/jpg" href="images/favicon_green.png" />

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome CSS -->
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <!-- BX Slider CSS -->
    <link href="css/jquery.bxslider.min.css" rel="stylesheet">
    <!-- ANIMATE CSS -->
    <link rel="stylesheet" type="text/css" href="css/animate.css">

    <!-- Google Font CSS -->
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <!-- <link href="https://fonts.googleapis.com/css2?family=DM+Sans:wght@400;500;700&display=swap" rel="stylesheet"> -->
    <link href="https://fonts.googleapis.com/css2?family=PT+Sans+Narrow:wght@400;700&display=swap" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Righteous" type="text/css" rel="stylesheet" />
    <!-- Custom styles for this template -->
    <link href="css/stylesheet.css" rel="stylesheet">
 <!-- Global site tag (gtag.js) - Google Analytics -->
 
 <%
 	if(!"localhost".equalsIgnoreCase(request.getServerName()) && !"127.0.0.1".equalsIgnoreCase(request.getServerName())){
 %>
	<script async src="https://www.googletagmanager.com/gtag/js?id=UA-158752998-1"></script>
	<script>
	  window.dataLayer = window.dataLayer || [];
	  function gtag(){dataLayer.push(arguments);}
	  gtag('js', new Date());
	
	  gtag('config', 'UA-158752998-1');
	</script>
<%
 	}
%>	