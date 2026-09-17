package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sd implements ug1 {
    public final int f40441a;
    public final ke f40442b;
    public final TwoStepVerificationActivity f40443c;

    public sd(ke keVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f40441a = i10;
        this.f40442b = keVar;
        this.f40443c = twoStepVerificationActivity;
    }

    @Override
    public final void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f40441a) {
            case 0:
                this.f40442b.b0(false, tL_inputCheckPasswordSRP, this.f40443c);
                return;
            case 1:
                this.f40442b.b0(true, tL_inputCheckPasswordSRP, this.f40443c);
                return;
            default:
                this.f40442b.b0(true, tL_inputCheckPasswordSRP, this.f40443c);
                return;
        }
    }
}
