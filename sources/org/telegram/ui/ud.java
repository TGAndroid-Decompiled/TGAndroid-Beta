package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ud implements mg1 {
    public final int f41201a;
    public final me f41202b;
    public final TwoStepVerificationActivity f41203c;

    public ud(me meVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41201a = i10;
        this.f41202b = meVar;
        this.f41203c = twoStepVerificationActivity;
    }

    @Override
    public final void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f41201a) {
            case 0:
                this.f41202b.F(false, tL_inputCheckPasswordSRP, this.f41203c);
                return;
            case 1:
                this.f41202b.F(true, tL_inputCheckPasswordSRP, this.f41203c);
                return;
            default:
                this.f41202b.F(true, tL_inputCheckPasswordSRP, this.f41203c);
                return;
        }
    }
}
