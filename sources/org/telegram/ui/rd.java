package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class rd implements ug1 {
    public final int f41415a;
    public final je f41416b;
    public final TwoStepVerificationActivity f41417c;

    public rd(je jeVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41415a = i10;
        this.f41416b = jeVar;
        this.f41417c = twoStepVerificationActivity;
    }

    @Override
    public final void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f41415a) {
            case 0:
                this.f41416b.b0(false, tL_inputCheckPasswordSRP, this.f41417c);
                return;
            case 1:
                this.f41416b.b0(true, tL_inputCheckPasswordSRP, this.f41417c);
                return;
            default:
                this.f41416b.b0(true, tL_inputCheckPasswordSRP, this.f41417c);
                return;
        }
    }
}
