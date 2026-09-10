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
    public boolean f47931a;
    public long f47932b;
    public final ArrayList f47933c;

    public m0(Looper looper) {
        super(looper);
        this.f47933c = new ArrayList();
    }

    public final void a(Messenger messenger) {
        String str;
        if (this.f47931a) {
            Object b10 = k9.h.c().b(j0.class);
            kotlin.jvm.internal.i.d(b10, "Firebase.app[SessionGenerator::class.java]");
            c(messenger, ((j0) b10).b().f47860a);
            return;
        }
        Object b11 = k9.h.c().b(s.class);
        kotlin.jvm.internal.i.d(b11, "Firebase.app[SessionDatastore::class.java]");
        m mVar = (m) ((z) ((s) b11)).f47963c.get();
        if (mVar != null) {
            str = mVar.f47930a;
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
            a2 = j0Var.f47920c;
        } else {
            a2 = j0Var.a();
        }
        String str = a2;
        String str2 = j0Var.f47920c;
        int i11 = j0Var.d;
        j0Var.f47918a.getClass();
        j0Var.e = new a0(i11, System.currentTimeMillis() * 1000, str, str2);
        j0Var.b();
        StringBuilder sb2 = new StringBuilder("Generated new session ");
        Object b11 = k9.h.c().b(j0.class);
        kotlin.jvm.internal.i.d(b11, "Firebase.app[SessionGenerator::class.java]");
        sb2.append(((j0) b11).b().f47860a);
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
        zd.e0.q(zd.e0.b(h0Var.e), new f0(h0Var, ((j0) b14).b(), null));
        ArrayList arrayList = new ArrayList(this.f47933c);
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            Messenger it = (Messenger) obj;
            kotlin.jvm.internal.i.d(it, "it");
            a(it);
        }
        Object b15 = k9.h.c().b(s.class);
        kotlin.jvm.internal.i.d(b15, "Firebase.app[SessionDatastore::class.java]");
        Object b16 = k9.h.c().b(j0.class);
        kotlin.jvm.internal.i.d(b16, "Firebase.app[SessionGenerator::class.java]");
        String sessionId = ((j0) b16).b().f47860a;
        z zVar = (z) ((s) b15);
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        zd.e0.q(zd.e0.b(zVar.f47962b), new bb.i(zVar, sessionId, null, 5));
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
            this.f47933c.remove(messenger);
        } catch (Exception e) {
            Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e);
        }
    }

    @Override
    public final void handleMessage(android.os.Message r12) {
        throw new UnsupportedOperationException("Method not decompiled: za.m0.handleMessage(android.os.Message):void");
    }
}
