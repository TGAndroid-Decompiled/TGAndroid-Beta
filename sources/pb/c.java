package pb;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
public abstract class c {
    public static final k8.a f55517a = new k8.a("CommonUtils", "");

    public static String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e10) {
            String concat = "Exception thrown when trying to get app version ".concat(e10.toString());
            k8.a aVar = f55517a;
            if (Log.isLoggable((String) aVar.f18180b, 6)) {
                String str = (String) aVar.f18181c;
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
