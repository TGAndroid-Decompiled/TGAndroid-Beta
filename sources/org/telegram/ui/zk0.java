package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class zk0 implements hl0 {
    public final Runnable f52589a;
    public final jl0 f52590b;

    public zk0(jl0 jl0Var, Runnable runnable) {
        this.f52590b = jl0Var;
        this.f52589a = runnable;
    }

    @Override
    public final boolean c(String str, String str2, boolean z9, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        String str3;
        jl0 jl0Var = this.f52590b;
        jl0Var.f47033y0 = tL_paymentSavedCredentialsCard;
        jl0Var.f47029w0 = str;
        jl0Var.U0 = z9;
        jl0Var.f47031x0 = str2;
        jl0Var.J0 = tL_inputPaymentCredentialsGooglePay;
        org.telegram.ui.Cells.y8[] y8VarArr = jl0Var.Y;
        org.telegram.ui.Cells.y8 y8Var = y8VarArr[0];
        if (y8Var != null) {
            y8Var.setVisibility(0);
            org.telegram.ui.Cells.y8 y8Var2 = y8VarArr[0];
            String str4 = jl0Var.f47031x0;
            if (str4 != null && str4.length() > 1) {
                str3 = jl0Var.f47031x0.substring(0, 1).toUpperCase() + jl0Var.f47031x0.substring(1);
            } else {
                str3 = jl0Var.f47031x0;
            }
            y8Var2.b(2131232273, str3, org.telegram.messenger.id.M0(2131747414, null), true);
            org.telegram.ui.Cells.y8 y8Var3 = y8VarArr[1];
            if (y8Var3 != null) {
                y8Var3.setVisibility(0);
            }
        }
        Runnable runnable = this.f52589a;
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
