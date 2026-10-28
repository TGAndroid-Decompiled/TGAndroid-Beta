package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ud implements sf1 {
    public final int f43988a;
    public final ke f43989b;
    public final TwoStepVerificationActivity f43990c;

    public ud(ke keVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f43988a = i10;
        this.f43989b = keVar;
        this.f43990c = twoStepVerificationActivity;
    }

    @Override
    public final void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f43988a) {
            case 0:
                this.f43989b.F(tL_inputCheckPasswordSRP, this.f43990c, false);
                return;
            case 1:
                this.f43989b.F(tL_inputCheckPasswordSRP, this.f43990c, true);
                return;
            default:
                this.f43989b.F(tL_inputCheckPasswordSRP, this.f43990c, true);
                return;
        }
    }
}
