package pb;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.telegram.ui.Components.qt;
import sg.i0;
public final class g {
    public static final Object f53412b = new Object();
    public static g f53413c;
    public u9.f f53414a;

    public static g c() {
        boolean z9;
        g gVar;
        synchronized (f53412b) {
            if (f53413c != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            q6.m.i("MlKitContext has not been initialized", z9);
            gVar = f53413c;
            q6.m.g(gVar);
        }
        return gVar;
    }

    public static g d(Context context, Executor executor) {
        boolean z9;
        g gVar;
        synchronized (f53412b) {
            if (f53413c == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            q6.m.i("MlKitContext is already initialized", z9);
            ?? obj = new Object();
            f53413c = obj;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList b10 = new i0(4, context, new qt(MlKitComponentDiscoveryService.class, 20)).b();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            s0.b bVar = u9.e.B;
            arrayList.addAll(b10);
            arrayList2.add(u9.a.c(context, Context.class, new Class[0]));
            arrayList2.add(u9.a.c(obj, g.class, new Class[0]));
            u9.f fVar = new u9.f(executor, arrayList, arrayList2, bVar);
            obj.f53414a = fVar;
            fVar.h(true);
            gVar = f53413c;
        }
        return gVar;
    }

    public final Object a(Class cls) {
        boolean z9;
        if (f53413c == this) {
            z9 = true;
        } else {
            z9 = false;
        }
        q6.m.i("MlKitContext has been deleted", z9);
        q6.m.g(this.f53414a);
        return this.f53414a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
