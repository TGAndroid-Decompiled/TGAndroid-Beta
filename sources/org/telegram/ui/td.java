package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class td implements cg1 {
    public final int f41575a;
    public final ke f41576b;
    public final TwoStepVerificationActivity f41577c;

    public td(ke keVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41575a = i10;
        this.f41576b = keVar;
        this.f41577c = twoStepVerificationActivity;
    }

    @Override
    public final void i(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f41575a) {
            case 0:
                this.f41576b.b0(false, tL_inputCheckPasswordSRP, this.f41577c);
                return;
            case 1:
                this.f41576b.b0(true, tL_inputCheckPasswordSRP, this.f41577c);
                return;
            default:
                this.f41576b.b0(true, tL_inputCheckPasswordSRP, this.f41577c);
                return;
        }
    }
}
