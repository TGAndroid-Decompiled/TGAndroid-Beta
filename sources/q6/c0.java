package q6;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
public final class c0 extends com.google.android.gms.internal.cast.y {
    public final d f53719a;

    public c0(d dVar, Looper looper) {
        super(looper, 4);
        this.f53719a = dVar;
    }

    @Override
    public final void handleMessage(Message message) {
        Boolean bool;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        y yVar;
        d dVar = this.f53719a;
        if (dVar.C.get() != message.arg1) {
            int i7 = message.what;
            if ((i7 == 2 || i7 == 1 || i7 == 7) && (yVar = (y) message.obj) != null) {
                yVar.c();
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 != 1 && i10 != 7 && i10 != 4 && i10 != 5) || dVar.t()) {
            int i11 = message.what;
            if (i11 == 4) {
                dVar.f53742z = new n6.a(message.arg2, null, null);
                if (!dVar.A && !TextUtils.isEmpty(dVar.o()) && !TextUtils.isEmpty(null)) {
                    try {
                        Class.forName(dVar.o());
                        if (!dVar.A) {
                            dVar.A(3, null);
                            return;
                        }
                    } catch (ClassNotFoundException unused) {
                    }
                }
                n6.a aVar = dVar.f53742z;
                if (aVar == null) {
                    aVar = new n6.a(8, null, null);
                }
                dVar.f53732o.a(aVar);
                dVar.u(aVar);
                return;
            } else if (i11 == 5) {
                n6.a aVar2 = dVar.f53742z;
                if (aVar2 == null) {
                    aVar2 = new n6.a(8, null, null);
                }
                dVar.f53732o.a(aVar2);
                dVar.u(aVar2);
                return;
            } else if (i11 == 3) {
                Object obj = message.obj;
                if (obj instanceof PendingIntent) {
                    pendingIntent2 = (PendingIntent) obj;
                } else {
                    pendingIntent2 = null;
                }
                n6.a aVar3 = new n6.a(message.arg2, pendingIntent2, null);
                dVar.f53732o.a(aVar3);
                dVar.u(aVar3);
                return;
            } else if (i11 == 6) {
                dVar.A(5, null);
                n nVar = dVar.f53737t;
                if (nVar != null) {
                    ((com.google.android.gms.common.api.k) nVar.f53801a).onConnectionSuspended(message.arg2);
                }
                dVar.v(message.arg2);
                dVar.y(5, 1, null);
                return;
            } else if (i11 == 2 && !dVar.s()) {
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
                        bool = yVar3.f53835a;
                        if (yVar3.f53836b) {
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
                    d dVar2 = yVar3.f53839f;
                    int i13 = yVar3.d;
                    if (i13 == 0) {
                        if (!yVar3.a()) {
                            dVar2.A(1, null);
                            yVar3.b(new n6.a(8, null, null));
                        }
                    } else {
                        dVar2.A(1, null);
                        Bundle bundle = yVar3.f53838e;
                        if (bundle != null) {
                            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
                        } else {
                            pendingIntent = null;
                        }
                        yVar3.b(new n6.a(i13, pendingIntent, null));
                    }
                }
                synchronized (yVar3) {
                    yVar3.f53836b = true;
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
