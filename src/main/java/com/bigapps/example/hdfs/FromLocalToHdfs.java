package com.bigapps.example.hdfs;

import org.apache.hadoop.conf.Configuration;
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
    public void push() {
        try

        {

            Configuration conf = new Configuration();
            //conf.addResource(new Path("/user/wissam"));

            FileSystem fs = FileSystem.get(conf);
            fs.copyFromLocalFile(new Path("/home/bw_maamar_kouadri/helloWorld.txt"),
                    new Path("/user/wissam"));


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
     catch(IOException e)
    {
        e.printStackTrace();
    }
    catch (Exception ex) {
        ex.printStackTrace();
    }

}
}
