package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class wd implements xg1 {
    public final int f43137a;
    public final oe f43138b;
    public final TwoStepVerificationActivity f43139c;

    public wd(oe oeVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f43137a = i10;
        this.f43138b = oeVar;
        this.f43139c = twoStepVerificationActivity;
    }

    @Override
    public final void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f43137a) {
            case 0:
                this.f43138b.b0(false, tL_inputCheckPasswordSRP, this.f43139c);
                return;
            case 1:
                this.f43138b.b0(true, tL_inputCheckPasswordSRP, this.f43139c);
                return;
            default:
                this.f43138b.b0(true, tL_inputCheckPasswordSRP, this.f43139c);
                return;
        }
    }
}
