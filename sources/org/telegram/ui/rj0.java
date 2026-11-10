package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
public final class rj0 implements Runnable {
    public final int f49429a;
    public final sj0 f49430b;
    public final TLRPC.TL_error f49431c;
    public final TLObject d;

    public rj0(sj0 sj0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f49429a = 0;
        this.f49430b = sj0Var;
        this.d = tLObject;
        this.f49431c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f49429a) {
            case 0:
                sj0 sj0Var = this.f49430b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.f49431c;
                ek0 ek0Var = sj0Var.f49868e;
                if (tLObject instanceof Vector) {
                    ek0Var.D = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        ek0Var.D.values.add((TLRPC.TL_secureValue) vector.objects.get(i7));
                    }
                    sj0Var.a();
                    return;
                }
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    org.telegram.ui.Components.u4.u0(ek0Var.getParentActivity(), org.telegram.messenger.id.M0(2131743820, null), true);
                } else {
                    ek0Var.Q1(org.telegram.messenger.id.M0(2131689472, null), tL_error.text);
                }
                ek0Var.R1(true, false);
                return;
            case 1:
                sj0 sj0Var2 = this.f49430b;
                TLRPC.TL_error tL_error2 = this.f49431c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    sj0Var2.f49868e.J = password;
                    TwoStepVerificationActivity.r0(password);
                    sj0Var2.b();
                    return;
                }
                sj0Var2.getClass();
                return;
            default:
                sj0 sj0Var3 = this.f49430b;
                TLRPC.TL_error tL_error3 = this.f49431c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    sj0Var3.f49868e.J = password2;
                    TwoStepVerificationActivity.r0(password2);
                    Utilities.f21341e.c(new pc0(sj0Var3, sj0Var3.f49866b, sj0Var3.d, 14));
                    return;
                }
                return;
        }
    }

    public rj0(sj0 sj0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7) {
        this.f49429a = i7;
        this.f49430b = sj0Var;
        this.f49431c = tL_error;
        this.d = tLObject;
    }
}
