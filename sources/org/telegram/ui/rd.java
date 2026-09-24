package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class rd implements mg1 {
    public final int f37287a;
    public final je f37288b;
    public final TwoStepVerificationActivity f37289c;

    public rd(je jeVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f37287a = i10;
        this.f37288b = jeVar;
        this.f37289c = twoStepVerificationActivity;
    }

    @Override
    public final void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f37287a) {
            case 0:
                this.f37288b.b0(false, tL_inputCheckPasswordSRP, this.f37289c);
                return;
            case 1:
                this.f37288b.b0(true, tL_inputCheckPasswordSRP, this.f37289c);
                return;
            default:
                this.f37288b.b0(true, tL_inputCheckPasswordSRP, this.f37289c);
                return;
        }
    }
}
