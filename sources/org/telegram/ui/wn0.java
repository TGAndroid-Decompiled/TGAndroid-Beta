package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class wn0 implements ho0 {
    public final Runnable f39773a;
    public final jo0 f39774b;

    public wn0(jo0 jo0Var, Runnable runnable) {
        this.f39774b = jo0Var;
        this.f39773a = runnable;
    }

    @Override
    public final boolean c(String str, String str2, boolean z4, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        String str3;
        jo0 jo0Var = this.f39774b;
        jo0Var.f35418v0 = tL_paymentSavedCredentialsCard;
        jo0Var.f35416t0 = str;
        jo0Var.R0 = z4;
        jo0Var.f35417u0 = str2;
        jo0Var.G0 = tL_inputPaymentCredentialsGooglePay;
        org.telegram.ui.Cells.z8[] z8VarArr = jo0Var.V;
        org.telegram.ui.Cells.z8 z8Var = z8VarArr[0];
        if (z8Var != null) {
            z8Var.setVisibility(0);
            org.telegram.ui.Cells.z8 z8Var2 = z8VarArr[0];
            String str4 = jo0Var.f35417u0;
            if (str4 != null && str4.length() > 1) {
                str3 = jo0Var.f35417u0.substring(0, 1).toUpperCase() + jo0Var.f35417u0.substring(1);
            } else {
                str3 = jo0Var.f35417u0;
            }
            z8Var2.b(R.drawable.msg_payment_card, str3, LocaleController.getString(R.string.PaymentCheckoutMethod), true);
            org.telegram.ui.Cells.z8 z8Var3 = z8VarArr[1];
            if (z8Var3 != null) {
                z8Var3.setVisibility(0);
            }
        }
        Runnable runnable = this.f39773a;
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
