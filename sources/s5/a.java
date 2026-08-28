package s5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import b7.d;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.j;
import com.google.android.gms.internal.clearcut.d2;
import com.google.android.gms.internal.clearcut.r1;
import com.google.android.gms.internal.clearcut.v0;
public final class a {
    public static final e f47433j = new e("ClearcutLogger.API", new d(12), new Object());
    public final Context f47434a;
    public final String f47435b;
    public final int f47436c;
    public final String d;
    public final int f47437e;
    public final r1 f47438f;
    public final v0 f47439g;
    public final e6.a h;
    public final d2 f47440i;

    public a(Context context) {
        ?? jVar = new j(context, f47433j, (com.google.android.gms.common.api.a) null, (t) new Object());
        d2 d2Var = new d2(context);
        this.f47437e = -1;
        r1 r1Var = r1.DEFAULT;
        this.f47438f = r1Var;
        this.f47434a = context;
        this.f47435b = context.getPackageName();
        int i9 = 0;
        try {
            i9 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.wtf("ClearcutLogger", "This can't happen.", e10);
        }
        this.f47436c = i9;
        this.f47437e = -1;
        this.d = "VISION";
        this.f47439g = jVar;
        this.h = e6.a.f4957a;
        this.f47438f = r1Var;
        this.f47440i = d2Var;
    }
}
