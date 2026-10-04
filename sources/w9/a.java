package w9;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.ArrayList;
import n7.z0;
public final class a {
    public final String f48915a;
    public final String f48916b;
    public final ArrayList f48917c;
    public final String d;
    public final String f48918e;
    public final String f48919f;
    public final String f48920g;
    public final z0 h;

    public a(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, z0 z0Var) {
        this.f48915a = str;
        this.f48916b = str2;
        this.f48917c = arrayList;
        this.d = str3;
        this.f48918e = str4;
        this.f48919f = str5;
        this.f48920g = str6;
        this.h = z0Var;
    }

    public static a a(Context context, v vVar, String str, String str2, ArrayList arrayList, z0 z0Var) {
        String num;
        String packageName = context.getPackageName();
        String c10 = vVar.c();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        if (Build.VERSION.SDK_INT >= 28) {
            num = Long.toString(packageInfo.getLongVersionCode());
        } else {
            num = Integer.toString(packageInfo.versionCode);
        }
        String str3 = num;
        String str4 = packageInfo.versionName;
        if (str4 == null) {
            str4 = "0.0";
        }
        return new a(str, str2, arrayList, c10, packageName, str3, str4, z0Var);
    }
}
