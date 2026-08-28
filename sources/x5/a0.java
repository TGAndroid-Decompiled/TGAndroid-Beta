package x5;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import c2.u0;
import j3.r0;
public final class a0 extends u0 {
    public final g f48884a;

    public a0(g gVar, Looper looper) {
        super(looper, 6);
        this.f48884a = gVar;
    }

    @Override
    public final void handleMessage(Message message) {
        Boolean bool;
        if (this.f48884a.N.get() != message.arg1) {
            int i9 = message.what;
            if (i9 != 2 && i9 != 1 && i9 != 7) {
                return;
            }
            w wVar = (w) message.obj;
            wVar.getClass();
            wVar.d();
            return;
        }
        int i10 = message.what;
        if ((i10 != 1 && i10 != 7 && i10 != 4 && i10 != 5) || this.f48884a.f()) {
            int i11 = message.what;
            PendingIntent pendingIntent = null;
            if (i11 == 4) {
                g gVar = this.f48884a;
                gVar.K = new u5.a(message.arg2);
                if (!gVar.L && !TextUtils.isEmpty(gVar.v()) && !TextUtils.isEmpty(null)) {
                    try {
                        Class.forName(gVar.v());
                        g gVar2 = this.f48884a;
                        if (!gVar2.L) {
                            gVar2.F(3, null);
                            return;
                        }
                    } catch (ClassNotFoundException unused) {
                    }
                }
                g gVar3 = this.f48884a;
                u5.a aVar = gVar3.K;
                if (aVar == null) {
                    aVar = new u5.a(8);
                }
                gVar3.A.a(aVar);
                this.f48884a.z(aVar);
                return;
            } else if (i11 == 5) {
                g gVar4 = this.f48884a;
                u5.a aVar2 = gVar4.K;
                if (aVar2 == null) {
                    aVar2 = new u5.a(8);
                }
                gVar4.A.a(aVar2);
                this.f48884a.z(aVar2);
                return;
            } else if (i11 == 3) {
                Object obj = message.obj;
                if (obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) obj;
                }
                u5.a aVar3 = new u5.a(message.arg2, pendingIntent);
                this.f48884a.A.a(aVar3);
                this.f48884a.z(aVar3);
                return;
            } else if (i11 == 6) {
                this.f48884a.F(5, null);
                m mVar = this.f48884a.F;
                if (mVar != null) {
                    ((com.google.android.gms.common.api.k) mVar.f48956a).onConnectionSuspended(message.arg2);
                }
                this.f48884a.A(message.arg2);
                g.E(this.f48884a, 5, 1, null);
                return;
            } else if (i11 == 2 && !this.f48884a.i()) {
                w wVar2 = (w) message.obj;
                wVar2.getClass();
                wVar2.d();
                return;
            } else {
                int i12 = message.what;
                if (i12 != 2 && i12 != 1 && i12 != 7) {
                    Log.wtf("GmsClient", r0.l(i12, "Don't know how to handle message: "), new Exception());
                    return;
                }
                w wVar3 = (w) message.obj;
                synchronized (wVar3) {
                    try {
                        bool = wVar3.f48987a;
                        if (wVar3.f48988b) {
                            String obj2 = wVar3.toString();
                            Log.w("GmsClient", "Callback proxy " + obj2 + " being reused. This is not safe.");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (bool != null) {
                    g gVar5 = wVar3.f48991f;
                    int i13 = wVar3.d;
                    if (i13 == 0) {
                        if (!wVar3.b()) {
                            gVar5.F(1, null);
                            wVar3.a(new u5.a(8, null));
                        }
                    } else {
                        gVar5.F(1, null);
                        Bundle bundle = wVar3.f48990e;
                        if (bundle != null) {
                            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
                        }
                        wVar3.a(new u5.a(i13, pendingIntent));
                    }
                }
                synchronized (wVar3) {
                    wVar3.f48988b = true;
                }
                wVar3.d();
                return;
            }
        }
        w wVar4 = (w) message.obj;
        wVar4.getClass();
        wVar4.d();
    }
}
