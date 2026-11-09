package pb;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.telegram.ui.Components.rt;
import sg.i0;
public final class g {
    public static final Object f53542b = new Object();
    public static g f53543c;
    public u9.g f53544a;

    public static g c() {
        boolean z9;
        g gVar;
        synchronized (f53542b) {
            if (f53543c != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            q6.m.i("MlKitContext has not been initialized", z9);
            gVar = f53543c;
            q6.m.g(gVar);
        }
        return gVar;
    }

    public static g d(Context context, Executor executor) {
        boolean z9;
        g gVar;
        synchronized (f53542b) {
            if (f53543c == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            q6.m.i("MlKitContext is already initialized", z9);
            ?? obj = new Object();
            f53543c = obj;
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
            obj.f53544a = gVar2;
            gVar2.h(true);
            gVar = f53543c;
        }
        return gVar;
    }

    public final Object a(Class cls) {
        boolean z9;
        if (f53543c == this) {
            z9 = true;
        } else {
            z9 = false;
        }
        q6.m.i("MlKitContext has been deleted", z9);
        q6.m.g(this.f53544a);
        return this.f53544a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
