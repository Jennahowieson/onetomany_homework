package com.codeclan.FileFolderHomework.repositories;

import com.codeclan.FileFolderHomework.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {

}
