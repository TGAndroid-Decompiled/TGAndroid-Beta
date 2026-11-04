package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class tk0 implements bl0 {
    public final Runnable f49822a;
    public final dl0 f49823b;

    public tk0(dl0 dl0Var, Runnable runnable) {
        this.f49823b = dl0Var;
        this.f49822a = runnable;
    }

    @Override
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        String str3;
        dl0 dl0Var = this.f49823b;
        dl0Var.f44778z0 = tL_paymentSavedCredentialsCard;
        dl0Var.f44775x0 = str;
        dl0Var.V0 = z10;
        dl0Var.f44777y0 = str2;
        dl0Var.K0 = tL_inputPaymentCredentialsGooglePay;
        org.telegram.ui.Cells.x8[] x8VarArr = dl0Var.Z;
        org.telegram.ui.Cells.x8 x8Var = x8VarArr[0];
        if (x8Var != null) {
            x8Var.setVisibility(0);
            org.telegram.ui.Cells.x8 x8Var2 = x8VarArr[0];
            String str4 = dl0Var.f44777y0;
            if (str4 != null && str4.length() > 1) {
                str3 = dl0Var.f44777y0.substring(0, 1).toUpperCase() + dl0Var.f44777y0.substring(1);
            } else {
                str3 = dl0Var.f44777y0;
            }
            x8Var2.b(2131232273, str3, org.telegram.messenger.bd.M0(2131747422, null), true);
            org.telegram.ui.Cells.x8 x8Var3 = x8VarArr[1];
            if (x8Var3 != null) {
                x8Var3.setVisibility(0);
            }
        }
        Runnable runnable = this.f49822a;
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
