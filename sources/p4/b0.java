package p4;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import c8.ab;
public final class b0 extends Handler {
    public boolean f53171a;
    public boolean f53172b;
    public final d0 f53173c;

    public b0(d0 d0Var, Looper looper) {
        super(looper);
        this.f53173c = d0Var;
        this.f53171a = true;
        this.f53172b = true;
    }

    public final void a(boolean z9, boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (this.f53171a && z9) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f53171a = z11;
        if (this.f53172b && z10) {
            z12 = true;
        }
        this.f53172b = z12;
        if (!hasMessages(1)) {
            sendEmptyMessage(1);
        }
    }

    @Override
    public final void handleMessage(Message message) {
        v vVar;
        int i7;
        e1 e1Var;
        d0 d0Var = this.f53173c;
        c1 c1Var = d0Var.f53206g;
        if (message.what == 1) {
            e1 c10 = d0Var.f53217s.c(d0Var.f53218t.T0(), d0Var.f53218t.R0(), d0Var.f53217s.f53253k);
            d0Var.f53217s = c10;
            boolean z9 = this.f53171a;
            boolean z10 = this.f53172b;
            e1 A1 = c1Var.A1(c10);
            ui.e eVar = c1Var.f53184b;
            h9.i0 w10 = eVar.w();
            for (int i10 = 0; i10 < w10.size(); i10++) {
                v vVar2 = (v) w10.get(i10);
                try {
                    com.google.android.gms.common.api.internal.s C = eVar.C(vVar2);
                    if (C != null) {
                        i7 = C.e();
                    } else if (!d0Var.h(vVar2)) {
                        break;
                    } else {
                        i7 = 0;
                    }
                    e1 B = eVar.B(vVar2);
                    if (B == null) {
                        eVar.A(vVar2);
                        e2.y0 a10 = ab.a(eVar.u(vVar2), d0Var.f53218t.t());
                        try {
                            u uVar = vVar2.d;
                            uVar.getClass();
                            if (B == null) {
                                vVar = vVar2;
                                e1Var = A1;
                            } else {
                                vVar = vVar2;
                                e1Var = B;
                            }
                            try {
                                uVar.a(i7, e1Var, a10, z9, z10);
                            } catch (DeadObjectException unused) {
                                c1Var.f53184b.T(vVar);
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
            this.f53171a = true;
            this.f53172b = true;
            return;
        }
        throw new IllegalStateException("Invalid message what=" + message.what);
    }
}
