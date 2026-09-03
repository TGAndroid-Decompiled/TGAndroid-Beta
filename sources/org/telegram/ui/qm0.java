package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
public final class qm0 implements Runnable {
    public final int f37443a;
    public final rm0 f37444b;
    public final TLRPC.TL_error f37445c;
    public final TLObject d;

    public qm0(rm0 rm0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f37443a = 0;
        this.f37444b = rm0Var;
        this.d = tLObject;
        this.f37445c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f37443a) {
            case 0:
                rm0 rm0Var = this.f37444b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.f37445c;
                fn0 fn0Var = rm0Var.e;
                if (tLObject instanceof Vector) {
                    fn0Var.f34165y = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        fn0Var.f34165y.values.add((TLRPC.TL_secureValue) vector.objects.get(i10));
                    }
                    rm0Var.a();
                    return;
                }
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    org.telegram.ui.Components.z4.x0(fn0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                } else {
                    fn0Var.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                }
                fn0Var.N1(true, false);
                return;
            case 1:
                rm0 rm0Var2 = this.f37444b;
                TLRPC.TL_error tL_error2 = this.f37445c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    rm0Var2.e.G = password;
                    TwoStepVerificationActivity.m0(password);
                    rm0Var2.b();
                    return;
                }
                rm0Var2.getClass();
                return;
            default:
                rm0 rm0Var3 = this.f37444b;
                TLRPC.TL_error tL_error3 = this.f37445c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    rm0Var3.e.G = password2;
                    TwoStepVerificationActivity.m0(password2);
                    Utilities.globalQueue.postRunnable(new jf0(rm0Var3, rm0Var3.f37896b, rm0Var3.d, 12));
                    return;
                }
                return;
        }
    }

    public qm0(rm0 rm0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f37443a = i10;
        this.f37444b = rm0Var;
        this.f37445c = tL_error;
        this.d = tLObject;
    }
}
