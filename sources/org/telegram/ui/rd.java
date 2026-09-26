package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class rd implements mg1 {
    public final int f37298a;
    public final je f37299b;
    public final TwoStepVerificationActivity f37300c;

    public rd(je jeVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f37298a = i10;
        this.f37299b = jeVar;
        this.f37300c = twoStepVerificationActivity;
    }

    @Override
    public final void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f37298a) {
            case 0:
                this.f37299b.b0(false, tL_inputCheckPasswordSRP, this.f37300c);
                return;
            case 1:
                this.f37299b.b0(true, tL_inputCheckPasswordSRP, this.f37300c);
                return;
            default:
                this.f37299b.b0(true, tL_inputCheckPasswordSRP, this.f37300c);
                return;
        }
    }
}
