package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sd implements of1 {
    public final int f41382a;
    public final ie f41383b;
    public final TwoStepVerificationActivity f41384c;

    public sd(ie ieVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41382a = i10;
        this.f41383b = ieVar;
        this.f41384c = twoStepVerificationActivity;
    }

    @Override
    public final void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f41382a) {
            case 0:
                this.f41383b.a0(tL_inputCheckPasswordSRP, this.f41384c, false);
                return;
            case 1:
                this.f41383b.a0(tL_inputCheckPasswordSRP, this.f41384c, true);
                return;
            default:
                this.f41383b.a0(tL_inputCheckPasswordSRP, this.f41384c, true);
                return;
        }
    }
}
