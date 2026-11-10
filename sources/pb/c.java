package pb;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
public abstract class c {
    public static final f5.a f53536a = new f5.a("CommonUtils", "");

    public static String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e10) {
            String concat = "Exception thrown when trying to get app version ".concat(e10.toString());
            f5.a aVar = f53536a;
            if (Log.isLoggable(aVar.f11117a, 6)) {
                String str = aVar.f11118b;
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
