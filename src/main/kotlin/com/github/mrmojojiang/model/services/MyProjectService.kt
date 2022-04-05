package com.github.mrmojojiang.model.services

import com.intellij.openapi.project.Project
import com.github.mrmojojiang.model.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
