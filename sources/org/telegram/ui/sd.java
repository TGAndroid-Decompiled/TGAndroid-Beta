package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sd implements vg1 {
    public final int f41716a;
    public final ke f41717b;
    public final TwoStepVerificationActivity f41718c;

    public sd(ke keVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41716a = i10;
        this.f41717b = keVar;
        this.f41718c = twoStepVerificationActivity;
    }

    @Override
    public final void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f41716a) {
            case 0:
                this.f41717b.b0(false, tL_inputCheckPasswordSRP, this.f41718c);
                return;
            case 1:
                this.f41717b.b0(true, tL_inputCheckPasswordSRP, this.f41718c);
                return;
            default:
                this.f41717b.b0(true, tL_inputCheckPasswordSRP, this.f41718c);
                return;
        }
    }
}
