package p6;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
public final class u implements Handler.Callback {
    public final bb.c f53312a;
    public final com.google.android.gms.internal.cast.z f53317n;
    public final ArrayList f53313b = new ArrayList();
    public final ArrayList f53314c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public volatile boolean f53315e = false;
    public final AtomicInteger f53316f = new AtomicInteger(0);
    public boolean h = false;
    public final Object f53318r = new Object();

    public u(Looper looper, bb.c cVar) {
        this.f53312a = cVar;
        this.f53317n = new com.google.android.gms.internal.cast.z(looper, this);
    }

    public final void a(com.google.android.gms.common.api.l lVar) {
        m.g(lVar);
        synchronized (this.f53318r) {
            try {
                ArrayList arrayList = this.d;
                if (arrayList.contains(lVar)) {
                    String valueOf = String.valueOf(lVar);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 67);
                    sb2.append("registerConnectionFailedListener(): listener ");
                    sb2.append(valueOf);
                    sb2.append(" is already registered");
                    Log.w("GmsClientEvents", sb2.toString());
                } else {
                    arrayList.add(lVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i3 = message.what;
        if (i3 == 1) {
            com.google.android.gms.common.api.k kVar = (com.google.android.gms.common.api.k) message.obj;
            synchronized (this.f53318r) {
                try {
                    if (this.f53315e && this.f53312a.e() && this.f53313b.contains(kVar)) {
                        kVar.onConnected(null);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 34);
        sb2.append("Don't know how to handle message: ");
        sb2.append(i3);
        Log.wtf("GmsClientEvents", sb2.toString(), new Exception());
        return false;
    }
}
