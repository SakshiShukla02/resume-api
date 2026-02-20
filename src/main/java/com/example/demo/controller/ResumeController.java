package com.example.demo.controller;

import com.example.demo.model.Resume;
import com.example.demo.repository.ResumeRepository;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resume")
public class ResumeController {

    @Autowired
    private ResumeRepository resumeRepository;

    // CREATE
    @PostMapping("/add")
    public Resume addResume(@Valid @RequestBody Resume resume) {
        return resumeRepository.save(resume);
    }

    // READ
    @GetMapping("/all")
    public List<Resume> getAllResumes() {
        return resumeRepository.findAll();
    }

    // UPDATE  ⭐ add here
    @PutMapping("/update/{id}")
    public ResponseEntity<Resume> updateResume(@PathVariable Long id, @RequestBody Resume details) {

        Resume resume = resumeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Resume not found"));

        resume.setName(details.getName());
        resume.setEmail(details.getEmail());
        resume.setSkills(details.getSkills());

        return ResponseEntity.ok(resumeRepository.save(resume));
    }

    // DELETE  ⭐ add here
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteResume(@PathVariable Long id) {

        Resume resume = resumeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Resume not found"));

        resumeRepository.delete(resume);

        return ResponseEntity.ok("Resume deleted successfully");
    }
}
