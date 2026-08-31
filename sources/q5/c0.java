package q5;

import android.os.Parcel;
import android.os.RemoteException;
public final class c0 implements Runnable {
    public final int f44526a;
    public final d0 f44527b;
    public final int f44528c;

    public c0(d0 d0Var, int i10, int i11) {
        this.f44526a = i11;
        this.f44527b = d0Var;
        this.f44528c = i10;
    }

    private final void a() {
        d0 d0Var = this.f44527b;
        e0 e0Var = d0Var.f44536b;
        e0Var.f44552x = -1;
        e0Var.f44553y = -1;
        e0Var.f44549t = null;
        e0Var.f44550u = null;
        e0Var.v = 0.0d;
        e0Var.j();
        e0Var.f44551w = false;
        e0Var.f44554z = null;
        e0 e0Var2 = d0Var.f44536b;
        e0Var2.F = 1;
        int i10 = this.f44528c;
        synchronized (e0Var2.E) {
            try {
                for (r5.i iVar : d0Var.f44536b.E) {
                    r5.q qVar = iVar.f46720a.f46704e;
                    if (qVar != null) {
                        try {
                            y5.a aVar = new y5.a(i10);
                            r5.o oVar = (r5.o) qVar;
                            Parcel M0 = oVar.M0();
                            com.google.android.gms.internal.cast.s.c(M0, aVar);
                            oVar.Q0(M0, 3);
                        } catch (RemoteException e6) {
                            r5.c.f46702m.a(e6, "Unable to call %s on %s.", "onDisconnected", r5.q.class.getSimpleName());
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        d0Var.f44536b.h();
        e0 e0Var3 = d0Var.f44536b;
        com.google.android.gms.common.api.internal.n nVar = y5.h.h(e0Var3.f2856f, e0Var3.f44540k, "castDeviceControllerListenerKey").f2779c;
        b6.m.i(nVar, "Key must not be null");
        e0Var3.c(nVar, 8415);
    }

    private final void b() {
        d0 d0Var = this.f44527b;
        int i10 = this.f44528c;
        if (i10 == 0) {
            e0 e0Var = d0Var.f44536b;
            e0Var.F = 2;
            e0Var.f44542m = true;
            e0Var.f44543n = true;
            synchronized (e0Var.E) {
                try {
                    for (r5.i iVar : d0Var.f44536b.E) {
                        iVar.a();
                    }
                } finally {
                }
            }
            return;
        }
        e0 e0Var2 = d0Var.f44536b;
        e0Var2.F = 1;
        synchronized (e0Var2.E) {
            try {
            } catch (RemoteException e6) {
                r5.c.f46702m.a(e6, "Unable to call %s on %s.", "onConnectionFailed", r5.q.class.getSimpleName());
            } finally {
            }
            for (r5.i iVar2 : d0Var.f44536b.E) {
                r5.q qVar = iVar2.f46720a.f46704e;
                if (qVar != null) {
                    y5.a aVar = new y5.a(i10);
                    r5.o oVar = (r5.o) qVar;
                    Parcel M0 = oVar.M0();
                    com.google.android.gms.internal.cast.s.c(M0, aVar);
                    oVar.Q0(M0, 3);
                }
            }
        }
        d0Var.f44536b.h();
    }

    @Override
    public final void run() {
        switch (this.f44526a) {
            case 0:
                a();
                return;
            case 1:
                b();
                return;
            case 2:
                this.f44527b.f44536b.D.b(this.f44528c);
                return;
            default:
                d0 d0Var = this.f44527b;
                e0 e0Var = d0Var.f44536b;
                e0Var.F = 3;
                int i10 = this.f44528c;
                synchronized (e0Var.E) {
                    try {
                        for (r5.i iVar : d0Var.f44536b.E) {
                            r5.q qVar = iVar.f46720a.f46704e;
                            if (qVar != null) {
                                try {
                                    r5.o oVar = (r5.o) qVar;
                                    Parcel M0 = oVar.M0();
                                    M0.writeInt(i10);
                                    oVar.Q0(M0, 2);
                                } catch (RemoteException e6) {
                                    r5.c.f46702m.a(e6, "Unable to call %s on %s.", "onConnectionSuspended", r5.q.class.getSimpleName());
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }
}
