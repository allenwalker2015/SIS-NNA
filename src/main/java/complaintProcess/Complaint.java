package complaintProcess;
// Generated Aug 31, 2019 12:09:55 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Complaint generated by hbm2java
 */
public class Complaint  implements java.io.Serializable {


     private Integer idcomplaint;
     private Staff staff;
     private TypeAbuse typeAbuse;
     private byte complaintCategory;
     private byte complaintType;
     private String comment;
     private Date date;
     private Date time;
     private String status;
     private Date createdUp;
     private Date updatedUp;
     private String accused;
     private String program;
     private String victimName;
     private int victimAge;
     private String victimGender;
     private String victimGrade;
     private String victimLocation;
     private String victionGuardian;
     private String victimAddress;
     private String confidentNumber;
     private Integer numberAbuse;
     private byte isNotifiedGuardian;
     private String victimComment;
     private byte isVictimInDanger;
     private Integer processId;
     private Byte veracity;
     private String record;
     private Set<Process> processes = new HashSet<Process>(0);

    public Complaint() {
    }

	
    public Complaint(TypeAbuse typeAbuse, byte complaintCategory, byte complaintType, String comment, Date date, Date time, String status, Date createdUp, String accused, String program, String victimName, int victimAge, String victimGender, String victimLocation, String victionGuardian, String confidentNumber, byte isNotifiedGuardian, String victimComment, byte isVictimInDanger) {
        this.typeAbuse = typeAbuse;
        this.complaintCategory = complaintCategory;
        this.complaintType = complaintType;
        this.comment = comment;
        this.date = date;
        this.time = time;
        this.status = status;
        this.createdUp = createdUp;
        this.accused = accused;
        this.program = program;
        this.victimName = victimName;
        this.victimAge = victimAge;
        this.victimGender = victimGender;
        this.victimLocation = victimLocation;
        this.victionGuardian = victionGuardian;
        this.confidentNumber = confidentNumber;
        this.isNotifiedGuardian = isNotifiedGuardian;
        this.victimComment = victimComment;
        this.isVictimInDanger = isVictimInDanger;
    }
    public Complaint(Staff staff, TypeAbuse typeAbuse, byte complaintCategory, byte complaintType, String comment, Date date, Date time, String status, Date createdUp, Date updatedUp, String accused, String program, String victimName, int victimAge, String victimGender, String victimGrade, String victimLocation, String victionGuardian, String victimAddress, String confidentNumber, Integer numberAbuse, byte isNotifiedGuardian, String victimComment, byte isVictimInDanger, Integer processId, Byte veracity, String record, Set<Process> processes) {
       this.staff = staff;
       this.typeAbuse = typeAbuse;
       this.complaintCategory = complaintCategory;
       this.complaintType = complaintType;
       this.comment = comment;
       this.date = date;
       this.time = time;
       this.status = status;
       this.createdUp = createdUp;
       this.updatedUp = updatedUp;
       this.accused = accused;
       this.program = program;
       this.victimName = victimName;
       this.victimAge = victimAge;
       this.victimGender = victimGender;
       this.victimGrade = victimGrade;
       this.victimLocation = victimLocation;
       this.victionGuardian = victionGuardian;
       this.victimAddress = victimAddress;
       this.confidentNumber = confidentNumber;
       this.numberAbuse = numberAbuse;
       this.isNotifiedGuardian = isNotifiedGuardian;
       this.victimComment = victimComment;
       this.isVictimInDanger = isVictimInDanger;
       this.processId = processId;
       this.veracity = veracity;
       this.record = record;
       this.processes = processes;
    }
   
    public Integer getIdcomplaint() {
        return this.idcomplaint;
    }
    
    public void setIdcomplaint(Integer idcomplaint) {
        this.idcomplaint = idcomplaint;
    }
    public Staff getStaff() {
        return this.staff;
    }
    
    public void setStaff(Staff staff) {
        this.staff = staff;
    }
    public TypeAbuse getTypeAbuse() {
        return this.typeAbuse;
    }
    
