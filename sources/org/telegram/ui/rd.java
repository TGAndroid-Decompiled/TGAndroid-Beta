package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class rd implements ug1 {
    public final int f37105a;
    public final je f37106b;
    public final TwoStepVerificationActivity f37107c;

    public rd(je jeVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f37105a = i10;
        this.f37106b = jeVar;
        this.f37107c = twoStepVerificationActivity;
    }

    @Override
    public final void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f37105a) {
            case 0:
                this.f37106b.b0(false, tL_inputCheckPasswordSRP, this.f37107c);
                return;
            case 1:
                this.f37106b.b0(true, tL_inputCheckPasswordSRP, this.f37107c);
                return;
            default:
                this.f37106b.b0(true, tL_inputCheckPasswordSRP, this.f37107c);
                return;
        }
    }
}
