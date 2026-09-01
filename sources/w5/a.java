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
    public static final e f49418j = new e("ClearcutLogger.API", new j(18), new Object());
    public final Context f49419a;
    public final String f49420b;
    public final int f49421c;
    public final String d;
    public final int f49422e;
    public final q1 f49423f;
    public final a8.e f49424g;
    public final i6.a h;
    public final c2 f49425i;

    public a(Context context) {
        ?? jVar = new com.google.android.gms.common.api.j(context, f49418j, (com.google.android.gms.common.api.a) null, (t) new Object());
        c2 c2Var = new c2(context);
        this.f49422e = -1;
        q1 q1Var = q1.DEFAULT;
        this.f49423f = q1Var;
        this.f49419a = context;
        this.f49420b = context.getPackageName();
        int i10 = 0;
        try {
            i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e6) {
            Log.wtf("ClearcutLogger", "This can't happen.", e6);
        }
        this.f49421c = i10;
        this.f49422e = -1;
        this.d = "VISION";
        this.f49424g = jVar;
        this.h = i6.a.f7902a;
        this.f49423f = q1Var;
        this.f49425i = c2Var;
    }
}
