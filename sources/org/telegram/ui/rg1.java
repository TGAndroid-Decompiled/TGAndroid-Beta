package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class rg1 extends gh1 {
    public final TwoStepVerificationActivity f37064k0;

    public rg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10, TL_account.Password password) {
        super(i10, 4, password);
        this.f37064k0 = twoStepVerificationActivity;
    }

    @Override
    public final void B0() {
        this.f37064k0.N = true;
    }
}
