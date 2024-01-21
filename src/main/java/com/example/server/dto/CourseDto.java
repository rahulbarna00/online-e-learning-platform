package com.example.server.dto;

public class CourseDto {
    private Long courseId;
    private String courseName;
    private String thumbnailUrl;
    private String videoUrl;
    private String category;
    private String level;
    private int durationHrs;
    private String publishedOn;

    public CourseDto(){}

    public CourseDto(Long courseId, String courseName, String thumbnailUrl, String videoUrl, String category, String level, int durationHrs, String publishedOn){
        this.courseId = courseId;
        this.courseName = courseName;
        this.thumbnailUrl = thumbnailUrl;
        this.videoUrl = videoUrl;
        this.category = category;
        this.level = level;
        this.durationHrs = durationHrs;
        this.publishedOn = publishedOn;
    }


    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getDurationHrs() {
        return durationHrs;
    }

    public void setDurationHrs(int durationHrs) {
        this.durationHrs = durationHrs;
    }

    public String getPublishedOn() {
        return publishedOn;
    }

    public void setPublishedOn(String publishedOn) {
        this.publishedOn = publishedOn;
    }
}