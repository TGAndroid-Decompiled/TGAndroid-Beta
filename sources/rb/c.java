package rb;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
public abstract class c {
    public static final c5.a f43849a = new c5.a("CommonUtils", "");

    public static String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            String concat = "Exception thrown when trying to get app version ".concat(e.toString());
            c5.a aVar = f43849a;
            if (Log.isLoggable(aVar.f4326a, 6)) {
                String str = aVar.f4327b;
                if (str != null) {
                    concat = str.concat(concat);
                }
                Log.e("CommonUtils", concat);
                return "";
            }
            return "";
        }
    }
}
