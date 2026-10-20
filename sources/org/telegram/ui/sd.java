package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sd implements hf1 {
    public final int f41433a;
    public final ie f41434b;
    public final TwoStepVerificationActivity f41435c;

    public sd(ie ieVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41433a = i10;
        this.f41434b = ieVar;
        this.f41435c = twoStepVerificationActivity;
    }

    @Override
    public final void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f41433a) {
            case 0:
                this.f41434b.b0(tL_inputCheckPasswordSRP, this.f41435c, false);
                return;
            case 1:
                this.f41434b.b0(tL_inputCheckPasswordSRP, this.f41435c, true);
                return;
            default:
                this.f41434b.b0(tL_inputCheckPasswordSRP, this.f41435c, true);
                return;
        }
    }
}
