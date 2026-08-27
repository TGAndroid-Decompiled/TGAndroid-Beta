package t5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.e;
import com.google.android.gms.internal.clearcut.d2;
import com.google.android.gms.internal.clearcut.r1;
import com.google.android.gms.internal.clearcut.v0;

public final class a {

    public static final e f48082j = new e("ClearcutLogger.API", new a6.b(14), new d());

    public final Context f48083a;

    public final String f48084b;

    public final int f48085c;
    public final String d;

    public final int f48086e;

    public final r1 f48087f;

    public final v0 f48088g;
    public final f6.a h;

    public final d2 f48089i;

    public a(Context context) {
        v0 v0Var = new v0(context, f48082j, null, new com.google.android.gms.common.api.internal.a());
        d2 d2Var = new d2(context);
        this.f48086e = -1;
        r1 r1Var = r1.DEFAULT;
        this.f48087f = r1Var;
        this.f48083a = context;
        this.f48084b = context.getPackageName();
        int i10 = 0;
        try {
            i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e9) {
            Log.wtf("ClearcutLogger", "This can't happen.", e9);
        }
        this.f48085c = i10;
        this.f48086e = -1;
        this.d = "VISION";
        this.f48088g = v0Var;
        this.h = f6.a.f5886a;
        this.f48087f = r1Var;
        this.f48089i = d2Var;
    }
}
