package za;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

public abstract class c {

    public static final c9.b f50281a = new c9.b("CommonUtils", "");

    public static String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e9) {
            String strConcat = "Exception thrown when trying to get app version ".concat(e9.toString());
            c9.b bVar = f50281a;
            if (!Log.isLoggable(bVar.f2566b, 6)) {
                return "";
            }
            String str = bVar.f2567c;
            if (str != null) {
                strConcat = str.concat(strConcat);
            }
            Log.e("CommonUtils", strConcat);
            return "";
        }
    }
}
