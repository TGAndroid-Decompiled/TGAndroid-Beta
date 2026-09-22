package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sd implements vg1 {
    public final int f37395a;
    public final ke f37396b;
    public final TwoStepVerificationActivity f37397c;

    public sd(ke keVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f37395a = i10;
        this.f37396b = keVar;
        this.f37397c = twoStepVerificationActivity;
    }

    @Override
    public final void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f37395a) {
            case 0:
                this.f37396b.b0(false, tL_inputCheckPasswordSRP, this.f37397c);
                return;
            case 1:
                this.f37396b.b0(true, tL_inputCheckPasswordSRP, this.f37397c);
                return;
            default:
                this.f37396b.b0(true, tL_inputCheckPasswordSRP, this.f37397c);
                return;
        }
    }
}
