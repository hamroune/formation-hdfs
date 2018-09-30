package com.bigapps.example.hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;

import java.nio.file.FileSystem;

public class HdfsWriter {

    try {

        Configuration configuration = new Configuration();
        FileSystem fs = FileSystem.get(new URI("hdfs://192.168.1.170:54310/"),configuration);
        fs.copyFromLocalFile(new Path("./part-m-00000"), new Path("hdfs://192.168.1.170:54310/user/hduser/samplefile"));
        fs.close();
    } catch (Exception ex) {
        System.out.println("Exception "+ex.toString());
    }


}
