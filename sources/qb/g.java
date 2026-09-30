package qb;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
public final class g {
    public static final Object f41530b = new Object();
    public static g f41531c;
    public q9.g f41532a;

    public static g c() {
        boolean z10;
        g gVar;
        synchronized (f41530b) {
            if (f41531c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            n6.l.j("MlKitContext has not been initialized", z10);
            gVar = f41531c;
            n6.l.h(gVar);
        }
        return gVar;
    }

    public static g d(Context context, Executor executor) {
        boolean z10;
        g gVar;
        synchronized (f41530b) {
            if (f41531c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            n6.l.j("MlKitContext is already initialized", z10);
            ?? obj = new Object();
            f41531c = obj;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList q6 = new o0.a(12, context, new n2.e(MlKitComponentDiscoveryService.class, 14)).q();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            org.webrtc.audio.b bVar = q9.e.A;
            arrayList.addAll(q6);
            arrayList2.add(q9.a.c(context, Context.class, new Class[0]));
            arrayList2.add(q9.a.c(obj, g.class, new Class[0]));
            q9.g gVar2 = new q9.g(executor, arrayList, arrayList2, bVar);
            obj.f41532a = gVar2;
            gVar2.g(true);
            gVar = f41531c;
        }
        return gVar;
    }

    public final Object a(Class cls) {
        boolean z10;
        if (f41531c == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        n6.l.j("MlKitContext has been deleted", z10);
        n6.l.h(this.f41532a);
        return this.f41532a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
