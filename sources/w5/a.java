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
    public static final e f46528j = new e("ClearcutLogger.API", new j(18), new Object());
    public final Context f46529a;
    public final String f46530b;
    public final int f46531c;
    public final String d;
    public final int e;
    public final q1 f46532f;
    public final a8.e f46533g;
    public final i6.a h;
    public final c2 f46534i;

    public a(Context context) {
        ?? jVar = new com.google.android.gms.common.api.j(context, f46528j, (com.google.android.gms.common.api.a) null, (t) new Object());
        c2 c2Var = new c2(context);
        this.e = -1;
        q1 q1Var = q1.DEFAULT;
        this.f46532f = q1Var;
        this.f46529a = context;
        this.f46530b = context.getPackageName();
        int i10 = 0;
        try {
            i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.wtf("ClearcutLogger", "This can't happen.", e);
        }
        this.f46531c = i10;
        this.e = -1;
        this.d = "VISION";
        this.f46533g = jVar;
        this.h = i6.a.f7327a;
        this.f46532f = q1Var;
        this.f46534i = c2Var;
    }
}
