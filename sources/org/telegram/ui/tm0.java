package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
public final class tm0 implements Runnable {
    public final int f43872a;
    public final um0 f43873b;
    public final TLRPC.TL_error f43874c;
    public final TLObject d;

    public tm0(um0 um0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f43872a = 0;
        this.f43873b = um0Var;
        this.d = tLObject;
        this.f43874c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f43872a) {
            case 0:
                um0 um0Var = this.f43873b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.f43874c;
                in0 in0Var = um0Var.e;
                if (tLObject instanceof Vector) {
                    in0Var.f40327y = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        in0Var.f40327y.values.add((TLRPC.TL_secureValue) vector.objects.get(i10));
                    }
                    um0Var.a();
                    return;
                }
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    org.telegram.ui.Components.g5.w0(in0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                } else {
                    in0Var.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                }
                in0Var.N1(true, false);
                return;
            case 1:
                um0 um0Var2 = this.f43873b;
                TLRPC.TL_error tL_error2 = this.f43874c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    um0Var2.e.J = password;
                    TwoStepVerificationActivity.n0(password);
                    um0Var2.b();
                    return;
                }
                um0Var2.getClass();
                return;
            default:
                um0 um0Var3 = this.f43873b;
                TLRPC.TL_error tL_error3 = this.f43874c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    um0Var3.e.J = password2;
                    TwoStepVerificationActivity.n0(password2);
                    Utilities.globalQueue.postRunnable(new oe0(um0Var3, um0Var3.f44169b, um0Var3.d, 15));
                    return;
                }
                return;
        }
    }

    public tm0(um0 um0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f43872a = i10;
        this.f43873b = um0Var;
        this.f43874c = tL_error;
        this.d = tLObject;
    }
}
