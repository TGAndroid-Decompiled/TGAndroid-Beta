package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class vk0 implements il0 {
    public final kl0 f50752a;

    public vk0(kl0 kl0Var) {
        this.f50752a = kl0Var;
    }

    @Override
    public final boolean c(String str, String str2, boolean z9, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        return false;
    }

    @Override
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
        kl0 kl0Var = this.f50752a;
        kl0Var.I0 = tL_payments_validateRequestedInfo;
        kl0Var.H0(tL_payments_validateRequestedInfo.info);
    }

    @Override
    public final void a(TL_account.Password password) {
    }

    @Override
    public final void b() {
    }
}
