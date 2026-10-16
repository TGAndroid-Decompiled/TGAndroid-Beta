package rb;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import m2.t;
import r0.s0;
public final class g {
    public static final Object f43854b = new Object();
    public static g f43855c;
    public r9.g f43856a;

    public static g c() {
        boolean z10;
        g gVar;
        synchronized (f43854b) {
            if (f43855c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            n6.l.j("MlKitContext has not been initialized", z10);
            gVar = f43855c;
            n6.l.h(gVar);
        }
        return gVar;
    }

    public static g d(Context context, Executor executor) {
        boolean z10;
        g gVar;
        synchronized (f43854b) {
            if (f43855c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            n6.l.j("MlKitContext is already initialized", z10);
            ?? obj = new Object();
            f43855c = obj;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList A = new t(21, context, new gb.e(MlKitComponentDiscoveryService.class)).A();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            s0 s0Var = r9.e.A;
            arrayList.addAll(A);
            arrayList2.add(r9.a.c(context, Context.class, new Class[0]));
            arrayList2.add(r9.a.c(obj, g.class, new Class[0]));
            r9.g gVar2 = new r9.g(executor, arrayList, arrayList2, s0Var);
            obj.f43856a = gVar2;
            gVar2.h(true);
            gVar = f43855c;
        }
        return gVar;
    }

    public final Object a(Class cls) {
        boolean z10;
        if (f43855c == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        n6.l.j("MlKitContext has been deleted", z10);
        n6.l.h(this.f43856a);
        return this.f43856a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
