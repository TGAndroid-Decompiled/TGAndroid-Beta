package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
public final class rj0 implements Runnable {
    public final int f50961a;
    public final sj0 f50962b;
    public final TLRPC.TL_error f50963c;
    public final TLObject d;

    public rj0(sj0 sj0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f50961a = 0;
        this.f50962b = sj0Var;
        this.d = tLObject;
        this.f50963c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f50961a) {
            case 0:
                sj0 sj0Var = this.f50962b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.f50963c;
                ek0 ek0Var = sj0Var.f51237e;
                if (tLObject instanceof Vector) {
                    ek0Var.E = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        ek0Var.E.values.add((TLRPC.TL_secureValue) vector.objects.get(i7));
                    }
                    sj0Var.a();
                    return;
                }
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    org.telegram.ui.Components.t4.u0(ek0Var.getParentActivity(), org.telegram.messenger.hd.M0(2131743820, null), true);
                } else {
                    ek0Var.Q1(org.telegram.messenger.hd.M0(2131689472, null), tL_error.text);
                }
                ek0Var.R1(true, false);
                return;
            case 1:
                sj0 sj0Var2 = this.f50962b;
                TLRPC.TL_error tL_error2 = this.f50963c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    sj0Var2.f51237e.K = password;
                    TwoStepVerificationActivity.r0(password);
                    sj0Var2.b();
                    return;
                }
                sj0Var2.getClass();
                return;
            default:
                sj0 sj0Var3 = this.f50962b;
                TLRPC.TL_error tL_error3 = this.f50963c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    sj0Var3.f51237e.K = password2;
                    TwoStepVerificationActivity.r0(password2);
                    Utilities.f22416e.c(new lc0(sj0Var3, sj0Var3.f51235b, sj0Var3.d, 14));
                    return;
                }
                return;
        }
    }

    public rj0(sj0 sj0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7) {
        this.f50961a = i7;
        this.f50962b = sj0Var;
        this.f50963c = tL_error;
        this.d = tLObject;
    }
}
