package in.cdn.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.cdn.Model.StudentSurvey;
import in.cdn.Repository.StudentSurveyRepository;

@Service
public class SurveyServiceImpl implements SurveyService {

	@Autowired
	private StudentSurveyRepository courseRepo;

	@Override
	public String upsert(StudentSurvey course) {

		courseRepo.save(course); // upsert (insert / update based on PK)

		return "success";
	}

	@Override
	public StudentSurvey getById(Integer id) {
		Optional<StudentSurvey> findById = courseRepo.findById(id);

		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public List<StudentSurvey> getAllSurveys() {
		return courseRepo.findAll();
	}

	@Override
	public String deleteById(Integer id) {
		if (courseRepo.existsById(id)) {
			courseRepo.deleteById(id);
			return "Delete Success";
		} else {
			return "No Record Found";
		}
	}

}
