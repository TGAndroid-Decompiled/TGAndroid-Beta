package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class td implements vg1 {
    public final int f37716a;
    public final le f37717b;
    public final TwoStepVerificationActivity f37718c;

    public td(le leVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f37716a = i10;
        this.f37717b = leVar;
        this.f37718c = twoStepVerificationActivity;
    }

    @Override
    public final void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f37716a) {
            case 0:
                this.f37717b.b0(false, tL_inputCheckPasswordSRP, this.f37718c);
                return;
            case 1:
                this.f37717b.b0(true, tL_inputCheckPasswordSRP, this.f37718c);
                return;
            default:
                this.f37717b.b0(true, tL_inputCheckPasswordSRP, this.f37718c);
                return;
        }
    }
}
