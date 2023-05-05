package in.cdn.Service;

import java.util.List;

import in.cdn.Model.StudentSurvey;

public interface SurveyService {

	public String upsert(StudentSurvey course);

	public StudentSurvey getById(Integer id);

	public List<StudentSurvey> getAllSurveys();

	public String deleteById(Integer id);

}
