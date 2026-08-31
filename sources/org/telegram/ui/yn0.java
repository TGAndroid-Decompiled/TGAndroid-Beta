package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class yn0 implements jo0 {
    public final Runnable f43667a;
    public final lo0 f43668b;

    public yn0(lo0 lo0Var, Runnable runnable) {
        this.f43668b = lo0Var;
        this.f43667a = runnable;
    }

    @Override
    public final boolean c(String str, String str2, boolean z4, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        String str3;
        lo0 lo0Var = this.f43668b;
        lo0Var.f38826v0 = tL_paymentSavedCredentialsCard;
        lo0Var.f38824t0 = str;
        lo0Var.R0 = z4;
        lo0Var.f38825u0 = str2;
        lo0Var.G0 = tL_inputPaymentCredentialsGooglePay;
        org.telegram.ui.Cells.z8[] z8VarArr = lo0Var.V;
        org.telegram.ui.Cells.z8 z8Var = z8VarArr[0];
        if (z8Var != null) {
            z8Var.setVisibility(0);
            org.telegram.ui.Cells.z8 z8Var2 = z8VarArr[0];
            String str4 = lo0Var.f38825u0;
            if (str4 != null && str4.length() > 1) {
                str3 = lo0Var.f38825u0.substring(0, 1).toUpperCase() + lo0Var.f38825u0.substring(1);
            } else {
                str3 = lo0Var.f38825u0;
            }
            z8Var2.b(R.drawable.msg_payment_card, str3, LocaleController.getString(R.string.PaymentCheckoutMethod), true);
            org.telegram.ui.Cells.z8 z8Var3 = z8VarArr[1];
            if (z8Var3 != null) {
                z8Var3.setVisibility(0);
            }
        }
        Runnable runnable = this.f43667a;
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
