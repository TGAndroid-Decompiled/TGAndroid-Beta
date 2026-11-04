package p6;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
public final class c0 extends com.google.android.gms.internal.cast.z {
    public final d f53213a;

    public c0(d dVar, Looper looper) {
        super(looper, 4);
        this.f53213a = dVar;
    }

    @Override
    public final void handleMessage(Message message) {
        Boolean bool;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        y yVar;
        d dVar = this.f53213a;
        if (dVar.C.get() != message.arg1) {
            int i3 = message.what;
            if ((i3 == 2 || i3 == 1 || i3 == 7) && (yVar = (y) message.obj) != null) {
                yVar.c();
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 != 1 && i10 != 7 && i10 != 4 && i10 != 5) || dVar.s()) {
            int i11 = message.what;
            if (i11 == 4) {
                dVar.f53236z = new m6.a(message.arg2, null, null);
                if (!dVar.A && !TextUtils.isEmpty(dVar.n()) && !TextUtils.isEmpty(null)) {
                    try {
                        Class.forName(dVar.n());
                        if (!dVar.A) {
                            dVar.z(3, null);
                            return;
                        }
                    } catch (ClassNotFoundException unused) {
                    }
                }
                m6.a aVar = dVar.f53236z;
                if (aVar == null) {
                    aVar = new m6.a(8, null, null);
                }
                dVar.f53226o.a(aVar);
                dVar.t(aVar);
                return;
            } else if (i11 == 5) {
                m6.a aVar2 = dVar.f53236z;
                if (aVar2 == null) {
                    aVar2 = new m6.a(8, null, null);
                }
                dVar.f53226o.a(aVar2);
                dVar.t(aVar2);
                return;
            } else if (i11 == 3) {
                Object obj = message.obj;
                if (obj instanceof PendingIntent) {
                    pendingIntent2 = (PendingIntent) obj;
                } else {
                    pendingIntent2 = null;
                }
                m6.a aVar3 = new m6.a(message.arg2, pendingIntent2, null);
                dVar.f53226o.a(aVar3);
                dVar.t(aVar3);
                return;
            } else if (i11 == 6) {
                dVar.z(5, null);
                n nVar = dVar.f53231t;
                if (nVar != null) {
                    ((com.google.android.gms.common.api.k) nVar.f53295a).onConnectionSuspended(message.arg2);
                }
                dVar.u(message.arg2);
                dVar.x(5, 1, null);
                return;
            } else if (i11 == 2 && !dVar.r()) {
                y yVar2 = (y) message.obj;
                if (yVar2 != null) {
                    yVar2.c();
                    return;
                }
                return;
            } else {
                int i12 = message.what;
                if (i12 != 2 && i12 != 1 && i12 != 7) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 34);
                    sb2.append("Don't know how to handle message: ");
                    sb2.append(i12);
                    Log.wtf("GmsClient", sb2.toString(), new Exception());
                    return;
                }
                y yVar3 = (y) message.obj;
                synchronized (yVar3) {
                    try {
                        bool = yVar3.f53329a;
                        if (yVar3.f53330b) {
                            String obj2 = yVar3.toString();
                            StringBuilder sb3 = new StringBuilder(obj2.length() + 47);
                            sb3.append("Callback proxy ");
                            sb3.append(obj2);
                            sb3.append(" being reused. This is not safe.");
                            Log.w("GmsClient", sb3.toString());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (bool != null) {
                    d dVar2 = yVar3.f53333f;
                    int i13 = yVar3.d;
                    if (i13 == 0) {
                        if (!yVar3.a()) {
                            dVar2.z(1, null);
                            yVar3.b(new m6.a(8, null, null));
                        }
                    } else {
                        dVar2.z(1, null);
                        Bundle bundle = yVar3.f53332e;
                        if (bundle != null) {
                            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
                        } else {
                            pendingIntent = null;
                        }
                        yVar3.b(new m6.a(i13, pendingIntent, null));
                    }
                }
                synchronized (yVar3) {
                    yVar3.f53330b = true;
                }
                yVar3.c();
                return;
            }
        }
        y yVar4 = (y) message.obj;
        if (yVar4 != null) {
            yVar4.c();
        }
    }
}
