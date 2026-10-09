package qb;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import m.f3;
import org.telegram.ui.ActionBar.b5;
import pg.e0;
public final class g {
    public static final Object f46076b = new Object();
    public static g f46077c;
    public q9.g f46078a;

    public static g c() {
        boolean z10;
        g gVar;
        synchronized (f46076b) {
            if (f46077c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            n6.l.j("MlKitContext has not been initialized", z10);
            gVar = f46077c;
            n6.l.h(gVar);
        }
        return gVar;
    }

    public static g d(Context context, Executor executor) {
        boolean z10;
        g gVar;
        synchronized (f46076b) {
            if (f46077c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            n6.l.j("MlKitContext is already initialized", z10);
            ?? obj = new Object();
            f46077c = obj;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList j3 = new b5(context, new f3(MlKitComponentDiscoveryService.class, 14), false, 11).j();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            e0 e0Var = q9.e.A;
            arrayList.addAll(j3);
            arrayList2.add(q9.a.c(context, Context.class, new Class[0]));
            arrayList2.add(q9.a.c(obj, g.class, new Class[0]));
            q9.g gVar2 = new q9.g(executor, arrayList, arrayList2, e0Var);
            obj.f46078a = gVar2;
            gVar2.h(true);
            gVar = f46077c;
        }
        return gVar;
    }

    public final Object a(Class cls) {
        boolean z10;
        if (f46077c == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        n6.l.j("MlKitContext has been deleted", z10);
        n6.l.h(this.f46078a);
        return this.f46078a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
