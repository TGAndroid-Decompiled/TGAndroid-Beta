package z5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import c2.v0;
import j7.l1;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
public final class s implements Handler.Callback {
    public final m5.i f50670a;
    public final v0 f50675n;
    public final ArrayList f50671b = new ArrayList();
    public final ArrayList f50672c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public volatile boolean f50673e = false;
    public final AtomicInteger f50674f = new AtomicInteger(0);
    public boolean h = false;
    public final Object f50676r = new Object();

    public s(Looper looper, m5.i iVar) {
        this.f50670a = iVar;
        this.f50675n = new v0(looper, this);
    }

    public final void a(com.google.android.gms.common.api.l lVar) {
        l.h(lVar);
        synchronized (this.f50676r) {
            try {
                if (this.d.contains(lVar)) {
                    String valueOf = String.valueOf(lVar);
                    Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + valueOf + " is already registered");
                } else {
                    this.d.add(lVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            com.google.android.gms.common.api.k kVar = (com.google.android.gms.common.api.k) message.obj;
            synchronized (this.f50676r) {
                try {
                    if (this.f50673e && this.f50670a.H() && this.f50671b.contains(kVar)) {
                        kVar.onConnected(null);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
        Log.wtf("GmsClientEvents", l1.k(i10, "Don't know how to handle message: "), new Exception());
        return false;
    }
}
