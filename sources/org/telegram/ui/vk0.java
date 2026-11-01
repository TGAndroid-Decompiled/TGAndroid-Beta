package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
public final class vk0 implements Runnable {
    public final int f42561a;
    public final wk0 f42562b;
    public final TLRPC.TL_error f42563c;
    public final TLObject d;

    public vk0(wk0 wk0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f42561a = 0;
        this.f42562b = wk0Var;
        this.d = tLObject;
        this.f42563c = tL_error;
    }

    @Override
    public final void run() {
        switch (this.f42561a) {
            case 0:
                wk0 wk0Var = this.f42562b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.f42563c;
                jl0 jl0Var = wk0Var.e;
                if (tLObject instanceof Vector) {
                    jl0Var.D = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        jl0Var.D.values.add((TLRPC.TL_secureValue) vector.objects.get(i10));
                    }
                    wk0Var.a();
                    return;
                }
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    org.telegram.ui.Components.s4.w0(jl0Var.getParentActivity(), org.telegram.messenger.dd.L0(2131743846, null), true);
                } else {
                    jl0Var.Q1(org.telegram.messenger.dd.L0(2131689472, null), tL_error.text);
                }
                jl0Var.R1(true, false);
                return;
            case 1:
                wk0 wk0Var2 = this.f42562b;
                TLRPC.TL_error tL_error2 = this.f42563c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    wk0Var2.e.J = password;
                    TwoStepVerificationActivity.r0(password);
                    wk0Var2.b();
                    return;
                }
                wk0Var2.getClass();
                return;
            default:
                wk0 wk0Var3 = this.f42562b;
                TLRPC.TL_error tL_error3 = this.f42563c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    wk0Var3.e.J = password2;
                    TwoStepVerificationActivity.r0(password2);
                    Utilities.e.c(new pd0(wk0Var3, wk0Var3.f43126b, wk0Var3.d, 15));
                    return;
                }
                return;
        }
    }

    public vk0(wk0 wk0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.f42561a = i10;
        this.f42562b = wk0Var;
        this.f42563c = tL_error;
        this.d = tLObject;
    }
}
