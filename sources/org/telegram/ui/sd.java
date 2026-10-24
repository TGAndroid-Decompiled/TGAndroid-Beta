package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sd implements nf1 {
    public final int f41345a;
    public final ie f41346b;
    public final TwoStepVerificationActivity f41347c;

    public sd(ie ieVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41345a = i10;
        this.f41346b = ieVar;
        this.f41347c = twoStepVerificationActivity;
    }

    @Override
    public final void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f41345a) {
            case 0:
                this.f41346b.a0(tL_inputCheckPasswordSRP, this.f41347c, false);
                return;
            case 1:
                this.f41346b.a0(tL_inputCheckPasswordSRP, this.f41347c, true);
                return;
            default:
                this.f41346b.a0(tL_inputCheckPasswordSRP, this.f41347c, true);
                return;
        }
    }
}
