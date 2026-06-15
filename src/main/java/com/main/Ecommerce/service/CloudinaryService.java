package com.main.Ecommerce.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface CloudinaryService {

    public String upload(MultipartFile file);

}
