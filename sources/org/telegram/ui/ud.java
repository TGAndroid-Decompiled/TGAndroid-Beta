package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ud implements mg1 {
    public final int f38207a;
    public final me f38208b;
    public final TwoStepVerificationActivity f38209c;

    public ud(me meVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f38207a = i10;
        this.f38208b = meVar;
        this.f38209c = twoStepVerificationActivity;
    }

    @Override
    public final void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f38207a) {
            case 0:
                this.f38208b.b0(false, tL_inputCheckPasswordSRP, this.f38209c);
                return;
            case 1:
                this.f38208b.b0(true, tL_inputCheckPasswordSRP, this.f38209c);
                return;
            default:
                this.f38208b.b0(true, tL_inputCheckPasswordSRP, this.f38209c);
                return;
        }
    }
}
