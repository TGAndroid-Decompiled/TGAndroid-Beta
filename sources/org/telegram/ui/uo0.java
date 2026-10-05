package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class uo0 implements Utilities.Callback {
    public final int f41308a = 0;
    public final zf.b f41309b;
    public final TL_stars.TL_starGiftUnique f41310c;
    public final long d;
    public final Object f41311e;
    public final Object f41312f;

    public uo0(wp0 wp0Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, to0 to0Var) {
        this.f41311e = wp0Var;
        this.f41309b = bVar;
        this.f41310c = tL_starGiftUnique;
        this.d = j3;
        this.f41312f = to0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f41308a) {
            case 0:
                wp0.T((wp0) this.f41311e, this.f41309b, this.f41310c, this.d, (to0) this.f41312f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                xh.h4.S((xh.h4) this.f41311e, (org.telegram.ui.ActionBar.b2) this.f41312f, this.f41309b, this.f41310c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public uo0(xh.h4 h4Var, org.telegram.ui.ActionBar.b2 b2Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        this.f41311e = h4Var;
        this.f41312f = b2Var;
        this.f41309b = bVar;
        this.f41310c = tL_starGiftUnique;
        this.d = j3;
    }
}
