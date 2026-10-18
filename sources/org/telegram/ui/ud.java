package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ud implements jf1 {
    public final int f41968a;
    public final ke f41969b;
    public final TwoStepVerificationActivity f41970c;

    public ud(ke keVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41968a = i10;
        this.f41969b = keVar;
        this.f41970c = twoStepVerificationActivity;
    }

    @Override
    public final void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f41968a) {
            case 0:
                this.f41969b.b0(tL_inputCheckPasswordSRP, this.f41970c, false);
                return;
            case 1:
                this.f41969b.b0(tL_inputCheckPasswordSRP, this.f41970c, true);
                return;
            default:
                this.f41969b.b0(tL_inputCheckPasswordSRP, this.f41970c, true);
                return;
        }
    }
}
