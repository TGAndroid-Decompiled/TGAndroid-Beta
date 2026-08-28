package x5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import c2.u0;
import j3.r0;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
public final class s implements Handler.Callback {
    public final android.support.v4.media.c f48970a;
    public final u0 f48975n;
    public final ArrayList f48971b = new ArrayList();
    public final ArrayList f48972c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public volatile boolean f48973e = false;
    public final AtomicInteger f48974f = new AtomicInteger(0);
    public boolean h = false;
    public final Object f48976r = new Object();

    public s(Looper looper, android.support.v4.media.c cVar) {
        this.f48970a = cVar;
        this.f48975n = new u0(looper, this);
    }

    public final void a(com.google.android.gms.common.api.l lVar) {
        l.h(lVar);
        synchronized (this.f48976r) {
            try {
                if (this.d.contains(lVar)) {
                    String valueOf = String.valueOf(lVar);
                    Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + valueOf + " is already registered");
                } else {
                    this.d.add(lVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i9 = message.what;
        if (i9 == 1) {
            com.google.android.gms.common.api.k kVar = (com.google.android.gms.common.api.k) message.obj;
            synchronized (this.f48976r) {
                try {
                    if (this.f48973e && this.f48970a.G() && this.f48971b.contains(kVar)) {
                        kVar.onConnected(null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        Log.wtf("GmsClientEvents", r0.l(i9, "Don't know how to handle message: "), new Exception());
        return false;
    }
}
