package com.bigapps.example.hdfs;
import org.apache.commons.io.IOUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;


import java.io.IOException;
import java.net.URI;
import java.util.logging.Logger;

public class Main {

   private static final Logger logger = Logger.getLogger("com.bigapps.example.hdfs.Main");

   public static void main(String[] args)  {

      try {
         Configuration conf = new Configuration();
         //conf.addResource(new Path("/user/wissam"));

         FileSystem fs = FileSystem.get(conf);
         fs.copyFromLocalFile(new Path("/home/bw_maamar_kouadri/helloworld.txt"), new Path("/user/wissam"));



      }

      catch(IOException e)
      {
         e.printStackTrace();
      }
      catch (Exception ex) {
         ex.printStackTrace();
      }

   }
}
