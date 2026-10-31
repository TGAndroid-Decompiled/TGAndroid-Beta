package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class rd implements gc1 {
    public final int f41201a;
    public final le f41202b;
    public final TwoStepVerificationActivity f41203c;

    public rd(le leVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41201a = i10;
        this.f41202b = leVar;
        this.f41203c = twoStepVerificationActivity;
    }

    @Override
    public final void m(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
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
