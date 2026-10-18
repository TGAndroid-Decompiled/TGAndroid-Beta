package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ud implements jf1 {
    public final int f41927a;
    public final ke f41928b;
    public final TwoStepVerificationActivity f41929c;

    public ud(ke keVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41927a = i10;
        this.f41928b = keVar;
        this.f41929c = twoStepVerificationActivity;
    }

    @Override
    public final void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f41927a) {
            case 0:
                this.f41928b.b0(tL_inputCheckPasswordSRP, this.f41929c, false);
                return;
            case 1:
                this.f41928b.b0(tL_inputCheckPasswordSRP, this.f41929c, true);
                return;
            default:
                this.f41928b.b0(tL_inputCheckPasswordSRP, this.f41929c, true);
                return;
        }
    }
}
