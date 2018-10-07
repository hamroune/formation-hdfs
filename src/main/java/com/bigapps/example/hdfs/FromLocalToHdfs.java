package com.bigapps.example.hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;

public class FromLocalToHdfs {



    public void createLocal (String localFileName){
        try {
            //Whatever the file path is.
            File statText = new File(localFileName);
            FileOutputStream is = new FileOutputStream(statText);
            OutputStreamWriter osw = new OutputStreamWriter(is);
            Writer w = new BufferedWriter(osw);
            w.write("hello World!!!");
            w.close();
        } catch (IOException e) {
            System.err.println("Problem writing to the file statsTest.txt");
        }


    }
    public void push() throws IOException, URISyntaxException{


                    // ====== Init HDFS File System Object
                    Configuration conf = new Configuration();
                    conf.addResource(new Path("/home/boulesbaa/travail/hadoopreadwrite/src/main/resources/hdfs-site.xml"));
                    // Set FileSystem URI
                    String hdfsuri = "hdfs://172.17.0.2:8022/" ;


                    //Get the filesystem - HDFS
                    FileSystem fs = FileSystem.get( new URI(hdfsuri) ,  new Configuration());
                    FileStatus[] status = fs.listStatus(new Path(hdfsuri));  // you need to pass in your hdfs path



                    //==== Create folder if not exists
                    String path = "documents" ;

                    for(FileStatus f : status){
                        System.out.println(f.getPath().toString());
                    }





           /*
            System.out.println("okay");
            Configuration configuration = new Configuration();
            System.out.println("okay2");
            FileSystem fs = null;
            fs = FileSystem.get(new URI(hdfsPath), configuration);
            System.out.println("okay3");
            fs.copyFromLocalFile(new Path(localFileName), new Path(hdfsPath));
            System.out.println("okay4");*/
            fs.close();


}
}
