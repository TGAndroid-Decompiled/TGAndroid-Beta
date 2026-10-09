package w9;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f50212a;
    public final String f50213b;
    public final ArrayList f50214c;
    public final String d;
    public final String f50215e;
    public final String f50216f;
    public final String f50217g;
    public final n6.t h;

    public a(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, n6.t tVar) {
        this.f50212a = str;
        this.f50213b = str2;
        this.f50214c = arrayList;
        this.d = str3;
        this.f50215e = str4;
        this.f50216f = str5;
        this.f50217g = str6;
        this.h = tVar;
    }

    public static a a(Context context, u uVar, String str, String str2, ArrayList arrayList, n6.t tVar) {
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
        return new a(str, str2, arrayList, c10, packageName, str3, str4, tVar);
    }
}
