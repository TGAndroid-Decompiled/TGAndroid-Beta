package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
public final class uj0 implements Runnable {
    public final int f52570a;
    public final vj0 f52571b;
    public final TLRPC.TL_error f52572c;
    public final TLObject d;

    public uj0(vj0 vj0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f52570a = 0;
        this.f52571b = vj0Var;
        this.d = tLObject;
        this.f52572c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f52570a) {
            case 0:
                vj0 vj0Var = this.f52571b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.f52572c;
                hk0 hk0Var = vj0Var.f52795e;
                if (tLObject instanceof Vector) {
                    hk0Var.E = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        hk0Var.E.values.add((TLRPC.TL_secureValue) vector.objects.get(i7));
                    }
                    vj0Var.a();
                    return;
                }
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    org.telegram.ui.Components.b5.u0(hk0Var.getParentActivity(), org.telegram.messenger.gd.M0(2131743583, null), true);
                } else {
                    hk0Var.Q1(org.telegram.messenger.gd.M0(2131689472, null), tL_error.text);
                }
                hk0Var.R1(true, false);
                return;
            case 1:
                vj0 vj0Var2 = this.f52571b;
                TLRPC.TL_error tL_error2 = this.f52572c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    vj0Var2.f52795e.K = password;
                    TwoStepVerificationActivity.r0(password);
                    vj0Var2.b();
                    return;
                }
                vj0Var2.getClass();
                return;
            default:
                vj0 vj0Var3 = this.f52571b;
                TLRPC.TL_error tL_error3 = this.f52572c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    vj0Var3.f52795e.K = password2;
                    TwoStepVerificationActivity.r0(password2);
                    Utilities.f22779e.c(new mc0(vj0Var3, vj0Var3.f52793b, vj0Var3.d, 14));
                    return;
                }
                return;
        }
    }

    public uj0(vj0 vj0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7) {
        this.f52570a = i7;
        this.f52571b = vj0Var;
        this.f52572c = tL_error;
        this.d = tLObject;
    }
}
