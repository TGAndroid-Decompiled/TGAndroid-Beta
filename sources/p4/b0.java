package p4;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import c8.kb;
public final class b0 extends Handler {
    public boolean f55283a;
    public boolean f55284b;
    public final d0 f55285c;

    public b0(d0 d0Var, Looper looper) {
        super(looper);
        this.f55285c = d0Var;
        this.f55283a = true;
        this.f55284b = true;
    }

    public final void a(boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = false;
        if (this.f55283a && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f55283a = z12;
        if (this.f55284b && z11) {
            z13 = true;
        }
        this.f55284b = z13;
        if (!hasMessages(1)) {
            sendEmptyMessage(1);
        }
    }

    @Override
    public final void handleMessage(Message message) {
        v vVar;
        int i7;
        f1 f1Var;
        d0 d0Var = this.f55285c;
        d1 d1Var = d0Var.f55312g;
        if (message.what == 1) {
            f1 c10 = d0Var.f55323s.c(d0Var.f55324t.T0(), d0Var.f55324t.R0(), d0Var.f55323s.f55370k);
            d0Var.f55323s = c10;
            boolean z10 = this.f55283a;
            boolean z11 = this.f55284b;
            f1 A1 = d1Var.A1(c10);
            ab.c0 c0Var = d1Var.f55331b;
            h9.i0 s5 = c0Var.s();
            for (int i10 = 0; i10 < s5.size(); i10++) {
                v vVar2 = (v) s5.get(i10);
                try {
                    com.google.android.gms.common.api.internal.t y10 = c0Var.y(vVar2);
                    if (y10 != null) {
                        i7 = y10.e();
                    } else if (!d0Var.h(vVar2)) {
                        break;
                    } else {
                        i7 = 0;
                    }
                    f1 x10 = c0Var.x(vVar2);
                    if (x10 == null) {
                        c0Var.w(vVar2);
                        e2.y0 a10 = kb.a(c0Var.p(vVar2), d0Var.f55324t.u());
                        try {
                            u uVar = vVar2.d;
                            uVar.getClass();
                            if (x10 == null) {
                                vVar = vVar2;
                                f1Var = A1;
                            } else {
                                vVar = vVar2;
                                f1Var = x10;
                            }
                            try {
                                uVar.a(i7, f1Var, a10, z10, z11);
                            } catch (DeadObjectException unused) {
                                d1Var.f55331b.K(vVar);
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
            this.f55283a = true;
            this.f55284b = true;
            return;
        }
        throw new IllegalStateException("Invalid message what=" + message.what);
    }
}
