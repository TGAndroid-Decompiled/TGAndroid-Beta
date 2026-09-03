package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class td implements ig1 {
    public final int f41510a;
    public final ke f41511b;
    public final TwoStepVerificationActivity f41512c;

    public td(ke keVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41510a = i10;
        this.f41511b = keVar;
        this.f41512c = twoStepVerificationActivity;
    }

    @Override
    public final void i(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f41510a) {
            case 0:
                this.f41511b.b0(false, tL_inputCheckPasswordSRP, this.f41512c);
                return;
            case 1:
                this.f41511b.b0(true, tL_inputCheckPasswordSRP, this.f41512c);
                return;
            default:
                this.f41511b.b0(true, tL_inputCheckPasswordSRP, this.f41512c);
                return;
        }
    }
}
