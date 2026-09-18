package w9;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.ArrayList;
import n7.a1;
public final class a {
    public final String f44934a;
    public final String f44935b;
    public final ArrayList f44936c;
    public final String d;
    public final String e;
    public final String f44937f;
    public final String f44938g;
    public final a1 h;

    public a(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, a1 a1Var) {
        this.f44934a = str;
        this.f44935b = str2;
        this.f44936c = arrayList;
        this.d = str3;
        this.e = str4;
        this.f44937f = str5;
        this.f44938g = str6;
        this.h = a1Var;
    }

    public static a a(Context context, u uVar, String str, String str2, ArrayList arrayList, a1 a1Var) {
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
        return new a(str, str2, arrayList, c10, packageName, str3, str4, a1Var);
    }
}
