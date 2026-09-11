package qb;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import m2.u;
public abstract class c {
    public static final u f44273a = new u("CommonUtils", "");

    public static String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e7) {
            String concat = "Exception thrown when trying to get app version ".concat(e7.toString());
            u uVar = f44273a;
            if (Log.isLoggable(uVar.f15820b, 6)) {
                String str = uVar.f15821c;
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
