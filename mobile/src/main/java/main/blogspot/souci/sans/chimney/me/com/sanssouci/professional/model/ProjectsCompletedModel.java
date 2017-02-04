package main.blogspot.souci.sans.chimney.me.com.sanssouci.professional.model;

import android.graphics.Bitmap;
import android.media.Image;

import java.io.Serializable;

/**
 * Created by sshastri009 on 2/4/17.
 */

public class ProjectsCompletedModel implements Serializable {

    public ProjectsCompletedModel(){

    }

    private String projectName;
    private Bitmap projectLogo;
    private String projectDescription;
    private String projectTag; // Type of project : official/friends_personal/unsuccessful

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Bitmap getProjectLogo() {
        return projectLogo;
    }

    public void setProjectLogo(Bitmap projectLogo) {
        this.projectLogo = projectLogo;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public String getProjectTag() {
        return projectTag;
    }

    public void setProjectTag(String projectTag) {
        this.projectTag = projectTag;
    }
}
