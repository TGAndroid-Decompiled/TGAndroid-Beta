package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
public final class ym0 implements Runnable {
    public final int f44373a;
    public final zm0 f44374b;
    public final TLRPC.TL_error f44375c;
    public final TLObject d;

    public ym0(zm0 zm0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f44373a = 0;
        this.f44374b = zm0Var;
        this.d = tLObject;
        this.f44375c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f44373a) {
            case 0:
                zm0 zm0Var = this.f44374b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.f44375c;
                nn0 nn0Var = zm0Var.f44699e;
                if (tLObject instanceof Vector) {
                    nn0Var.f40296y = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        nn0Var.f40296y.values.add((TLRPC.TL_secureValue) vector.objects.get(i10));
                    }
                    zm0Var.a();
                    return;
                }
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    org.telegram.ui.Components.g5.w0(nn0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                } else {
                    nn0Var.L1(LocaleController.getString(R.string.AppName), tL_error.text);
                }
                nn0Var.M1(true, false);
                return;
            case 1:
                zm0 zm0Var2 = this.f44374b;
                TLRPC.TL_error tL_error2 = this.f44375c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    zm0Var2.f44699e.J = password;
                    TwoStepVerificationActivity.m0(password);
                    zm0Var2.b();
                    return;
                }
                zm0Var2.getClass();
                return;
            default:
                zm0 zm0Var3 = this.f44374b;
                TLRPC.TL_error tL_error3 = this.f44375c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    zm0Var3.f44699e.J = password2;
                    TwoStepVerificationActivity.m0(password2);
                    Utilities.globalQueue.postRunnable(new of0(zm0Var3, zm0Var3.f44697b, zm0Var3.d, 12));
                    return;
                }
                return;
        }
    }

    public ym0(zm0 zm0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f44373a = i10;
        this.f44374b = zm0Var;
        this.f44375c = tL_error;
        this.d = tLObject;
    }
}
