package q5;

import android.os.Parcel;
import android.os.RemoteException;
public final class d0 implements Runnable {
    public final int f42815a;
    public final e0 f42816b;
    public final int f42817c;

    public d0(e0 e0Var, int i10, int i11) {
        this.f42815a = i11;
        this.f42816b = e0Var;
        this.f42817c = i10;
    }

    private final void a() {
        e0 e0Var = this.f42816b;
        f0 f0Var = e0Var.f42821b;
        f0Var.f42834x = -1;
        f0Var.f42835y = -1;
        f0Var.f42831t = null;
        f0Var.f42832u = null;
        f0Var.v = 0.0d;
        f0Var.j();
        f0Var.f42833w = false;
        f0Var.f42836z = null;
        f0 f0Var2 = e0Var.f42821b;
        f0Var2.F = 1;
        int i10 = this.f42817c;
        synchronized (f0Var2.E) {
            try {
                for (r5.i iVar : e0Var.f42821b.E) {
                    r5.q qVar = iVar.f43395a.e;
                    if (qVar != null) {
                        try {
                            y5.a aVar = new y5.a(i10);
                            r5.o oVar = (r5.o) qVar;
                            Parcel M0 = oVar.M0();
                            com.google.android.gms.internal.cast.t.c(M0, aVar);
                            oVar.Q0(M0, 3);
                        } catch (RemoteException e) {
                            r5.c.f43378m.a(e, "Unable to call %s on %s.", "onDisconnected", r5.q.class.getSimpleName());
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e0Var.f42821b.h();
        f0 f0Var3 = e0Var.f42821b;
        com.google.android.gms.common.api.internal.n nVar = androidx.biometric.e0.i(f0Var3.f2897f, f0Var3.f42822k, "castDeviceControllerListenerKey").f2826c;
        b6.m.i(nVar, "Key must not be null");
        f0Var3.c(nVar, 8415);
    }

    private final void b() {
        e0 e0Var = this.f42816b;
        int i10 = this.f42817c;
        if (i10 == 0) {
            f0 f0Var = e0Var.f42821b;
            f0Var.F = 2;
            f0Var.f42824m = true;
            f0Var.f42825n = true;
            synchronized (f0Var.E) {
                try {
                    for (r5.i iVar : e0Var.f42821b.E) {
                        iVar.a();
                    }
                } finally {
                }
            }
            return;
        }
        f0 f0Var2 = e0Var.f42821b;
        f0Var2.F = 1;
        synchronized (f0Var2.E) {
            try {
            } catch (RemoteException e) {
                r5.c.f43378m.a(e, "Unable to call %s on %s.", "onConnectionFailed", r5.q.class.getSimpleName());
            } finally {
            }
            for (r5.i iVar2 : e0Var.f42821b.E) {
                r5.q qVar = iVar2.f43395a.e;
                if (qVar != null) {
                    y5.a aVar = new y5.a(i10);
                    r5.o oVar = (r5.o) qVar;
                    Parcel M0 = oVar.M0();
                    com.google.android.gms.internal.cast.t.c(M0, aVar);
                    oVar.Q0(M0, 3);
                }
            }
        }
        e0Var.f42821b.h();
    }

    @Override
    public final void run() {
        switch (this.f42815a) {
            case 0:
                a();
                return;
            case 1:
                b();
                return;
            case 2:
                this.f42816b.f42821b.D.b(this.f42817c);
                return;
            default:
                e0 e0Var = this.f42816b;
                f0 f0Var = e0Var.f42821b;
                f0Var.F = 3;
                int i10 = this.f42817c;
                synchronized (f0Var.E) {
                    try {
                        for (r5.i iVar : e0Var.f42821b.E) {
                            r5.q qVar = iVar.f43395a.e;
                            if (qVar != null) {
                                try {
                                    r5.o oVar = (r5.o) qVar;
                                    Parcel M0 = oVar.M0();
                                    M0.writeInt(i10);
                                    oVar.Q0(M0, 2);
                                } catch (RemoteException e) {
                                    r5.c.f43378m.a(e, "Unable to call %s on %s.", "onConnectionSuspended", r5.q.class.getSimpleName());
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
