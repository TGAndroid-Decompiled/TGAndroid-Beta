package rb;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
public final class g {
    public static final Object f44095b = new Object();
    public static g f44096c;
    public r9.g f44097a;

    public static g c() {
        boolean z10;
        g gVar;
        synchronized (f44095b) {
            if (f44096c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            n6.l.j("MlKitContext has not been initialized", z10);
            gVar = f44096c;
            n6.l.h(gVar);
        }
        return gVar;
    }

    public static g d(Context context, Executor executor) {
        boolean z10;
        g gVar;
        synchronized (f44095b) {
            if (f44096c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            n6.l.j("MlKitContext is already initialized", z10);
            ?? obj = new Object();
            f44096c = obj;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList A = new m4.c(21, context, new l2.f(MlKitComponentDiscoveryService.class, 16)).A();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            r0.h hVar = r9.e.A;
            arrayList.addAll(A);
            arrayList2.add(r9.a.c(context, Context.class, new Class[0]));
            arrayList2.add(r9.a.c(obj, g.class, new Class[0]));
            r9.g gVar2 = new r9.g(executor, arrayList, arrayList2, hVar);
            obj.f44097a = gVar2;
            gVar2.d(true);
            gVar = f44096c;
        }
        return gVar;
    }

    public final Object a(Class cls) {
        boolean z10;
        if (f44096c == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        n6.l.j("MlKitContext has been deleted", z10);
        n6.l.h(this.f44097a);
        return this.f44097a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
