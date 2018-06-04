import jenkins.model.*
import hudson.model.*
import hudson.AbortException
import hudson.console.HyperlinkNote
import java.util.concurrent.CancellationException
 
// Retrieve parameters of the current build
def jobPattern = build.buildVariableResolver.resolve("jobPattern")
println "jobPattern=$jobPattern"

//def jobPattern = params.jobPattern

  println "Job Pattern read from Jenkins: ${jobPattern}"
