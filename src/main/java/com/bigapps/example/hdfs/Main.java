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


        String localFileName= "D:\\Users\\wissam\\Documents\\these\\formation_bigdata\\formation-hdfs\\Data\\helloWorld.txt";
      //String uri= "dataproc-ccf11a60-26ec-43a6-954e-bbabd444d4c5-europe-west1";
      FromLocalToHdfs fromLocalToHdfs = new  FromLocalToHdfs();
      System.out.print("okay");
      //fromLocalToHdfs.createLocal(localFileName);
      System.out.print("file writing okay");
      fromLocalToHdfs.push( );
      System.out.print("hello");

   }
}
