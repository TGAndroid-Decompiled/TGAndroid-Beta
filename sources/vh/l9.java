package vh;

import java.util.TimeZone;
public abstract class l9 {
    public static String f51459a;
    public static k9 f51460b;

    public static boolean a() {
        String id2 = TimeZone.getDefault().getID();
        if (!id2.startsWith("US/") && !"America/Nassau".equals(id2) && !"America/Belize".equals(id2) && !"America/Cayman".equals(id2) && !"Pacific/Palau".equals(id2)) {
            return true;
        }
        return false;
    }
}
