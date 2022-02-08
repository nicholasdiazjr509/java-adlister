import javax.servlet.jsp.jstl.core.Config;

public class DaoFactory {
    private static Ads adsDao;

//    public static Users getUsersDao(){
//        if (usersDao == null){
//            userDao = new MySqlUsersDao(config);
//        }
//        return usersDao;
//    }
    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new ListAdsDao();
        }
        return adsDao;
    }

}
