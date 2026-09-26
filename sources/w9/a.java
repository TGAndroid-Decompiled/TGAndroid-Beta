package w9;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.ArrayList;
import n7.z0;
public final class a {
    public final String f45186a;
    public final String f45187b;
    public final ArrayList f45188c;
    public final String d;
    public final String e;
    public final String f45189f;
    public final String f45190g;
    public final z0 h;

    public a(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, z0 z0Var) {
        this.f45186a = str;
        this.f45187b = str2;
        this.f45188c = arrayList;
        this.d = str3;
        this.e = str4;
        this.f45189f = str5;
        this.f45190g = str6;
        this.h = z0Var;
    }

    public static a a(Context context, u uVar, String str, String str2, ArrayList arrayList, z0 z0Var) {
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
        return new a(str, str2, arrayList, c10, packageName, str3, str4, z0Var);
    }
}
