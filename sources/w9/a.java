package w9;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.ArrayList;
import n7.z0;
public final class a {
    public final String f48923a;
    public final String f48924b;
    public final ArrayList f48925c;
    public final String d;
    public final String f48926e;
    public final String f48927f;
    public final String f48928g;
    public final z0 h;

    public a(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, z0 z0Var) {
        this.f48923a = str;
        this.f48924b = str2;
        this.f48925c = arrayList;
        this.d = str3;
        this.f48926e = str4;
        this.f48927f = str5;
        this.f48928g = str6;
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
