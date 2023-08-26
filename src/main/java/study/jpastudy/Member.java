package study.jpastudy;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Member {
    @Id
    private Long id;

    // @Column(name = "name", updatable = false) // 수정하더라도 DB에 반영되지 않음
    // @Column(name = "name", nullable = false) // not null
    // @Column(name = "name", columnDefinition = "varchar(100) default 'EMPTY'") // DB column 정보를 직접 주기
    private String username;

    // int가 아니더라도 적절한 타입으로 찾음
    private Integer age;

    // DB에서 Enum type이 없는데
    // 객체에서 Enum type을 사용하고 싶을 때
    // @Enumerated // default 설정 = EnumType.ORDINAL -> int type으로 DB에 저장됨
    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    // Date, Time, Timestamp 세 개가 있음
    // @Temporal(TemporalType.TIMESTAMP)
    // private LocalDateTime createdDate;

    // @Temporal(TemporalType.TIMESTAMP)
    // private Date lastModifiedDate;

    // Java 8 이후, 최신 Hibernate가 LocalDate와 LocateDateTime 타입을 지원하기 때문에
    // @Temporal annotation 불필요
    private LocalDate lastModifiedDate;
    private LocalDateTime createdDate;

    // 분량이 큰 컨텐츠
    @Lob
    private String description;
    

    
    public Member() {
    }

    public Member(Long id, String name) {
        this.id = id;
        this.username = name;
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return username;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.username = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    
    
    
}
