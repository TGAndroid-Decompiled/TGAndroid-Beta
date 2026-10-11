package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
public final class xm0 implements Runnable {
    public final int f44142a;
    public final ym0 f44143b;
    public final TLRPC.TL_error f44144c;
    public final TLObject d;

    public xm0(ym0 ym0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f44142a = 0;
        this.f44143b = ym0Var;
        this.d = tLObject;
        this.f44144c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f44142a) {
            case 0:
                ym0 ym0Var = this.f44143b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.f44144c;
                mn0 mn0Var = ym0Var.f44493e;
                if (tLObject instanceof Vector) {
                    mn0Var.f40072y = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        mn0Var.f40072y.values.add((TLRPC.TL_secureValue) vector.objects.get(i10));
                    }
                    ym0Var.a();
                    return;
                }
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    org.telegram.ui.Components.g5.w0(mn0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                } else {
                    mn0Var.L1(LocaleController.getString(R.string.AppName), tL_error.text);
                }
                mn0Var.M1(true, false);
                return;
            case 1:
                ym0 ym0Var2 = this.f44143b;
                TLRPC.TL_error tL_error2 = this.f44144c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    ym0Var2.f44493e.J = password;
                    TwoStepVerificationActivity.m0(password);
                    ym0Var2.b();
                    return;
                }
                ym0Var2.getClass();
                return;
            default:
                ym0 ym0Var3 = this.f44143b;
                TLRPC.TL_error tL_error3 = this.f44144c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    ym0Var3.f44493e.J = password2;
                    TwoStepVerificationActivity.m0(password2);
                    Utilities.globalQueue.postRunnable(new nf0(ym0Var3, ym0Var3.f44491b, ym0Var3.d, 12));
                    return;
                }
                return;
        }
    }

    public xm0(ym0 ym0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f44142a = i10;
        this.f44143b = ym0Var;
        this.f44144c = tL_error;
        this.d = tLObject;
    }
}
