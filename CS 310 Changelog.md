# CS 310 Changelog

*All notable changes made from the tutorial exercises for CS 310 using the Calculator application will be documented in this file. Each version will match to a separate tutorial. Remember to start at the end of this file and work your way up. The most recent change will be located at the top of this document.*

## Version 12.0.0 \<2021-06-11\>

Note: Jukebox Playlist Application

Major Changes:

-   Added BrandonRicks to playlists

    ![image](https://user-images.githubusercontent.com/79807877/191563464-c14cfb17-4e91-406f-a1fd-2098c6e78401.png)

-   Added case statement for profile in StudentList
-   Updated unit test to StudentTest to include profile tests
-   Created pull request for merge

    ![image](https://user-images.githubusercontent.com/79807877/191563845-36be0c6c-aa19-4181-94da-41198afcf535.png)

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

    ![image](https://user-images.githubusercontent.com/79807877/191563876-1f78bd64-427c-4b5d-b4e9-f614474b846f.png)

    ![image](https://user-images.githubusercontent.com/79807877/191563910-af91e5c7-9c38-4438-b965-badfa78bb0cd.png)

Minor Changes:

-   Modified tests for StudentTest and JukeboxTest

    ![image](https://user-images.githubusercontent.com/79807877/191563997-db7a1fe1-e430-485a-8ad5-67d46f0fcf6d.png)

    ![image](https://user-images.githubusercontent.com/79807877/191564014-4442b1e7-ce66-4e98-8233-75d7845e00ad.png)

-   Added comments to new code
-   Committed and Pushed changes of new branch titled “Bricks_FeatureBranch” to remote repository on BitBucket

Bug Fixes:

-   Not Applicable

## Version 10.0.0 \<2021-05-29\>

Note: Tutorial Ten: Stashing Changes in EGit

Major Changes:

-   Added “@since 1.0” to BinaryOperation.java and stashed this change.

    ![image](https://user-images.githubusercontent.com/79807877/191564048-2cf4eb25-aa8b-416e-a165-46648cad733d.png)

-   Applied the stashed changes to the javadoc branch.

    ![image](https://user-images.githubusercontent.com/79807877/191564074-4bdf8f91-b254-464e-a218-8c892fb5615d.png)

Minor Changes:

-   Compared the working tree with the stashed changes.

    ![image](https://user-images.githubusercontent.com/79807877/191564090-003f42ed-590b-49a8-addc-71a6c6774cd0.png)

Bug Fixes:

-   Not Applicable

## Version 9.0.0 \<2021-05-29\>

Note: Tutorial Nine: Use the “Git Blame” Feature

Major Changes:

-   Opened Calculator.java and used the “show revision information” option to show commit information and author.

    ![image](https://user-images.githubusercontent.com/79807877/191564114-6baef1c9-234d-4854-a3ca-c51ff182bf61.png)

-   This information is also shown within the History tab.

    ![image](https://user-images.githubusercontent.com/79807877/191564141-d30deaf4-7de4-4676-a3ca-8a5ba5e35781.png)

Minor Changes:

-   Reverted to before new branch was created for tutorial 8.

Bug Fixes:

-   Not Applicable

## Version 8.0.0 \<2021-05-29\>

Note: Tutorial Eight: Change a Series of Commits

Major Changes:

-   Created a separate branch for the tutorial with an empty class file, and added a different empty class file to the master branch to create differences in the branches.

    ![image](https://user-images.githubusercontent.com/79807877/191564156-6be53d49-867a-4b04-a197-a0e8e0aea201.png)

-   Cherry-picked the other commit to add the difference between them to the new commit.

    ![image](https://user-images.githubusercontent.com/79807877/191564176-19f265dc-4c12-4687-b50b-50ffa9a89c5b.png)

Minor Changes:

-   Not Applicable

Bug Fixes:

-   Issues with SWT not being included in project, needed to import

## Version 7.0.0 \<2021-05-23\>

Note: Tutorial Seven: Reset Branch to a Previous State

Major Changes:

-   Applied reset mixed to addDivide, resetting the branch pointer.

    ![image](https://user-images.githubusercontent.com/79807877/191564203-b974c5b4-fedf-42d7-81b9-2fe3554b23e6.png)

-   Amended commit and reset branch.

    ![image](https://user-images.githubusercontent.com/79807877/191564224-d6c3082f-9381-48c1-8499-a947bff8ca4e.png)

Minor Changes:

-   Branch reset create a new master separate from prior mergers.

    ![image](https://user-images.githubusercontent.com/79807877/191564247-a4801db2-b8c4-4eec-b899-ef8a3350c45a.png)

-   Reset back before amend to prior tree.

    ![image](https://user-images.githubusercontent.com/79807877/191564265-1eec511a-16ad-4555-afd9-ce76a35704bc.png)

Bug Fixes:

-   Not Applicable

## Version 6.0.0 \<2021-05-23\>

Note: Tutorial Six: Merging, Rebasing, and Resolving Conflict

Major Changes:

-   Began merging all branches together. addDivide and addPower merged successfully

    ![image](https://user-images.githubusercontent.com/79807877/191564302-c69dfb4e-58ce-4475-a839-09da4c11d9e9.png)

-   addMultiply conflicted. Used merge tool to merge and fix conflict, added newly resolved file to index.

    ![image](https://user-images.githubusercontent.com/79807877/191564332-8bf5d9db-889e-484a-9c4a-476ccde71069.png)

Minor Changes:

-   Confirmed in History tab that all mergers were successful.

    ![image](https://user-images.githubusercontent.com/79807877/191564370-6b45e602-09c4-47a2-8a49-b159708db3b4.png)

-   Tested all functions in calculator to ensure newest branch works as intended prior to push.

Bug Fixes:

-   addMultiply conflict was fixed and added to index.

## Version 5.0.0 \<2021-05-23\>

Note: Tutorial Five: Fetch the Latest State From Upstream

Major Changes:

-   Attempted Fetch from origin; everything is up to date

    ![image](https://user-images.githubusercontent.com/79807877/191564400-c70a5733-e8ee-4dda-a354-9e7ce3f266fc.png)

-   As everything is up to date, this is a good foundation to create new local feature branches

Minor Changes:

-   Not Applicable

Bug Fixes:

-   Not Applicable

## Version 4.0.0 \<2021-05-23\>

Note: Tutorial Four: Work on Branches in Parallel

Major Changes:

-   Created a new feature: addMultiply

    ![image](https://user-images.githubusercontent.com/79807877/191564424-9c165fb3-cc24-40cb-b5d0-cc4a67485fa9.png)

-   Changed committed comments using Amend

    ![image](https://user-images.githubusercontent.com/79807877/191564450-4018d3f5-61f7-4487-8b5b-c20e2217baee.png)

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

    ![image](https://user-images.githubusercontent.com/79807877/191564469-ad86577b-67a0-4956-a0ff-7de0c4773f14.png)

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

    ![image](https://user-images.githubusercontent.com/79807877/191564490-5c1c1ada-c64a-4af8-9784-449af49ac592.png)

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

    ![image](https://user-images.githubusercontent.com/79807877/191564525-a27a875d-c2e2-40e4-88bf-1ec8f2955c39.png)

Minor Changes:

-   Updated Calculator.java to make use of new Divide.java
-   Committed changes locally to Calculator.java and Divide.java in Git Staging

Bug Fixes:

-   Not Applicable
