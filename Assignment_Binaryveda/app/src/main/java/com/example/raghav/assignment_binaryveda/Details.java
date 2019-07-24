package com.example.raghav.assignment_binaryveda;

/**
 * Created by raghav on 7/24/19.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.json.JSONObject;
import java.io.Serializable;
import java.util.List;



public class Details {

    @SerializedName("data")
    @Expose
    private Data data;

    public Data getData() {
        return data;
    }


    class Data {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("roles")
        @Expose
        private List<Role> roles = null;
        @SerializedName("user_id")
        @Expose
        private Integer userId;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("image")
        @Expose
        private String image;
        @SerializedName("designation")
        @Expose
        private Designation designation;
        @SerializedName("since_last_company")
        @Expose
        private String sinceLastCompany;
        @SerializedName("experience")
        @Expose
        private String experience;
        @SerializedName("expected_ctc")
        @Expose
        private String expectedCtc;

        @SerializedName("highest_qualification")
        @Expose
        private HighestQualification highestQualification;

        @SerializedName("location")
        @Expose
        private String location;
        @SerializedName("latitude")
        @Expose
        private Double latitude;
        @SerializedName("longitude")
        @Expose
        private Double longitude;
        @SerializedName("radius")
        @Expose
        private Integer radius;
        @SerializedName("resume_count")
        @Expose
        private Integer resumeCount;
        @SerializedName("bitbucket")
        @Expose
        private Object bitbucket;
        @SerializedName("github")
        @Expose
        private Object github;
        @SerializedName("stackoverflow")
        @Expose
        private String stackoverflow;
        @SerializedName("linkedin")
        @Expose
        private String linkedin;
        @SerializedName("hackathon")
        @Expose
        private Integer hackathon;
        @SerializedName("latest_user_resume")
        @Expose
        private Object latestUserResume;
        @SerializedName("user_comments")
        @Expose
        private Integer userComments;
        @SerializedName("city_list")
        @Expose
        private List<String> cityList = null;
        @SerializedName("show_city_popup")
        @Expose
        private Boolean showCityPopup;
        @SerializedName("city_popup_text")
        @Expose
        private String cityPopupText;
        @SerializedName("city_popup_image")
        @Expose
        private String cityPopupImage;

        @SerializedName("skills")
        @Expose
        private List<Skill> skills = null;

        @SerializedName("last_company")
        @Expose
        private LastCompany lastCompany;
        @SerializedName("industries")
        @Expose
        private List<Industry> industries = null;
        @SerializedName("work_functions")
        @Expose
        private List<WorkFunction> workFunctions = null;



        public List<Industry> getIndustries() {
            return industries;
        }

        public List<WorkFunction> getWorkFunctions() {
            return workFunctions;
        }

        public List<Role> getRoles() {
            return roles;
        }

        public LastCompany getLastCompany() {
            return lastCompany;
        }

        public List<Skill> getSkills() {
            return skills;
        }


        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getUserId() {
            return userId;
        }

        public void setUserId(Integer userId) {
            this.userId = userId;
        }

        public HighestQualification getHighestQualification() {
            return highestQualification;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public Designation getDesignation() {
            return designation;
        }

        public void setDesignation(Designation designation) {
            this.designation = designation;
        }


        public String getSinceLastCompany() {
            return sinceLastCompany;
        }

        public void setSinceLastCompany(String sinceLastCompany) {
            this.sinceLastCompany = sinceLastCompany;
        }

        public String getExperience() {
            return experience;
        }

        public void setExperience(String experience) {
            this.experience = experience;
        }

        public String getExpectedCtc() {
            return expectedCtc;
        }

        public void setExpectedCtc(String expectedCtc) {
            this.expectedCtc = expectedCtc;
        }


        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public Double getLatitude() {
            return latitude;
        }

        public void setLatitude(Double latitude) {
            this.latitude = latitude;
        }

        public Double getLongitude() {
            return longitude;
        }

        public void setLongitude(Double longitude) {
            this.longitude = longitude;
        }

        public Integer getRadius() {
            return radius;
        }

        public void setRadius(Integer radius) {
            this.radius = radius;
        }

        public Integer getResumeCount() {
            return resumeCount;
        }

        public void setResumeCount(Integer resumeCount) {
            this.resumeCount = resumeCount;
        }

        public Object getBitbucket() {
            return bitbucket;
        }

        public void setBitbucket(Object bitbucket) {
            this.bitbucket = bitbucket;
        }

        public Object getGithub() {
            return github;
        }

        public void setGithub(Object github) {
            this.github = github;
        }

        public String getStackoverflow() {
            return stackoverflow;
        }

        public void setStackoverflow(String stackoverflow) {
            this.stackoverflow = stackoverflow;
        }

        public String getLinkedin() {
            return linkedin;
        }

        public void setLinkedin(String linkedin) {
            this.linkedin = linkedin;
        }

        public Integer getHackathon() {
            return hackathon;
        }

        public void setHackathon(Integer hackathon) {
            this.hackathon = hackathon;
        }

        public Object getLatestUserResume() {
            return latestUserResume;
        }

        public void setLatestUserResume(Object latestUserResume) {
            this.latestUserResume = latestUserResume;
        }

        public Integer getUserComments() {
            return userComments;
        }

        public void setUserComments(Integer userComments) {
            this.userComments = userComments;
        }


        public List<String> getCityList() {
            return cityList;
        }

        public void setCityList(List<String> cityList) {
            this.cityList = cityList;
        }

        public Boolean getShowCityPopup() {
            return showCityPopup;
        }

        public void setShowCityPopup(Boolean showCityPopup) {
            this.showCityPopup = showCityPopup;
        }

        public String getCityPopupText() {
            return cityPopupText;
        }

        public void setCityPopupText(String cityPopupText) {
            this.cityPopupText = cityPopupText;
        }

        public String getCityPopupImage() {
            return cityPopupImage;
        }

        public void setCityPopupImage(String cityPopupImage) {
            this.cityPopupImage = cityPopupImage;
        }



        //====DESIGNATION ===
        class Designation {

            @SerializedName("id")
            @Expose
            private Integer id;
            @SerializedName("name")
            @Expose
            private String name;

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        //======QUALIFICATIONS==

        class HighestQualification {

            @SerializedName("id")
            @Expose
            private Integer id;
            @SerializedName("name")
            @Expose
            private String name;

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        //===== SKILLS ======

        class Skill {

            @SerializedName("id")
            @Expose
            private Integer id;
            @SerializedName("name")
            @Expose
            private String name;

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

        }

        public class LastCompany {

            @SerializedName("id")
            @Expose
            private Integer id;
            @SerializedName("name")
            @Expose
            private String name;

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

        }

        public class Role {

            @SerializedName("id")
            @Expose
            private Integer id;
            @SerializedName("name")
            @Expose
            private String name;

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

        }

        public class WorkFunction {

            @SerializedName("id")
            @Expose
            private Integer id;
            @SerializedName("name")
            @Expose
            private String name;

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

        }

        public class Industry {

            @SerializedName("id")
            @Expose
            private Integer id;
            @SerializedName("name")
            @Expose
            private String name;

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

        }


    }


}
