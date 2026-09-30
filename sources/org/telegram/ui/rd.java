package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class rd implements mg1 {
    public final int f37401a;
    public final je f37402b;
    public final TwoStepVerificationActivity f37403c;

    public rd(je jeVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f37401a = i10;
        this.f37402b = jeVar;
        this.f37403c = twoStepVerificationActivity;
    }

    @Override
    public final void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f37401a) {
            case 0:
                this.f37402b.b0(false, tL_inputCheckPasswordSRP, this.f37403c);
                return;
            case 1:
                this.f37402b.b0(true, tL_inputCheckPasswordSRP, this.f37403c);
                return;
            default:
                this.f37402b.b0(true, tL_inputCheckPasswordSRP, this.f37403c);
                return;
        }
    }
}
