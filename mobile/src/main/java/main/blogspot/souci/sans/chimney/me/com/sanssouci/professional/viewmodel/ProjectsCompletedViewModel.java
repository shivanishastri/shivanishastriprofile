package main.blogspot.souci.sans.chimney.me.com.sanssouci.professional.viewmodel;

import android.content.Context;
import android.databinding.BaseObservable;

import main.blogspot.souci.sans.chimney.me.com.sanssouci.professional.model.ProjectsCompletedModel;

/**
 * Created by sshastri009 on 2/4/17.
 */

public class ProjectsCompletedViewModel extends BaseObservable {

    private ProjectsCompletedModel projectsCompletedModel;
    private Context mContext;

    public String getProjectName() {
        return projectsCompletedModel.getProjectName();
    }



}
