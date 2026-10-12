package w9;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f50439a;
    public final String f50440b;
    public final ArrayList f50441c;
    public final String d;
    public final String f50442e;
    public final String f50443f;
    public final String f50444g;
    public final n6.k h;

    public a(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, n6.k kVar) {
        this.f50439a = str;
        this.f50440b = str2;
        this.f50441c = arrayList;
        this.d = str3;
        this.f50442e = str4;
        this.f50443f = str5;
        this.f50444g = str6;
        this.h = kVar;
    }

    public static a a(Context context, v vVar, String str, String str2, ArrayList arrayList, n6.k kVar) {
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
        return new a(str, str2, arrayList, c10, packageName, str3, str4, kVar);
    }
}
