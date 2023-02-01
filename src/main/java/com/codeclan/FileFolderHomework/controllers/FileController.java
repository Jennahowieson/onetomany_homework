package com.codeclan.FileFolderHomework.controllers;

import com.codeclan.FileFolderHomework.models.File;
import com.codeclan.FileFolderHomework.models.Folder;
import com.codeclan.FileFolderHomework.repositories.FileRepository;
import com.codeclan.FileFolderHomework.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FileController {
    @Autowired
    FileRepository fileRepository;

    @GetMapping("/files")
    public List<File> getAllFiles(){
        return fileRepository.findAll();
    }
}
