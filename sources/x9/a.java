package x9;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f53435a;
    public final String f53436b;
    public final ArrayList f53437c;
    public final String d;
    public final String e;
    public final String f53438f;
    public final String f53439g;
    public final u9.b h;

    public a(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, u9.b bVar) {
        this.f53435a = str;
        this.f53436b = str2;
        this.f53437c = arrayList;
        this.d = str3;
        this.e = str4;
        this.f53438f = str5;
        this.f53439g = str6;
        this.h = bVar;
    }

    public static a a(Context context, v vVar, String str, String str2, ArrayList arrayList, u9.b bVar) {
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
        return new a(str, str2, arrayList, c10, packageName, str3, str4, bVar);
    }
}
