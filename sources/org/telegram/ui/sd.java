package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sd implements hf1 {
    public final int f41437a;
    public final ie f41438b;
    public final TwoStepVerificationActivity f41439c;

    public sd(ie ieVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41437a = i10;
        this.f41438b = ieVar;
        this.f41439c = twoStepVerificationActivity;
    }

    @Override
    public final void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f41437a) {
            case 0:
                this.f41438b.b0(tL_inputCheckPasswordSRP, this.f41439c, false);
                return;
            case 1:
                this.f41438b.b0(tL_inputCheckPasswordSRP, this.f41439c, true);
                return;
            default:
                this.f41438b.b0(tL_inputCheckPasswordSRP, this.f41439c, true);
                return;
        }
    }
}
