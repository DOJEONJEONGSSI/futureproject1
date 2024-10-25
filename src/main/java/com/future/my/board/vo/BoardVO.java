package com.future.my.board.vo;

import org.springframework.web.multipart.MultipartFile;

public class BoardVO {
    
    private int boardNo;               /* 게시글 번호    */
    private String boardTitle;         /* 게시글 제목    */
    private String boardContent;       /* 게시글 내용    */
    private String memId;              /* 작성자 아이디  */
    private MultipartFile fileImage;  /* 게시판 사진 (MultipartFile로 변경) */
    private String boardimage;
    private String updateDt;		/* 수정 일자       */
    
    
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public MultipartFile getFileImage() {
		return fileImage;
	}
	public void setFileImage(MultipartFile fileImage) {
		this.fileImage = fileImage;
	}
	public String getBoardimage() {
		return boardimage;
	}
	public void setBoardimage(String boardimage) {
		this.boardimage = boardimage;
	}
	public String getUpdateDt() {
		return updateDt;
	}
	public void setUpdateDt(String updateDt) {
		this.updateDt = updateDt;
	}
	@Override
	public String toString() {
		return "BoardVO [boardNo=" + boardNo + ", boardTitle=" + boardTitle + ", boardContent=" + boardContent
				+ ", memId=" + memId + ", fileImage=" + fileImage + ", boardimage=" + boardimage + ", updateDt="
				+ updateDt + "]";
	}
    
    
}
