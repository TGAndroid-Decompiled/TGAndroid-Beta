package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
public final class vm0 implements Runnable {
    public final int f44384a;
    public final wm0 f44385b;
    public final TLRPC.TL_error f44386c;
    public final TLObject d;

    public vm0(wm0 wm0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f44384a = 0;
        this.f44385b = wm0Var;
        this.d = tLObject;
        this.f44386c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f44384a) {
            case 0:
                wm0 wm0Var = this.f44385b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.f44386c;
                kn0 kn0Var = wm0Var.e;
                if (tLObject instanceof Vector) {
                    kn0Var.f40890y = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        kn0Var.f40890y.values.add((TLRPC.TL_secureValue) vector.objects.get(i10));
                    }
                    wm0Var.a();
                    return;
                }
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    org.telegram.ui.Components.g5.w0(kn0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                } else {
                    kn0Var.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                }
                kn0Var.N1(true, false);
                return;
            case 1:
                wm0 wm0Var2 = this.f44385b;
                TLRPC.TL_error tL_error2 = this.f44386c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    wm0Var2.e.J = password;
                    TwoStepVerificationActivity.n0(password);
                    wm0Var2.b();
                    return;
                }
                wm0Var2.getClass();
                return;
            default:
                wm0 wm0Var3 = this.f44385b;
                TLRPC.TL_error tL_error3 = this.f44386c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    wm0Var3.e.J = password2;
                    TwoStepVerificationActivity.n0(password2);
                    Utilities.globalQueue.postRunnable(new ne0(wm0Var3, wm0Var3.f45033b, wm0Var3.d, 16));
                    return;
                }
                return;
        }
    }

    public vm0(wm0 wm0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f44384a = i10;
        this.f44385b = wm0Var;
        this.f44386c = tL_error;
        this.d = tLObject;
    }
}
