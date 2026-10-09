package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sd implements vg1 {
    public final int f41670a;
    public final ke f41671b;
    public final TwoStepVerificationActivity f41672c;

    public sd(ke keVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41670a = i10;
        this.f41671b = keVar;
        this.f41672c = twoStepVerificationActivity;
    }

    @Override
    public final void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f41670a) {
            case 0:
                this.f41671b.b0(false, tL_inputCheckPasswordSRP, this.f41672c);
                return;
            case 1:
                this.f41671b.b0(true, tL_inputCheckPasswordSRP, this.f41672c);
                return;
            default:
                this.f41671b.b0(true, tL_inputCheckPasswordSRP, this.f41672c);
                return;
        }
    }
}
