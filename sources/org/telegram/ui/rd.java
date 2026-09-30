package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class rd implements mg1 {
    public final int f37300a;
    public final je f37301b;
    public final TwoStepVerificationActivity f37302c;

    public rd(je jeVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f37300a = i10;
        this.f37301b = jeVar;
        this.f37302c = twoStepVerificationActivity;
    }

    @Override
    public final void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f37300a) {
            case 0:
                this.f37301b.b0(false, tL_inputCheckPasswordSRP, this.f37302c);
                return;
            case 1:
                this.f37301b.b0(true, tL_inputCheckPasswordSRP, this.f37302c);
                return;
            default:
                this.f37301b.b0(true, tL_inputCheckPasswordSRP, this.f37302c);
                return;
        }
    }
}
