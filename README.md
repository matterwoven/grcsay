# grcsay
An exercise for collaborating with git / GitHub. Please read the directions CAREFULLY! I recommend focusing on the changes to the README before reading the Java code.

## Setup
1. Choose one partner to be Partner A, one partner to Partner B.
1. Have ONLY Partner A fork this repository. PARTNER B SHOULD NOT FORK.
1. Have Partner A add Partner B as a collaborator on their fork. Follow [these directions](https://docs.github.com/en/enterprise-server@3.10/account-and-profile/setting-up-and-managing-your-personal-account-on-github/managing-access-to-your-personal-repositories/inviting-collaborators-to-a-personal-repository#inviting-a-collaborator-to-a-personal-repository).
1. Have the Partner A send the URL of their repository to Partner B.
1. Partner B should see an invitation at the top of the repository. Click "View Invitation", then "Accept Invitation".
1. Both partners should clone the repository to their own computer. The URL should include Partner A's username.
1. Both partners should change into the project repository:
    ```
    cd grcsay
    ```
1. Both partners should open VSCode in the project repository. If the below command does not work, open VS Code and use File > Open Folder.
    ```
    code .
    ```

## Setting up git merging strategy
1. Each partner should run these commands on their own terminal. DO NOT SKIP THIS PART!!!
    ```
    git config --global pull.ff true
    git config --global pull.rebase false
    ```
    This will tell git to perform fast forwards when possible, never rebase, and create merge commits when necessary. We will not cover the differences between these in-depth in class, but feel free on your own time to research them using search engines or AI if you're interested. Explore your curiosity!

## Making a change to the README
We will first practice making changes that do not trigger a merge conflict. In general, this is what we hope to happen!
1. Partner A will make changes first. ONLY PARTNER A SHOULD DO THESE SUB STEPS to add, commit, and push the changes.
    1. Do a git pull. You should get a message saying you're up to date.
        ```
        git pull
        ```
    1. Make any change to the README and save it.
    1. Check that the change shows up in red (shows as unstaged) when asking for the status.
        ```
        git status
        ```
    1. Add (stage) the change.
        ```
        git add README.md
        ```
    1. Check that the change shows up as green (staged for commit).
        ```
        git status
        ```
    1. Commit the change. Change the commit message to describe your commit.
        ```
        git commit -m "DESCRIBE YOUR CHANGE HERE"
        ```
    1. Push the changes to GitHub
        ```
        git push origin
        ```
1. Go to Partner A's fork on GitHub. Refresh the page and verify the changes show up.
1. Have Partner B pull Partner A's change. ONLY PARTNER B SHOULD DO THIS:
    ```
    git pull
    ```
1. Verify that the changes are downloaded locally to Partner B's computer. At this point, the code on both computers should be exactly the same.
1. Have ONLY Partner B now make a change to the README. Partner B should add, commit, and push the change following the above steps.
1. Have Partner A pull partner B's changes. Verify that the changes are downloaded locally to Partner B's computer. At this point, the code on both computers should be exactly the same again.

## Triggering a merge conflict
We will now artificially trigger a merge conflict. When we follow good git practices (small, frequent commits, pulling frequently) these won't happen as often. But they will happen time to time! In this part we'll get experience in resolving them once they arise.

1. Have BOTH Partner A and Partner B edit the below line. Each person should make it say something different.
    ```
    EDIT THIS LINE
    ```
1. Have BOTH Partner A and Partner B add, commit, and push the changes. One of the partners will get an error saying that their changes can't be pushed. This is OK and expected. Today we are practicing how to resolve this error.
1. Have the error partner pull the other partner's changes:
    ```
    git pull
    ```
1. There will be an message about a merge conflict. This is expected! This is what we're practicing how to resolve.
1. ONLY the error partner should open the README in VSCode. There should be both changes and extra text separating them. It will look something like this:
TODO: Put in image
1. Resolve the merge conflict to include both of the changes and delete the extra lines.
1. Mark the conflicted file as resolved with git add.
    ```
    git add README.md
    ```
1. Commit the confict resolution:
    ```
    git commit -m "Resolved merge conflict"
    ```
1. Push the changes to GitHub.
    ```
    git push
    ```
1. Have the other partner pull the changes and verify that both changes are there:
    ```
    git pull
    ```
1. The code should be the same on both computers. Congrats on resolving your first merge conflict!

## Running the Project
1. Both partners should compile the project. Make sure that you are in the root of the project's directory.
    ```
    javac src/*.java
    ```
1. Both partners should try running the project:
    ```
    java -cp src SayApp
    ```
1. Follow the prompts to give input and run the program.
1. Make sure it works on both computers.

## Updating the project
1. Read through the code and understand what it's doing. Talk with your partner about it! Talk about any object-oriented practices you see occuring. Talk about what data structures are used.
1. Each partner should make a new class that implements the Animal interface. Each person should do this on their own computer! There is some ASCII art [provided below](#sample-ascii-art), but feel free to add your own if you prefer. If you copy from some source on the internet please make sure to add attribution in a comment.
1. Always make sure to save and compile your files again before re-running the program. As you're working, follow good git practices of pulling, editing, adding, committing, and pushing.
1. Add your animal to the `animalList` method in `SayApp.java`
1. Make sure to push and pull each other's changes.
1. Merge conflicts may arise! This is OK! Keep calm and resolve them as they come up.

## Submitting
1. Have ONLY PARTNER A make a pull request against the original repository.
1. Have partner A give the URL of the pull request to partner B.
1. BOTH PARTNERS MUST SUBMIT THE URL OF THE PULL REQUEST TO CANVAS. You will both be submitting the same URL.

## Want more?
Try updating the program so that it can handle multiple lines of text. Or make any other change you find interesting!

## Sample ASCII art
TODO: add samples

