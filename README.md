# grcsay
An exercise for collaborating with git / GitHub. Please read the directions CAREFULLY! I recommend focusing on the changes to the README before reading the Java code.

## Setup
1. Choose one partner to be Partner A, one partner to Partner B.
1. Have ONLY Partner A fork this repository. PARTNER B SHOULD NOT FORK.
1. Have Partner A add Partner B as a collaborator on their fork. Follow [these directions](https://docs.github.com/en/enterprise-server@3.10/account-and-profile/setting-up-and-managing-your-personal-account-on-github/managing-access-to-your-personal-repositories/inviting-collaborators-to-a-personal-repository#inviting-a-collaborator-to-a-personal-repository).
1. Have the Partner A send the URL of their repository to Partner B.
1. Partner B should see an invitation at the top of the repository. Click "View Invitation", then "Accept Invitation".
1. Both partners should clone the repository to their own computer. The URL should include Partner A's username.

## Setting up git mergeing strategy
1. Each partner should run these commands on their own terminal:
    ```
    git config --global pull.ff true
    git config --global pull.rebase false
    ```
    This will tell git to perform fast forwards when possible, never rebase, and create merge commits when necessary. We will not cover the differences between these in-depth in class, but feel free on your own time to research them using search engines or AI if you're interested. Explore your curiosity!

## Making a change to the README
We will first practice making changes that do not trigger a merge conflict. In general, this is what we hope to happen!
1. Have ONLY Partner A make any change to this README. Partner A should add, commit, and push this change. ONLY PARTNER A SHOULD DO THESE SUB STEPS.
    1. Check that the change shows up in red when asking for the status.
        ```
        git status
        ```
    1. Add the change.
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

1. 