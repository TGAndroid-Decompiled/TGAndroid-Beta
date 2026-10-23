package x9;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f50111a;
    public final String f50112b;
    public final ArrayList f50113c;
    public final String d;
    public final String e;
    public final String f50114f;
    public final String f50115g;
    public final mi.q h;

    public a(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, mi.q qVar) {
        this.f50111a = str;
        this.f50112b = str2;
        this.f50113c = arrayList;
        this.d = str3;
        this.e = str4;
        this.f50114f = str5;
        this.f50115g = str6;
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
