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
    public void push(String localFileName,String hdfsPath) {
        try

        {

            Configuration configuration = new Configuration();
            FileSystem fs = null;
            fs = FileSystem.get(new URI(hdfsPath), configuration);
            fs.copyFromLocalFile(new Path(localFileName), new Path(hdfsPath));
            fs.close();
        }
     catch(IOException e)

    {
        e.printStackTrace();
    } catch(URISyntaxException e){
        e.printStackTrace();
    }
    catch (Exception ex) {
        System.out.println("Exception " + ex.toString());
    }

}
}
