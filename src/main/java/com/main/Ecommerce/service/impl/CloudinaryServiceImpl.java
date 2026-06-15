package com.main.Ecommerce.service.impl;

import java.io.IOException;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.main.Ecommerce.service.CloudinaryService;

@Service
public class CloudinaryServiceImpl implements CloudinaryService {

    final Cloudinary cloudinary;

    CloudinaryServiceImpl(Cloudinary cloudinary) {
        this.cloudinary = cloudinary;
    }

    @Override
    public String upload(MultipartFile file) {

        Map<Object, Object> map = null;
        try {
            map = cloudinary.uploader().upload(file.getBytes(), Map.of());
            return (String) map.get("url"); // It will return url of saved image.
        } catch (IOException e) {
            System.out.println("Image uploading error in CloudinaryServiceImpl upload method : Error is -> " + e);
            return null;
            // throw new RuntimeException("Image Uploading failed", e);
        }
    }

}
