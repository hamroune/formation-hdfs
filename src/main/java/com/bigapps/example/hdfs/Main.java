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

   public static void main(String[] args)  {
      logger.info("Starting ");
      /*
      String localFileName= "./Data/helloWorld.txt";
      String uri= "dataproc-ccf11a60-26ec-43a6-954e-bbabd444d4c5-europe-west1";
      FromLocalToHdfs fromLocalToHdfs = new  FromLocalToHdfs();
      fromLocalToHdfs.createLocal(localFileName);
      fromLocalToHdfs.push(localFileName,uri );
      System.out.print("hello");*/

   }
}
