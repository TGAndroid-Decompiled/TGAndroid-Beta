package za;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import java.util.ArrayList;
public final class n0 extends Handler {
    public boolean f49079a;
    public long f49080b;
    public final ArrayList f49081c;

    public n0(Looper looper) {
        super(looper);
        this.f49081c = new ArrayList();
    }

    public final void a(Messenger messenger) {
        String str;
        if (this.f49079a) {
            Object b10 = k9.h.c().b(k0.class);
            kotlin.jvm.internal.i.d(b10, "Firebase.app[SessionGenerator::class.java]");
            c(messenger, ((k0) b10).b().f49009a);
            return;
        }
        Object b11 = k9.h.c().b(u.class);
        kotlin.jvm.internal.i.d(b11, "Firebase.app[SessionDatastore::class.java]");
        o oVar = (o) ((a0) ((u) b11)).f49006c.get();
        if (oVar != null) {
            str = oVar.f49082a;
        } else {
            str = null;
        }
        Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session: " + str);
        if (str != null) {
            c(messenger, str);
        }
    }

    public final void b() {
        String a2;
        Object b10 = k9.h.c().b(k0.class);
        kotlin.jvm.internal.i.d(b10, "Firebase.app[SessionGenerator::class.java]");
        k0 k0Var = (k0) b10;
        int i10 = k0Var.d + 1;
        k0Var.d = i10;
        if (i10 == 0) {
            a2 = k0Var.f49068c;
        } else {
            a2 = k0Var.a();
        }
        String str = a2;
        String str2 = k0Var.f49068c;
        int i11 = k0Var.d;
        k0Var.f49066a.getClass();
        k0Var.e = new b0(i11, System.currentTimeMillis() * 1000, str, str2);
        k0Var.b();
        StringBuilder sb2 = new StringBuilder("Generated new session ");
        Object b11 = k9.h.c().b(k0.class);
        kotlin.jvm.internal.i.d(b11, "Firebase.app[SessionGenerator::class.java]");
        sb2.append(((k0) b11).b().f49009a);
        Log.d("SessionLifecycleService", sb2.toString());
        StringBuilder sb3 = new StringBuilder("Broadcasting new session: ");
        Object b12 = k9.h.c().b(k0.class);
        kotlin.jvm.internal.i.d(b12, "Firebase.app[SessionGenerator::class.java]");
        sb3.append(((k0) b12).b());
        Log.d("SessionLifecycleService", sb3.toString());
        Object b13 = k9.h.c().b(e0.class);
        kotlin.jvm.internal.i.d(b13, "Firebase.app[SessionFirelogPublisher::class.java]");
        Object b14 = k9.h.c().b(k0.class);
        kotlin.jvm.internal.i.d(b14, "Firebase.app[SessionGenerator::class.java]");
        i0 i0Var = (i0) ((e0) b13);
        zd.e0.q(zd.e0.b(i0Var.e), new g0(i0Var, ((k0) b14).b(), null));
        ArrayList arrayList = new ArrayList(this.f49081c);
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            Messenger it = (Messenger) obj;
            kotlin.jvm.internal.i.d(it, "it");
            a(it);
        }
        Object b15 = k9.h.c().b(u.class);
        kotlin.jvm.internal.i.d(b15, "Firebase.app[SessionDatastore::class.java]");
        Object b16 = k9.h.c().b(k0.class);
        kotlin.jvm.internal.i.d(b16, "Firebase.app[SessionGenerator::class.java]");
        String sessionId = ((k0) b16).b().f49009a;
        a0 a0Var = (a0) ((u) b15);
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        zd.e0.q(zd.e0.b(a0Var.f49005b), new bb.i(a0Var, sessionId, null, 5));
    }

    public final void c(Messenger messenger, String str) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("SessionUpdateExtra", str);
            Message obtain = Message.obtain(null, 3, 0, 0);
            obtain.setData(bundle);
            messenger.send(obtain);
        } catch (DeadObjectException unused) {
            Log.d("SessionLifecycleService", "Removing dead client from list: " + messenger);
            this.f49081c.remove(messenger);
        } catch (Exception e) {
            Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e);
        }
    }

    @Override
    public final void handleMessage(android.os.Message r12) {
        throw new UnsupportedOperationException("Method not decompiled: za.n0.handleMessage(android.os.Message):void");
    }
}
