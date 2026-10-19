package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class qn0 implements co0 {
    public final Runnable f40940a;
    public final eo0 f40941b;

    public qn0(eo0 eo0Var, Runnable runnable) {
        this.f40941b = eo0Var;
        this.f40940a = runnable;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        String str3;
        eo0 eo0Var = this.f40941b;
        eo0Var.f36737y0 = tL_paymentSavedCredentialsCard;
        eo0Var.f36733w0 = str;
        eo0Var.U0 = z10;
        eo0Var.f36735x0 = str2;
        eo0Var.J0 = tL_inputPaymentCredentialsGooglePay;
        org.telegram.ui.Cells.c9[] c9VarArr = eo0Var.Y;
        org.telegram.ui.Cells.c9 c9Var = c9VarArr[0];
        if (c9Var != null) {
            c9Var.setVisibility(0);
            org.telegram.ui.Cells.c9 c9Var2 = c9VarArr[0];
            String str4 = eo0Var.f36735x0;
            if (str4 != null && str4.length() > 1) {
                str3 = eo0Var.f36735x0.substring(0, 1).toUpperCase() + eo0Var.f36735x0.substring(1);
            } else {
                str3 = eo0Var.f36735x0;
            }
            c9Var2.b(R.drawable.msg_payment_card, str3, LocaleController.getString(R.string.PaymentCheckoutMethod), true);
            org.telegram.ui.Cells.c9 c9Var3 = c9VarArr[1];
            if (c9Var3 != null) {
                c9Var3.setVisibility(0);
            }
        }
        Runnable runnable = this.f40940a;
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
