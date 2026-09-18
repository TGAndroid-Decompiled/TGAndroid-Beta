package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class td implements vg1 {
    public final int f37721a;
    public final le f37722b;
    public final TwoStepVerificationActivity f37723c;

    public td(le leVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f37721a = i10;
        this.f37722b = leVar;
        this.f37723c = twoStepVerificationActivity;
    }

    @Override
    public final void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f37721a) {
            case 0:
                this.f37722b.b0(false, tL_inputCheckPasswordSRP, this.f37723c);
                return;
            case 1:
                this.f37722b.b0(true, tL_inputCheckPasswordSRP, this.f37723c);
                return;
            default:
                this.f37722b.b0(true, tL_inputCheckPasswordSRP, this.f37723c);
                return;
        }
    }
}
