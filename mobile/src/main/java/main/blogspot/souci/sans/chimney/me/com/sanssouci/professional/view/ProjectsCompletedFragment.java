package main.blogspot.souci.sans.chimney.me.com.sanssouci.professional.view;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import main.blogspot.souci.sans.chimney.me.com.sanssouci.BaseFragment;
import main.blogspot.souci.sans.chimney.me.com.sanssouci.R;

/**
 * Created by sshastri009 on 2/1/17.
 */

public class ProjectsCompletedFragment extends BaseFragment {

    public ProjectsCompletedFragment(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_projects_completed, container, false);

    }
}
