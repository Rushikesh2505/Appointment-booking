package com.file.beans;

public class ViewOrderItemBean {
	
private String orderItemId;
	
	private String fileName;
	
	private String quantity;
	
	private String coordinate_x;
	
	private String coordinate_y;
	
	private String coordinate_z;
	
	private String stlFile;
	
	private String uploadedFileName;
	
	private String fileSize;
	
	private String actualVolume;
	
	private String surfaceArea;

	private String unitCost;
	
	private String totalCost;
	
	private String colorName;
	
	private String processName;
	
	private String materialName;
	
	private String finishingName;
	
	/** The infill percentage. */
	private String infillPercentage;
	
	/** The layer thickness. */
	private String layerThickness;
	
	/** The total weight. */
	private String totalWeight;
	
	/** The note. */
	private String note;
	
	private String layerType;
	
	private String infillType;
	

	
	private String orderCode;

	
	
	
	public String getInfillPercentage() {
		return infillPercentage;
	}

	public void setInfillPercentage(String infillPercentage) {
		this.infillPercentage = infillPercentage;
	}

	public String getLayerThickness() {
		return layerThickness;
	}

	public void setLayerThickness(String layerThickness) {
		this.layerThickness = layerThickness;
	}

	public String getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(String totalWeight) {
		this.totalWeight = totalWeight;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getLayerType() {
		return layerType;
	}

	public void setLayerType(String layerType) {
		this.layerType = layerType;
	}

	public String getInfillType() {
		return infillType;
	}

	public void setInfillType(String infillType) {
		this.infillType = infillType;
	}

	public String getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(String orderItemId) {
		this.orderItemId = orderItemId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getCoordinate_x() {
		return coordinate_x;
	}

	public void setCoordinate_x(String coordinate_x) {
		this.coordinate_x = coordinate_x;
	}

	public String getCoordinate_y() {
		return coordinate_y;
	}

	public void setCoordinate_y(String coordinate_y) {
		this.coordinate_y = coordinate_y;
	}

	public String getCoordinate_z() {
		return coordinate_z;
	}

	public void setCoordinate_z(String coordinate_z) {
		this.coordinate_z = coordinate_z;
	}

	public String getStlFile() {
		return stlFile;
	}

	public void setStlFile(String stlFile) {
		this.stlFile = stlFile;
	}

	public String getUploadedFileName() {
		return uploadedFileName;
	}

	public void setUploadedFileName(String uploadedFileName) {
		this.uploadedFileName = uploadedFileName;
	}

	public String getFileSize() {
		return fileSize;
	}

	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}

	public String getActualVolume() {
		return actualVolume;
	}

	public void setActualVolume(String actualVolume) {
		this.actualVolume = actualVolume;
	}

	public String getSurfaceArea() {
		return surfaceArea;
	}

	public void setSurfaceArea(String surfaceArea) {
		this.surfaceArea = surfaceArea;
	}

	public String getUnitCost() {
		return unitCost;
	}

	public void setUnitCost(String unitCost) {
		this.unitCost = unitCost;
	}

	public String getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(String totalCost) {
		this.totalCost = totalCost;
	}

	public String getColorName() {
		return colorName;
	}

	public void setColorName(String colorName) {
		this.colorName = colorName;
	}

	public String getProcessName() {
		return processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}

	public String getMaterialName() {
		return materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public String getFinishingName() {
		return finishingName;
	}

	public void setFinishingName(String finishingName) {
		this.finishingName = finishingName;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	@Override
	public String toString() {
		return "ViewOrderItemBean [orderItemId=" + orderItemId + ", fileName=" + fileName + ", quantity=" + quantity
				+ ", coordinate_x=" + coordinate_x + ", coordinate_y=" + coordinate_y + ", coordinate_z=" + coordinate_z
				+ ", stlFile=" + stlFile + ", uploadedFileName=" + uploadedFileName + ", fileSize=" + fileSize
				+ ", actualVolume=" + actualVolume + ", surfaceArea=" + surfaceArea + ", unitCost=" + unitCost
				+ ", totalCost=" + totalCost + ", colorName=" + colorName + ", processName=" + processName
				+ ", materialName=" + materialName + ", finishingName=" + finishingName + ", infillPercentage="
				+ infillPercentage + ", layerThickness=" + layerThickness + ", orderCode=" + orderCode + "]";
	}
	
	
	

}
