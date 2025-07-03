plugins {
  id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "grokking_ai_algorithms"

include("genetic_algorithm")
include("ant_algorithm")
include("swarm_algorithm")
include("machine_learning")
include("artificial_neural_networks")
