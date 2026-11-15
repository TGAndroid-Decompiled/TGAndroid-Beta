package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class zk0 implements hl0 {
    public final Runnable f53983a;
    public final jl0 f53984b;

    public zk0(jl0 jl0Var, Runnable runnable) {
        this.f53984b = jl0Var;
        this.f53983a = runnable;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        String str3;
        jl0 jl0Var = this.f53984b;
        jl0Var.f48424z0 = tL_paymentSavedCredentialsCard;
        jl0Var.f48421x0 = str;
        jl0Var.V0 = z10;
        jl0Var.f48423y0 = str2;
        jl0Var.K0 = tL_inputPaymentCredentialsGooglePay;
        org.telegram.ui.Cells.x8[] x8VarArr = jl0Var.Z;
        org.telegram.ui.Cells.x8 x8Var = x8VarArr[0];
        if (x8Var != null) {
            x8Var.setVisibility(0);
            org.telegram.ui.Cells.x8 x8Var2 = x8VarArr[0];
            String str4 = jl0Var.f48423y0;
            if (str4 != null && str4.length() > 1) {
                str3 = jl0Var.f48423y0.substring(0, 1).toUpperCase() + jl0Var.f48423y0.substring(1);
            } else {
                str3 = jl0Var.f48423y0;
            }
            x8Var2.b(2131232274, str3, org.telegram.messenger.hd.M0(2131747414, null), true);
            org.telegram.ui.Cells.x8 x8Var3 = x8VarArr[1];
            if (x8Var3 != null) {
                x8Var3.setVisibility(0);
            }
        }
        Runnable runnable = this.f53983a;
        if (runnable != null) {
            runnable.run();
        }
        return false;
    }

    @Override
    public final void a(TL_account.Password password) {
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }

    @Override
    public final void b() {
    }
}
