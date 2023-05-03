package in.cdn.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.cdn.Model.StudentSurvey;
import in.cdn.Service.SurveyService;

@RestController
public class StudentSurveyController {

	@Autowired
	private SurveyService surveyService;

	@PostMapping("/survey")
	public ResponseEntity<String> createSurvey(@RequestBody StudentSurvey survey) {
		String status = surveyService.upsert(survey);
		return new ResponseEntity<>(status, HttpStatus.CREATED);
	}

	@GetMapping("/survey/{id}")
	public ResponseEntity<StudentSurvey> getSurvey(@PathVariable Integer id) {
		StudentSurvey survey = surveyService.getById(id);
		return new ResponseEntity<>(survey, HttpStatus.OK);
	}

	@GetMapping("/surveys")
	public ResponseEntity<List<StudentSurvey>> getAllSurveys() {
		List<StudentSurvey> allSurveys = surveyService.getAllSurveys();
		return new ResponseEntity<>(allSurveys, HttpStatus.OK);
	}

	@PutMapping("/survey")
	public ResponseEntity<String> updateSurvey(@RequestBody StudentSurvey survey) {
		String status = surveyService.upsert(survey);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}

	@DeleteMapping("/survey/{id}")
	public ResponseEntity<String> deleteSurvey(@PathVariable Integer id) {
		String status = surveyService.deleteById(id);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}

}
