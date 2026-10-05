package qb;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
public abstract class c {
    public static final lf.g f44914a = new lf.g("CommonUtils", "");

    public static String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e7) {
            String concat = "Exception thrown when trying to get app version ".concat(e7.toString());
            lf.g gVar = f44914a;
            if (Log.isLoggable(gVar.f15488b, 6)) {
                String str = gVar.f15489c;
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
