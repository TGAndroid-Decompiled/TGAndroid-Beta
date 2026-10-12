package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class vg1 extends kh1 {
    public final TwoStepVerificationActivity f42784k0;

    public vg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10, TL_account.Password password) {
        super(i10, 4, password);
        this.f42784k0 = twoStepVerificationActivity;
    }

    @Override
    public final void B0() {
        this.f42784k0.N = true;
    }
}
