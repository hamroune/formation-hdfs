Example for read & write into HDFS
==================

Usage in local :

 - mvn package
 - java -jar target/formation-hdfs-1.0-SNAPSHOT-jar-with-dependencies.jar hdfs://namenodeserver:8020

Usage :

 - mvn package (in local, to generate jar file)
 - create new Java Job
 - upload the jar (arget/example-java-read-and-write-from-hdfs-1.0-SNAPSHOT-jar-with-dependencies.jar)
 - copy URL from HDFS connection details panel and add it in first argument in the command line
 - choose java 8
 - create and launch.
