package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ud implements og1 {
    public final int f41151a;
    public final me f41152b;
    public final TwoStepVerificationActivity f41153c;

    public ud(me meVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41151a = i10;
        this.f41152b = meVar;
        this.f41153c = twoStepVerificationActivity;
    }

    @Override
    public final void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f41151a) {
            case 0:
                this.f41152b.y0(false, tL_inputCheckPasswordSRP, this.f41153c);
                return;
            case 1:
                this.f41152b.y0(true, tL_inputCheckPasswordSRP, this.f41153c);
                return;
            default:
                this.f41152b.y0(true, tL_inputCheckPasswordSRP, this.f41153c);
                return;
        }
    }
}
