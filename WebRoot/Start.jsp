<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib prefix="s" uri="/struts-tags"%>

<script src="jquery-3.2.1.js"></script>
<script src="jquery-ui.js"></script>

</head>

<body>

	<h1>Welcome!!!</h1>



	<div>
	<form action="save.action" method="post" accept-charset=utf-8>
		ID :<br> 
		<input type="text" name="id" id="id"> </br> 
		NAME :</br> 
		<input type="text" name="name" id="name"> </br> 
		ADDRESS :</br> 
		<input type="text" name="address" id="address"> </br> 
		<input type="submit" value="Save" id="save">
		</form>
		<input type="button" value="View Records" id="vr" onClick="callViewAction()">
	</div>

	<div id="div1"></div>



	<script type="text/javascript" src="Start.js"></script>

</body>
</html>
