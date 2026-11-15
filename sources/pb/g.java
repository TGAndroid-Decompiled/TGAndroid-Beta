package pb;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.telegram.ui.Components.cf;
import sg.h0;
public final class g {
    public static final Object f54946b = new Object();
    public static g f54947c;
    public u9.f f54948a;

    public static g c() {
        boolean z10;
        g gVar;
        synchronized (f54946b) {
            if (f54947c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            q6.m.i("MlKitContext has not been initialized", z10);
            gVar = f54947c;
            q6.m.g(gVar);
        }
        return gVar;
    }

    public static g d(Context context, Executor executor) {
        boolean z10;
        g gVar;
        synchronized (f54946b) {
            if (f54947c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            q6.m.i("MlKitContext is already initialized", z10);
            ?? obj = new Object();
            f54947c = obj;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList b10 = new h0(4, context, new cf(MlKitComponentDiscoveryService.class)).b();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            r2.j jVar = u9.e.B;
            arrayList.addAll(b10);
            arrayList2.add(u9.a.c(context, Context.class, new Class[0]));
            arrayList2.add(u9.a.c(obj, g.class, new Class[0]));
            u9.f fVar = new u9.f(executor, arrayList, arrayList2, jVar);
            obj.f54948a = fVar;
            fVar.h(true);
            gVar = f54947c;
        }
        return gVar;
    }

    public final Object a(Class cls) {
        boolean z10;
        if (f54947c == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        q6.m.i("MlKitContext has been deleted", z10);
        q6.m.g(this.f54948a);
        return this.f54948a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
