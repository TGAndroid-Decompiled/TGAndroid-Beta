package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class rn0 implements do0 {
    public final Runnable f40773a;
    public final fo0 f40774b;

    public rn0(fo0 fo0Var, Runnable runnable) {
        this.f40774b = fo0Var;
        this.f40773a = runnable;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        String str3;
        fo0 fo0Var = this.f40774b;
        fo0Var.f37009y0 = tL_paymentSavedCredentialsCard;
        fo0Var.f37005w0 = str;
        fo0Var.U0 = z10;
        fo0Var.f37007x0 = str2;
        fo0Var.J0 = tL_inputPaymentCredentialsGooglePay;
        org.telegram.ui.Cells.c9[] c9VarArr = fo0Var.Y;
        org.telegram.ui.Cells.c9 c9Var = c9VarArr[0];
        if (c9Var != null) {
            c9Var.setVisibility(0);
            org.telegram.ui.Cells.c9 c9Var2 = c9VarArr[0];
            String str4 = fo0Var.f37007x0;
            if (str4 != null && str4.length() > 1) {
                str3 = fo0Var.f37007x0.substring(0, 1).toUpperCase() + fo0Var.f37007x0.substring(1);
            } else {
                str3 = fo0Var.f37007x0;
            }
            c9Var2.b(R.drawable.msg_payment_card, str3, LocaleController.getString(R.string.PaymentCheckoutMethod), true);
            org.telegram.ui.Cells.c9 c9Var3 = c9VarArr[1];
            if (c9Var3 != null) {
                c9Var3.setVisibility(0);
            }
        }
        Runnable runnable = this.f40773a;
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
