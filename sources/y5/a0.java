package y5;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import c2.t0;

public final class a0 extends t0 {

    public final g f49601a;

    public a0(g gVar, Looper looper) {
        super(looper, 6);
        this.f49601a = gVar;
    }

    @Override
    public final void handleMessage(Message message) {
        Boolean bool;
        if (this.f49601a.N.get() != message.arg1) {
            int i10 = message.what;
            if (i10 == 2 || i10 == 1 || i10 == 7) {
                w wVar = (w) message.obj;
                wVar.getClass();
                wVar.d();
                return;
            }
            return;
        }
        int i11 = message.what;
        if ((i11 == 1 || i11 == 7 || i11 == 4 || i11 == 5) && !this.f49601a.d()) {
            w wVar2 = (w) message.obj;
            wVar2.getClass();
            wVar2.d();
            return;
        }
        int i12 = message.what;
        if (i12 == 4) {
            g gVar = this.f49601a;
            gVar.K = new v5.a(message.arg2);
            if (!gVar.L && !TextUtils.isEmpty(gVar.v()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(gVar.v());
                    g gVar2 = this.f49601a;
                    if (!gVar2.L) {
                        gVar2.F(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            g gVar3 = this.f49601a;
            v5.a aVar = gVar3.K;
            if (aVar == null) {
                aVar = new v5.a(8);
            }
            gVar3.A.a(aVar);
            this.f49601a.z(aVar);
            return;
        }
        if (i12 == 5) {
            g gVar4 = this.f49601a;
            v5.a aVar2 = gVar4.K;
            if (aVar2 == null) {
                aVar2 = new v5.a(8);
            }
            gVar4.A.a(aVar2);
            this.f49601a.z(aVar2);
            return;
        }
        if (i12 == 3) {
            Object obj = message.obj;
            v5.a aVar3 = new v5.a(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f49601a.A.a(aVar3);
            this.f49601a.z(aVar3);
            return;
        }
        if (i12 == 6) {
            this.f49601a.F(5, null);
            m mVar = this.f49601a.F;
            if (mVar != null) {
                ((com.google.android.gms.common.api.k) mVar.f49673a).onConnectionSuspended(message.arg2);
            }
            this.f49601a.A(message.arg2);
            g.E(this.f49601a, 5, 1, null);
            return;
        }
        if (i12 == 2 && !this.f49601a.h()) {
            w wVar3 = (w) message.obj;
            wVar3.getClass();
            wVar3.d();
            return;
        }
        int i13 = message.what;
        if (i13 != 2 && i13 != 1 && i13 != 7) {
            Log.wtf("GmsClient", i0.a.k(i13, "Don't know how to handle message: "), new Exception());
            return;
        }
        w wVar4 = (w) message.obj;
        synchronized (wVar4) {
            try {
                bool = wVar4.f49704a;
                if (wVar4.f49705b) {
                    Log.w("GmsClient", "Callback proxy " + wVar4.toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            g gVar5 = wVar4.f49708f;
            int i14 = wVar4.d;
            if (i14 != 0) {
                gVar5.F(1, null);
                Bundle bundle = wVar4.f49707e;
                wVar4.a(new v5.a(i14, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
            } else if (!wVar4.b()) {
                gVar5.F(1, null);
                wVar4.a(new v5.a(8, null));
            }
        }
        synchronized (wVar4) {
            wVar4.f49705b = true;
        }
        wVar4.d();
    }
}
