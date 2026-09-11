package qb;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import k2.g0;
import n7.z0;
import org.telegram.ui.sw0;
public final class g {
    public static final Object f44278b = new Object();
    public static g f44279c;
    public q9.g f44280a;

    public static g c() {
        boolean z10;
        g gVar;
        synchronized (f44278b) {
            if (f44279c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            n6.l.j("MlKitContext has not been initialized", z10);
            gVar = f44279c;
            n6.l.h(gVar);
        }
        return gVar;
    }

    public static g d(Context context, Executor executor) {
        boolean z10;
        g gVar;
        synchronized (f44278b) {
            if (f44279c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            n6.l.j("MlKitContext is already initialized", z10);
            ?? obj = new Object();
            f44279c = obj;
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
            obj.f44280a = gVar2;
            gVar2.e(true);
            gVar = f44279c;
        }
        return gVar;
    }

    public final Object a(Class cls) {
        boolean z10;
        if (f44279c == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        n6.l.j("MlKitContext has been deleted", z10);
        n6.l.h(this.f44280a);
        return this.f44280a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
