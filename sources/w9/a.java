package w9;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f50447a;
    public final String f50448b;
    public final ArrayList f50449c;
    public final String d;
    public final String f50450e;
    public final String f50451f;
    public final String f50452g;
    public final n6.k h;

    public a(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, n6.k kVar) {
        this.f50447a = str;
        this.f50448b = str2;
        this.f50449c = arrayList;
        this.d = str3;
        this.f50450e = str4;
        this.f50451f = str5;
        this.f50452g = str6;
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
