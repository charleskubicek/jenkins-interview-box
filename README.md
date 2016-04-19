# jenkins-interview-box
Simple vagrant box that provisions and runs jenkins, with SBT.

## Interview goals

1. Create a job to make this project and build a jar
2. Save the resulting jar as a build artifact on a successful build
3. On successful build trigger a job that uses the artifact
4. Use language of choice to gather last build status from the execute job
5. trigger the execute job by any method until status changes
