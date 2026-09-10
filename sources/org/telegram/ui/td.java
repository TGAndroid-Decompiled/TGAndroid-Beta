package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class td implements zg1 {
    public final int f36907a;
    public final le f36908b;
    public final TwoStepVerificationActivity f36909c;

    public td(le leVar, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f36907a = i10;
        this.f36908b = leVar;
        this.f36909c = twoStepVerificationActivity;
    }

    @Override
    public final void d(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f36907a) {
            case 0:
                this.f36908b.b0(false, tL_inputCheckPasswordSRP, this.f36909c);
                return;
            case 1:
                this.f36908b.b0(true, tL_inputCheckPasswordSRP, this.f36909c);
                return;
            default:
                this.f36908b.b0(true, tL_inputCheckPasswordSRP, this.f36909c);
                return;
        }
    }
}
