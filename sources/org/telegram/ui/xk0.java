package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
public final class xk0 implements Runnable {
    public final int f43593a;
    public final yk0 f43594b;
    public final TLRPC.TL_error f43595c;
    public final TLObject d;

    public xk0(yk0 yk0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f43593a = 0;
        this.f43594b = yk0Var;
        this.d = tLObject;
        this.f43595c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f43593a) {
            case 0:
                yk0 yk0Var = this.f43594b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.f43595c;
                ll0 ll0Var = yk0Var.e;
                if (tLObject instanceof Vector) {
                    ll0Var.D = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ll0Var.D.values.add((TLRPC.TL_secureValue) vector.objects.get(i10));
                    }
                    yk0Var.a();
                    return;
                }
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    org.telegram.ui.Components.s4.w0(ll0Var.getParentActivity(), org.telegram.messenger.cd.L0(2131743846, null), true);
                } else {
                    ll0Var.P1(org.telegram.messenger.cd.L0(2131689472, null), tL_error.text);
                }
                ll0Var.Q1(true, false);
                return;
            case 1:
                yk0 yk0Var2 = this.f43594b;
                TLRPC.TL_error tL_error2 = this.f43595c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    yk0Var2.e.J = password;
                    TwoStepVerificationActivity.q0(password);
                    yk0Var2.b();
                    return;
                }
                yk0Var2.getClass();
                return;
            default:
                yk0 yk0Var3 = this.f43594b;
                TLRPC.TL_error tL_error3 = this.f43595c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    yk0Var3.e.J = password2;
                    TwoStepVerificationActivity.q0(password2);
                    Utilities.e.c(new qd0(yk0Var3, yk0Var3.f43859b, yk0Var3.d, 15));
                    return;
                }
                return;
        }
    }

    public xk0(yk0 yk0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f43593a = i10;
        this.f43594b = yk0Var;
        this.f43595c = tL_error;
        this.d = tLObject;
    }
}
