package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class xg1 extends mh1 {
    public final TwoStepVerificationActivity f38745k0;

    public xg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10, TL_account.Password password) {
        super(i10, 4, password);
        this.f38745k0 = twoStepVerificationActivity;
    }

    @Override
    public final void B0() {
        this.f38745k0.N = true;
    }
}
