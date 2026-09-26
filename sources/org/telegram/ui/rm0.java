package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
public final class rm0 implements Runnable {
    public final int f37381a;
    public final sm0 f37382b;
    public final TLRPC.TL_error f37383c;
    public final TLObject d;

    public rm0(sm0 sm0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f37381a = 0;
        this.f37382b = sm0Var;
        this.d = tLObject;
        this.f37383c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f37381a) {
            case 0:
                sm0 sm0Var = this.f37382b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.f37383c;
                gn0 gn0Var = sm0Var.e;
                if (tLObject instanceof Vector) {
                    gn0Var.f34023y = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        gn0Var.f34023y.values.add((TLRPC.TL_secureValue) vector.objects.get(i10));
                    }
                    sm0Var.a();
                    return;
                }
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    org.telegram.ui.Components.e5.x0(gn0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                } else {
                    gn0Var.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                }
                gn0Var.N1(true, false);
                return;
            case 1:
                sm0 sm0Var2 = this.f37382b;
                TLRPC.TL_error tL_error2 = this.f37383c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    sm0Var2.e.J = password;
                    TwoStepVerificationActivity.m0(password);
                    sm0Var2.b();
                    return;
                }
                sm0Var2.getClass();
                return;
            default:
                sm0 sm0Var3 = this.f37382b;
                TLRPC.TL_error tL_error3 = this.f37383c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    sm0Var3.e.J = password2;
                    TwoStepVerificationActivity.m0(password2);
                    Utilities.globalQueue.postRunnable(new jf0(sm0Var3, sm0Var3.f37827b, sm0Var3.d, 12));
                    return;
                }
                return;
        }
    }

    public rm0(sm0 sm0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f37381a = i10;
        this.f37382b = sm0Var;
        this.f37383c = tL_error;
        this.d = tLObject;
    }
}
