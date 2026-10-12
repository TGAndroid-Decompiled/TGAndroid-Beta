package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class yd implements bh1 {
    public final int f42136a;
    public final qe f42137b;
    public final TwoStepVerificationActivity f42138c;

    public yd(qe qeVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f42136a = i10;
        this.f42137b = qeVar;
        this.f42138c = twoStepVerificationActivity;
    }

    @Override
    public final void i(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f42136a) {
            case 0:
                this.f42137b.b0(false, tL_inputCheckPasswordSRP, this.f42138c);
                return;
            case 1:
                this.f42137b.b0(true, tL_inputCheckPasswordSRP, this.f42138c);
                return;
            default:
                this.f42137b.b0(true, tL_inputCheckPasswordSRP, this.f42138c);
                return;
        }
    }
}
