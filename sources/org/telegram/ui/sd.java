package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sd implements hf1 {
    public final int f41436a;
    public final ie f41437b;
    public final TwoStepVerificationActivity f41438c;

    public sd(ie ieVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41436a = i10;
        this.f41437b = ieVar;
        this.f41438c = twoStepVerificationActivity;
    }

    @Override
    public final void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f41436a) {
            case 0:
                this.f41437b.b0(tL_inputCheckPasswordSRP, this.f41438c, false);
                return;
            case 1:
                this.f41437b.b0(tL_inputCheckPasswordSRP, this.f41438c, true);
                return;
            default:
                this.f41437b.b0(tL_inputCheckPasswordSRP, this.f41438c, true);
                return;
        }
    }
}
