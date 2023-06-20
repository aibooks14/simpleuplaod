package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {

    @GetMapping("/upload")
    public String showUploadForm() {
        return "upload";
    }

    @PostMapping("/upload")
    public String handleFileUpload(@RequestParam("file") MultipartFile file) {
        // Handle the file upload logic here
        if (!file.isEmpty()) {
            // Save the file to a location or process it
            // For example, you can use the Files class to save the file:
            // Files.copy(file.getInputStream(), Paths.get("/path/to/save/location/filename.pdf"));
        }
        

        // Redirect the user to a success page or back to the upload form
        return "redirect:/success";
    }

    @GetMapping("/success")
    public String showSuccessPage() {
        return "success";
    }
}

