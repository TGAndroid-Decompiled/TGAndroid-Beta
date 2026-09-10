package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
public final class zm0 implements Runnable {
    public final int f39412a;
    public final an0 f39413b;
    public final TLRPC.TL_error f39414c;
    public final TLObject d;

    public zm0(an0 an0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f39412a = 0;
        this.f39413b = an0Var;
        this.d = tLObject;
        this.f39414c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f39412a) {
            case 0:
                an0 an0Var = this.f39413b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.f39414c;
                on0 on0Var = an0Var.e;
                if (tLObject instanceof Vector) {
                    on0Var.f35572y = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        on0Var.f35572y.values.add((TLRPC.TL_secureValue) vector.objects.get(i10));
                    }
                    an0Var.a();
                    return;
                }
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    org.telegram.ui.Components.d5.x0(on0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                } else {
                    on0Var.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                }
                on0Var.N1(true, false);
                return;
            case 1:
                an0 an0Var2 = this.f39413b;
                TLRPC.TL_error tL_error2 = this.f39414c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    an0Var2.e.J = password;
                    TwoStepVerificationActivity.m0(password);
                    an0Var2.b();
                    return;
                }
                an0Var2.getClass();
                return;
            default:
                an0 an0Var3 = this.f39413b;
                TLRPC.TL_error tL_error3 = this.f39414c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    an0Var3.e.J = password2;
                    TwoStepVerificationActivity.m0(password2);
                    Utilities.globalQueue.postRunnable(new pf0(an0Var3, an0Var3.f31042b, an0Var3.d, 12));
                    return;
                }
                return;
        }
    }

    public zm0(an0 an0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f39412a = i10;
        this.f39413b = an0Var;
        this.f39414c = tL_error;
        this.d = tLObject;
    }
}
