def project = 'maddop/jenkins-container'
def jobName = "${project}".replaceAll('/','-')

multibranchPipelineJob(jobName) {
    branchSources {
        git {
            remote("git://github.com/${project}.git")
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}
