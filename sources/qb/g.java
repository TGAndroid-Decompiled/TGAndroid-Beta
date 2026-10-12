package qb;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import n7.z0;
import pg.e0;
public final class g {
    public static final Object f46013b = new Object();
    public static g f46014c;
    public q9.g f46015a;

    public static g c() {
        boolean z10;
        g gVar;
        synchronized (f46013b) {
            if (f46014c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            n6.m.j("MlKitContext has not been initialized", z10);
            gVar = f46014c;
            n6.m.h(gVar);
        }
        return gVar;
    }

    public static g d(Context context, Executor executor) {
        boolean z10;
        g gVar;
        synchronized (f46013b) {
            if (f46014c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            n6.m.j("MlKitContext is already initialized", z10);
            ?? obj = new Object();
            f46014c = obj;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList j3 = new z0(12, context, new fb.e(MlKitComponentDiscoveryService.class)).j();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            e0 e0Var = q9.e.A;
            arrayList.addAll(j3);
            arrayList2.add(q9.a.c(context, Context.class, new Class[0]));
            arrayList2.add(q9.a.c(obj, g.class, new Class[0]));
            q9.g gVar2 = new q9.g(executor, arrayList, arrayList2, e0Var);
            obj.f46015a = gVar2;
            gVar2.h(true);
            gVar = f46014c;
        }
        return gVar;
    }

    public final Object a(Class cls) {
        boolean z10;
        if (f46014c == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        n6.m.j("MlKitContext has been deleted", z10);
        n6.m.h(this.f46015a);
        return this.f46015a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
