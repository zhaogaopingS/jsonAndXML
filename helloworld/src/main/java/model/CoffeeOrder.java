package model;


import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

import java.io.Serializable;
import java.util.Date;

@XmlRootElement(name="CoffeeOrder")
public class CoffeeOrder implements Serializable {
    private Long id=System.currentTimeMillis();
    private String customer="用户-1";
    private Integer state=1;
    private Date createTime=new Date();
    private Date updateTime=new Date();

    public Long getId() {
        return id;
    }
    @XmlElement
    public void setId(Long id) {
        this.id = id;
    }

    public Integer getState() {
        return state;
    }
    @XmlElement
    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }
    @XmlElement
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }
    @XmlElement
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}

