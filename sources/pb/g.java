package pb;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.telegram.ui.Components.rt;
import sg.i0;
public final class g {
    public static final Object f53530b = new Object();
    public static g f53531c;
    public u9.g f53532a;

    public static g c() {
        boolean z9;
        g gVar;
        synchronized (f53530b) {
            if (f53531c != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            q6.m.i("MlKitContext has not been initialized", z9);
            gVar = f53531c;
            q6.m.g(gVar);
        }
        return gVar;
    }

    public static g d(Context context, Executor executor) {
        boolean z9;
        g gVar;
        synchronized (f53530b) {
            if (f53531c == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            q6.m.i("MlKitContext is already initialized", z9);
            ?? obj = new Object();
            f53531c = obj;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList b10 = new i0(4, context, new rt(MlKitComponentDiscoveryService.class, 20)).b();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            s0.b bVar = u9.e.B;
            arrayList.addAll(b10);
            arrayList2.add(u9.a.c(context, Context.class, new Class[0]));
            arrayList2.add(u9.a.c(obj, g.class, new Class[0]));
            u9.g gVar2 = new u9.g(executor, arrayList, arrayList2, bVar);
            obj.f53532a = gVar2;
            gVar2.h(true);
            gVar = f53531c;
        }
        return gVar;
    }

    public final Object a(Class cls) {
        boolean z9;
        if (f53531c == this) {
            z9 = true;
        } else {
            z9 = false;
        }
        q6.m.i("MlKitContext has been deleted", z9);
        q6.m.g(this.f53532a);
        return this.f53532a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
