package p4;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import c8.cb;
public final class b0 extends Handler {
    public boolean f54588a;
    public boolean f54589b;
    public final d0 f54590c;

    public b0(d0 d0Var, Looper looper) {
        super(looper);
        this.f54590c = d0Var;
        this.f54588a = true;
        this.f54589b = true;
    }

    public final void a(boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = false;
        if (this.f54588a && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f54588a = z12;
        if (this.f54589b && z11) {
            z13 = true;
        }
        this.f54589b = z13;
        if (!hasMessages(1)) {
            sendEmptyMessage(1);
        }
    }

    @Override
    public final void handleMessage(Message message) {
        v vVar;
        int i7;
        e1 e1Var;
        d0 d0Var = this.f54590c;
        c1 c1Var = d0Var.f54623g;
        if (message.what == 1) {
            e1 c10 = d0Var.f54634s.c(d0Var.f54635t.T0(), d0Var.f54635t.R0(), d0Var.f54634s.f54670k);
            d0Var.f54634s = c10;
            boolean z10 = this.f54588a;
            boolean z11 = this.f54589b;
            e1 A1 = c1Var.A1(c10);
            ab.c0 c0Var = c1Var.f54601b;
            h9.i0 o4 = c0Var.o();
            for (int i10 = 0; i10 < o4.size(); i10++) {
                v vVar2 = (v) o4.get(i10);
                try {
                    com.google.android.gms.common.api.internal.t u10 = c0Var.u(vVar2);
                    if (u10 != null) {
                        i7 = u10.e();
                    } else if (!d0Var.h(vVar2)) {
                        break;
                    } else {
                        i7 = 0;
                    }
                    e1 t6 = c0Var.t(vVar2);
                    if (t6 == null) {
                        c0Var.s(vVar2);
                        e2.y0 a10 = cb.a(c0Var.n(vVar2), d0Var.f54635t.t());
                        try {
                            u uVar = vVar2.d;
                            uVar.getClass();
                            if (t6 == null) {
                                vVar = vVar2;
                                e1Var = A1;
                            } else {
                                vVar = vVar2;
                                e1Var = t6;
                            }
                            try {
                                uVar.a(i7, e1Var, a10, z10, z11);
                            } catch (DeadObjectException unused) {
                                c1Var.f54601b.H(vVar);
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
            this.f54588a = true;
            this.f54589b = true;
            return;
        }
        throw new IllegalStateException("Invalid message what=" + message.what);
    }
}
