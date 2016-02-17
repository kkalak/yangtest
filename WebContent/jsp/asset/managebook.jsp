<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath }" />
<c:set var="count" value="1"></c:set>
<!DOCTYPE html>
<html lang="en">

<!-- start: content -->
<div id="content">
	<div class="panel">

		<div class="panel-body">
			<div class="col-md-6 col-sm-12">
				<h3 class="animated fadeInLeft">DC16th Team No.2 GroupWare
					Project</h3>
			</div>

			<div class="col-md-6 col-sm-12 text-right">
				<h5 id="addr" style="color: #DDDDDE;">
					<span class="fa  fa-map-marker"></span>
				</h5>
			</div>
		</div>

	</div>
	<div>
		<!-- 실제 화면 구동부분 -->
		<div class="col-md-12 top-20 padding-0">
			<div class="col-md-12">
				<div class="panel">
					<div class="panel-heading">
						<h3 class="animated fadeInLeft">도서관리</h3>
						<p class="animated fadeInDown">
							자산관리 <span class="fa-angle-right fa"></span> 도서관리
						</p>
					</div>
					<div class="panel-body">
						<div class="responsive-table">
							<table id="datatables-example"
								class="table table-striped table-bordered"
								style="width: 100%; cellspacing: 0;">
								<thead>
									<tr>
										<th>NO</th>
										<th>등록시간</th>
										<th>분류</th>
										<th>도서명</th>
										<th>저자</th>
										<th>출판사</th>
										<th>구입금액</th>
										<th>등록자</th>
									</tr>
								</thead>
								<tbody>									
									<c:forEach var="comList" items="${list}">
										<tr>
											<c:if test="${comList.strBCode eq 750 && comList.intUse_Flag eq 1}">
												<td>${comList.intSort}</td>
												<td></td>
												<td>${comList.strBName}</td>
												<td>${comList.strName}</td>
												<td>${comList.strValue1}</td>
												<td>${comList.strValue2}</td>
												<td>${comList.strValue3}</td>
												<td></td>
											</c:if>										
										</tr>
									</c:forEach>									
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- 실제 화면 구동부분 끝 -->
	</div>
</div>
<!-- end: content -->

</html>