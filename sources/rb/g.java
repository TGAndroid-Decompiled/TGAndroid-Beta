package rb;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import k2.w0;
import qg.f0;
public final class g {
    public static final Object f45184b = new Object();
    public static g f45185c;
    public r9.g f45186a;

    public static g c() {
        boolean z10;
        g gVar;
        synchronized (f45184b) {
            if (f45185c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            n6.l.j("MlKitContext has not been initialized", z10);
            gVar = f45185c;
            n6.l.h(gVar);
        }
        return gVar;
    }

    public static g d(Context context, Executor executor) {
        boolean z10;
        g gVar;
        synchronized (f45184b) {
            if (f45185c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            n6.l.j("MlKitContext is already initialized", z10);
            ?? obj = new Object();
            f45185c = obj;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList S = new mi.q(19, context, new w0(MlKitComponentDiscoveryService.class, 19)).S();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            f0 f0Var = r9.e.A;
            arrayList.addAll(S);
            arrayList2.add(r9.a.c(context, Context.class, new Class[0]));
            arrayList2.add(r9.a.c(obj, g.class, new Class[0]));
            r9.g gVar2 = new r9.g(executor, arrayList, arrayList2, f0Var);
            obj.f45186a = gVar2;
            gVar2.h(true);
            gVar = f45185c;
        }
        return gVar;
    }

    public final Object a(Class cls) {
        boolean z10;
        if (f45185c == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        n6.l.j("MlKitContext has been deleted", z10);
        n6.l.h(this.f45186a);
        return this.f45186a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
