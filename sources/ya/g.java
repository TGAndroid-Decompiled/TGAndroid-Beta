package ya;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
public final class g {
    public static final Object f49691b = new Object();
    public static g f49692c;
    public y8.g f49693a;

    public static g c() {
        boolean z10;
        g gVar;
        synchronized (f49691b) {
            if (f49692c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            x5.l.j("MlKitContext has not been initialized", z10);
            gVar = f49692c;
            x5.l.h(gVar);
        }
        return gVar;
    }

    public static g d(Context context, Executor executor) {
        boolean z10;
        g gVar;
        synchronized (f49691b) {
            if (f49692c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            x5.l.j("MlKitContext is already initialized", z10);
            ?? obj = new Object();
            f49692c = obj;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList e10 = new w4.e(12, context, new na.e(MlKitComponentDiscoveryService.class)).e();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            v0.l lVar = y8.e.f49629z;
            arrayList.addAll(e10);
            arrayList2.add(y8.a.c(context, Context.class, new Class[0]));
            arrayList2.add(y8.a.c(obj, g.class, new Class[0]));
            y8.g gVar2 = new y8.g(executor, arrayList, arrayList2, lVar);
            obj.f49693a = gVar2;
            gVar2.d(true);
            gVar = f49692c;
        }
        return gVar;
    }

    public final Object a(Class cls) {
        boolean z10;
        if (f49692c == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        x5.l.j("MlKitContext has been deleted", z10);
        x5.l.h(this.f49693a);
        return this.f49693a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
