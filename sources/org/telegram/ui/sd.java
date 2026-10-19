package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sd implements hf1 {
    public final int f41427a;
    public final ie f41428b;
    public final TwoStepVerificationActivity f41429c;

    public sd(ie ieVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41427a = i10;
        this.f41428b = ieVar;
        this.f41429c = twoStepVerificationActivity;
    }

    @Override
    public final void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f41427a) {
            case 0:
                this.f41428b.b0(tL_inputCheckPasswordSRP, this.f41429c, false);
                return;
            case 1:
                this.f41428b.b0(tL_inputCheckPasswordSRP, this.f41429c, true);
                return;
            default:
                this.f41428b.b0(tL_inputCheckPasswordSRP, this.f41429c, true);
                return;
        }
    }
}
