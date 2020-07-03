package com.github.finnzhang0710.rainbowfartidea193.services

import com.intellij.openapi.project.Project
import com.github.finnzhang0710.rainbowfartidea193.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
