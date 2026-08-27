package t8;

import a9.r;
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
import m5.o;
import w3.b0;
import y5.l;
import z8.m;

public final class h {

    public static final Object f48117k = new Object();

    public static final a0.f f48118l = new a0.f(0);

    public final Context f48119a;

    public final String f48120b;

    public final j f48121c;
    public final z8.f d;

    public final AtomicBoolean f48122e;

    public final AtomicBoolean f48123f;

    public final m f48124g;
    public final y9.b h;

    public final CopyOnWriteArrayList f48125i;

    public final CopyOnWriteArrayList f48126j;

    public h(Context context, String str, j jVar) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f48122e = atomicBoolean;
        this.f48123f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f48125i = copyOnWriteArrayList;
        this.f48126j = new CopyOnWriteArrayList();
        this.f48119a = context;
        l.f(str);
        this.f48120b = str;
        this.f48121c = jVar;
        a aVar = FirebaseInitProvider.f4647a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayListI = new b0(13, context, new o(ComponentDiscoveryService.class, 27)).i();
        Trace.endSection();
        Trace.beginSection("Runtime");
        r rVar = r.f195a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(arrayListI);
        int i10 = 1;
        arrayList.add(new z8.c(new FirebaseCommonRegistrar(), i10));
        arrayList.add(new z8.c(new ExecutorsRegistrar(), i10));
        arrayList2.add(z8.a.c(context, Context.class, new Class[0]));
        arrayList2.add(z8.a.c(this, h.class, new Class[0]));
        arrayList2.add(z8.a.c(jVar, j.class, new Class[0]));
        ab.a aVar2 = new ab.a(13);
        if ((Build.VERSION.SDK_INT >= 24 ? v.g(context) : true) && FirebaseInitProvider.f4648b.get()) {
            arrayList2.add(z8.a.c(aVar, a.class, new Class[0]));
        }
        z8.f fVar = new z8.f(rVar, arrayList, arrayList2, aVar2);
        this.d = fVar;
        Trace.endSection();
        this.f48124g = new m(new d(0, this, context));
        this.h = fVar.e(w9.c.class);
        e eVar = new e(this);
        a();
        if (atomicBoolean.get()) {
            com.google.android.gms.common.api.internal.d.f3228e.f3229a.get();
        }
        copyOnWriteArrayList.add(eVar);
        Trace.endSection();
    }

    public static h c() {
        h hVar;
        synchronized (f48117k) {
            try {
                hVar = (h) f48118l.get("[DEFAULT]");
                if (hVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + f6.d.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((w9.c) hVar.h.get()).c();
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    public static h f(Context context) {
        synchronized (f48117k) {
            try {
                if (f48118l.containsKey("[DEFAULT]")) {
                    return c();
                }
                j jVarA = j.a(context);
                if (jVarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return g(context, jVarA);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static h g(Context context, j jVar) {
        h hVar;
        AtomicReference atomicReference = f.f48114a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = f.f48114a;
            if (atomicReference2.get() == null) {
                f fVar = new f();
                do {
                    if (atomicReference2.compareAndSet(null, fVar)) {
                        com.google.android.gms.common.api.internal.d.b(application);
                        com.google.android.gms.common.api.internal.d.f3228e.a(fVar);
                        break;
                    }
                } while (atomicReference2.get() == null);
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f48117k) {
            a0.f fVar2 = f48118l;
            l.j("FirebaseApp name [DEFAULT] already exists!", !fVar2.containsKey("[DEFAULT]"));
            l.i(context, "Application context cannot be null.");
            hVar = new h(context, "[DEFAULT]", jVar);
            fVar2.put("[DEFAULT]", hVar);
        }
        hVar.e();
        return hVar;
    }

    public final void a() {
        l.j("FirebaseApp was deleted", !this.f48123f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.d.a(cls);
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        a();
        sb2.append(f6.b.c(this.f48120b.getBytes(Charset.defaultCharset())));
        sb2.append("+");
        a();
        sb2.append(f6.b.c(this.f48121c.f48132b.getBytes(Charset.defaultCharset())));
        return sb2.toString();
    }

    public final void e() {
        int i10 = Build.VERSION.SDK_INT;
        Context context = this.f48119a;
        boolean zG = i10 >= 24 ? v.g(context) : true;
        String str = this.f48120b;
        if (zG) {
            StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
            a();
            sb2.append(str);
            Log.i("FirebaseApp", sb2.toString());
            a();
            this.d.f("[DEFAULT]".equals(str));
            ((w9.c) this.h.get()).c();
            return;
        }
        StringBuilder sb3 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
        a();
        sb3.append(str);
        Log.i("FirebaseApp", sb3.toString());
        AtomicReference atomicReference = g.f48115b;
        if (atomicReference.get() == null) {
            g gVar = new g(context);
            while (!atomicReference.compareAndSet(null, gVar)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            context.registerReceiver(gVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        hVar.a();
        return this.f48120b.equals(hVar.f48120b);
    }

    public final boolean h() {
        boolean z10;
        a();
        da.a aVar = (da.a) this.f48124g.get();
        synchronized (aVar) {
            z10 = aVar.f4875a;
        }
        return z10;
    }

    public final int hashCode() {
        return this.f48120b.hashCode();
    }

    public final String toString() {
        b0 b0Var = new b0(this);
        b0Var.e(this.f48120b, "name");
        b0Var.e(this.f48121c, "options");
        return b0Var.toString();
    }
}
