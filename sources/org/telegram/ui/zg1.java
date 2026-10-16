package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;
public final class zg1 extends oh1 {
    public final TwoStepVerificationActivity f42319k0;

    public zg1(TwoStepVerificationActivity twoStepVerificationActivity, int i10, TL_account.Password password) {
        super(i10, 4, password);
        this.f42319k0 = twoStepVerificationActivity;
    }

    @Override
    public final void B0() {
        this.f42319k0.N = true;
    }
}
