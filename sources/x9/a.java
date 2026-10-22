package x9;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f49668a;
    public final String f49669b;
    public final ArrayList f49670c;
    public final String d;
    public final String e;
    public final String f49671f;
    public final String f49672g;
    public final mi.q h;

    public a(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, mi.q qVar) {
        this.f49668a = str;
        this.f49669b = str2;
        this.f49670c = arrayList;
        this.d = str3;
        this.e = str4;
        this.f49671f = str5;
        this.f49672g = str6;
        this.h = qVar;
    }

    public static a a(Context context, u uVar, String str, String str2, ArrayList arrayList, mi.q qVar) {
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
        return new a(str, str2, arrayList, c10, packageName, str3, str4, qVar);
    }
}
