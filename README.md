# sandbox-cdi.weld-jpms
environment for problems (and, hopefully, solutions) regarding the use of jmps together with cdi (weld)

the environment consists of a simple maven multi project. it is a _multi_ project to make adding of more modules easy. for now ```modules``` is the only module in this project.

notice the location of ```beans.xml``` in ```src/main/resources```. this enables cdi in the main application as well as in tests.

also notice the content of ```module-info.java```.

currently both the application and the tests can be run successfully.