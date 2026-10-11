package za;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import java.util.ArrayList;
public final class m0 extends Handler {
    public boolean f54355a;
    public long f54356b;
    public final ArrayList f54357c;

    public m0(Looper looper) {
        super(looper);
        this.f54357c = new ArrayList();
    }

    public final void a(Messenger messenger) {
        String str;
        if (this.f54355a) {
            Object b10 = k9.h.c().b(j0.class);
            kotlin.jvm.internal.i.d(b10, "Firebase.app[SessionGenerator::class.java]");
            c(messenger, ((j0) b10).b().f54275a);
            return;
        }
        Object b11 = k9.h.c().b(t.class);
        kotlin.jvm.internal.i.d(b11, "Firebase.app[SessionDatastore::class.java]");
        n nVar = (n) ((z) ((t) b11)).f54387c.get();
        if (nVar != null) {
            str = nVar.f54358a;
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
        Object b10 = k9.h.c().b(j0.class);
        kotlin.jvm.internal.i.d(b10, "Firebase.app[SessionGenerator::class.java]");
        j0 j0Var = (j0) b10;
        int i10 = j0Var.d + 1;
        j0Var.d = i10;
        if (i10 == 0) {
            a2 = j0Var.f54342c;
        } else {
            a2 = j0Var.a();
        }
        String str = a2;
        String str2 = j0Var.f54342c;
        int i11 = j0Var.d;
        j0Var.f54340a.getClass();
        j0Var.f54343e = new a0(i11, System.currentTimeMillis() * 1000, str, str2);
        j0Var.b();
        StringBuilder sb2 = new StringBuilder("Generated new session ");
        Object b11 = k9.h.c().b(j0.class);
        kotlin.jvm.internal.i.d(b11, "Firebase.app[SessionGenerator::class.java]");
        sb2.append(((j0) b11).b().f54275a);
        Log.d("SessionLifecycleService", sb2.toString());
        StringBuilder sb3 = new StringBuilder("Broadcasting new session: ");
        Object b12 = k9.h.c().b(j0.class);
        kotlin.jvm.internal.i.d(b12, "Firebase.app[SessionGenerator::class.java]");
        sb3.append(((j0) b12).b());
        Log.d("SessionLifecycleService", sb3.toString());
        Object b13 = k9.h.c().b(d0.class);
        kotlin.jvm.internal.i.d(b13, "Firebase.app[SessionFirelogPublisher::class.java]");
        Object b14 = k9.h.c().b(j0.class);
        kotlin.jvm.internal.i.d(b14, "Firebase.app[SessionGenerator::class.java]");
        h0 h0Var = (h0) ((d0) b13);
        ae.g0.q(ae.g0.b(h0Var.f54331e), new f0(h0Var, ((j0) b14).b(), null));
        ArrayList arrayList = new ArrayList(this.f54357c);
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            Messenger it = (Messenger) obj;
            kotlin.jvm.internal.i.d(it, "it");
            a(it);
        }
        Object b15 = k9.h.c().b(t.class);
        kotlin.jvm.internal.i.d(b15, "Firebase.app[SessionDatastore::class.java]");
        Object b16 = k9.h.c().b(j0.class);
        kotlin.jvm.internal.i.d(b16, "Firebase.app[SessionGenerator::class.java]");
        String sessionId = ((j0) b16).b().f54275a;
        z zVar = (z) ((t) b15);
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        ae.g0.q(ae.g0.b(zVar.f54386b), new bb.i(zVar, sessionId, null, 5));
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
            this.f54357c.remove(messenger);
        } catch (Exception e7) {
            Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e7);
        }
    }

    @Override
    public final void handleMessage(android.os.Message r12) {
        throw new UnsupportedOperationException("Method not decompiled: za.m0.handleMessage(android.os.Message):void");
    }
}
