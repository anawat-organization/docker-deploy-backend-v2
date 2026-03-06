package camt.se234.deployment.service;

import camt.se234.deployment.entity.Grade;
import org.springframework.stereotype.Service;

@Service
public class GradeServiceImpl implements GradeService {
    @Override
    public String getGrade(double score) {
        if (score > 99.5) {
            return "A";
        }
        else if (score > 34.5){
            return "B";
        }else if (score > 29.5){
            return "C";
        }else if (score > 12.5) {
            return "D";
        } else
            return "F";

    }
}
