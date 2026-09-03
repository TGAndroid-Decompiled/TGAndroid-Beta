package w5;

import a8.j;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.internal.clearcut.c2;
import com.google.android.gms.internal.clearcut.q1;
public final class a {
    public static final e f49454j = new e("ClearcutLogger.API", new j(18), new Object());
    public final Context f49455a;
    public final String f49456b;
    public final int f49457c;
    public final String d;
    public final int f49458e;
    public final q1 f49459f;
    public final a8.e f49460g;
    public final i6.a h;
    public final c2 f49461i;

    public a(Context context) {
        ?? jVar = new com.google.android.gms.common.api.j(context, f49454j, (com.google.android.gms.common.api.a) null, (t) new Object());
        c2 c2Var = new c2(context);
        this.f49458e = -1;
        q1 q1Var = q1.DEFAULT;
        this.f49459f = q1Var;
        this.f49455a = context;
        this.f49456b = context.getPackageName();
        int i10 = 0;
        try {
            i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e6) {
            Log.wtf("ClearcutLogger", "This can't happen.", e6);
        }
        this.f49457c = i10;
        this.f49458e = -1;
        this.d = "VISION";
        this.f49460g = jVar;
        this.h = i6.a.f7902a;
        this.f49459f = q1Var;
        this.f49461i = c2Var;
    }
}
