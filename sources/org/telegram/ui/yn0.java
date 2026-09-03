package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class yn0 implements jo0 {
    public final Runnable f40310a;
    public final lo0 f40311b;

    public yn0(lo0 lo0Var, Runnable runnable) {
        this.f40311b = lo0Var;
        this.f40310a = runnable;
    }

    @Override
    public final boolean c(String str, String str2, boolean z4, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        String str3;
        lo0 lo0Var = this.f40311b;
        lo0Var.f35845v0 = tL_paymentSavedCredentialsCard;
        lo0Var.f35843t0 = str;
        lo0Var.R0 = z4;
        lo0Var.f35844u0 = str2;
        lo0Var.G0 = tL_inputPaymentCredentialsGooglePay;
        org.telegram.ui.Cells.y8[] y8VarArr = lo0Var.V;
        org.telegram.ui.Cells.y8 y8Var = y8VarArr[0];
        if (y8Var != null) {
            y8Var.setVisibility(0);
            org.telegram.ui.Cells.y8 y8Var2 = y8VarArr[0];
            String str4 = lo0Var.f35844u0;
            if (str4 != null && str4.length() > 1) {
                str3 = lo0Var.f35844u0.substring(0, 1).toUpperCase() + lo0Var.f35844u0.substring(1);
            } else {
                str3 = lo0Var.f35844u0;
            }
            y8Var2.b(R.drawable.msg_payment_card, str3, LocaleController.getString(R.string.PaymentCheckoutMethod), true);
            org.telegram.ui.Cells.y8 y8Var3 = y8VarArr[1];
            if (y8Var3 != null) {
                y8Var3.setVisibility(0);
            }
        }
        Runnable runnable = this.f40310a;
        if (runnable != null) {
            runnable.run();
        }
        return false;
    }

    @Override
    public final void a(TL_account.Password password) {
    }

    @Override
    public final void b() {
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
