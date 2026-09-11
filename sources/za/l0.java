package za;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import java.util.ArrayList;
public final class l0 extends Handler {
    public boolean f51458a;
    public long f51459b;
    public final ArrayList f51460c;

    public l0(Looper looper) {
        super(looper);
        this.f51460c = new ArrayList();
    }

    public final void a(Messenger messenger) {
        String str;
        if (this.f51458a) {
            Object b10 = k9.h.c().b(i0.class);
            kotlin.jvm.internal.i.d(b10, "Firebase.app[SessionGenerator::class.java]");
            c(messenger, ((i0) b10).b().f51491a);
            return;
        }
        Object b11 = k9.h.c().b(s.class);
        kotlin.jvm.internal.i.d(b11, "Firebase.app[SessionDatastore::class.java]");
        m mVar = (m) ((y) ((s) b11)).f51490c.get();
        if (mVar != null) {
            str = mVar.f51461a;
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
        Object b10 = k9.h.c().b(i0.class);
        kotlin.jvm.internal.i.d(b10, "Firebase.app[SessionGenerator::class.java]");
        i0 i0Var = (i0) b10;
        int i10 = i0Var.d + 1;
        i0Var.d = i10;
        if (i10 == 0) {
            a2 = i0Var.f51443c;
        } else {
            a2 = i0Var.a();
        }
        String str = a2;
        String str2 = i0Var.f51443c;
        int i11 = i0Var.d;
        i0Var.f51441a.getClass();
        i0Var.f51444e = new z(i11, System.currentTimeMillis() * 1000, str, str2);
        i0Var.b();
        StringBuilder sb2 = new StringBuilder("Generated new session ");
        Object b11 = k9.h.c().b(i0.class);
        kotlin.jvm.internal.i.d(b11, "Firebase.app[SessionGenerator::class.java]");
        sb2.append(((i0) b11).b().f51491a);
        Log.d("SessionLifecycleService", sb2.toString());
        StringBuilder sb3 = new StringBuilder("Broadcasting new session: ");
        Object b12 = k9.h.c().b(i0.class);
        kotlin.jvm.internal.i.d(b12, "Firebase.app[SessionGenerator::class.java]");
        sb3.append(((i0) b12).b());
        Log.d("SessionLifecycleService", sb3.toString());
        Object b13 = k9.h.c().b(c0.class);
        kotlin.jvm.internal.i.d(b13, "Firebase.app[SessionFirelogPublisher::class.java]");
        Object b14 = k9.h.c().b(i0.class);
        kotlin.jvm.internal.i.d(b14, "Firebase.app[SessionGenerator::class.java]");
        g0 g0Var = (g0) ((c0) b13);
        zd.e0.q(zd.e0.b(g0Var.f51429e), new e0(g0Var, ((i0) b14).b(), null));
        ArrayList arrayList = new ArrayList(this.f51460c);
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
        Object b16 = k9.h.c().b(i0.class);
        kotlin.jvm.internal.i.d(b16, "Firebase.app[SessionGenerator::class.java]");
        String sessionId = ((i0) b16).b().f51491a;
        y yVar = (y) ((s) b15);
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        zd.e0.q(zd.e0.b(yVar.f51489b), new bb.j(yVar, sessionId, null, 5));
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
            this.f51460c.remove(messenger);
        } catch (Exception e7) {
            Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e7);
        }
    }

    @Override
    public final void handleMessage(android.os.Message r12) {
        throw new UnsupportedOperationException("Method not decompiled: za.l0.handleMessage(android.os.Message):void");
    }
}
