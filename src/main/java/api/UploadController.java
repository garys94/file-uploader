package api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(value = "/files")
public class UploadController {

    public UploadController() {

    }

    @PostMapping("/")
    public ResponseEntity uploadFile(@RequestParam("file") final MultipartFile file) {

        return new ResponseEntity(HttpStatus.CREATED);
    }
}
