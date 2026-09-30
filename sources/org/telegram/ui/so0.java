package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class so0 implements Utilities.Callback {
    public final int f37928a = 0;
    public final zf.b f37929b;
    public final TL_stars.TL_starGiftUnique f37930c;
    public final long d;
    public final Object e;
    public final Object f37931f;

    public so0(sp0 sp0Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, po0 po0Var) {
        this.e = sp0Var;
        this.f37929b = bVar;
        this.f37930c = tL_starGiftUnique;
        this.d = j3;
        this.f37931f = po0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37928a) {
            case 0:
                sp0.V((sp0) this.e, this.f37929b, this.f37930c, this.d, (po0) this.f37931f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                xh.h4.U((xh.h4) this.e, (org.telegram.ui.ActionBar.a2) this.f37931f, this.f37929b, this.f37930c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public so0(xh.h4 h4Var, org.telegram.ui.ActionBar.a2 a2Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        this.e = h4Var;
        this.f37931f = a2Var;
        this.f37929b = bVar;
        this.f37930c = tL_starGiftUnique;
        this.d = j3;
    }
}
