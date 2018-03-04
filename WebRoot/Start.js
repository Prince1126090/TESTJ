
//function callMyAction() {
//
//	var a = $("#id").val();
//	var b = $("#name").val();
//	var c = $("#address").val();
//
//	 $.post("info.action",{id:a,name:b,address:c},popdiv);
//	// $("#div0").hide();
//	// alert("after ajax");
//}

function callViewAction() {
	// alert("view record button");
	$.get("info.action", popdiv);

}

function popdiv(itr, status) {
	var i = 1;
	if (status != "success") {
		alert("status: not successful");
	}
	var txt = "";
	txt += "<table border='1'>";

	txt += "<col width=\"7%\">";
	txt += "<col width=\"10%\">";
	txt += "<col width=\"10%\">";

	txt += "<tr><th>" + "CUSTOMER ID" + "</th>";
	txt += "<th>" + "NAME" + "</th>";
	txt += "<th>" + "ADDRESS" + "</th></tr>";

	for (x in itr.readingList) {

		txt += "<tr><td>" + itr.readingList[x].id + "</td>";
		txt += "<td>" + itr.readingList[x].name + "</td>";
		txt += "<td>" + itr.readingList[x].address + "</td></tr>";
		i++;
	}
	txt += "</table>";
	// txt += " <input type=\"button\" value=\"Save\" id=\"saveCurrentReading\"
	// onClick=\"saveCurrentReadingAction()\">" ;

	document.getElementById("div1").innerHTML = "";
	document.getElementById("div1").innerHTML = txt;

}
