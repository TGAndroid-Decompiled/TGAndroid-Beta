package q6;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
public final class u implements Handler.Callback {
    public final aa.n f53947a;
    public final com.google.android.gms.internal.cast.y f53952n;
    public final ArrayList f53948b = new ArrayList();
    public final ArrayList f53949c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public volatile boolean f53950e = false;
    public final AtomicInteger f53951f = new AtomicInteger(0);
    public boolean h = false;
    public final Object f53953r = new Object();

    public u(Looper looper, aa.n nVar) {
        this.f53947a = nVar;
        this.f53952n = new com.google.android.gms.internal.cast.y(looper, this);
    }

    public final void a(com.google.android.gms.common.api.l lVar) {
        m.g(lVar);
        synchronized (this.f53953r) {
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
        int i7 = message.what;
        if (i7 == 1) {
            com.google.android.gms.common.api.k kVar = (com.google.android.gms.common.api.k) message.obj;
            synchronized (this.f53953r) {
                try {
                    if (this.f53950e && this.f53947a.j() && this.f53948b.contains(kVar)) {
                        kVar.onConnected(null);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 34);
        sb2.append("Don't know how to handle message: ");
        sb2.append(i7);
        Log.wtf("GmsClientEvents", sb2.toString(), new Exception());
        return false;
    }
}
