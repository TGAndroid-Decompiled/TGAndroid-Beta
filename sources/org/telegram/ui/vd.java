package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class vd implements ig1 {
    public final int f39070a;
    public final me f39071b;
    public final TwoStepVerificationActivity f39072c;

    public vd(me meVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f39070a = i10;
        this.f39071b = meVar;
        this.f39072c = twoStepVerificationActivity;
    }

    @Override
    public final void g(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f39070a) {
            case 0:
                this.f39071b.b0(false, tL_inputCheckPasswordSRP, this.f39072c);
                return;
            case 1:
                this.f39071b.b0(true, tL_inputCheckPasswordSRP, this.f39072c);
                return;
            default:
                this.f39071b.b0(true, tL_inputCheckPasswordSRP, this.f39072c);
                return;
        }
    }
}
