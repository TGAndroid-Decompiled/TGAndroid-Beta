package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class tg1 extends ih1 {
    public final TwoStepVerificationActivity f37780k0;

    public tg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10, TL_account.Password password) {
        super(i10, 4, password);
        this.f37780k0 = twoStepVerificationActivity;
    }

    @Override
    public final void B0() {
        this.f37780k0.N = true;
    }
}
