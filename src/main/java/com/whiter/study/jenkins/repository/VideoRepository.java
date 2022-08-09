package com.whiter.study.jenkins.repository;

import com.whiter.study.jenkins.model.Video;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VideoRepository extends MongoRepository<Video, String> {
}
