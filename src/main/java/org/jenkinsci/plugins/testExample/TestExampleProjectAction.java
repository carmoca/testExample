package org.jenkinsci.plugins.testExample;

import hudson.model.AbstractBuild;
import hudson.model.AbstractProject;
import hudson.model.Action;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prit8976 on 8/27/15.
 */
public class TestExampleProjectAction implements Action {

    private AbstractProject<?, ?> project;

    /**
     * @brief Returns the Icon's path and filename to use. This icon will be 
     * displayed next to the text returned via 'getDisplayName()'.
     * @return Returns a String datatype containing the path to the icon file.
     */
    @Override
    public String getIconFileName() {
        return "/plugin/testExample/img/project_icon.png";
    }

    /**
     * @brief Returns a human-friendly text string for the user. Will be 
     * displayed in a context menu item for builds being built and for 
     * historical builds.
     * 
     * @return Returns a String datatype of human-friendly readable text.
     */
    @Override
    public String getDisplayName() {
        return "Test Example Project Action";
    }

    /**
     * @brief Returns the local URL to use to fetch this content.
     * @return Returns a String datatype containing the URL.
     */
    @Override
    public String getUrlName() {
        return "testExamplePA";
    }

    /**
     * @brief This method returns a reference to the AbstractProject<?,?> as defined upon the project's creation.
     * @return This method returns a reference to the AbstractProject<?,?> as defined upon the project's creation.
     */
    public AbstractProject<?, ?> getProject() {
        return this.project;
    }

    /**
     * @brief This method returns the project's name.
     * @return This method returns the project's name. 
     */
    public String getProjectName() {
        return this.project.getName();
    }

    /**
     * @brief This method returns the message results of the command issued.
     * @return This method returns the message results of the command issued.
     */
    public List<String> getProjectMessages() {
        List<String> projectMessages = new ArrayList<String>();
        List<? extends AbstractBuild<?, ?>> builds = project.getBuilds();
        String projectMessage="";
        final Class<TestExampleBuildAction> buildClass = TestExampleBuildAction.class;

        for (AbstractBuild<?, ?> currentBuild : builds) {
            projectMessage = "Build #"+currentBuild.getAction(buildClass).getBuildNumber()
                    +": "+currentBuild.getAction(buildClass).getMessage();
            projectMessages.add(projectMessage);
        }
        return projectMessages;
    }

    /**
     * @brief Constructor for TestExampleProjectAction
     * @param project AbstractProject<?,?>
     */
    TestExampleProjectAction(final AbstractProject<?, ?> project) {
        this.project = project;
    }
}
