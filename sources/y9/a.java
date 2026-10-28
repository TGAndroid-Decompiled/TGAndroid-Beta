package y9;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f52468a;
    public final String f52469b;
    public final ArrayList f52470c;
    public final String d;
    public final String e;
    public final String f52471f;
    public final String f52472g;
    public final m4.c h;

    public a(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, m4.c cVar) {
        this.f52468a = str;
        this.f52469b = str2;
        this.f52470c = arrayList;
        this.d = str3;
        this.e = str4;
        this.f52471f = str5;
        this.f52472g = str6;
        this.h = cVar;
    }

    public static a a(Context context, v vVar, String str, String str2, ArrayList arrayList, m4.c cVar) {
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
        return new a(str, str2, arrayList, c10, packageName, str3, str4, cVar);
    }
}
