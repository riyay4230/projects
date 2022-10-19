setInterval(function(){
	function time(el,deg)
	{
	el.setAttribute('transform','rotate('+deg+' 50 50)');
}
	var today = new Date();
	time(sec,6*today.getSeconds());
	time(min,6*today.getMinutes());
	time(hour,30*(today.getHours()%12 + today.getMinutes()/2));
}, 1);
