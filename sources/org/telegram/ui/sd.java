package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sd implements vg1 {
    public final int f37373a;
    public final ke f37374b;
    public final TwoStepVerificationActivity f37375c;

    public sd(ke keVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f37373a = i10;
        this.f37374b = keVar;
        this.f37375c = twoStepVerificationActivity;
    }

    @Override
    public final void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f37373a) {
            case 0:
                this.f37374b.b0(false, tL_inputCheckPasswordSRP, this.f37375c);
                return;
            case 1:
                this.f37374b.b0(true, tL_inputCheckPasswordSRP, this.f37375c);
                return;
            default:
                this.f37374b.b0(true, tL_inputCheckPasswordSRP, this.f37375c);
                return;
        }
    }
}
