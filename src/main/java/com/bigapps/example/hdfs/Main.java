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
         String hdfsPath= "hdfs://10.132.0.2:8020";
         String localFileName= "/home/bw_maamar_kouadri/helloworld.txt";
         System.out.println("okay");
         Configuration configuration = new Configuration();
         System.out.println("okay2");
         FileSystem fs = null;
         fs = FileSystem.get(new URI(hdfsPath), configuration);
         System.out.println("okay3");
         fs.copyFromLocalFile(new Path(localFileName), new Path(hdfsPath));
         System.out.println("okay4");




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



