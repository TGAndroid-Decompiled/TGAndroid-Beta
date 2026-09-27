package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
public final class um0 implements Runnable {
    public final int f38280a;
    public final vm0 f38281b;
    public final TLRPC.TL_error f38282c;
    public final TLObject d;

    public um0(vm0 vm0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f38280a = 0;
        this.f38281b = vm0Var;
        this.d = tLObject;
        this.f38282c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f38280a) {
            case 0:
                vm0 vm0Var = this.f38281b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.f38282c;
                jn0 jn0Var = vm0Var.e;
                if (tLObject instanceof Vector) {
                    jn0Var.f34822y = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        jn0Var.f34822y.values.add((TLRPC.TL_secureValue) vector.objects.get(i10));
                    }
                    vm0Var.a();
                    return;
                }
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    org.telegram.ui.Components.e5.x0(jn0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                } else {
                    jn0Var.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                }
                jn0Var.N1(true, false);
                return;
            case 1:
                vm0 vm0Var2 = this.f38281b;
                TLRPC.TL_error tL_error2 = this.f38282c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    vm0Var2.e.J = password;
                    TwoStepVerificationActivity.m0(password);
                    vm0Var2.b();
                    return;
                }
                vm0Var2.getClass();
                return;
            default:
                vm0 vm0Var3 = this.f38281b;
                TLRPC.TL_error tL_error3 = this.f38282c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    vm0Var3.e.J = password2;
                    TwoStepVerificationActivity.m0(password2);
                    Utilities.globalQueue.postRunnable(new mf0(vm0Var3, vm0Var3.f38641b, vm0Var3.d, 12));
                    return;
                }
                return;
        }
    }

    public um0(vm0 vm0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f38280a = i10;
        this.f38281b = vm0Var;
        this.f38282c = tL_error;
        this.d = tLObject;
    }
}
