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
      logger.info("Starting ");
       Configuration config = new Configuration();
       FileSystem fs = FileSystem.get(config);
       Path source = new Path("sofiane.txt");
       Path dest = new Path("/user/sofiane/");

       try {
           if (fs.exists(source)) {
               fs.delete(source, true);
           }

           FSDataOutputStream fin = fs.create(source);
           fin.close();

           fs.copyFromLocalFile(false,true,source, dest);
       }catch (Exception err){
           
       }


       logger.info("Ending ");

   }
}
