package w8;

import a0.k;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.emoji2.text.w;
import b6.m;
import c9.j;
import c9.q;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import d9.l;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
public final class g {
    public static final Object f46558k = new Object();
    public static final a0.f f46559l = new k(0);
    public final Context f46560a;
    public final String f46561b;
    public final i f46562c;
    public final j d;
    public final AtomicBoolean e;
    public final AtomicBoolean f46563f;
    public final q f46564g;
    public final ba.b h;
    public final CopyOnWriteArrayList f46565i;
    public final CopyOnWriteArrayList f46566j;

    public g(Context context, String str, i iVar) {
        boolean z4;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.e = atomicBoolean;
        this.f46563f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f46565i = copyOnWriteArrayList;
        this.f46566j = new CopyOnWriteArrayList();
        this.f46560a = context;
        m.f(str);
        this.f46561b = str;
        this.f46562c = iVar;
        a aVar = FirebaseInitProvider.f4036a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList w10 = new af.c(16, context, new c9.e(ComponentDiscoveryService.class)).w();
        Trace.endSection();
        Trace.beginSection("Runtime");
        l lVar = l.f4278a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(w10);
        arrayList.add(new c9.d(new FirebaseCommonRegistrar(), 1));
        arrayList.add(new c9.d(new ExecutorsRegistrar(), 1));
        arrayList2.add(c9.b.c(context, Context.class, new Class[0]));
        arrayList2.add(c9.b.c(this, g.class, new Class[0]));
        arrayList2.add(c9.b.c(iVar, i.class, new Class[0]));
        ab.a aVar2 = new ab.a(15);
        if (Build.VERSION.SDK_INT >= 24) {
            z4 = w.g(context);
        } else {
            z4 = true;
        }
        if (z4 && FirebaseInitProvider.f4037b.get()) {
            arrayList2.add(c9.b.c(aVar, a.class, new Class[0]));
        }
        j jVar = new j(lVar, arrayList, arrayList2, aVar2);
        this.d = jVar;
        Trace.endSection();
        this.f46564g = new q(new c9.i(1, this, context));
        this.h = jVar.c(z9.c.class);
        d dVar = new d(this);
        a();
        if (atomicBoolean.get()) {
            com.google.android.gms.common.api.internal.d.e.f2742a.get();
        }
        copyOnWriteArrayList.add(dVar);
        Trace.endSection();
    }

    public static g c() {
        g gVar;
        synchronized (f46558k) {
            try {
                gVar = (g) f46559l.get("[DEFAULT]");
                if (gVar != null) {
                    ((z9.c) gVar.h.get()).c();
                } else {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + i6.d.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    public static g f(Context context) {
        synchronized (f46558k) {
            try {
                if (f46559l.containsKey("[DEFAULT]")) {
                    return c();
                }
                i a2 = i.a(context);
                if (a2 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return g(context, a2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static g g(Context context, i iVar) {
        g gVar;
        AtomicReference atomicReference = e.f46555a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = e.f46555a;
            if (atomicReference2.get() == null) {
                ?? obj = new Object();
                while (true) {
                    if (atomicReference2.compareAndSet(null, obj)) {
                        com.google.android.gms.common.api.internal.d.b(application);
                        com.google.android.gms.common.api.internal.d.e.a(obj);
                        break;
                    } else if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f46558k) {
            a0.f fVar = f46559l;
            m.j("FirebaseApp name [DEFAULT] already exists!", !fVar.containsKey("[DEFAULT]"));
            m.i(context, "Application context cannot be null.");
            gVar = new g(context, "[DEFAULT]", iVar);
            fVar.put("[DEFAULT]", gVar);
        }
        gVar.e();
        return gVar;
    }

    public final void a() {
        m.j("FirebaseApp was deleted", !this.f46563f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.d.a(cls);
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        a();
        sb.append(i6.b.c(this.f46561b.getBytes(Charset.defaultCharset())));
        sb.append("+");
        a();
        sb.append(i6.b.c(this.f46562c.f46571b.getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    public final void e() {
        boolean z4;
        int i10 = Build.VERSION.SDK_INT;
        Context context = this.f46560a;
        if (i10 >= 24) {
            z4 = w.g(context);
        } else {
            z4 = true;
        }
        String str = this.f46561b;
        if (!z4) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(str);
            Log.i("FirebaseApp", sb.toString());
            AtomicReference atomicReference = f.f46556b;
            if (atomicReference.get() == null) {
                f fVar = new f(context);
                while (!atomicReference.compareAndSet(null, fVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(fVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(str);
        Log.i("FirebaseApp", sb2.toString());
        a();
        this.d.h("[DEFAULT]".equals(str));
        ((z9.c) this.h.get()).c();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.a();
        return this.f46561b.equals(gVar.f46561b);
    }

    public final boolean h() {
        boolean z4;
        a();
        ga.a aVar = (ga.a) this.f46564g.get();
        synchronized (aVar) {
            z4 = aVar.f6489a;
        }
        return z4;
    }

    public final int hashCode() {
        return this.f46561b.hashCode();
    }

    public final String toString() {
        af.c cVar = new af.c((Object) this);
        cVar.s(this.f46561b, "name");
        cVar.s(this.f46562c, "options");
        return cVar.toString();
    }
}
