package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class xk0 implements fl0 {
    public final Runnable f51901a;
    public final hl0 f51902b;

    public xk0(hl0 hl0Var, Runnable runnable) {
        this.f51902b = hl0Var;
        this.f51901a = runnable;
    }

    @Override
    public final boolean c(String str, String str2, boolean z9, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        String str3;
        hl0 hl0Var = this.f51902b;
        hl0Var.f46446y0 = tL_paymentSavedCredentialsCard;
        hl0Var.f46442w0 = str;
        hl0Var.U0 = z9;
        hl0Var.f46444x0 = str2;
        hl0Var.J0 = tL_inputPaymentCredentialsGooglePay;
        org.telegram.ui.Cells.y8[] y8VarArr = hl0Var.Y;
        org.telegram.ui.Cells.y8 y8Var = y8VarArr[0];
        if (y8Var != null) {
            y8Var.setVisibility(0);
            org.telegram.ui.Cells.y8 y8Var2 = y8VarArr[0];
            String str4 = hl0Var.f46444x0;
            if (str4 != null && str4.length() > 1) {
                str3 = hl0Var.f46444x0.substring(0, 1).toUpperCase() + hl0Var.f46444x0.substring(1);
            } else {
                str3 = hl0Var.f46444x0;
            }
            y8Var2.b(2131232273, str3, org.telegram.messenger.hd.M0(2131747413, null), true);
            org.telegram.ui.Cells.y8 y8Var3 = y8VarArr[1];
            if (y8Var3 != null) {
                y8Var3.setVisibility(0);
            }
        }
        Runnable runnable = this.f51901a;
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
