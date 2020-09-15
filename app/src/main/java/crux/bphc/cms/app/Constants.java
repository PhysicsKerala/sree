package crux.bphc.cms.app;

/**
 * Class that contains constants and other near-constant information
 *
 * @author Harshit Agarwal (16-12-2016)
 */

public class Constants {
    public static final int PER_PAGE = 20; // Number of course search results in a page
    // used for intent from CourseSearch to CorseDetailActivity for CourseEnrolFrag
    public static final String COURSE_PARCEL_INTENT_KEY = "course_parcel";
    public static final String WEBSITE_URL = "https://www.physicskerala.in/";

    public static final String API_URL = "https://mcc.physicskerala.in/mcq/";
    public static final String SSO_LOGIN_URL = API_URL +
            "/admin/tool/mobile/launch.php?service=moodle_mobile_app&passport=%s&urlscheme=%s&oauthsso=1";
    public static final String COURSE_URL = API_URL + "/course/view.php";
    public static final String SSO_URL_SCHEME = "cmsbphc";

    public static String TOKEN;

    public static final String DARK_MODE_KEY = "DARK_MODE";
    public static final String LOGIN_LAUNCH_DATA = "LOGIN_LAUNCH_DATA";

    public static String getFeedbackURL(String username, String id) {
        id += "@hyderabad.bits-pilani.ac.in";
        return "https://www.physicskerala.in/viewform?entry.1072406768="
                + username
                + "&entry.309049076="
                + id
                + "&entry.1046611324&entry.1695717508&entry.1379315100";

    }

    public static String getCourseURL(int courseId) {
        return COURSE_URL + "?id=" + courseId;
    }

}
