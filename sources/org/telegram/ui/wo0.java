package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class wo0 implements Utilities.Callback {
    public final int f39382a = 0;
    public final zf.b f39383b;
    public final TL_stars.TL_starGiftUnique f39384c;
    public final long d;
    public final Object e;
    public final Object f39385f;

    public wo0(wp0 wp0Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, to0 to0Var) {
        this.e = wp0Var;
        this.f39383b = bVar;
        this.f39384c = tL_starGiftUnique;
        this.d = j3;
        this.f39385f = to0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39382a) {
            case 0:
                wp0.V((wp0) this.e, this.f39383b, this.f39384c, this.d, (to0) this.f39385f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                xh.i4.U((xh.i4) this.e, (org.telegram.ui.ActionBar.c2) this.f39385f, this.f39383b, this.f39384c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public wo0(xh.i4 i4Var, org.telegram.ui.ActionBar.c2 c2Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        this.e = i4Var;
        this.f39385f = c2Var;
        this.f39383b = bVar;
        this.f39384c = tL_starGiftUnique;
        this.d = j3;
    }
}
