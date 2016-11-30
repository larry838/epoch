@echo off
call mvn clean:clean
call mvn -Dtest -DfailIfNoTests=false install


cd deploy
call mvn assembly:assembly
cd ../web/target
del "epoch.war" 
ren epoch  epoch.war 
pause