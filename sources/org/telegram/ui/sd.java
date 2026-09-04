package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sd implements ug1 {
    public final int f40413a;
    public final ke f40414b;
    public final TwoStepVerificationActivity f40415c;

    public sd(ke keVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f40413a = i10;
        this.f40414b = keVar;
        this.f40415c = twoStepVerificationActivity;
    }

    @Override
    public final void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f40413a) {
            case 0:
                this.f40414b.b0(false, tL_inputCheckPasswordSRP, this.f40415c);
                return;
            case 1:
                this.f40414b.b0(true, tL_inputCheckPasswordSRP, this.f40415c);
                return;
            default:
                this.f40414b.b0(true, tL_inputCheckPasswordSRP, this.f40415c);
                return;
        }
    }
}
