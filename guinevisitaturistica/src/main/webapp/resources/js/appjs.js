


$(function(){
	
	///active menu problem solved here
	
	switch(menu){
	case 'gastronomie':
		$('#culture').addClass('active');
		break;
		
	case 'ethnies':
		$('#culture').addClass('active');
		break;
		
	case 'reservation':
		$('#reservation').addClass('active');
		break;
		
		
	case 'contact':
		$('#contact').addClass('active');
		break;
		
		
		default:
			$('#a_'+menu).addClass('active');
		
		break;
	}
	
    

	 

		
	
});




$(document).ready(function () {
	  
    $("#usr1").datepicker({
    	showAnim:'drop',
    	numberOfMonth:1,
        minDate: 0,
        format: 'dd-mm-yyyy',
        autoclose: true,
		onclose: function(selectedDate){
			
			$("#usr2").datepicker("option","minDate",selectedDate);
		}	    
    });
    
    
    
    $("#usr2").datepicker({
    	showAnim:'drop',
    	numberOfMonth:1,
        minDate: 0,
        format:'dd-mm-yyyy',
		onclose: function(selectedDate){
			
			$("#usr1").datepicker("option","maxDate",selectedDate);
		}	    
		
    });
    
    
    AOS.init(
    {
    	'duration':1200
    	
    }		
    
    );
    
    
   

    $('input[type="number"]').niceNumber();
    
});


function myFunction(imgs) {
	  var expandImg = document.getElementById("expandedImg");
	  expandImg.src = imgs.src;
	  expandImg.parentElement.style.display = "block";
	  
	};
	
	
	

	$('input').spunkySlider();

	







