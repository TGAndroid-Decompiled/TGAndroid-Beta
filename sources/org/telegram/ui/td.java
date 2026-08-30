package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class td implements ag1 {
    public final int f38635a;
    public final ke f38636b;
    public final TwoStepVerificationActivity f38637c;

    public td(ke keVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f38635a = i10;
        this.f38636b = keVar;
        this.f38637c = twoStepVerificationActivity;
    }

    @Override
    public final void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f38635a) {
            case 0:
                this.f38636b.b0(false, tL_inputCheckPasswordSRP, this.f38637c);
                return;
            case 1:
                this.f38636b.b0(true, tL_inputCheckPasswordSRP, this.f38637c);
                return;
            default:
                this.f38636b.b0(true, tL_inputCheckPasswordSRP, this.f38637c);
                return;
        }
    }
}
