package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sd implements vg1 {
    public final int f41672a;
    public final ke f41673b;
    public final TwoStepVerificationActivity f41674c;

    public sd(ke keVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41672a = i10;
        this.f41673b = keVar;
        this.f41674c = twoStepVerificationActivity;
    }

    @Override
    public final void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f41672a) {
            case 0:
                this.f41673b.b0(false, tL_inputCheckPasswordSRP, this.f41674c);
                return;
            case 1:
                this.f41673b.b0(true, tL_inputCheckPasswordSRP, this.f41674c);
                return;
            default:
                this.f41673b.b0(true, tL_inputCheckPasswordSRP, this.f41674c);
                return;
        }
    }
}
