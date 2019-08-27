package com.hedian.haian.util;


import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Iterator;

/**
 * 实现对于文件上传的工具实现
 */
public class FileUtil {


    // 文件允许格式
    private String[] allowFiles = { ".rar", ".doc", ".docx", ".zip", ".pdf",
            ".txt", ".swf", ".wmv", ".gif", ".png", ".jpg", ".jpeg", ".bmp" };

    /**
     * 实现对于文件的数据上传功能实现
     * @param file
     * @param filePath
     * @param fileName
     * @throws Exception
     */
    public static String uploadFile(byte[] file, String filePath, String fileName) throws Exception{
        File targetFile = new File(filePath);
        if(!targetFile.exists()){
            targetFile.mkdirs();
        }
        String fileMark=filePath+fileName;
        FileOutputStream out = new FileOutputStream(fileMark);
        out.write(file);
        out.flush();
        out.close();
        return fileMark;
    }


    /**
     * 文件类型判断
     *
     * @param fileName
     * @return
     */
    private boolean checkFileType(String fileName) {
        Iterator<String> type = Arrays.asList(this.allowFiles).iterator();
        while (type.hasNext()) {
            String ext = type.next();
            if (fileName.toLowerCase().endsWith(ext)) {
                return true;
            }
        }
        return false;
    }



    /**
     * 获取文件扩展名
     *
     * @return string
     */
    private String getFileExt(String fileName) {
        return fileName.substring(fileName.lastIndexOf("."));
    }



    private byte[] getFileOutputStream(InputStream in) {

        try {
            return IOUtils.toByteArray(in);
        } catch (IOException e) {
            return null;
        }

    }
}
