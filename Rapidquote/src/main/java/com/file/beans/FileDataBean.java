package com.file.beans;

public class FileDataBean { 
	
	private String fileName;

	private String actualVolume;

	private String surfaceArea;

	private String X;

	private String Y;

	private String Z;
	
	private String partCost;
	
	private String capturePath;
	
	private String uploadedFileName;
	
	private String serverFileName;
	
	private String fileSize;
	

	/** The measure unit. */
	private String measureUnit;
	
	/** The Xmm. */
	private String Xmm;
	
	/** The Ymm. */
	private String Ymm;
	
	/** The Zmm. */
	private String Zmm;
	
	/** The actual volumemm. */
	private String actualVolumemm;

	/** The surface areamm. */
	private String surfaceAreamm;
	
	private String note;
	


	public String getMeasureUnit() {
		return measureUnit;
	}

	public void setMeasureUnit(String measureUnit) {
		this.measureUnit = measureUnit;
	}

	public String getXmm() {
		return Xmm;
	}

	public void setXmm(String xmm) {
		Xmm = xmm;
	}

	public String getYmm() {
		return Ymm;
	}

	public void setYmm(String ymm) {
		Ymm = ymm;
	}

	public String getZmm() {
		return Zmm;
	}

	public void setZmm(String zmm) {
		Zmm = zmm;
	}

	public String getActualVolumemm() {
		return actualVolumemm;
	}

	public void setActualVolumemm(String actualVolumemm) {
		this.actualVolumemm = actualVolumemm;
	}

	public String getSurfaceAreamm() {
		return surfaceAreamm;
	}

	public void setSurfaceAreamm(String surfaceAreamm) {
		this.surfaceAreamm = surfaceAreamm;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
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

	public String getX() {
		return X;
	}

	public void setX(String x) {
		X = x;
	}

	public String getY() {
		return Y;
	}

	public void setY(String y) {
		Y = y;
	}

	public String getZ() {
		return Z;
	}

	public void setZ(String z) {
		Z = z;
	}

	public String getPartCost() {
		return partCost;
	}

	public void setPartCost(String partCost) {
		this.partCost = partCost;
	}

	public String getCapturePath() {
		return capturePath;
	}

	public void setCapturePath(String capturePath) {
		this.capturePath = capturePath;
	}

	public String getUploadedFileName() {
		return uploadedFileName;
	}

	public void setUploadedFileName(String uploadedFileName) {
		this.uploadedFileName = uploadedFileName;
	}

	public String getServerFileName() {
		return serverFileName;
	}

	public void setServerFileName(String serverFileName) {
		this.serverFileName = serverFileName;
	}

	public String getFileSize() {
		return fileSize;
	}

	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}

	@Override
	public String toString() {
		return "FileDataBean [fileName=" + fileName + ", actualVolume=" + actualVolume + ", surfaceArea=" + surfaceArea
				+ ", X=" + X + ", Y=" + Y + ", Z=" + Z + ", partCost=" + partCost + ", capturePath=" + capturePath
				+ ", uploadedFileName=" + uploadedFileName + ", serverFileName=" + serverFileName + ", fileSize="
				+ fileSize + ", measureUnit=" + measureUnit + ", Xmm=" + Xmm + ", Ymm=" + Ymm + ", Zmm=" + Zmm
				+ ", actualVolumemm=" + actualVolumemm + ", surfaceAreamm=" + surfaceAreamm + ", note=" + note
				+ ", getMeasureUnit()=" + getMeasureUnit() + ", getXmm()=" + getXmm() + ", getYmm()=" + getYmm()
				+ ", getZmm()=" + getZmm() + ", getActualVolumemm()=" + getActualVolumemm() + ", getSurfaceAreamm()="
				+ getSurfaceAreamm() + ", getNote()=" + getNote() + ", getFileName()=" + getFileName()
				+ ", getActualVolume()=" + getActualVolume() + ", getSurfaceArea()=" + getSurfaceArea() + ", getX()="
				+ getX() + ", getY()=" + getY() + ", getZ()=" + getZ() + ", getPartCost()=" + getPartCost()
				+ ", getCapturePath()=" + getCapturePath() + ", getUploadedFileName()=" + getUploadedFileName()
				+ ", getServerFileName()=" + getServerFileName() + ", getFileSize()=" + getFileSize() + ", getClass()=" + getClass() + ", hashCode()="
						+ hashCode() + ", toString()=" + super.toString() + "]";
	}


}
