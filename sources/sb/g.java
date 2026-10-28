package sb;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
public final class g {
    public static final Object f48087b = new Object();
    public static g f48088c;
    public s9.h f48089a;

    public static g c() {
        boolean z10;
        g gVar;
        synchronized (f48087b) {
            if (f48088c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            o6.l.j("MlKitContext has not been initialized", z10);
            gVar = f48088c;
            o6.l.h(gVar);
        }
        return gVar;
    }

    public static g d(Context context, Executor executor) {
        boolean z10;
        g gVar;
        synchronized (f48087b) {
            if (f48088c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            o6.l.j("MlKitContext is already initialized", z10);
            ?? obj = new Object();
            f48088c = obj;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList k10 = new m4.c(19, context, new hb.e(MlKitComponentDiscoveryService.class)).k();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            s0.b bVar = s9.e.A;
            arrayList.addAll(k10);
            arrayList2.add(s9.a.c(context, Context.class, new Class[0]));
            arrayList2.add(s9.a.c(obj, g.class, new Class[0]));
            s9.h hVar = new s9.h(executor, arrayList, arrayList2, bVar);
            obj.f48089a = hVar;
            hVar.e(true);
            gVar = f48088c;
        }
        return gVar;
    }

    public final Object a(Class cls) {
        boolean z10;
        if (f48088c == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        o6.l.j("MlKitContext has been deleted", z10);
        o6.l.h(this.f48089a);
        return this.f48089a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
