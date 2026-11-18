package pb;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.telegram.ui.Cells.b5;
import r0.f1;
import sg.h0;
public final class g {
    public static final Object f55522b = new Object();
    public static g f55523c;
    public u9.f f55524a;

    public static g c() {
        boolean z10;
        g gVar;
        synchronized (f55522b) {
            if (f55523c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            q6.m.j("MlKitContext has not been initialized", z10);
            gVar = f55523c;
            q6.m.h(gVar);
        }
        return gVar;
    }

    public static g d(Context context, Executor executor) {
        boolean z10;
        g gVar;
        synchronized (f55522b) {
            if (f55523c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            q6.m.j("MlKitContext is already initialized", z10);
            ?? obj = new Object();
            f55523c = obj;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList b10 = new h0(4, context, new b5(MlKitComponentDiscoveryService.class)).b();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            f1 f1Var = u9.e.B;
            arrayList.addAll(b10);
            arrayList2.add(u9.a.c(context, Context.class, new Class[0]));
            arrayList2.add(u9.a.c(obj, g.class, new Class[0]));
            u9.f fVar = new u9.f(executor, arrayList, arrayList2, f1Var);
            obj.f55524a = fVar;
            fVar.g(true);
            gVar = f55523c;
        }
        return gVar;
    }

    public final Object a(Class cls) {
        boolean z10;
        if (f55523c == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        q6.m.j("MlKitContext has been deleted", z10);
        q6.m.h(this.f55524a);
        return this.f55524a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
