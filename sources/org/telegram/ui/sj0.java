package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
public final class sj0 implements Runnable {
    public final int f52095a;
    public final tj0 f52096b;
    public final TLRPC.TL_error f52097c;
    public final TLObject d;

    public sj0(tj0 tj0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f52095a = 0;
        this.f52096b = tj0Var;
        this.d = tLObject;
        this.f52097c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f52095a) {
            case 0:
                tj0 tj0Var = this.f52096b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.f52097c;
                fk0 fk0Var = tj0Var.f52419e;
                if (tLObject instanceof Vector) {
                    fk0Var.E = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        fk0Var.E.values.add((TLRPC.TL_secureValue) vector.objects.get(i7));
                    }
                    tj0Var.a();
                    return;
                }
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    org.telegram.ui.Components.b5.u0(fk0Var.getParentActivity(), org.telegram.messenger.gd.N0(2131743573, null), true);
                } else {
                    fk0Var.Q1(org.telegram.messenger.gd.N0(2131689472, null), tL_error.text);
                }
                fk0Var.R1(true, false);
                return;
            case 1:
                tj0 tj0Var2 = this.f52096b;
                TLRPC.TL_error tL_error2 = this.f52097c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    tj0Var2.f52419e.K = password;
                    TwoStepVerificationActivity.r0(password);
                    tj0Var2.b();
                    return;
                }
                tj0Var2.getClass();
                return;
            default:
                tj0 tj0Var3 = this.f52096b;
                TLRPC.TL_error tL_error3 = this.f52097c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    tj0Var3.f52419e.K = password2;
                    TwoStepVerificationActivity.r0(password2);
                    Utilities.f22877e.c(new lc0(tj0Var3, tj0Var3.f52417b, tj0Var3.d, 14));
                    return;
                }
                return;
        }
    }

    public sj0(tj0 tj0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7) {
        this.f52095a = i7;
        this.f52096b = tj0Var;
        this.f52097c = tL_error;
        this.d = tLObject;
    }
}
