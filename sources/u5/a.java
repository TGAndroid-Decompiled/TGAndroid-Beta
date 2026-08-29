package u5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.j;
import com.google.android.gms.internal.clearcut.d2;
import com.google.android.gms.internal.clearcut.r1;
import com.google.android.gms.internal.clearcut.v0;
public final class a {
    public static final e f49097j = new e("ClearcutLogger.API", new b6.b(14), new Object());
    public final Context f49098a;
    public final String f49099b;
    public final int f49100c;
    public final String d;
    public final int f49101e;
    public final r1 f49102f;
    public final v0 f49103g;
    public final g6.a h;
    public final d2 f49104i;

    public a(Context context) {
        ?? jVar = new j(context, f49097j, (com.google.android.gms.common.api.a) null, (t) new Object());
        d2 d2Var = new d2(context);
        this.f49101e = -1;
        r1 r1Var = r1.DEFAULT;
        this.f49102f = r1Var;
        this.f49098a = context;
        this.f49099b = context.getPackageName();
        int i10 = 0;
        try {
            i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.wtf("ClearcutLogger", "This can't happen.", e10);
        }
        this.f49100c = i10;
        this.f49101e = -1;
        this.d = "VISION";
        this.f49103g = jVar;
        this.h = g6.a.f7109a;
        this.f49102f = r1Var;
        this.f49104i = d2Var;
    }
}
