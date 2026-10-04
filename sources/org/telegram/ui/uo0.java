package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class uo0 implements Utilities.Callback {
    public final int f41273a = 0;
    public final zf.b f41274b;
    public final TL_stars.TL_starGiftUnique f41275c;
    public final long d;
    public final Object f41276e;
    public final Object f41277f;

    public uo0(wp0 wp0Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, to0 to0Var) {
        this.f41276e = wp0Var;
        this.f41274b = bVar;
        this.f41275c = tL_starGiftUnique;
        this.d = j3;
        this.f41277f = to0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f41273a) {
            case 0:
                wp0.T((wp0) this.f41276e, this.f41274b, this.f41275c, this.d, (to0) this.f41277f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                xh.h4.S((xh.h4) this.f41276e, (org.telegram.ui.ActionBar.b2) this.f41277f, this.f41274b, this.f41275c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public uo0(xh.h4 h4Var, org.telegram.ui.ActionBar.b2 b2Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        this.f41276e = h4Var;
        this.f41277f = b2Var;
        this.f41274b = bVar;
        this.f41275c = tL_starGiftUnique;
        this.d = j3;
    }
}
