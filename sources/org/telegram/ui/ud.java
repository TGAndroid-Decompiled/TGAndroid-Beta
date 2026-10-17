package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ud implements jf1 {
    public final int f41953a;
    public final ke f41954b;
    public final TwoStepVerificationActivity f41955c;

    public ud(ke keVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41953a = i10;
        this.f41954b = keVar;
        this.f41955c = twoStepVerificationActivity;
    }

    @Override
    public final void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f41953a) {
            case 0:
                this.f41954b.b0(false, tL_inputCheckPasswordSRP, this.f41955c);
                return;
            case 1:
                this.f41954b.b0(true, tL_inputCheckPasswordSRP, this.f41955c);
                return;
            default:
                this.f41954b.b0(true, tL_inputCheckPasswordSRP, this.f41955c);
                return;
        }
    }
}
