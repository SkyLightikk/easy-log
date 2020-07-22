package com.github.skylightikk.easylog.services

import com.intellij.openapi.project.Project
import com.github.skylightikk.easylog.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
