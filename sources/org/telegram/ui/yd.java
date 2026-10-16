package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class yd implements bh1 {
    public final int f41804a;
    public final qe f41805b;
    public final TwoStepVerificationActivity f41806c;

    public yd(qe qeVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41804a = i10;
        this.f41805b = qeVar;
        this.f41806c = twoStepVerificationActivity;
    }

    @Override
    public final void i(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f41804a) {
            case 0:
                this.f41805b.b0(false, tL_inputCheckPasswordSRP, this.f41806c);
                return;
            case 1:
                this.f41805b.b0(true, tL_inputCheckPasswordSRP, this.f41806c);
                return;
            default:
                this.f41805b.b0(true, tL_inputCheckPasswordSRP, this.f41806c);
                return;
        }
    }
}
