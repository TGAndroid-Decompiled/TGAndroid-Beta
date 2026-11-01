package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class rd implements ec1 {
    public final int f41057a;
    public final le f41058b;
    public final TwoStepVerificationActivity f41059c;

    public rd(le leVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41057a = i10;
        this.f41058b = leVar;
        this.f41059c = twoStepVerificationActivity;
    }

    @Override
    public final void m(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f41057a) {
            case 0:
                this.f41058b.F(false, tL_inputCheckPasswordSRP, this.f41059c);
                return;
            case 1:
                this.f41058b.F(true, tL_inputCheckPasswordSRP, this.f41059c);
                return;
            default:
                this.f41058b.F(true, tL_inputCheckPasswordSRP, this.f41059c);
                return;
        }
    }
}
