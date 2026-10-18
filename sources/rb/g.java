package rb;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
public final class g {
    public static final Object f45230b = new Object();
    public static g f45231c;
    public r9.g f45232a;

    public static g c() {
        boolean z10;
        g gVar;
        synchronized (f45230b) {
            if (f45231c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            n6.l.j("MlKitContext has not been initialized", z10);
            gVar = f45231c;
            n6.l.h(gVar);
        }
        return gVar;
    }

    public static g d(Context context, Executor executor) {
        boolean z10;
        g gVar;
        synchronized (f45230b) {
            if (f45231c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            n6.l.j("MlKitContext is already initialized", z10);
            ?? obj = new Object();
            f45231c = obj;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList R = new mi.q(19, context, new l2.f(MlKitComponentDiscoveryService.class, 16)).R();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            r.a aVar = r9.e.A;
            arrayList.addAll(R);
            arrayList2.add(r9.a.c(context, Context.class, new Class[0]));
            arrayList2.add(r9.a.c(obj, g.class, new Class[0]));
            r9.g gVar2 = new r9.g(executor, arrayList, arrayList2, aVar);
            obj.f45232a = gVar2;
            gVar2.d(true);
            gVar = f45231c;
        }
        return gVar;
    }

    public final Object a(Class cls) {
        boolean z10;
        if (f45231c == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        n6.l.j("MlKitContext has been deleted", z10);
        n6.l.h(this.f45232a);
        return this.f45232a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
