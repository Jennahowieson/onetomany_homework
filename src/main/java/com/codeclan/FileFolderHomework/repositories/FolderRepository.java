package com.codeclan.FileFolderHomework.repositories;

import com.codeclan.FileFolderHomework.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long>{
}
