Demonstration of classpath mixture when depending on multiple versions of a particular dependency.

Steps to reproduce:
1. `git clone` this repo
1. check out the version at tag `v1.0`
1. Run `gradle service:run` and observe the output
1. Publish v1.0 to your local maven by running `gradle publishToMavenLocal`
1. Check out the version at tag `mixed`
1. Run `gradle service:run` and observe the output.

The output in the last step can only occur if it's picking up `Leaf.java` from the `v1.0` version in the mavenLocal repository, and the `LeafyGreen.java` from the local checkout. Therefore both of those versions must be on the runtime classpath, with the `v1.0` version ahead of the local version.

You can also check out some of the other tags to see other behaviours depending on how the dependencies are ordered.
