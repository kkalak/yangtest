<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<link rel="stylesheet" type="text/css" href="${root}/css/bootstrap.min.css">

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
				<div class="panel-heading">
					<h3 class="animated fadeInLeft">예약신청</h3>
					<p class="animated fadeInDown">
						자산관리 <span class="fa-angle-right fa"></span>예약신청
					</p>
				</div>
				<div class="col-md-12 tabs-area">
					<ul id="tabs-demo6" class="nav nav-tabs nav-tabs-v6" role="tablist">
						<li role="presentation" class="active"><a
							href="#tabs-demo7-area1" id="tabs-demo6-1" role="tab"
							data-toggle="tab" aria-expanded="true">회의실 예약신청</a></li>
						<li role="presentation" class=""><a href="#tabs-demo7-area2"
							role="tab" id="tabs-demo6-2" data-toggle="tab"
							aria-expanded="false">법인차량 예약신청</a></li>
						<li role="presentation"><a href="#tabs-demo7-area3"
							id="tabs-demo6-3" role="tab" data-toggle="tab"
							aria-expanded="false">공용장비 예약신청</a></li>
					</ul>
					<div id="tabsDemo6Content"
						class="tab-content tab-content-v6 col-md-12">
						<div role="tabpanel" class="tab-pane fade active in"
							id="tabs-demo7-area1" aria-labelledby="tabs-demo7-area1">
							<div class="col-md-12 well">
								<div class="col-md-4" style="margin-top: 10px;">
									<div class="panel">
										<div class="panel-body">
											<div class="form-group form-animate-text">
												<span class="bar"></span> <input type="text"
													class="form-text date" required> <span class="bar"></span>
												<label><span class="icons icon-calendar"></span> 날짜
													선택</label>
											</div>
										</div>
									</div>
								</div>
								<div class="col-md-4">
									<div class="panel">
										<div class="panel-body">
											<div class="form-group form-animate-text">
												<span class="bar"></span> <label><span
													class="icons icon-people"></span> 회의실 선택</label>
												<div class="col-sm-12" style="margin-top: 40px;">
													<select id="room" class="select2-A" size="15"
														style="margin-top: 60px; width: 280px;">
														<c:forEach var="confList" items="${list}">
															<c:if
																test="${confList.strBCode eq 710 && confList.intUse_Flag eq 1}">
																<option value="${confList.strSCode}">${confList.strName}</option>
															</c:if>
														</c:forEach>
													</select>
												</div>
											</div>
										</div>
									</div>
								</div>
								<div class="col-md-4">
									<div class="panel">
										<div class="panel-body">
											<div class="form-group form-animate-text">
												<label><span class="icons icon-clock"></span> 시간 선택</label>
												<c:forEach var="timeList" items="${list}">
													<c:if
														test="${timeList.strBCode eq 700 && timeList.intUse_Flag eq 1}">
														<div class="col-sm-12" style="margin-top: 40px;">
															<input type="checkbox" name="${timeList.strSCode}">&nbsp;${timeList.strValue1}&nbsp;${timeList.strValue2}&nbsp;-&nbsp;${timeList.strValue3}&nbsp;${timeList.strValue4}<br>
														</div>
													</c:if>
												</c:forEach>

											</div>
										</div>
									</div>
								</div>
								<div class="col-md-6">
									<div class="panel">
										<div class="panel-body">이용사항</div>
									</div>
								</div>

								<div class="col-md-6">
									<div class="panel">
										<div class="panel-body">사용정보</div>
									</div>
								</div>

								<div class="col-md-12">
									<div class="panel">
										<div class="panel-body">메모</div>
									</div>
								</div>
							</div>
						</div>
						<div role="tabpanel" class="tab-pane fade" id="tabs-demo7-area2"
							aria-labelledby="tabs-demo7-area2">
							<div class="col-md-12 top-20 padding-0">
								<div class="col-md-12">
									<div class="panel">
										<div class="panel-body">
											<div class="responsive-table">
												<!-- <table id="datatables-example2"
													class="table table-striped table-bordered"
													style="width: 100%; cellspacing: 0;">
													<thead>
														<tr>
															
														</tr>
													</thead>
													<tbody>
														<tr>
															
														</tr>
													</tbody>
												</table> -->
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div role="tabpanel" class="tab-pane fade" id="tabs-demo7-area3"
							aria-labelledby="tabs-demo7-area3">
							<div class="col-md-12 top-20 padding-0">
								<div class="col-md-12">
									<div class="panel">
										<div class="panel-body">
											<div class="responsive-table">
												<!-- <table id="datatables-example3"
													class="table table-striped table-bordered"
													style="width: 100%; cellspacing: 0;">
													<thead>
														<tr>
															
														</tr>
													</thead>
													<tbody>
														<tr>
															
														</tr>
													</tbody>
												</table> -->
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

				</div>
			</div>
		</div>
		<!-- 실제 화면 구동부분  끝-->
	</div>
</div>
<!-- end: content -->

</html>