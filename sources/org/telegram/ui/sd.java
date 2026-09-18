package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sd implements tg1 {
    public final int f37251a;
    public final ke f37252b;
    public final TwoStepVerificationActivity f37253c;

    public sd(ke keVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f37251a = i10;
        this.f37252b = keVar;
        this.f37253c = twoStepVerificationActivity;
    }

    @Override
    public final void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f37251a) {
            case 0:
                this.f37252b.b0(false, tL_inputCheckPasswordSRP, this.f37253c);
                return;
            case 1:
                this.f37252b.b0(true, tL_inputCheckPasswordSRP, this.f37253c);
                return;
            default:
                this.f37252b.b0(true, tL_inputCheckPasswordSRP, this.f37253c);
                return;
        }
    }
}
