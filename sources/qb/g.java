package qb;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import k2.g0;
import n7.z0;
import org.telegram.ui.sw0;
public final class g {
    public static final Object f44306b = new Object();
    public static g f44307c;
    public q9.g f44308a;

    public static g c() {
        boolean z10;
        g gVar;
        synchronized (f44306b) {
            if (f44307c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            n6.l.j("MlKitContext has not been initialized", z10);
            gVar = f44307c;
            n6.l.h(gVar);
        }
        return gVar;
    }

    public static g d(Context context, Executor executor) {
        boolean z10;
        g gVar;
        synchronized (f44306b) {
            if (f44307c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            n6.l.j("MlKitContext is already initialized", z10);
            ?? obj = new Object();
            f44307c = obj;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList u10 = new z0(11, context, new g0(MlKitComponentDiscoveryService.class, 16)).u();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            sw0 sw0Var = q9.e.A;
            arrayList.addAll(u10);
            arrayList2.add(q9.a.c(context, Context.class, new Class[0]));
            arrayList2.add(q9.a.c(obj, g.class, new Class[0]));
            q9.g gVar2 = new q9.g(executor, arrayList, arrayList2, sw0Var);
            obj.f44308a = gVar2;
            gVar2.e(true);
            gVar = f44307c;
        }
        return gVar;
    }

    public final Object a(Class cls) {
        boolean z10;
        if (f44307c == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        n6.l.j("MlKitContext has been deleted", z10);
        n6.l.h(this.f44308a);
        return this.f44308a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
