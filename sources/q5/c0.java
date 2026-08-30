package q5;

import android.os.Parcel;
import android.os.RemoteException;
public final class c0 implements Runnable {
    public final int f42776a;
    public final d0 f42777b;
    public final int f42778c;

    public c0(d0 d0Var, int i10, int i11) {
        this.f42776a = i11;
        this.f42777b = d0Var;
        this.f42778c = i10;
    }

    private final void a() {
        d0 d0Var = this.f42777b;
        e0 e0Var = d0Var.f42785b;
        e0Var.f42801x = -1;
        e0Var.f42802y = -1;
        e0Var.f42798t = null;
        e0Var.f42799u = null;
        e0Var.v = 0.0d;
        e0Var.j();
        e0Var.f42800w = false;
        e0Var.f42803z = null;
        e0 e0Var2 = d0Var.f42785b;
        e0Var2.F = 1;
        int i10 = this.f42778c;
        synchronized (e0Var2.E) {
            try {
                for (r5.i iVar : d0Var.f42785b.E) {
                    r5.q qVar = iVar.f43371a.e;
                    if (qVar != null) {
                        try {
                            y5.a aVar = new y5.a(i10);
                            r5.o oVar = (r5.o) qVar;
                            Parcel M0 = oVar.M0();
                            com.google.android.gms.internal.cast.t.c(M0, aVar);
                            oVar.Q0(M0, 3);
                        } catch (RemoteException e) {
                            r5.c.f43354m.a(e, "Unable to call %s on %s.", "onDisconnected", r5.q.class.getSimpleName());
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        d0Var.f42785b.h();
        e0 e0Var3 = d0Var.f42785b;
        com.google.android.gms.common.api.internal.n nVar = androidx.biometric.f0.f(e0Var3.f2914f, e0Var3.f42789k, "castDeviceControllerListenerKey").f2843c;
        b6.m.i(nVar, "Key must not be null");
        e0Var3.c(nVar, 8415);
    }

    private final void b() {
        d0 d0Var = this.f42777b;
        int i10 = this.f42778c;
        if (i10 == 0) {
            e0 e0Var = d0Var.f42785b;
            e0Var.F = 2;
            e0Var.f42791m = true;
            e0Var.f42792n = true;
            synchronized (e0Var.E) {
                try {
                    for (r5.i iVar : d0Var.f42785b.E) {
                        iVar.a();
                    }
                } finally {
                }
            }
            return;
        }
        e0 e0Var2 = d0Var.f42785b;
        e0Var2.F = 1;
        synchronized (e0Var2.E) {
            try {
            } catch (RemoteException e) {
                r5.c.f43354m.a(e, "Unable to call %s on %s.", "onConnectionFailed", r5.q.class.getSimpleName());
            } finally {
            }
            for (r5.i iVar2 : d0Var.f42785b.E) {
                r5.q qVar = iVar2.f43371a.e;
                if (qVar != null) {
                    y5.a aVar = new y5.a(i10);
                    r5.o oVar = (r5.o) qVar;
                    Parcel M0 = oVar.M0();
                    com.google.android.gms.internal.cast.t.c(M0, aVar);
                    oVar.Q0(M0, 3);
                }
            }
        }
        d0Var.f42785b.h();
    }

    @Override
    public final void run() {
        switch (this.f42776a) {
            case 0:
                a();
                return;
            case 1:
                b();
                return;
            case 2:
                this.f42777b.f42785b.D.b(this.f42778c);
                return;
            default:
                d0 d0Var = this.f42777b;
                e0 e0Var = d0Var.f42785b;
                e0Var.F = 3;
                int i10 = this.f42778c;
                synchronized (e0Var.E) {
                    try {
                        for (r5.i iVar : d0Var.f42785b.E) {
                            r5.q qVar = iVar.f43371a.e;
                            if (qVar != null) {
                                try {
                                    r5.o oVar = (r5.o) qVar;
                                    Parcel M0 = oVar.M0();
                                    M0.writeInt(i10);
                                    oVar.Q0(M0, 2);
                                } catch (RemoteException e) {
                                    r5.c.f43354m.a(e, "Unable to call %s on %s.", "onConnectionSuspended", r5.q.class.getSimpleName());
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
