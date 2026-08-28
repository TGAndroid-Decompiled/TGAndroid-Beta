package s8;

import a0.k;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.emoji2.text.v;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import x5.l;
import y8.n;
public final class h {
    public static final Object f47468k = new Object();
    public static final a0.f f47469l = new k(0);
    public final Context f47470a;
    public final String f47471b;
    public final j f47472c;
    public final y8.g d;
    public final AtomicBoolean f47473e;
    public final AtomicBoolean f47474f;
    public final n f47475g;
    public final x9.b h;
    public final CopyOnWriteArrayList f47476i;
    public final CopyOnWriteArrayList f47477j;

    public h(Context context, String str, j jVar) {
        boolean z10;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f47473e = atomicBoolean;
        this.f47474f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f47476i = copyOnWriteArrayList;
        this.f47477j = new CopyOnWriteArrayList();
        this.f47470a = context;
        l.f(str);
        this.f47471b = str;
        this.f47472c = jVar;
        a aVar = FirebaseInitProvider.f4205a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList e10 = new w4.e(12, context, new na.e(ComponentDiscoveryService.class)).e();
        Trace.endSection();
        Trace.beginSection("Runtime");
        z8.j jVar2 = z8.j.f50384a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(e10);
        arrayList.add(new y8.c(new FirebaseCommonRegistrar(), 1));
        arrayList.add(new y8.c(new ExecutorsRegistrar(), 1));
        arrayList2.add(y8.a.c(context, Context.class, new Class[0]));
        arrayList2.add(y8.a.c(this, h.class, new Class[0]));
        arrayList2.add(y8.a.c(jVar, j.class, new Class[0]));
        v9.d dVar = new v9.d(12);
        if (Build.VERSION.SDK_INT >= 24) {
            z10 = v.g(context);
        } else {
            z10 = true;
        }
        if (z10 && FirebaseInitProvider.f4206b.get()) {
            arrayList2.add(y8.a.c(aVar, a.class, new Class[0]));
        }
        y8.g gVar = new y8.g(jVar2, arrayList, arrayList2, dVar);
        this.d = gVar;
        Trace.endSection();
        this.f47475g = new n(new d(0, this, context));
        this.h = gVar.e(v9.c.class);
        e eVar = new e(this);
        a();
        if (atomicBoolean.get()) {
            com.google.android.gms.common.api.internal.d.f2783e.f2784a.get();
        }
        copyOnWriteArrayList.add(eVar);
        Trace.endSection();
    }

    public static h c() {
        h hVar;
        synchronized (f47468k) {
            try {
                hVar = (h) f47469l.get("[DEFAULT]");
                if (hVar != null) {
                    ((v9.c) hVar.h.get()).c();
                } else {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + e6.d.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    public static h f(Context context) {
        synchronized (f47468k) {
            try {
                if (f47469l.containsKey("[DEFAULT]")) {
                    return c();
                }
                j a2 = j.a(context);
                if (a2 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return g(context, a2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static h g(Context context, j jVar) {
        h hVar;
        AtomicReference atomicReference = f.f47465a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = f.f47465a;
            if (atomicReference2.get() == null) {
                ?? obj = new Object();
                while (true) {
                    if (atomicReference2.compareAndSet(null, obj)) {
                        com.google.android.gms.common.api.internal.d.b(application);
                        com.google.android.gms.common.api.internal.d.f2783e.a(obj);
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
        synchronized (f47468k) {
            a0.f fVar = f47469l;
            l.j("FirebaseApp name [DEFAULT] already exists!", !fVar.containsKey("[DEFAULT]"));
            l.i(context, "Application context cannot be null.");
            hVar = new h(context, "[DEFAULT]", jVar);
            fVar.put("[DEFAULT]", hVar);
        }
        hVar.e();
        return hVar;
    }

    public final void a() {
        l.j("FirebaseApp was deleted", !this.f47474f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.d.a(cls);
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        a();
        sb2.append(e6.b.c(this.f47471b.getBytes(Charset.defaultCharset())));
        sb2.append("+");
        a();
        sb2.append(e6.b.c(this.f47472c.f47483b.getBytes(Charset.defaultCharset())));
        return sb2.toString();
    }

    public final void e() {
        boolean z10;
        int i9 = Build.VERSION.SDK_INT;
        Context context = this.f47470a;
        if (i9 >= 24) {
            z10 = v.g(context);
        } else {
            z10 = true;
        }
        String str = this.f47471b;
        if (!z10) {
            StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb2.append(str);
            Log.i("FirebaseApp", sb2.toString());
            AtomicReference atomicReference = g.f47466b;
            if (atomicReference.get() == null) {
                g gVar = new g(context);
                while (!atomicReference.compareAndSet(null, gVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(gVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb3 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb3.append(str);
        Log.i("FirebaseApp", sb3.toString());
        a();
        this.d.d("[DEFAULT]".equals(str));
        ((v9.c) this.h.get()).c();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        hVar.a();
        return this.f47471b.equals(hVar.f47471b);
    }

    public final boolean h() {
        boolean z10;
        a();
        ca.a aVar = (ca.a) this.f47475g.get();
        synchronized (aVar) {
            z10 = aVar.f2331a;
        }
        return z10;
    }

    public final int hashCode() {
        return this.f47471b.hashCode();
    }

    public final String toString() {
        w4.e eVar = new w4.e((Object) this);
        eVar.c(this.f47471b, "name");
        eVar.c(this.f47472c, "options");
        return eVar.toString();
    }
}
