package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sd implements ug1 {
    public final int f40414a;
    public final ke f40415b;
    public final TwoStepVerificationActivity f40416c;

    public sd(ke keVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f40414a = i10;
        this.f40415b = keVar;
        this.f40416c = twoStepVerificationActivity;
    }

    @Override
    public final void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f40414a) {
            case 0:
                this.f40415b.b0(false, tL_inputCheckPasswordSRP, this.f40416c);
                return;
            case 1:
                this.f40415b.b0(true, tL_inputCheckPasswordSRP, this.f40416c);
                return;
            default:
                this.f40415b.b0(true, tL_inputCheckPasswordSRP, this.f40416c);
                return;
        }
    }
}
