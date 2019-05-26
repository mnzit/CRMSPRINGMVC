<%@include file="../../../shared/header.jsp" %>
<div class="jumbotron">
    <h1 class="display-4 text-center">ADD FOLLOW UP STATUS</h1>
</div>
<form action="${SITE_URL}/admin/master/enquiries/followup/status/" method="POST">
        <div class="row">
        <div class="col-md-6">
            <div class="form-group">
        <label>Status name</label>
        <input type="text" class="form-control" name="name" required="required">
    </div>
        </div>
        <div class="col-md-6">
            <div class="form-group">
                <label>Status color</label>
                <input type="text" class="form-control" name="color" required="required">
            </div>
        </div>
    </div>
    <button type="submit" class="btn btn-primary float-right"><i class="fa fa-save"></i> Add</button>
</form>
<%@include file="../../../shared/footer.jsp" %>