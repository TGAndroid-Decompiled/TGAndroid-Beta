package w9;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f50333a;
    public final String f50334b;
    public final ArrayList f50335c;
    public final String d;
    public final String f50336e;
    public final String f50337f;
    public final String f50338g;
    public final n6.k h;

    public a(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, n6.k kVar) {
        this.f50333a = str;
        this.f50334b = str2;
        this.f50335c = arrayList;
        this.d = str3;
        this.f50336e = str4;
        this.f50337f = str5;
        this.f50338g = str6;
        this.h = kVar;
    }

    public static a a(Context context, u uVar, String str, String str2, ArrayList arrayList, n6.k kVar) {
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
        return new a(str, str2, arrayList, c10, packageName, str3, str4, kVar);
    }
}
