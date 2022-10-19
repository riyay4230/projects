function submitAnswers(){
	                     var total=5;
                         var score=0;
       //input
       var q1=document.forms["quiz"]["q1"].value;
   var q2=document.forms["quiz"]["q2"].value;
var q3=document.forms["quiz"]["q3"].value;
var q4=document.forms["quiz"]["q4"].value;
var q5=document.forms["quiz"]["q5"].value;
//validation
for ( var i=1;i<=total; i++) 
{
	if (eval('q'+i)==null||eval('q'+i)=="")
 {
 	alert("you missed question "+i);
 }
}
	//correct answer

	var answers=["b","a","d","b","d"];
	//chek answer
	for ( i=1;i<=total; i++) 
	{
		if (eval('q'+i)==answers[i-1])
			{
				score++;
			}
    }
		//Display result
	var results=document.getElementById('results');
	results.innerHTML="<h3>your correct answer are <span> "+score+" </span>out of<span> "+total+" </span></h3>";
	return false;
}