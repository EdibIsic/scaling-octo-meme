package com.github.edibisic.scalingoctomeme.services

import com.github.edibisic.scalingoctomeme.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
