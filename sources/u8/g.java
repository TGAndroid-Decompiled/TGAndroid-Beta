package u8;

import a0.k;
import a9.j;
import a9.q;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.emoji2.text.v;
import b9.m;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import v5.n;
import z5.l;
public final class g {
    public static final Object f49129k = new Object();
    public static final a0.f f49130l = new k(0);
    public final Context f49131a;
    public final String f49132b;
    public final i f49133c;
    public final j d;
    public final AtomicBoolean f49134e;
    public final AtomicBoolean f49135f;
    public final q f49136g;
    public final z9.b h;
    public final CopyOnWriteArrayList f49137i;
    public final CopyOnWriteArrayList f49138j;

    public g(Context context, String str, i iVar) {
        boolean z10;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f49134e = atomicBoolean;
        this.f49135f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f49137i = copyOnWriteArrayList;
        this.f49138j = new CopyOnWriteArrayList();
        this.f49131a = context;
        l.f(str);
        this.f49132b = str;
        this.f49133c = iVar;
        a aVar = FirebaseInitProvider.f5214a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList o10 = new ze.b(context, new m5.i(ComponentDiscoveryService.class, 1)).o();
        Trace.endSection();
        Trace.beginSection("Runtime");
        m mVar = m.f2022a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(o10);
        arrayList.add(new a9.d(new FirebaseCommonRegistrar(), 1));
        arrayList.add(new a9.d(new ExecutorsRegistrar(), 1));
        arrayList2.add(a9.b.c(context, Context.class, new Class[0]));
        arrayList2.add(a9.b.c(this, g.class, new Class[0]));
        arrayList2.add(a9.b.c(iVar, i.class, new Class[0]));
        x9.d dVar = new x9.d(12);
        if (Build.VERSION.SDK_INT >= 24) {
            z10 = v.g(context);
        } else {
            z10 = true;
        }
        if (z10 && FirebaseInitProvider.f5215b.get()) {
            arrayList2.add(a9.b.c(aVar, a.class, new Class[0]));
        }
        j jVar = new j(mVar, arrayList, arrayList2, dVar);
        this.d = jVar;
        Trace.endSection();
        this.f49136g = new q(new a9.i(1, this, context));
        this.h = jVar.c(x9.c.class);
        d dVar2 = new d(this);
        a();
        if (atomicBoolean.get()) {
            com.google.android.gms.common.api.internal.d.f3797e.f3798a.get();
        }
        copyOnWriteArrayList.add(dVar2);
        Trace.endSection();
    }

    public static g c() {
        g gVar;
        synchronized (f49129k) {
            try {
                gVar = (g) f49130l.get("[DEFAULT]");
                if (gVar != null) {
                    ((x9.c) gVar.h.get()).c();
                } else {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + g6.d.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    public static g f(Context context) {
        synchronized (f49129k) {
            try {
                if (f49130l.containsKey("[DEFAULT]")) {
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
        AtomicReference atomicReference = e.f49126a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = e.f49126a;
            if (atomicReference2.get() == null) {
                ?? obj = new Object();
                while (true) {
                    if (atomicReference2.compareAndSet(null, obj)) {
                        com.google.android.gms.common.api.internal.d.b(application);
                        com.google.android.gms.common.api.internal.d.f3797e.a(obj);
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
        synchronized (f49129k) {
            a0.f fVar = f49130l;
            l.j("FirebaseApp name [DEFAULT] already exists!", !fVar.containsKey("[DEFAULT]"));
            l.i(context, "Application context cannot be null.");
            gVar = new g(context, "[DEFAULT]", iVar);
            fVar.put("[DEFAULT]", gVar);
        }
        gVar.e();
        return gVar;
    }

    public final void a() {
        l.j("FirebaseApp was deleted", !this.f49135f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.d.a(cls);
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        a();
        sb2.append(g6.b.c(this.f49132b.getBytes(Charset.defaultCharset())));
        sb2.append("+");
        a();
        sb2.append(g6.b.c(this.f49133c.f49144b.getBytes(Charset.defaultCharset())));
        return sb2.toString();
    }

    public final void e() {
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        Context context = this.f49131a;
        if (i10 >= 24) {
            z10 = v.g(context);
        } else {
            z10 = true;
        }
        String str = this.f49132b;
        if (!z10) {
            StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb2.append(str);
            Log.i("FirebaseApp", sb2.toString());
            AtomicReference atomicReference = f.f49127b;
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
        StringBuilder sb3 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb3.append(str);
        Log.i("FirebaseApp", sb3.toString());
        a();
        this.d.h("[DEFAULT]".equals(str));
        ((x9.c) this.h.get()).c();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.a();
        return this.f49132b.equals(gVar.f49132b);
    }

    public final boolean h() {
        boolean z10;
        a();
        ea.a aVar = (ea.a) this.f49136g.get();
        synchronized (aVar) {
            z10 = aVar.f5843a;
        }
        return z10;
    }

    public final int hashCode() {
        return this.f49132b.hashCode();
    }

    public final String toString() {
        n nVar = new n(this);
        nVar.g(this.f49132b, "name");
        nVar.g(this.f49133c, "options");
        return nVar.toString();
    }
}
