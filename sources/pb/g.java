package pb;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.telegram.ui.Components.nd0;
import r0.f1;
public final class g {
    public static final Object f55645b = new Object();
    public static g f55646c;
    public u9.f f55647a;

    public static g c() {
        boolean z10;
        g gVar;
        synchronized (f55645b) {
            if (f55646c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            q6.m.j("MlKitContext has not been initialized", z10);
            gVar = f55646c;
            q6.m.h(gVar);
        }
        return gVar;
    }

    public static g d(Context context, Executor executor) {
        boolean z10;
        g gVar;
        synchronized (f55645b) {
            if (f55646c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            q6.m.j("MlKitContext is already initialized", z10);
            ?? obj = new Object();
            f55646c = obj;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList b10 = new s2.e(5, context, new nd0(MlKitComponentDiscoveryService.class, 21)).b();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            f1 f1Var = u9.e.B;
            arrayList.addAll(b10);
            arrayList2.add(u9.a.c(context, Context.class, new Class[0]));
            arrayList2.add(u9.a.c(obj, g.class, new Class[0]));
            u9.f fVar = new u9.f(executor, arrayList, arrayList2, f1Var);
            obj.f55647a = fVar;
            fVar.h(true);
            gVar = f55646c;
        }
        return gVar;
    }

    public final Object a(Class cls) {
        boolean z10;
        if (f55646c == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        q6.m.j("MlKitContext has been deleted", z10);
        q6.m.h(this.f55647a);
        return this.f55647a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
