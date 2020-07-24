package org.arp.easylog.services

import com.intellij.openapi.project.Project
import org.arp.easylog.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
