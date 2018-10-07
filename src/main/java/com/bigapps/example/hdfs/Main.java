package com.bigapps.example.hdfs;


import org.apache.commons.io.IOUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.net.URI;
import java.util.logging.Logger;

public class Main {

   private static final Logger logger = Logger.getLogger("com.bigapps.example.hdfs.Main");

   public static void main(String[] args) throws Exception {
      logger.info("Starting  Mohamed");

      //hdfs:"10.132.0.2:8020"
   String hdfsUris = "hdfs://10.132.0.2:8020";
      Configuration conf = new Configuration();
// set FileSystem UTL
      conf.set("fs.defaultFS", hdfsUris);
//Because of Maven
      conf.set("fs.hdfs.impl", org.apache.hadoop.hdfs.DistributedFileSystem.class.getName());
      conf.set("fs.hdfs.impl", org.apache.hadoop.fs.LocalFileSystem.class.getName());
// Set Hadoop User
      System.setProperty("HADOOP_USER_NAME", "hdfs");
      System.setProperty("hadoop.home.dir", "/");
      FileSystem fs = FileSystem.get(URI.create(hdfsUris),conf);

   }
}