    public void setTypeAbuse(TypeAbuse typeAbuse) {
        this.typeAbuse = typeAbuse;
    }
    public byte getComplaintCategory() {
        return this.complaintCategory;
    }
    
    public void setComplaintCategory(byte complaintCategory) {
        this.complaintCategory = complaintCategory;
    }
    public byte getComplaintType() {
        return this.complaintType;
    }
    
    public void setComplaintType(byte complaintType) {
        this.complaintType = complaintType;
    }
    public String getComment() {
        return this.comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    public Date getTime() {
        return this.time;
    }
    
    public void setTime(Date time) {
        this.time = time;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public Date getCreatedUp() {
        return this.createdUp;
    }
    
    public void setCreatedUp(Date createdUp) {
        this.createdUp = createdUp;
    }
    public Date getUpdatedUp() {
        return this.updatedUp;
    }
    
    public void setUpdatedUp(Date updatedUp) {
        this.updatedUp = updatedUp;
    }
    public String getAccused() {
        return this.accused;
    }
    
    public void setAccused(String accused) {
        this.accused = accused;
    }
    public String getProgram() {
        return this.program;
    }
    
    public void setProgram(String program) {
        this.program = program;
    }
    public String getVictimName() {
        return this.victimName;
    }
    
    public void setVictimName(String victimName) {
        this.victimName = victimName;
    }
    public int getVictimAge() {
        return this.victimAge;
    }
    
    public void setVictimAge(int victimAge) {
        this.victimAge = victimAge;
    }
    public String getVictimGender() {
        return this.victimGender;
    }
    
    public void setVictimGender(String victimGender) {
        this.victimGender = victimGender;
    }
    public String getVictimGrade() {
        return this.victimGrade;
    }
    
    public void setVictimGrade(String victimGrade) {
        this.victimGrade = victimGrade;
    }
    public String getVictimLocation() {
        return this.victimLocation;
    }
    
    public void setVictimLocation(String victimLocation) {
        this.victimLocation = victimLocation;
    }
    public String getVictionGuardian() {
        return this.victionGuardian;
    }
    
    public void setVictionGuardian(String victionGuardian) {
        this.victionGuardian = victionGuardian;
    }
    public String getVictimAddress() {
        return this.victimAddress;
    }
    
    public void setVictimAddress(String victimAddress) {
        this.victimAddress = victimAddress;
    }
    public String getConfidentNumber() {
        return this.confidentNumber;
    }
    
    public void setConfidentNumber(String confidentNumber) {
        this.confidentNumber = confidentNumber;
    }
    public Integer getNumberAbuse() {
        return this.numberAbuse;
    }
    
    public void setNumberAbuse(Integer numberAbuse) {
        this.numberAbuse = numberAbuse;
    }
    public byte getIsNotifiedGuardian() {
        return this.isNotifiedGuardian;
    }
    
    public void setIsNotifiedGuardian(byte isNotifiedGuardian) {
        this.isNotifiedGuardian = isNotifiedGuardian;
    }
    public String getVictimComment() {
        return this.victimComment;
    }
    
    public void setVictimComment(String victimComment) {
        this.victimComment = victimComment;
    }
    public byte getIsVictimInDanger() {
        return this.isVictimInDanger;
    }
    
    public void setIsVictimInDanger(byte isVictimInDanger) {
        this.isVictimInDanger = isVictimInDanger;
    }
    public Integer getProcessId() {
        return this.processId;
    }
    
    public void setProcessId(Integer processId) {
        this.processId = processId;
    }
    public Byte getVeracity() {
        return this.veracity;
    }
    
    public void setVeracity(Byte veracity) {
        this.veracity = veracity;
    }
    public String getRecord() {
        return this.record;
    }
    
    public void setRecord(String record) {
        this.record = record;
    }
    public Set<Process> getProcesses() {
        return this.processes;
    }
    
    public void setProcesses(Set<Process> processes) {
        this.processes = processes;
    }




}


