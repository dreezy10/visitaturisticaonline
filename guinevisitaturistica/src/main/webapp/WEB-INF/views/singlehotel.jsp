<div class="container">
	<div class="row">

		<div class="col-12 breadcrumn">
			<nav aria-label="breadcrumb">
				<ol class="breadcrumb">
					<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
					<li class="breadcrumb-item"><a
						href="${contextRoot}/show/all/hotels">Hotels</a></li>
					<li class="breadcrumb-item active" aria-current="page">${hotel.name}</li>
				</ol>
			</nav>
		</div>
		<!-- end col-12 -->

	</div>
	<!-- first row set -->

	<div class="row">

		<div class="left">
			<p>Left Menu</p>
		</div>

		<div class="main">


			<div class="container">

				<div class="row">

					<div class="left_img">

						<img
							src="${contextRoot}/resources/imgHotels/${hotel.getPhoto_hotel()._1_photo}.jpg"
							class="responsive" alt="${hotel.getPhoto_hotel().photo_name}"
							width="100%" height="100%" id="expandedImg">
					</div>
					<!-- end left_img -->

					<div class="hotel_info">

						<span class="hotel-title">Hotel ${hotel.getName()}</span> <span
							class="b"><i class="material-icons" style="font-size: 1em">
								room </i>${hotel.getAddress()}</span>
							<span class="price">preço: ${hotel.getPrice()}&euro;</span>	
								 
								 
							<span class="a"> <c:if
                            test="${hotel.getCategory()== 5}">
								<i class="material-icons" style="font-size: 1em"> star </i>
								<i class="material-icons" style="font-size: 1em"> star </i>
								<i class="material-icons" style="font-size: 1em"> star </i>
								<i class="material-icons" style="font-size: 1em"> star </i>
								<i class="material-icons" style="font-size: 1em"> star </i>
							</c:if> <c:if test="${hotel.getCategory()== 4}">
								<i class="material-icons" style="font-size: 1em"> star </i>
								<i class="material-icons" style="font-size: 1em"> star </i>
								<i class="material-icons" style="font-size: 1em"> star </i>
								<i class="material-icons" style="font-size: 1em"> star </i>
							</c:if> <c:if test="${hotel.getCategory()== 3}">
								<i class="material-icons" style="font-size: 1em"> star </i>
								<i class="material-icons" style="font-size: 1em"> star </i>
								<i class="material-icons" style="font-size: 1em"> star </i>
							</c:if> <c:if test="${hotel.getCategory()== 2}">
								<i class="material-icons" style="font-size: 1em"> star </i>
								<i class="material-icons" style="font-size: 1em"> star </i>
							</c:if>
						</span>
						   
						
						 <br> 
						 
						 <span class="a"><i class="material-icons"
							style="font-size: 1em">call</i>${hotel.getTel()}</span> <br> <label
							class="label_setup">entrada:</label> <input type="text"
							style="width: 135px; background-color: #fff;"
							class="form-control" id="usr1" name="event_date"
							placeholder="DD-MM-YYYY" autocomplete="off"> 
							<br> <label
							class="label_setup">saída:</label> <input type="text"
							style="width: 135px; background-color: #fff; margin-left: 17px;"
							class="form-control" id="usr2" name="event_date"
							placeholder="DD-MM-YYYY" autocomplete="off"> 
							
							<div class="box-spinner">
							<span>quartos:</span>
							<input type="number"value="1" min="1" max="10" step="1" class="spinner" id="spinner"><br>
							</div>
							
					</div>




				</div>
				<!-- end row -->
			</div>
			<!-- end container -->

		</div>
		<!-- end main -->



		<div class="right">
			<p></p>
		</div>

		<!-- second row set -->

		<div class="sizing_">
			<div class="row">

				<tr class="">
					<%@include file="./shared/images_hotels.jsp"%>
				</tr>

			</div>
			<!-- third row -->

		</div>


	</div>
	<!-- end container -->