package p4;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import c8.jb;
public final class c0 extends Handler {
    public boolean f55211a;
    public boolean f55212b;
    public final e0 f55213c;

    public c0(e0 e0Var, Looper looper) {
        super(looper);
        this.f55213c = e0Var;
        this.f55211a = true;
        this.f55212b = true;
    }

    public final void a(boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = false;
        if (this.f55211a && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f55211a = z12;
        if (this.f55212b && z11) {
            z13 = true;
        }
        this.f55212b = z13;
        if (!hasMessages(1)) {
            sendEmptyMessage(1);
        }
    }

    @Override
    public final void handleMessage(Message message) {
        v vVar;
        int i7;
        g1 g1Var;
        e0 e0Var = this.f55213c;
        e1 e1Var = e0Var.f55237g;
        if (message.what == 1) {
            g1 c10 = e0Var.f55248s.c(e0Var.f55249t.T0(), e0Var.f55249t.R0(), e0Var.f55248s.f55292k);
            e0Var.f55248s = c10;
            boolean z10 = this.f55211a;
            boolean z11 = this.f55212b;
            g1 A1 = e1Var.A1(c10);
            ab.c0 c0Var = e1Var.f55256b;
            h9.i0 p10 = c0Var.p();
            for (int i10 = 0; i10 < p10.size(); i10++) {
                v vVar2 = (v) p10.get(i10);
                try {
                    com.google.android.gms.common.api.internal.t v = c0Var.v(vVar2);
                    if (v != null) {
                        i7 = v.e();
                    } else if (!e0Var.h(vVar2)) {
                        break;
                    } else {
                        i7 = 0;
                    }
                    g1 u10 = c0Var.u(vVar2);
                    if (u10 == null) {
                        c0Var.t(vVar2);
                        e2.y0 a10 = jb.a(c0Var.n(vVar2), e0Var.f55249t.t());
                        try {
                            u uVar = vVar2.d;
                            uVar.getClass();
                            if (u10 == null) {
                                vVar = vVar2;
                                g1Var = A1;
                            } else {
                                vVar = vVar2;
                                g1Var = u10;
                            }
                            try {
                                uVar.a(i7, g1Var, a10, z10, z11);
                            } catch (DeadObjectException unused) {
                                e1Var.f55256b.K(vVar);
                            } catch (RemoteException e10) {
                                e = e10;
                                h2.a.m("MediaSessionImpl", "Exception in " + vVar, e);
                            }
                        } catch (DeadObjectException unused2) {
                            vVar = vVar2;
                        } catch (RemoteException e11) {
                            e = e11;
                            vVar = vVar2;
                        }
                    }
                } catch (DeadObjectException unused3) {
                    vVar = vVar2;
                } catch (RemoteException e12) {
                    e = e12;
                    vVar = vVar2;
                }
            }
            this.f55211a = true;
            this.f55212b = true;
            return;
        }
        throw new IllegalStateException("Invalid message what=" + message.what);
    }
}
