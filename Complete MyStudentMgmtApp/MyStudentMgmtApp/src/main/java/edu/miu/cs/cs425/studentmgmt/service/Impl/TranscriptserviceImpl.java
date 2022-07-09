package edu.miu.cs.cs425.studentmgmt.service.Impl;

import edu.miu.cs.cs425.studentmgmt.Repository.TranscriptRepository;
import edu.miu.cs.cs425.studentmgmt.model.Transcript;
import edu.miu.cs.cs425.studentmgmt.service.TranscriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TranscriptserviceImpl implements TranscriptService {
    @Autowired
    private TranscriptRepository transcriptRepository;

    @Override
    public void addTranscript(Transcript transcript) {
        transcriptRepository.save(transcript);
    }
}
