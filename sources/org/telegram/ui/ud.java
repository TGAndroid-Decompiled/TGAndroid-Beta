package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ud implements og1 {
    public final int f41144a;
    public final me f41145b;
    public final TwoStepVerificationActivity f41146c;

    public ud(me meVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41144a = i10;
        this.f41145b = meVar;
        this.f41146c = twoStepVerificationActivity;
    }

    @Override
    public final void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f41144a) {
            case 0:
                this.f41145b.y0(false, tL_inputCheckPasswordSRP, this.f41146c);
                return;
            case 1:
                this.f41145b.y0(true, tL_inputCheckPasswordSRP, this.f41146c);
                return;
            default:
                this.f41145b.y0(true, tL_inputCheckPasswordSRP, this.f41146c);
                return;
        }
    }
}
