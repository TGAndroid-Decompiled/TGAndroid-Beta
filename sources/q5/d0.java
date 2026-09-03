package q5;

import android.os.Parcel;
import android.os.RemoteException;
public final class d0 implements Runnable {
    public final int f44567a;
    public final e0 f44568b;
    public final int f44569c;

    public d0(e0 e0Var, int i10, int i11) {
        this.f44567a = i11;
        this.f44568b = e0Var;
        this.f44569c = i10;
    }

    private final void a() {
        e0 e0Var = this.f44568b;
        f0 f0Var = e0Var.f44573b;
        f0Var.f44586x = -1;
        f0Var.f44587y = -1;
        f0Var.f44583t = null;
        f0Var.f44584u = null;
        f0Var.v = 0.0d;
        f0Var.j();
        f0Var.f44585w = false;
        f0Var.f44588z = null;
        f0 f0Var2 = e0Var.f44573b;
        f0Var2.F = 1;
        int i10 = this.f44569c;
        synchronized (f0Var2.E) {
            try {
                for (r5.i iVar : e0Var.f44573b.E) {
                    r5.q qVar = iVar.f46751a.f46735e;
                    if (qVar != null) {
                        try {
                            y5.a aVar = new y5.a(i10);
                            r5.o oVar = (r5.o) qVar;
                            Parcel M0 = oVar.M0();
                            com.google.android.gms.internal.cast.s.c(M0, aVar);
                            oVar.Q0(M0, 3);
                        } catch (RemoteException e6) {
                            r5.c.f46733m.a(e6, "Unable to call %s on %s.", "onDisconnected", r5.q.class.getSimpleName());
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e0Var.f44573b.h();
        f0 f0Var3 = e0Var.f44573b;
        com.google.android.gms.common.api.internal.n nVar = y5.h.h(f0Var3.f2856f, f0Var3.f44574k, "castDeviceControllerListenerKey").f2779c;
        b6.m.i(nVar, "Key must not be null");
        f0Var3.c(nVar, 8415);
    }

    private final void b() {
        e0 e0Var = this.f44568b;
        int i10 = this.f44569c;
        if (i10 == 0) {
            f0 f0Var = e0Var.f44573b;
            f0Var.F = 2;
            f0Var.f44576m = true;
            f0Var.f44577n = true;
            synchronized (f0Var.E) {
                try {
                    for (r5.i iVar : e0Var.f44573b.E) {
                        iVar.a();
                    }
                } finally {
                }
            }
            return;
        }
        f0 f0Var2 = e0Var.f44573b;
        f0Var2.F = 1;
        synchronized (f0Var2.E) {
            try {
            } catch (RemoteException e6) {
                r5.c.f46733m.a(e6, "Unable to call %s on %s.", "onConnectionFailed", r5.q.class.getSimpleName());
            } finally {
            }
            for (r5.i iVar2 : e0Var.f44573b.E) {
                r5.q qVar = iVar2.f46751a.f46735e;
                if (qVar != null) {
                    y5.a aVar = new y5.a(i10);
                    r5.o oVar = (r5.o) qVar;
                    Parcel M0 = oVar.M0();
                    com.google.android.gms.internal.cast.s.c(M0, aVar);
                    oVar.Q0(M0, 3);
                }
            }
        }
        e0Var.f44573b.h();
    }

    @Override
    public final void run() {
        switch (this.f44567a) {
            case 0:
                a();
                return;
            case 1:
                b();
                return;
            case 2:
                this.f44568b.f44573b.D.b(this.f44569c);
                return;
            default:
                e0 e0Var = this.f44568b;
                f0 f0Var = e0Var.f44573b;
                f0Var.F = 3;
                int i10 = this.f44569c;
                synchronized (f0Var.E) {
                    try {
                        for (r5.i iVar : e0Var.f44573b.E) {
                            r5.q qVar = iVar.f46751a.f46735e;
                            if (qVar != null) {
                                try {
                                    r5.o oVar = (r5.o) qVar;
                                    Parcel M0 = oVar.M0();
                                    M0.writeInt(i10);
                                    oVar.Q0(M0, 2);
                                } catch (RemoteException e6) {
                                    r5.c.f46733m.a(e6, "Unable to call %s on %s.", "onConnectionSuspended", r5.q.class.getSimpleName());
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
