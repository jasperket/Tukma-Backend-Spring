package org.tukma.jobs.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.tukma.jobs.models.Job;

import java.util.List;
import java.util.Optional;

public interface JobRepository extends JpaRepository<Job, Long> {

    public List<Job> findByOwner_Id(Long id);
    
    public Page<Job> findByOwner_Id(Long id, Pageable pageable);

    public Optional<Job> findByAccessKey(String accessKey);

    public boolean existsByAccessKey(String accessKey);
}
