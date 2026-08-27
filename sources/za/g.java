package za;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import w3.b0;

public final class g {

    public static final Object f50286b = new Object();

    public static g f50287c;

    public z8.f f50288a;

    public static g c() {
        g gVar;
        synchronized (f50286b) {
            y5.l.j("MlKitContext has not been initialized", f50287c != null);
            gVar = f50287c;
            y5.l.h(gVar);
        }
        return gVar;
    }

    public static g d(Context context, Executor executor) {
        g gVar;
        synchronized (f50286b) {
            y5.l.j("MlKitContext is already initialized", f50287c == null);
            g gVar2 = new g();
            f50287c = gVar2;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList arrayListI = new b0(13, context, new m5.o(MlKitComponentDiscoveryService.class, 27)).i();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            u3.k kVar = z8.e.f50226z;
            arrayList.addAll(arrayListI);
            arrayList2.add(z8.a.c(context, Context.class, new Class[0]));
            arrayList2.add(z8.a.c(gVar2, g.class, new Class[0]));
            z8.f fVar = new z8.f(executor, arrayList, arrayList2, kVar);
            gVar2.f50288a = fVar;
            fVar.f(true);
            gVar = f50287c;
        }
        return gVar;
    }

    public final Object a(Class cls) {
        y5.l.j("MlKitContext has been deleted", f50287c == this);
        y5.l.h(this.f50288a);
        return this.f50288a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
