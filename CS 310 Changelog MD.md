# CS 310 Changelog

*All notable changes made from the tutorial exercises for CS 310 using the Calculator application will be documented in this file. Each version will match to a separate tutorial. Remember to start at the end of this file and work your way up. The most recent change will be located at the top of this document.*

## Version 12.0.0 \<2021-06-11\>

Note: Jukebox Playlist Application

Major Changes:

-   Added BrandonRicks to playlists

    ![](media/066b5cf6fafc7c167c7c48997d789d77.jpeg)

-   Added case statement for profile in StudentList
-   Updated unit test to StudentTest to include profile tests
-   Created pull request for merge

    ![](media/cdd54ffdf43a44777ffa3140fbec994a.jpeg)

Minor Changes:

-   Ran JUnit tests: passed
-   Ran program to test functionality: program ran successfully

Bug Fixes:

-   Fixed issue with branch in repository being detached

## Version 11.0.0 \<2021-06-04\>

Note: Jukebox Playlist Application

Major Changes:

-   Created a feature branch for Jukebox Playlist app
-   Added InFlames and Opeth to artists

    ![](media/1a1d1aa94e642c2e07b4fd9fac08da1d.jpeg)

    ![](media/edefb6d4c65747db7a88f55890efc29b.jpeg)

Minor Changes:

-   Modified tests for StudentTest and JukeboxTest

    ![](media/12c90274f2bae7d18feba19d0fb9a8b9.jpeg)

    ![](media/3f50b4b269b4fa73b4741267976f6aef.jpeg)

-   Added comments to new code
-   Committed and Pushed changes of new branch titled “Bricks_FeatureBranch” to remote repository on BitBucket

Bug Fixes:

-   Not Applicable

## Version 10.0.0 \<2021-05-29\>

Note: Tutorial Ten: Stashing Changes in EGit

Major Changes:

-   Added “@since 1.0” to BinaryOperation.java and stashed this change.

    ![](media/1996e2ccffc0fc3d71e748f35d21537d.jpeg)

-   Applied the stashed changes to the javadoc branch.

    ![](media/dff4f0707f53e2e998606ec34c81937c.jpeg)

Minor Changes:

-   Compared the working tree with the stashed changes.

    ![](media/9ddc804e3b30015e3d9bafd9949e2244.jpeg)

Bug Fixes:

-   Not Applicable

## Version 9.0.0 \<2021-05-29\>

Note: Tutorial Nine: Use the “Git Blame” Feature

Major Changes:

-   Opened Calculator.java and used the “show revision information” option to show commit information and author.

    ![](media/785ec2866b69fc93d8b352f65fc1cb33.jpeg)

-   This information is also shown within the History tab.

    ![](media/ba83e6b10ad52dbf686f6aff9b012068.jpeg)

Minor Changes:

-   Reverted to before new branch was created for tutorial 8.

Bug Fixes:

-   Not Applicable

## Version 8.0.0 \<2021-05-29\>

Note: Tutorial Eight: Change a Series of Commits

Major Changes:

-   Created a separate branch for the tutorial with an empty class file, and added a different empty class file to the master branch to create differences in the branches.

    ![](media/05923a5241b1d4a5b5ec130e5d4d0514.jpeg)

-   Cherry-picked the other commit to add the difference between them to the new commit.

    ![](media/c502523a05a29d04d3f9934388c1e815.jpeg)

Minor Changes:

-   Not Applicable

Bug Fixes:

-   Issues with SWT not being included in project, needed to import

## Version 7.0.0 \<2021-05-23\>

Note: Tutorial Seven: Reset Branch to a Previous State

Major Changes:

-   Applied reset mixed to addDivide, resetting the branch pointer.

    ![](media/8c5104f88b67e782600d9dfed868749c.jpeg)

-   Amended commit and reset branch.

    ![](media/6f8d5f6d7278647ceb583e815b5792de.jpeg)

Minor Changes:

-   Branch reset create a new master separate from prior mergers.

    ![](media/b6f8550d3e60dce32f055038655ab7f4.jpeg)

-   Reset back before amend to prior tree.

    ![](media/23a437495cd3f15bc6929a9893127058.jpeg)

Bug Fixes:

-   Not Applicable

## Version 6.0.0 \<2021-05-23\>

Note: Tutorial Six: Merging, Rebasing, and Resolving Conflict

Major Changes:

-   Began merging all branches together. addDivide and addPower merged successfully

    ![](media/5865f0c8e7b5b9f6e71764d10655efca.jpeg)

-   addMultiply conflicted. Used merge tool to merge and fix conflict, added newly resolved file to index.

    ![](media/3857ecd7da8d301d5d17844e426c02bc.jpeg)

Minor Changes:

-   Confirmed in History tab that all mergers were successful.

    ![](media/5e52566a1901070774bebf59b84c8d2a.jpeg)

-   Tested all functions in calculator to ensure newest branch works as intended prior to push.

Bug Fixes:

-   addMultiply conflict was fixed and added to index.

## Version 5.0.0 \<2021-05-23\>

Note: Tutorial Five: Fetch the Latest State From Upstream

Major Changes:

-   Attempted Fetch from origin; everything is up to date

    ![](media/1b8e0887ea486ea510009de67a384455.jpeg)

-   As everything is up to date, this is a good foundation to create new local feature branches

Minor Changes:

-   Not Applicable

Bug Fixes:

-   Not Applicable

## Version 4.0.0 \<2021-05-23\>

Note: Tutorial Four: Work on Branches in Parallel

Major Changes:

-   Created a new feature: addMultiply

    ![](media/6caf63f2b506e48b55be321363b7bf1d.jpeg)

-   Changed committed comments using Amend

    ![](media/310b300d1b6fcd44bb204769150841f8.jpeg)

Minor Changes:

-   Updated Calculator.java to make use of new Multiply.java
-   Did preliminary commit of new addMultiply branch

Bug Fixes:

-   Amended master branch comments
-   Cleaned up branches and commits

## Version 3.0.0 \<2021-05-16\>

Note: Tutorial Three: Inspecting the History

Major Changes:

-   Inspected History View of repository
-   Configured History View to show branching of Divide

    ![](media/430e2ce55a4525cbce8b06b44198cd72.jpeg)

Minor Changes:

-   Attempted commit search
-   Pushed Divide branch to bitbucket repository master

Bug Fixes:

-   Changed comment from "Binary plus operation" to "Binary divide operation"

## Version 2.0.0 \<2021-05-16\>

Note: Tutorial Two: Develop Another Feature and Use Staging View

Major Changes:

-   Developed a new feature branch
-   Created new feature Power (NOTE: Power not yet implemented into UI)

![](media/7dd32143bcf9cb128e87aa172b7bec5c.jpeg)

Minor Changes:

-   Updated Calculator.java to make use of new Power.java
-   Committed changes locally to Calculator.java and Divide.java in Git Staging

Bug Fixes:

-   Not Applicable

## Version 1.0.0 \<2021-05-16\>

Note: Tutorial One: Develop a Feature Bug Fix

Major Changes:

-   Created a new feature branch
-   Created feature Divide

![](media/d2742b40d1c96b88f9abead342d15772.jpeg)

Minor Changes:

-   Updated Calculator.java to make use of new Divide.java
-   Committed changes locally to Calculator.java and Divide.java in Git Staging

Bug Fixes:

-   Not Applicable
