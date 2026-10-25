package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ud implements qf1 {
    public final int f44096a;
    public final ke f44097b;
    public final TwoStepVerificationActivity f44098c;

    public ud(ke keVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f44096a = i10;
        this.f44097b = keVar;
        this.f44098c = twoStepVerificationActivity;
    }

    @Override
    public final void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f44096a) {
            case 0:
                this.f44097b.F(tL_inputCheckPasswordSRP, this.f44098c, false);
                return;
            case 1:
                this.f44097b.F(tL_inputCheckPasswordSRP, this.f44098c, true);
                return;
            default:
                this.f44097b.F(tL_inputCheckPasswordSRP, this.f44098c, true);
                return;
        }
    }
}
