import jenkins.model.*
import hudson.model.*
import hudson.AbortException
import hudson.console.HyperlinkNote
import java.util.concurrent.CancellationException
 
// Retrieve parameters of the current build
def jobPattern = build.buildVariableResolver.resolve("jobPattern")

def matchedJobs = Jenkins.instance.items.findAll { job ->
 job.name =~ /${jobPattern}/
}

matchedJobs.each { job ->
    println job.name
    //job.delete()
}
