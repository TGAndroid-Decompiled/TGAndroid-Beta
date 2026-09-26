package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class rd implements mg1 {
    public final int f37299a;
    public final je f37300b;
    public final TwoStepVerificationActivity f37301c;

    public rd(je jeVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f37299a = i10;
        this.f37300b = jeVar;
        this.f37301c = twoStepVerificationActivity;
    }

    @Override
    public final void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f37299a) {
            case 0:
                this.f37300b.b0(false, tL_inputCheckPasswordSRP, this.f37301c);
                return;
            case 1:
                this.f37300b.b0(true, tL_inputCheckPasswordSRP, this.f37301c);
                return;
            default:
                this.f37300b.b0(true, tL_inputCheckPasswordSRP, this.f37301c);
                return;
        }
    }
}
