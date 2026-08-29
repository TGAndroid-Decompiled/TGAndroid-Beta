package z5;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import c2.v0;
import j7.l1;
public final class a0 extends v0 {
    public final g f50584a;

    public a0(g gVar, Looper looper) {
        super(looper, 6);
        this.f50584a = gVar;
    }

    @Override
    public final void handleMessage(Message message) {
        Boolean bool;
        if (this.f50584a.N.get() != message.arg1) {
            int i10 = message.what;
            if (i10 != 2 && i10 != 1 && i10 != 7) {
                return;
            }
            w wVar = (w) message.obj;
            wVar.getClass();
            wVar.d();
            return;
        }
        int i11 = message.what;
        if ((i11 != 1 && i11 != 7 && i11 != 4 && i11 != 5) || this.f50584a.e()) {
            int i12 = message.what;
            PendingIntent pendingIntent = null;
            if (i12 == 4) {
                g gVar = this.f50584a;
                gVar.K = new w5.a(message.arg2);
                if (!gVar.L && !TextUtils.isEmpty(gVar.v()) && !TextUtils.isEmpty(null)) {
                    try {
                        Class.forName(gVar.v());
                        g gVar2 = this.f50584a;
                        if (!gVar2.L) {
                            gVar2.F(3, null);
                            return;
                        }
                    } catch (ClassNotFoundException unused) {
                    }
                }
                g gVar3 = this.f50584a;
                w5.a aVar = gVar3.K;
                if (aVar == null) {
                    aVar = new w5.a(8);
                }
                gVar3.A.a(aVar);
                this.f50584a.z(aVar);
                return;
            } else if (i12 == 5) {
                g gVar4 = this.f50584a;
                w5.a aVar2 = gVar4.K;
                if (aVar2 == null) {
                    aVar2 = new w5.a(8);
                }
                gVar4.A.a(aVar2);
                this.f50584a.z(aVar2);
                return;
            } else if (i12 == 3) {
                Object obj = message.obj;
                if (obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) obj;
                }
                w5.a aVar3 = new w5.a(message.arg2, pendingIntent);
                this.f50584a.A.a(aVar3);
                this.f50584a.z(aVar3);
                return;
            } else if (i12 == 6) {
                this.f50584a.F(5, null);
                m mVar = this.f50584a.F;
                if (mVar != null) {
                    ((com.google.android.gms.common.api.k) mVar.f50656a).onConnectionSuspended(message.arg2);
                }
                this.f50584a.A(message.arg2);
                g.E(this.f50584a, 5, 1, null);
                return;
            } else if (i12 == 2 && !this.f50584a.h()) {
                w wVar2 = (w) message.obj;
                wVar2.getClass();
                wVar2.d();
                return;
            } else {
                int i13 = message.what;
                if (i13 != 2 && i13 != 1 && i13 != 7) {
                    Log.wtf("GmsClient", l1.k(i13, "Don't know how to handle message: "), new Exception());
                    return;
                }
                w wVar3 = (w) message.obj;
                synchronized (wVar3) {
                    try {
                        bool = wVar3.f50687a;
                        if (wVar3.f50688b) {
                            String obj2 = wVar3.toString();
                            Log.w("GmsClient", "Callback proxy " + obj2 + " being reused. This is not safe.");
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (bool != null) {
                    g gVar5 = wVar3.f50691f;
                    int i14 = wVar3.d;
                    if (i14 == 0) {
                        if (!wVar3.b()) {
                            gVar5.F(1, null);
                            wVar3.a(new w5.a(8, null));
                        }
                    } else {
                        gVar5.F(1, null);
                        Bundle bundle = wVar3.f50690e;
                        if (bundle != null) {
                            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
                        }
                        wVar3.a(new w5.a(i14, pendingIntent));
                    }
                }
                synchronized (wVar3) {
                    wVar3.f50688b = true;
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
