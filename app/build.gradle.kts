/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample C++ project to get you started.
 * For more details on building C++ applications and libraries, please refer to https://docs.gradle.org/8.10.2/userguide/building_cpp_projects.html in the Gradle documentation.
 */

plugins {
    // Apply the cpp-application plugin to add support for building C++ executables
    `cpp-application`

    // Apply the cpp-unit-test plugin to add support for building and running C++ test executables
    `cpp-unit-test`
}

// Set the target operating system and architecture for this application
application {
    targetMachines.add(machines.windows.x86_64)
}
