package y5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import c2.t0;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class s implements Handler.Callback {

    public final ga.c f49687a;

    public final t0 f49692n;

    public final ArrayList f49688b = new ArrayList();

    public final ArrayList f49689c = new ArrayList();
    public final ArrayList d = new ArrayList();

    public volatile boolean f49690e = false;

    public final AtomicInteger f49691f = new AtomicInteger(0);
    public boolean h = false;

    public final Object f49693r = new Object();

    public s(Looper looper, ga.c cVar) {
        this.f49687a = cVar;
        this.f49692n = new t0(looper, this);
    }

    public final void a(com.google.android.gms.common.api.l lVar) {
        l.h(lVar);
        synchronized (this.f49693r) {
            try {
                if (this.d.contains(lVar)) {
                    Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + String.valueOf(lVar) + " is already registered");
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
        int i10 = message.what;
        if (i10 != 1) {
            Log.wtf("GmsClientEvents", i0.a.k(i10, "Don't know how to handle message: "), new Exception());
            return false;
        }
        com.google.android.gms.common.api.k kVar = (com.google.android.gms.common.api.k) message.obj;
        synchronized (this.f49693r) {
            try {
                if (this.f49690e && this.f49687a.f() && this.f49688b.contains(kVar)) {
                    kVar.onConnected(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
