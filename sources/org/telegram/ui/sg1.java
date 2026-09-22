package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class sg1 extends hh1 {
    public final TwoStepVerificationActivity f37395k0;

    public sg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10, TL_account.Password password) {
        super(i10, 4, password);
        this.f37395k0 = twoStepVerificationActivity;
    }

    @Override
    public final void B0() {
        this.f37395k0.N = true;
    }
}
