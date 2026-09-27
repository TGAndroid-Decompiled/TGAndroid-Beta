package qb;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.telegram.ui.web.d0;
public final class g {
    public static final Object f41558b = new Object();
    public static g f41559c;
    public q9.g f41560a;

    public static g c() {
        boolean z10;
        g gVar;
        synchronized (f41558b) {
            if (f41559c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            n6.l.j("MlKitContext has not been initialized", z10);
            gVar = f41559c;
            n6.l.h(gVar);
        }
        return gVar;
    }

    public static g d(Context context, Executor executor) {
        boolean z10;
        g gVar;
        synchronized (f41558b) {
            if (f41559c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            n6.l.j("MlKitContext is already initialized", z10);
            ?? obj = new Object();
            f41559c = obj;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList l4 = new o0.a(12, context, new o0.c(MlKitComponentDiscoveryService.class, 11)).l();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            d0 d0Var = q9.e.A;
            arrayList.addAll(l4);
            arrayList2.add(q9.a.c(context, Context.class, new Class[0]));
            arrayList2.add(q9.a.c(obj, g.class, new Class[0]));
            q9.g gVar2 = new q9.g(executor, arrayList, arrayList2, d0Var);
            obj.f41560a = gVar2;
            gVar2.g(true);
            gVar = f41559c;
        }
        return gVar;
    }

    public final Object a(Class cls) {
        boolean z10;
        if (f41559c == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        n6.l.j("MlKitContext has been deleted", z10);
        n6.l.h(this.f41560a);
        return this.f41560a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
