package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class uo0 implements Utilities.Callback {
    public final int f41265a = 0;
    public final zf.b f41266b;
    public final TL_stars.TL_starGiftUnique f41267c;
    public final long d;
    public final Object f41268e;
    public final Object f41269f;

    public uo0(wp0 wp0Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, to0 to0Var) {
        this.f41268e = wp0Var;
        this.f41266b = bVar;
        this.f41267c = tL_starGiftUnique;
        this.d = j3;
        this.f41269f = to0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f41265a) {
            case 0:
                wp0.T((wp0) this.f41268e, this.f41266b, this.f41267c, this.d, (to0) this.f41269f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                xh.h4.S((xh.h4) this.f41268e, (org.telegram.ui.ActionBar.b2) this.f41269f, this.f41266b, this.f41267c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public uo0(xh.h4 h4Var, org.telegram.ui.ActionBar.b2 b2Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        this.f41268e = h4Var;
        this.f41269f = b2Var;
        this.f41266b = bVar;
        this.f41267c = tL_starGiftUnique;
        this.d = j3;
    }
}
