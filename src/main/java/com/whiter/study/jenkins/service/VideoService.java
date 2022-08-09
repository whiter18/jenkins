package com.whiter.study.jenkins.service;

import com.whiter.study.jenkins.dto.VideoDto;
import com.whiter.study.jenkins.model.Video;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.whiter.study.jenkins.repository.VideoRepository;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class VideoService {
    private final VideoRepository videoRepository;

    public List<VideoDto> getAllVideos() {

        return videoRepository.findAll().stream().map(this::mapToVideoDto).collect(Collectors.toList());
    }

    private VideoDto mapToVideoDto(Video videoById){
        VideoDto videoDto = new VideoDto();
        videoDto.setVideoUrl(videoById.getVideoUrl());
        videoDto.setThumbnailUrl(videoById.getThumbnailUrl());
        videoDto.setId(videoById.getId());
        videoDto.setUserName(videoById.getUserName());
        videoDto.setUserId(videoById.getUserId());
        videoDto.setTitle(videoById.getTitle());
        videoDto.setDescription(videoById.getDescription());
        videoDto.setTags(videoById.getTags());

        return videoDto;
    }
}
