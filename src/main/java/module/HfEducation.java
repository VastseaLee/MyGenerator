package module;

import java.util.Date;

public class HfEducation {
    private String id;

    private String hospCode;

    private String deptCode;

    private String deptName;

    private String creatorId;

    private String creatorName;

    private String categoryId;

    private String coverImgSrc;

    private String title;

    private String pptSrc;

    private Integer shareStatus;

    private Integer invalidFlag;

    private Date createTime;

    private Date updateTime;

    private String shareDept;

    private String shareDeptCode;

    private String shareDeptName;

    private String appVersion;

    private Integer reviewStatus;

    private String refuseReason;

    private String reviewUserId;

    private String reviewUserName;

    private Date reviewTime;

    private String hospCourseId;

    private Integer dataType;

    private String packEducationId;

    private String packEducationName;

    private Integer selfFlag;

    private String diagCodes;

    private String diagNames;

    private String labelCodes;

    private String labelNames;

    private String educationDesc;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getHospCode() {
        return hospCode;
    }

    public void setHospCode(String hospCode) {
        this.hospCode = hospCode == null ? null : hospCode.trim();
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId == null ? null : creatorId.trim();
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId == null ? null : categoryId.trim();
    }

    public String getCoverImgSrc() {
        return coverImgSrc;
    }

    public void setCoverImgSrc(String coverImgSrc) {
        this.coverImgSrc = coverImgSrc == null ? null : coverImgSrc.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getPptSrc() {
        return pptSrc;
    }

    public void setPptSrc(String pptSrc) {
        this.pptSrc = pptSrc == null ? null : pptSrc.trim();
    }

    public Integer getShareStatus() {
        return shareStatus;
    }

    public void setShareStatus(Integer shareStatus) {
        this.shareStatus = shareStatus;
    }

    public Integer getInvalidFlag() {
        return invalidFlag;
    }

    public void setInvalidFlag(Integer invalidFlag) {
        this.invalidFlag = invalidFlag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getShareDept() {
        return shareDept;
    }

    public void setShareDept(String shareDept) {
        this.shareDept = shareDept == null ? null : shareDept.trim();
    }

    public String getShareDeptCode() {
        return shareDeptCode;
    }

    public void setShareDeptCode(String shareDeptCode) {
        this.shareDeptCode = shareDeptCode == null ? null : shareDeptCode.trim();
    }

    public String getShareDeptName() {
        return shareDeptName;
    }

    public void setShareDeptName(String shareDeptName) {
        this.shareDeptName = shareDeptName == null ? null : shareDeptName.trim();
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion == null ? null : appVersion.trim();
    }

    public Integer getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(Integer reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public String getRefuseReason() {
        return refuseReason;
    }

    public void setRefuseReason(String refuseReason) {
        this.refuseReason = refuseReason == null ? null : refuseReason.trim();
    }

    public String getReviewUserId() {
        return reviewUserId;
    }

    public void setReviewUserId(String reviewUserId) {
        this.reviewUserId = reviewUserId == null ? null : reviewUserId.trim();
    }

    public String getReviewUserName() {
        return reviewUserName;
    }

    public void setReviewUserName(String reviewUserName) {
        this.reviewUserName = reviewUserName == null ? null : reviewUserName.trim();
    }

    public Date getReviewTime() {
        return reviewTime;
    }

    public void setReviewTime(Date reviewTime) {
        this.reviewTime = reviewTime;
    }

    public String getHospCourseId() {
        return hospCourseId;
    }

    public void setHospCourseId(String hospCourseId) {
        this.hospCourseId = hospCourseId == null ? null : hospCourseId.trim();
    }

    public Integer getDataType() {
        return dataType;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public String getPackEducationId() {
        return packEducationId;
    }

    public void setPackEducationId(String packEducationId) {
        this.packEducationId = packEducationId == null ? null : packEducationId.trim();
    }

    public String getPackEducationName() {
        return packEducationName;
    }

    public void setPackEducationName(String packEducationName) {
        this.packEducationName = packEducationName == null ? null : packEducationName.trim();
    }

    public Integer getSelfFlag() {
        return selfFlag;
    }

    public void setSelfFlag(Integer selfFlag) {
        this.selfFlag = selfFlag;
    }

    public String getDiagCodes() {
        return diagCodes;
    }

    public void setDiagCodes(String diagCodes) {
        this.diagCodes = diagCodes == null ? null : diagCodes.trim();
    }

    public String getDiagNames() {
        return diagNames;
    }

    public void setDiagNames(String diagNames) {
        this.diagNames = diagNames == null ? null : diagNames.trim();
    }

    public String getLabelCodes() {
        return labelCodes;
    }

    public void setLabelCodes(String labelCodes) {
        this.labelCodes = labelCodes == null ? null : labelCodes.trim();
    }

    public String getLabelNames() {
        return labelNames;
    }

    public void setLabelNames(String labelNames) {
        this.labelNames = labelNames == null ? null : labelNames.trim();
    }

    public String getEducationDesc() {
        return educationDesc;
    }

    public void setEducationDesc(String educationDesc) {
        this.educationDesc = educationDesc == null ? null : educationDesc.trim();
    }
}