/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jme3.macaq.filetype.mqs;

import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;

/**
 *
 * @author Rickard <neph1 @ github>
 */
public class FileTypeUtil {
    
    public static String getFileNameFromContext(MqsDataObject context){
        FileObject f = context.getPrimaryFile();
        String displayName = FileUtil.getFileDisplayName(f);
        return displayName;
    }
}
