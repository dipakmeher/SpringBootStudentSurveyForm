package in.cdn.Model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "surveys")
public class StudentSurvey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = "first_name")
    private String firstName;

    @NotBlank
    @Column(name = "last_name")
    private String lastName;

    @NotBlank
    @Column(name = "street_address")
    private String streetAddress;

    @NotBlank
    @Column(name = "city")
    private String city;

    @NotBlank
    @Column(name = "state")
    private String state;

    @NotBlank
    @Column(name = "zip")
    private String zip;

    @NotBlank
    @Column(name = "telephone_number")
    private String telephoneNumber;

    @NotBlank
    @Column(name = "email")
    private String email;

    @NotBlank
    @Column(name = "date_of_survey")
    private String dateOfSurvey;

    @Enumerated(EnumType.STRING)
    @Column(name = "liked_most")
    private LikedMostOption likedMost;

    @Enumerated(EnumType.STRING)
    @Column(name = "interested_in_university")
    private InterestedInUniversityOption interestedInUniversity;

    @Enumerated(EnumType.STRING)
    @Column(name = "recommend_likelihood")
    private RecommendLikelihoodOption recommendLikelihood;

    // getters and setters

    public enum LikedMostOption {
        STUDENTS,
        LOCATION,
        CAMPUS,
        ATMOSPHERE,
        DORM_ROOMS,
        SPORTS
    }

    public enum InterestedInUniversityOption {
        FRIENDS,
        TELEVISION,
        INTERNET,
        OTHER
    }

    public enum RecommendLikelihoodOption {
        VERY_LIKELY,
        LIKELY,
        UNLIKELY
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfSurvey() {
        return dateOfSurvey;
    }

    public void setDateOfSurvey(String dateOfSurvey) {
        this.dateOfSurvey = dateOfSurvey;
    }

    public LikedMostOption getLikedMost() {
        return likedMost;
    }

    public void setLikedMost(LikedMostOption likedMost) {
        this.likedMost = likedMost;
    }

    public InterestedInUniversityOption getInterestedInUniversity() {
        return interestedInUniversity;
    }

    public void setInterestedInUniversity(InterestedInUniversityOption interestedInUniversity) {
        this.interestedInUniversity = interestedInUniversity;
    }

    public RecommendLikelihoodOption getRecommendLikelihood() {
        return recommendLikelihood;
    }

    public void setRecommendLikelihood(RecommendLikelihoodOption recommendLikelihood) {
        this.recommendLikelihood = recommendLikelihood;
    }
}

