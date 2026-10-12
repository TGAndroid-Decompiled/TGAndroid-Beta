package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class wd implements xg1 {
    public final int f43135a;
    public final oe f43136b;
    public final TwoStepVerificationActivity f43137c;

    public wd(oe oeVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f43135a = i10;
        this.f43136b = oeVar;
        this.f43137c = twoStepVerificationActivity;
    }

    @Override
    public final void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f43135a) {
            case 0:
                this.f43136b.b0(false, tL_inputCheckPasswordSRP, this.f43137c);
                return;
            case 1:
                this.f43136b.b0(true, tL_inputCheckPasswordSRP, this.f43137c);
                return;
            default:
                this.f43136b.b0(true, tL_inputCheckPasswordSRP, this.f43137c);
                return;
        }
    }
}
