package w9;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.ArrayList;
import org.telegram.ui.Cells.f3;
public final class a {
    public final String f45204a;
    public final String f45205b;
    public final ArrayList f45206c;
    public final String d;
    public final String e;
    public final String f45207f;
    public final String f45208g;
    public final f3 h;

    public a(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, f3 f3Var) {
        this.f45204a = str;
        this.f45205b = str2;
        this.f45206c = arrayList;
        this.d = str3;
        this.e = str4;
        this.f45207f = str5;
        this.f45208g = str6;
        this.h = f3Var;
    }

    public static a a(Context context, u uVar, String str, String str2, ArrayList arrayList, f3 f3Var) {
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
        return new a(str, str2, arrayList, c10, packageName, str3, str4, f3Var);
    }
}
