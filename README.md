# Jenkins Plugin Template

Project: testExample
Version: >= 1.62

This is a Jenkins Post-build Plugin repository created for https://developer.rackspace.com/blog/jenkins-post-build-plugin-part-1/
and further extended for https://developer.rackspace.com/blog/jenkins-post-build-plugin-part-2/

## Additional Information

The testExample project showcases how to write a plugin for the "Post-Build Action" process in Jenkins  - specifically, the [Publisher](http://javadoc.jenkins-ci.org/hudson/tasks/Publisher.html) type of pluin.

There are a myriad number of write-ups (both in print and on-line) for writing new "Build" plugins for Jenkins but few resources explaining how to write "Publisher"-type plugins used in the "Post-Build" phase of Jenkins Continuous Integration (CI). This source code goes hand-in hand with the two URLs at the top of this README file.

That being said there are a number of issues with this particular source-tree - chiefly: some of the methods invoked in the project have been deprecated. This fork aims to clean that up and push back to Pritic's repo.
