package hu.bme.mit.ftsrg.chaincode.thesisportal;

public class Thesis {
  private String id;
  //private String owner;
  private String studentId;
  private String teacherId;
  private boolean approved;
  //private String reviewerId;

  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  public String getStudentId() {
    return studentId;
  }
  public void setStudentId(String studentId) {
    this.studentId = studentId;
  }
  public String getTeacherId() {
    return teacherId;
  }
  public void setTeacherId(String teacherId) {
    this.teacherId = teacherId;
  }
  public boolean isApproved() {
    return approved;
  }
  public void setApproved(boolean approved) {
    this.approved = approved;
  }
}
