
<div class="list-group">
	<label>selecione á destinação</label>
	<c:forEach items="${destinations}" var="destination">
		
			<a
				href="${contextRoot}/show/destination/${destination.id}/hotels"
				class="list-group-item list-group-item-action" id="a_${destination.dest_name}">${destination.dest_name}
				
			</a>
		
	</c:forEach>
</div>
