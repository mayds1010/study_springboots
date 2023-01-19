<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous" />

<div class="container">
<c:set var="form_action" value="update" />
    <c:if test="${empty resultMap}">
   <c:set var="form_action" value="insert" />
   </c:if>

<form action="/commonCodeOur/${form_action}" method="post">

<%-- 코드 ID --%>
<input type="hidden" name="REGISTER_SEQ" value="UUID-1111-1111111" >
<input type="hidden" name="MODIFIER_SEQ" value="UUID-1111-1111111" >

<input type="hidden" name="PARENT_COMMON_CODE_ID" value="${resultMap.PARENT_COMMON_CODE_ID}">
<div class="form-group form-row">
	<div class="col">
		<label>코드 ID</label> <input class="form-control" type="text"
			name="COMMON_CODE_ID"  value="${resultMap.COMMON_CODE_ID}"
			placeholder="TEMPORORY_COMMONCODE" required ${form_action == "update" ? "readonly" :"" }/>
			<%-- required readonly 값이 변경되지 않음  --%>
		<div class="invalid-tooltip">
		</div>
		
	</div>
</div>
			
<%-- 코드명 --%>
<div class="form-group form-row">
	<div class="col">
		<label>코드명 </label> <input class="form-control" type="text"
			name="NAME" value="${resultMap.NAME}" placeholder="임시 코드명" required ${statusDisabled}/>
		<div class="invalid-tooltip">
		</div>
	</div>
</div>
			
<%-- 표시 순서 --%>
<div class="form-group form-row">
	<div class="col">
		<label>표시 순서 <span class="text-muted">(<spring:messagecode="text.option" />)
		</span></label> 
		<select class="form-control" name="ORDER_NUMBER" ${statusDisabled}>
		<%-- for(int number = 1; number <= 5; number++)와 비슷--%>
			<c:forEach var="number" begin="1" end="5">
				<option 
					${resultMap.ORDER_NUMBER == number ? 'selected' : ''}>${number }</option>
			         <%-- 삼항연산자 selected가 되면 선택 될 수 있도록--%>
			</c:forEach>
		</select>
	</div>
</div>
<%-- 설명 --%>
<div class="form-group form-row">
	<div class="col">
		<label>설명 <span class="text-muted">(<spring:messagecode="text.option" />)
		</span></label>
		<textarea class="form-control" rows="3" name="DESCRIPTION"
			placeholder=""
			${statusDisabled}>${resultMap.DESCRIPTION }</textarea>
	</div>
</div>
<%-- 시스템 코드여부 --%>
<div class="form-group form-row">
	<div class="col">
		<div class="form-check">
			<input type="checkbox" class="form-check-input" name="SYSTEM_CODE_YN"
				
				${resultMap.SYSTEM_CODE_YN == 'System_Code_Yes' ? 'checked' : ''}
				${statusDisabled}> <label class="form-check-label">시스템 코드여부</label>
		</div>
	</div>
</div>
<%-- 사용 여부 --%>
<div class="form-group form-row">
	<div class="col">
		<div class="form-check">
			<input type="checkbox" class="form-check-input" name="USE_YN"
				 ${resultMap.USE_YN == 'Yes' ? 'checked' : ''}
				${statusDisabled}> <label class="form-check-label">사용 여부</label>
		</div>
	</div>
</div>
<%-- Update --%>
<div class="row justify-content-between">
	<div class="col">
			<button class="btn btn-primary">
				${form_action} 
			</button>
<%-- List --%>
		<button class="btn btn-outline-info">
			List
		</button>
	</div>
	<div class="col text-right">
		<%-- <button type="button" class="btn btn-secondary" data-dismiss="modal">
			
		</button> --%>
	</div>
</div>
</form>
</div>
