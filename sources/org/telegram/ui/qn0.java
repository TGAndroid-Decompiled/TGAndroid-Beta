package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public final class qn0 implements bo0 {

    public final Runnable f41712a;

    public final do0 f41713b;

    public qn0(do0 do0Var, Runnable runnable) {
        this.f41713b = do0Var;
        this.f41712a = runnable;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        String str3;
        do0 do0Var = this.f41713b;
        do0Var.f37480u0 = tL_paymentSavedCredentialsCard;
        do0Var.f37478s0 = str;
        do0Var.Q0 = z10;
        do0Var.f37479t0 = str2;
        do0Var.F0 = tL_inputPaymentCredentialsGooglePay;
        org.telegram.ui.Cells.w8[] w8VarArr = do0Var.U;
        org.telegram.ui.Cells.w8 w8Var = w8VarArr[0];
        if (w8Var != null) {
            w8Var.setVisibility(0);
            org.telegram.ui.Cells.w8 w8Var2 = w8VarArr[0];
            String str4 = do0Var.f37479t0;
            if (str4 == null || str4.length() <= 1) {
                str3 = do0Var.f37479t0;
            } else {
                str3 = do0Var.f37479t0.substring(0, 1).toUpperCase() + do0Var.f37479t0.substring(1);
            }
            w8Var2.b(R.drawable.msg_payment_card, str3, LocaleController.getString(R.string.PaymentCheckoutMethod), true);
            org.telegram.ui.Cells.w8 w8Var3 = w8VarArr[1];
            if (w8Var3 != null) {
                w8Var3.setVisibility(0);
            }
        }
        Runnable runnable = this.f41712a;
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
