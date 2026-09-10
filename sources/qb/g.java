package qb;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import og.u0;
import org.telegram.ui.js0;
public final class g {
    public static final Object f40616b = new Object();
    public static g f40617c;
    public q9.g f40618a;

    public static g c() {
        boolean z10;
        g gVar;
        synchronized (f40616b) {
            if (f40617c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            n6.l.j("MlKitContext has not been initialized", z10);
            gVar = f40617c;
            n6.l.h(gVar);
        }
        return gVar;
    }

    public static g d(Context context, Executor executor) {
        boolean z10;
        g gVar;
        synchronized (f40616b) {
            if (f40617c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            n6.l.j("MlKitContext is already initialized", z10);
            ?? obj = new Object();
            f40617c = obj;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList f7 = new u0(11, context, new l2.g(MlKitComponentDiscoveryService.class, 15)).f();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            js0 js0Var = q9.e.A;
            arrayList.addAll(f7);
            arrayList2.add(q9.a.c(context, Context.class, new Class[0]));
            arrayList2.add(q9.a.c(obj, g.class, new Class[0]));
            q9.g gVar2 = new q9.g(executor, arrayList, arrayList2, js0Var);
            obj.f40618a = gVar2;
            gVar2.g(true);
            gVar = f40617c;
        }
        return gVar;
    }

    public final Object a(Class cls) {
        boolean z10;
        if (f40617c == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        n6.l.j("MlKitContext has been deleted", z10);
        n6.l.h(this.f40618a);
        return this.f40618a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
