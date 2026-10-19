package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sd implements hf1 {
    public final int f41429a;
    public final ie f41430b;
    public final TwoStepVerificationActivity f41431c;

    public sd(ie ieVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41429a = i10;
        this.f41430b = ieVar;
        this.f41431c = twoStepVerificationActivity;
    }

    @Override
    public final void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f41429a) {
            case 0:
                this.f41430b.b0(tL_inputCheckPasswordSRP, this.f41431c, false);
                return;
            case 1:
                this.f41430b.b0(tL_inputCheckPasswordSRP, this.f41431c, true);
                return;
            default:
                this.f41430b.b0(tL_inputCheckPasswordSRP, this.f41431c, true);
                return;
        }
    }
}
