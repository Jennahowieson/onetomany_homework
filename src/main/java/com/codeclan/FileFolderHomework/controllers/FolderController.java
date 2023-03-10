package com.codeclan.FileFolderHomework.controllers;

import com.codeclan.FileFolderHomework.models.Folder;
import com.codeclan.FileFolderHomework.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FolderController {
    @Autowired
    FolderRepository folderRepository;

    @GetMapping("/folders")
    public List<Folder> getAllFolders(){
        return folderRepository.findAll();
    }
}
