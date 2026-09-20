package qb;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.telegram.ui.ja0;
public final class g {
    public static final Object f41542b = new Object();
    public static g f41543c;
    public q9.g f41544a;

    public static g c() {
        boolean z10;
        g gVar;
        synchronized (f41542b) {
            if (f41543c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            n6.l.j("MlKitContext has not been initialized", z10);
            gVar = f41543c;
            n6.l.h(gVar);
        }
        return gVar;
    }

    public static g d(Context context, Executor executor) {
        boolean z10;
        g gVar;
        synchronized (f41542b) {
            if (f41543c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            n6.l.j("MlKitContext is already initialized", z10);
            ?? obj = new Object();
            f41543c = obj;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList q6 = new m5.e(16, context, new n2.e(MlKitComponentDiscoveryService.class, 14)).q();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ja0 ja0Var = q9.e.A;
            arrayList.addAll(q6);
            arrayList2.add(q9.a.c(context, Context.class, new Class[0]));
            arrayList2.add(q9.a.c(obj, g.class, new Class[0]));
            q9.g gVar2 = new q9.g(executor, arrayList, arrayList2, ja0Var);
            obj.f41544a = gVar2;
            gVar2.g(true);
            gVar = f41543c;
        }
        return gVar;
    }

    public final Object a(Class cls) {
        boolean z10;
        if (f41543c == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        n6.l.j("MlKitContext has been deleted", z10);
        n6.l.h(this.f41544a);
        return this.f41544a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
