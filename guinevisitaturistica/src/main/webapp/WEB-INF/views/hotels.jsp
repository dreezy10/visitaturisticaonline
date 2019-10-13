
<div class="container">
	<div class="row">

		<div class="col-12">

			<hr>
			<h2>
				<span style="background-color: #fed136;">Todos os Hoteis em Guiné Bissau estão desponiveis aqui, We the Best.</span>
			</h2>

			<hr>

		</div>
		<!-- div col12 -->

	</div>
	<!-- div first row ends here -->

	<div class="row">
		<div class="col-4">

			<%@include file="./shared/listvilles.jsp"%>


		</div>


		<div class="col-8">

			<div class="col-12 gallery" style="margin: 10px 40px;">
				<span>escolhe Hotel desejado,  
					${destination.getDest_name()} </span>
				<hr>
	<c:if test="${userclickreservation==true}">
				<c:forEach items="${hotels}" var="hotel">
					<div class="responsive" data-aos="zoom-in-down">

						<div class="gallery">
							<a href="${contextRoot}/show/${hotel.id}/singlehotel"><img
								src="${contextRoot}/resources/imgHotels/${hotel.getPhoto_hotel()._1_photo}.jpg"
								alt="${hotel.getPhoto_hotel().photo_name}" width="800px"
								height="600px">

							</a>
							
							<div class="desc">
									<h6><a  href="" style="text-decoration:none;">Hotel ${hotel.getPhoto_hotel().photo_name}</a></h6>
								</div>
						</div>
						<!-- end galery -->
					</div>
					<!-- end responsive -->
				</c:forEach>
			</c:if>	
				
				<c:if test="${userclickSingleDestination==true}">
				
				<c:forEach items="${hotelbydestination}" var="hotelsdestination">
					<div class="responsive">

						<div class="gallery">
							<a href="${contextRoot}/show/${hotelsdestination.id}/singlehotel"> <img
								src="${contextRoot}/resources/imgHotels/${hotelsdestination.getPhoto_hotel()._1_photo}.jpg"
								alt="${hotelsdestination.getPhoto_hotel().photo_name}" width="800px"
								height="600px">

							</a>
							
							<div class="desc">
									<h6><a  href="" style="text-decoration:none;">Hotel ${hotelsdestination.getPhoto_hotel().photo_name}</a></h6>
								</div>
						</div>
						<!-- end galery -->
					</div>
					<!-- end responsive -->
				</c:forEach>
				</c:if>
				
			</div>
			<!-- div col12 -->

		</div>
	</div>
	<!-- div third row ends here -->
</div>
<!-- second row ends here -->



<div class="row">

	<!-- CODE WILL BE AVAILABLE SOON -->

</div>
<!-- div container -->



