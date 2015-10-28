package org.jetbrains.intellij

import org.gradle.api.Task

class IntelliJPluginExtension {

    public static final NAME = "intellij"

    String[] plugins
    String version
    String pluginName
    String sandboxDirectory
    String intellijRepo
    boolean instrumentCode
    boolean updateSinceUntilBuild
    boolean downloadSources
    boolean configureDependencies
    boolean initializeTasks

    File ideaDirectory
    File ideaSourcesFile

    Task runIdeaTask
    Task prepareSandboxTask
    Task patchPluginXmlTask
    Task publishTask
    Task buildPluginTask

    private final Set<File> intellijFiles = new HashSet<>();
    private final Set<File> runClasspath = new HashSet<>();

    Set<File> getIntellijFiles() {
        return intellijFiles
    }

    Set<File> getRunClasspath() {
        return runClasspath
    }
}
