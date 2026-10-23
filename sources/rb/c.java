package rb;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import m2.t;
public abstract class c {
    public static final t f45603a = new t("CommonUtils", "");

    public static String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            String concat = "Exception thrown when trying to get app version ".concat(e.toString());
            t tVar = f45603a;
            if (Log.isLoggable(tVar.f16532b, 6)) {
                String str = tVar.f16533c;
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
