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
    public static final e f49417j = new e("ClearcutLogger.API", new j(18), new Object());
    public final Context f49418a;
    public final String f49419b;
    public final int f49420c;
    public final String d;
    public final int f49421e;
    public final q1 f49422f;
    public final a8.e f49423g;
    public final i6.a h;
    public final c2 f49424i;

    public a(Context context) {
        ?? jVar = new com.google.android.gms.common.api.j(context, f49417j, (com.google.android.gms.common.api.a) null, (t) new Object());
        c2 c2Var = new c2(context);
        this.f49421e = -1;
        q1 q1Var = q1.DEFAULT;
        this.f49422f = q1Var;
        this.f49418a = context;
        this.f49419b = context.getPackageName();
        int i10 = 0;
        try {
            i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e6) {
            Log.wtf("ClearcutLogger", "This can't happen.", e6);
        }
        this.f49420c = i10;
        this.f49421e = -1;
        this.d = "VISION";
        this.f49423g = jVar;
        this.h = i6.a.f7902a;
        this.f49422f = q1Var;
        this.f49424i = c2Var;
    }
}
