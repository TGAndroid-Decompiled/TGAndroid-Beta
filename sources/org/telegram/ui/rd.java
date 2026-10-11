package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class rd implements ug1 {
    public final int f41449a;
    public final je f41450b;
    public final TwoStepVerificationActivity f41451c;

    public rd(je jeVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41449a = i10;
        this.f41450b = jeVar;
        this.f41451c = twoStepVerificationActivity;
    }

    @Override
    public final void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f41449a) {
            case 0:
                this.f41450b.b0(false, tL_inputCheckPasswordSRP, this.f41451c);
                return;
            case 1:
                this.f41450b.b0(true, tL_inputCheckPasswordSRP, this.f41451c);
                return;
            default:
                this.f41450b.b0(true, tL_inputCheckPasswordSRP, this.f41451c);
                return;
        }
    }
}
