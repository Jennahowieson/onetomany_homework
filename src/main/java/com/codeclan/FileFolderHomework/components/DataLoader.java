package com.codeclan.FileFolderHomework.components;

import com.codeclan.FileFolderHomework.models.File;
import com.codeclan.FileFolderHomework.models.Folder;
import com.codeclan.FileFolderHomework.models.Person;
import com.codeclan.FileFolderHomework.repositories.FileRepository;
import com.codeclan.FileFolderHomework.repositories.FolderRepository;
import com.codeclan.FileFolderHomework.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component //Comment this out if you do not to run the data loader.
public class DataLoader implements ApplicationRunner {

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    PersonRepository personRepository;

    @Autowired
    FileRepository fileRepository;


    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        Person polly = new Person("polly");
        personRepository.save(polly);

        Folder holidayPics = new Folder("Holiday Pics",polly);
        folderRepository.save(holidayPics);

        File photo1 = new File("photo1","jpeg",34,holidayPics);
        File photo2 = new File("photo2","jpeg",38,holidayPics);
        File photo3 = new File("photo3","jpeg",49,holidayPics);
        fileRepository.save(photo1);
        fileRepository.save(photo2);
        fileRepository.save(photo3);
    }
}
