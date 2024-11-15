package Entities_Utility_Classes.Abstract_Entities;

import java.util.List;
import java.util.Objects;

public abstract class ExpectedEntity {
    private String name;
    private String created;
    private String edited;
    private String url;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCreated() { return created; }
    public void setCreated(String created) { this.created = created; }

    public String getEdited() { return edited; }
    public void setEdited(String edited) { this.edited = edited; }

    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }


    public abstract String getInfo();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExpectedEntity that = (ExpectedEntity) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(created, that.created) &&
                Objects.equals(edited, that.edited) &&
                Objects.equals(url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, created, edited, url);
    }
}
