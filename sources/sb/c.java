package sb;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
public abstract class c {
    public static final d5.a f48044a = new d5.a("CommonUtils", "");

    public static String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            String concat = "Exception thrown when trying to get app version ".concat(e.toString());
            d5.a aVar = f48044a;
            if (Log.isLoggable(aVar.f7928a, 6)) {
                String str = aVar.f7929b;
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
