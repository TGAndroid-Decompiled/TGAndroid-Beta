package qb;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.telegram.ui.web.w;
public final class g {
    public static final Object f44919b = new Object();
    public static g f44920c;
    public q9.g f44921a;

    public static g c() {
        boolean z10;
        g gVar;
        synchronized (f44919b) {
            if (f44920c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            n6.l.j("MlKitContext has not been initialized", z10);
            gVar = f44920c;
            n6.l.h(gVar);
        }
        return gVar;
    }

    public static g d(Context context, Executor executor) {
        boolean z10;
        g gVar;
        synchronized (f44919b) {
            if (f44920c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            n6.l.j("MlKitContext is already initialized", z10);
            ?? obj = new Object();
            f44920c = obj;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList y3 = new o0.a(12, context, new k2.e(MlKitComponentDiscoveryService.class, 14)).y();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            w wVar = q9.e.A;
            arrayList.addAll(y3);
            arrayList2.add(q9.a.c(context, Context.class, new Class[0]));
            arrayList2.add(q9.a.c(obj, g.class, new Class[0]));
            q9.g gVar2 = new q9.g(executor, arrayList, arrayList2, wVar);
            obj.f44921a = gVar2;
            gVar2.h(true);
            gVar = f44920c;
        }
        return gVar;
    }

    public final Object a(Class cls) {
        boolean z10;
        if (f44920c == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        n6.l.j("MlKitContext has been deleted", z10);
        n6.l.h(this.f44921a);
        return this.f44921a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
