package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class rd implements mg1 {
    public final int f36796a;
    public final je f36797b;
    public final TwoStepVerificationActivity f36798c;

    public rd(je jeVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f36796a = i10;
        this.f36797b = jeVar;
        this.f36798c = twoStepVerificationActivity;
    }

    @Override
    public final void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f36796a) {
            case 0:
                this.f36797b.b0(false, tL_inputCheckPasswordSRP, this.f36798c);
                return;
            case 1:
                this.f36797b.b0(true, tL_inputCheckPasswordSRP, this.f36798c);
                return;
            default:
                this.f36797b.b0(true, tL_inputCheckPasswordSRP, this.f36798c);
                return;
        }
    }
}
