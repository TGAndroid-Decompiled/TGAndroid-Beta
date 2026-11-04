package z9;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f60158a;
    public final String f60159b;
    public final ArrayList f60160c;
    public final String d;
    public final String f60161e;
    public final String f60162f;
    public final String f60163g;
    public final w9.b h;

    public a(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, w9.b bVar) {
        this.f60158a = str;
        this.f60159b = str2;
        this.f60160c = arrayList;
        this.d = str3;
        this.f60161e = str4;
        this.f60162f = str5;
        this.f60163g = str6;
        this.h = bVar;
    }

    public static a a(Context context, v vVar, String str, String str2, ArrayList arrayList, w9.b bVar) {
        String num;
        String packageName = context.getPackageName();
        String d = vVar.d();
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
        return new a(str, str2, arrayList, d, packageName, str3, str4, bVar);
    }
}
