package org.jenkinsci.plugins.testExample;

import hudson.model.AbstractBuild;
import hudson.model.Action;
import java.util.ArrayList;

/**
 * Created by prit8976 on 8/27/15.
 */
public class TestExampleBuildAction implements Action {

    private String message;
    private AbstractBuild<?, ?> build;
    private String[] words = { "word 0","word 1","word 2","word 3","word 4","word 5"};

    /**
     * @brief Returns the Icon's path and filename to use. This icon will be 
     * displayed next to the text returned via 'getDisplayName()'.
     * @return Returns a String datatype containing the path to the icon file.
     */
    @Override
    public String getIconFileName() {
        return "/plugin/testExample/img/build-goals.png";
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
        return "Test Example Build Page";
    }

    /**
     * @brief Returns the local URL to use to fetch this content.
     * @return Returns a String datatype containing the URL.
     */
    @Override
    public String getUrlName() {
        return "testExampleBA";
    }

    /**
     * This method returns the message content created when the object was 
     * created. As each project is built, Jenkins supplies meta-data about that
     * build in the form of a String message.
     * 
     * TODO: Figure out what 'message' content is. Is the term just overloaded
     * and "message" can be just about anything or does it explicitly come from
     * other parts of the project (such as TestExampleProjectAction::getProjectMessages() ).
     * @return Returns a String datatype of "message" content.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * This method returns the build number of the build being queried.
     * @return Returns an int datatype corresponding to the build number.
     */
    public int getBuildNumber() {
        return this.build.number;
    }

    /**
     * This method returns the content of the data structure pertaining to this 
     * build.
     * @return Returns an AbstractBuild<?,?> object containing information to
     * the specific build being queried.
     */
    public AbstractBuild<?, ?> getBuild() {
        return build;
    }
    
    public String[] getWords() {
        return words;
    }

    /**
     * @brief Constructor.
     * 
     * This class acts a placeholder for message and build data about each build.
     * Builds can be historical or builds currently being compiled by the system.
     * @param message
     * @param build 
     */
    TestExampleBuildAction(final String message, final AbstractBuild<?, ?> build, String[] words)
    {
        this.message = message;
        this.build = build;
        this.words = words;
    }
}
