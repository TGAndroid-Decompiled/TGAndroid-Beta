package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sd implements ug1 {
    public final int f40440a;
    public final ke f40441b;
    public final TwoStepVerificationActivity f40442c;

    public sd(ke keVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f40440a = i10;
        this.f40441b = keVar;
        this.f40442c = twoStepVerificationActivity;
    }

    @Override
    public final void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f40440a) {
            case 0:
                this.f40441b.b0(false, tL_inputCheckPasswordSRP, this.f40442c);
                return;
            case 1:
                this.f40441b.b0(true, tL_inputCheckPasswordSRP, this.f40442c);
                return;
            default:
                this.f40441b.b0(true, tL_inputCheckPasswordSRP, this.f40442c);
                return;
        }
    }
}
