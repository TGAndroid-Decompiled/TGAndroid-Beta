package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class rd implements tg1 {
    public final int f37078a;
    public final je f37079b;
    public final TwoStepVerificationActivity f37080c;

    public rd(je jeVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f37078a = i10;
        this.f37079b = jeVar;
        this.f37080c = twoStepVerificationActivity;
    }

    @Override
    public final void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f37078a) {
            case 0:
                this.f37079b.b0(false, tL_inputCheckPasswordSRP, this.f37080c);
                return;
            case 1:
                this.f37079b.b0(true, tL_inputCheckPasswordSRP, this.f37080c);
                return;
            default:
                this.f37079b.b0(true, tL_inputCheckPasswordSRP, this.f37080c);
                return;
        }
    }
}
