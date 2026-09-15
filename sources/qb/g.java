package qb;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import k2.u;
import org.telegram.ui.zr0;
public final class g {
    public static final Object f41239b = new Object();
    public static g f41240c;
    public q9.g f41241a;

    public static g c() {
        boolean z10;
        g gVar;
        synchronized (f41239b) {
            if (f41240c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            n6.l.j("MlKitContext has not been initialized", z10);
            gVar = f41240c;
            n6.l.h(gVar);
        }
        return gVar;
    }

    public static g d(Context context, Executor executor) {
        boolean z10;
        g gVar;
        synchronized (f41239b) {
            if (f41240c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            n6.l.j("MlKitContext is already initialized", z10);
            ?? obj = new Object();
            f41240c = obj;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList g10 = new o0.a(12, context, new u(MlKitComponentDiscoveryService.class, 19)).g();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            zr0 zr0Var = q9.e.A;
            arrayList.addAll(g10);
            arrayList2.add(q9.a.c(context, Context.class, new Class[0]));
            arrayList2.add(q9.a.c(obj, g.class, new Class[0]));
            q9.g gVar2 = new q9.g(executor, arrayList, arrayList2, zr0Var);
            obj.f41241a = gVar2;
            gVar2.g(true);
            gVar = f41240c;
        }
        return gVar;
    }

    public final Object a(Class cls) {
        boolean z10;
        if (f41240c == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        n6.l.j("MlKitContext has been deleted", z10);
        n6.l.h(this.f41241a);
        return this.f41241a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
