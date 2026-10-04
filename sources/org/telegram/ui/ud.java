package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ud implements og1 {
    public final int f41145a;
    public final me f41146b;
    public final TwoStepVerificationActivity f41147c;

    public ud(me meVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41145a = i10;
        this.f41146b = meVar;
        this.f41147c = twoStepVerificationActivity;
    }

    @Override
    public final void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f41145a) {
            case 0:
                this.f41146b.y0(false, tL_inputCheckPasswordSRP, this.f41147c);
                return;
            case 1:
                this.f41146b.y0(true, tL_inputCheckPasswordSRP, this.f41147c);
                return;
            default:
                this.f41146b.y0(true, tL_inputCheckPasswordSRP, this.f41147c);
                return;
        }
    }
}
