package model;



import java.io.Serializable;
import java.util.Date;


public class Coffee implements Serializable {
    private Long id=System.currentTimeMillis();
    private String name="拿铁";

    private Date createTime=new Date();
    private Date updateTime=new Date();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
