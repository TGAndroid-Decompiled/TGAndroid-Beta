package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ud implements qf1 {
    public final int f44099a;
    public final ke f44100b;
    public final TwoStepVerificationActivity f44101c;

    public ud(ke keVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f44099a = i10;
        this.f44100b = keVar;
        this.f44101c = twoStepVerificationActivity;
    }

    @Override
    public final void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f44099a) {
            case 0:
                this.f44100b.F(tL_inputCheckPasswordSRP, this.f44101c, false);
                return;
            case 1:
                this.f44100b.F(tL_inputCheckPasswordSRP, this.f44101c, true);
                return;
            default:
                this.f44100b.F(tL_inputCheckPasswordSRP, this.f44101c, true);
                return;
        }
    }
}
