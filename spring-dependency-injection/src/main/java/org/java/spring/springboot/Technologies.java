package org.java.spring.springboot;

import org.springframework.stereotype.Component;

@Component
public class Technologies {
    private int techId;
    private String techName;

    public int getTechId() {
        return techId;
    }

    public void setTechId(int techId) {
        this.techId = techId;
    }

    @Override
    public String toString() {
        return "Technologies{" +
                "techId=" + techId +
                ", techName='" + techName + '\'' +
                '}';
    }
}
