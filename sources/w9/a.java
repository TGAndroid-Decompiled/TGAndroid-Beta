package w9;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.ArrayList;
import og.u0;
public final class a {
    public final String f43865a;
    public final String f43866b;
    public final ArrayList f43867c;
    public final String d;
    public final String e;
    public final String f43868f;
    public final String f43869g;
    public final u0 h;

    public a(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, u0 u0Var) {
        this.f43865a = str;
        this.f43866b = str2;
        this.f43867c = arrayList;
        this.d = str3;
        this.e = str4;
        this.f43868f = str5;
        this.f43869g = str6;
        this.h = u0Var;
    }

    public static a a(Context context, u uVar, String str, String str2, ArrayList arrayList, u0 u0Var) {
        String num;
        String packageName = context.getPackageName();
        String c10 = uVar.c();
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
        return new a(str, str2, arrayList, c10, packageName, str3, str4, u0Var);
    }
}
