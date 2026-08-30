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
    public static final e f46446j = new e("ClearcutLogger.API", new j(18), new Object());
    public final Context f46447a;
    public final String f46448b;
    public final int f46449c;
    public final String d;
    public final int e;
    public final q1 f46450f;
    public final a8.e f46451g;
    public final i6.a h;
    public final c2 f46452i;

    public a(Context context) {
        ?? jVar = new com.google.android.gms.common.api.j(context, f46446j, (com.google.android.gms.common.api.a) null, (t) new Object());
        c2 c2Var = new c2(context);
        this.e = -1;
        q1 q1Var = q1.DEFAULT;
        this.f46450f = q1Var;
        this.f46447a = context;
        this.f46448b = context.getPackageName();
        int i10 = 0;
        try {
            i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.wtf("ClearcutLogger", "This can't happen.", e);
        }
        this.f46449c = i10;
        this.e = -1;
        this.d = "VISION";
        this.f46451g = jVar;
        this.h = i6.a.f7345a;
        this.f46450f = q1Var;
        this.f46452i = c2Var;
    }
}
