1. Clone a Git repo
	git clone https://github.com/Nkosikk/ndosiautomationdevbasics.git

2. Check which user is in that repo
	git config user.name
	
3. To check your name:
	git config user.name "YOUR NAME"
	
4. To change your name globally:
	git config --global user.name "YOUR NAME"
	
5. To change your email:
	git config user.email "YOUR EMAIL"
	
6. High-level summary of the status of your local repo
	git status
High-level summary of your working directory which shows the current branch name, new files, and staged files.

7. Create a new branch
	git branch BRANCH_NAME or git checkout -b BRANCH_NAME
(no spaces in your branch name)

8. To get a list of all branches
	git branch
* indicates your current branch

9. To go to your branch:
	git checkout BRANCH_NAME

10. To move to the remote repo:
	git push
	
11. To undo everything on your working directory
	git restore

12. To commit your code with a message
	git commit -m "MESSAGE"
	
13. To add files from your working directory to the local repo
	git add FILE_NAME

14. To add all files from your working directory to the local repo
	git add .
	
	
	
	
Order

1. git status
2. git add . (add all)	or 	git add FILE_NAME
3. git commit 
4. git pull
5. git merge
6. git push or git push --set-upstream origin BRANCH_NAME (If it is new)
