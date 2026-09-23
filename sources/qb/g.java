package qb;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import k2.u;
import pg.e0;
public final class g {
    public static final Object f41191b = new Object();
    public static g f41192c;
    public q9.g f41193a;

    public static g c() {
        boolean z10;
        g gVar;
        synchronized (f41191b) {
            if (f41192c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            n6.l.j("MlKitContext has not been initialized", z10);
            gVar = f41192c;
            n6.l.h(gVar);
        }
        return gVar;
    }

    public static g d(Context context, Executor executor) {
        boolean z10;
        g gVar;
        synchronized (f41191b) {
            if (f41192c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            n6.l.j("MlKitContext is already initialized", z10);
            ?? obj = new Object();
            f41192c = obj;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList g10 = new o0.a(12, context, new u(MlKitComponentDiscoveryService.class, 19)).g();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            e0 e0Var = q9.e.A;
            arrayList.addAll(g10);
            arrayList2.add(q9.a.c(context, Context.class, new Class[0]));
            arrayList2.add(q9.a.c(obj, g.class, new Class[0]));
            q9.g gVar2 = new q9.g(executor, arrayList, arrayList2, e0Var);
            obj.f41193a = gVar2;
            gVar2.g(true);
            gVar = f41192c;
        }
        return gVar;
    }

    public final Object a(Class cls) {
        boolean z10;
        if (f41192c == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        n6.l.j("MlKitContext has been deleted", z10);
        n6.l.h(this.f41193a);
        return this.f41193a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
