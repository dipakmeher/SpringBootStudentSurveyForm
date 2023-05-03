package in.cdn.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.cdn.Model.StudentSurvey;

public interface StudentSurveyRepository extends JpaRepository<StudentSurvey, Serializable> {

}
