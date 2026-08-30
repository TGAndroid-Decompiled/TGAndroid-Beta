package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class yf1 extends og1 {
    public final TwoStepVerificationActivity f40514h0;

    public yf1(TwoStepVerificationActivity twoStepVerificationActivity, int i10, TL_account.Password password) {
        super(i10, 4, password);
        this.f40514h0 = twoStepVerificationActivity;
    }

    @Override
    public final void B0() {
        this.f40514h0.K = true;
    }
}
