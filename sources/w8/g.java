package w8;

import a0.k;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.emoji2.text.x;
import b6.m;
import c9.p;
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
    public static final Object f49449k = new Object();
    public static final a0.f f49450l = new k(0);
    public final Context f49451a;
    public final String f49452b;
    public final i f49453c;
    public final c9.i d;
    public final AtomicBoolean f49454e;
    public final AtomicBoolean f49455f;
    public final p f49456g;
    public final ba.b h;
    public final CopyOnWriteArrayList f49457i;
    public final CopyOnWriteArrayList f49458j;

    public g(Context context, String str, i iVar) {
        boolean z4;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f49454e = atomicBoolean;
        this.f49455f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f49457i = copyOnWriteArrayList;
        this.f49458j = new CopyOnWriteArrayList();
        this.f49451a = context;
        m.f(str);
        this.f49452b = str;
        this.f49453c = iVar;
        a aVar = FirebaseInitProvider.f4110a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList v = new bf.b(16, context, new o5.i(ComponentDiscoveryService.class, 5)).v();
        Trace.endSection();
        Trace.beginSection("Runtime");
        l lVar = l.f4377a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(v);
        arrayList.add(new c9.d(new FirebaseCommonRegistrar(), 1));
        arrayList.add(new c9.d(new ExecutorsRegistrar(), 1));
        arrayList2.add(c9.b.c(context, Context.class, new Class[0]));
        arrayList2.add(c9.b.c(this, g.class, new Class[0]));
        arrayList2.add(c9.b.c(iVar, i.class, new Class[0]));
        cb.b bVar = new cb.b(14);
        if (Build.VERSION.SDK_INT >= 24) {
            z4 = x.g(context);
        } else {
            z4 = true;
        }
        if (z4 && FirebaseInitProvider.f4111b.get()) {
            arrayList2.add(c9.b.c(aVar, a.class, new Class[0]));
        }
        c9.i iVar2 = new c9.i(lVar, arrayList, arrayList2, bVar);
        this.d = iVar2;
        Trace.endSection();
        this.f49456g = new p(new c9.h(1, this, context));
        this.h = iVar2.c(z9.c.class);
        d dVar = new d(this);
        a();
        if (atomicBoolean.get()) {
            com.google.android.gms.common.api.internal.d.f2688e.f2689a.get();
        }
        copyOnWriteArrayList.add(dVar);
        Trace.endSection();
    }

    public static g c() {
        g gVar;
        synchronized (f49449k) {
            try {
                gVar = (g) f49450l.get("[DEFAULT]");
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
        synchronized (f49449k) {
            try {
                if (f49450l.containsKey("[DEFAULT]")) {
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
        AtomicReference atomicReference = e.f49446a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = e.f49446a;
            if (atomicReference2.get() == null) {
                ?? obj = new Object();
                while (true) {
                    if (atomicReference2.compareAndSet(null, obj)) {
                        com.google.android.gms.common.api.internal.d.b(application);
                        com.google.android.gms.common.api.internal.d.f2688e.a(obj);
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
        synchronized (f49449k) {
            a0.f fVar = f49450l;
            m.j("FirebaseApp name [DEFAULT] already exists!", !fVar.containsKey("[DEFAULT]"));
            m.i(context, "Application context cannot be null.");
            gVar = new g(context, "[DEFAULT]", iVar);
            fVar.put("[DEFAULT]", gVar);
        }
        gVar.e();
        return gVar;
    }

    public final void a() {
        m.j("FirebaseApp was deleted", !this.f49455f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.d.a(cls);
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        a();
        sb.append(i6.b.c(this.f49452b.getBytes(Charset.defaultCharset())));
        sb.append("+");
        a();
        sb.append(i6.b.c(this.f49453c.f49464b.getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    public final void e() {
        boolean z4;
        int i10 = Build.VERSION.SDK_INT;
        Context context = this.f49451a;
        if (i10 >= 24) {
            z4 = x.g(context);
        } else {
            z4 = true;
        }
        String str = this.f49452b;
        if (!z4) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(str);
            Log.i("FirebaseApp", sb.toString());
            AtomicReference atomicReference = f.f49447b;
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
        this.d.g("[DEFAULT]".equals(str));
        ((z9.c) this.h.get()).c();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.a();
        return this.f49452b.equals(gVar.f49452b);
    }

    public final boolean h() {
        boolean z4;
        a();
        ga.a aVar = (ga.a) this.f49456g.get();
        synchronized (aVar) {
            z4 = aVar.f6983a;
        }
        return z4;
    }

    public final int hashCode() {
        return this.f49452b.hashCode();
    }

    public final String toString() {
        bf.b bVar = new bf.b((Object) this);
        bVar.r(this.f49452b, "name");
        bVar.r(this.f49453c, "options");
        return bVar.toString();
    }
}
