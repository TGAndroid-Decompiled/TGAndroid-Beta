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
    public static final Object f46476k = new Object();
    public static final a0.f f46477l = new k(0);
    public final Context f46478a;
    public final String f46479b;
    public final i f46480c;
    public final c9.i d;
    public final AtomicBoolean e;
    public final AtomicBoolean f46481f;
    public final p f46482g;
    public final ba.b h;
    public final CopyOnWriteArrayList f46483i;
    public final CopyOnWriteArrayList f46484j;

    public g(Context context, String str, i iVar) {
        boolean z4;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.e = atomicBoolean;
        this.f46481f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f46483i = copyOnWriteArrayList;
        this.f46484j = new CopyOnWriteArrayList();
        this.f46478a = context;
        m.f(str);
        this.f46479b = str;
        this.f46480c = iVar;
        a aVar = FirebaseInitProvider.f4055a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList w10 = new bf.b(16, context, new ja.c(ComponentDiscoveryService.class, 4)).w();
        Trace.endSection();
        Trace.beginSection("Runtime");
        l lVar = l.f4297a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(w10);
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
        if (z4 && FirebaseInitProvider.f4056b.get()) {
            arrayList2.add(c9.b.c(aVar, a.class, new Class[0]));
        }
        c9.i iVar2 = new c9.i(lVar, arrayList, arrayList2, bVar);
        this.d = iVar2;
        Trace.endSection();
        this.f46482g = new p(new c9.h(1, this, context));
        this.h = iVar2.d(z9.c.class);
        d dVar = new d(this);
        a();
        if (atomicBoolean.get()) {
            com.google.android.gms.common.api.internal.d.e.f2759a.get();
        }
        copyOnWriteArrayList.add(dVar);
        Trace.endSection();
    }

    public static g c() {
        g gVar;
        synchronized (f46476k) {
            try {
                gVar = (g) f46477l.get("[DEFAULT]");
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
        synchronized (f46476k) {
            try {
                if (f46477l.containsKey("[DEFAULT]")) {
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
        AtomicReference atomicReference = e.f46473a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = e.f46473a;
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
        synchronized (f46476k) {
            a0.f fVar = f46477l;
            m.j("FirebaseApp name [DEFAULT] already exists!", !fVar.containsKey("[DEFAULT]"));
            m.i(context, "Application context cannot be null.");
            gVar = new g(context, "[DEFAULT]", iVar);
            fVar.put("[DEFAULT]", gVar);
        }
        gVar.e();
        return gVar;
    }

    public final void a() {
        m.j("FirebaseApp was deleted", !this.f46481f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.d.a(cls);
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        a();
        sb.append(i6.b.c(this.f46479b.getBytes(Charset.defaultCharset())));
        sb.append("+");
        a();
        sb.append(i6.b.c(this.f46480c.f46489b.getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    public final void e() {
        boolean z4;
        int i10 = Build.VERSION.SDK_INT;
        Context context = this.f46478a;
        if (i10 >= 24) {
            z4 = x.g(context);
        } else {
            z4 = true;
        }
        String str = this.f46479b;
        if (!z4) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(str);
            Log.i("FirebaseApp", sb.toString());
            AtomicReference atomicReference = f.f46474b;
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
        return this.f46479b.equals(gVar.f46479b);
    }

    public final boolean h() {
        boolean z4;
        a();
        ga.a aVar = (ga.a) this.f46482g.get();
        synchronized (aVar) {
            z4 = aVar.f6489a;
        }
        return z4;
    }

    public final int hashCode() {
        return this.f46479b.hashCode();
    }

    public final String toString() {
        bf.b bVar = new bf.b((Object) this);
        bVar.s(this.f46479b, "name");
        bVar.s(this.f46480c, "options");
        return bVar.toString();
    }
}
