package com.whiter.study.jenkins.controller;


import com.whiter.study.jenkins.dto.VideoDto;
import com.whiter.study.jenkins.model.Video;
import com.whiter.study.jenkins.service.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class mainController {

    private final VideoService videoService;
    @GetMapping("/videos")
    public List<VideoDto> getAllVideos() {
        return videoService.getAllVideos();
    }
}
