package com.github.igorpet.mailimapplugin.services

import com.intellij.openapi.project.Project
import com.github.igorpet.mailimapplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
