package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class zo0 implements Utilities.Callback {
    public final int f45029a = 0;
    public final zf.b f45030b;
    public final TL_stars.TL_starGiftUnique f45031c;
    public final long d;
    public final Object f45032e;
    public final Object f45033f;

    public zo0(zp0 zp0Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, wo0 wo0Var) {
        this.f45032e = zp0Var;
        this.f45030b = bVar;
        this.f45031c = tL_starGiftUnique;
        this.d = j3;
        this.f45033f = wo0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f45029a) {
            case 0:
                zp0.V((zp0) this.f45032e, this.f45030b, this.f45031c, this.d, (wo0) this.f45033f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                xh.h4.V((xh.h4) this.f45032e, (org.telegram.ui.ActionBar.a2) this.f45033f, this.f45030b, this.f45031c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public zo0(xh.h4 h4Var, org.telegram.ui.ActionBar.a2 a2Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        this.f45032e = h4Var;
        this.f45033f = a2Var;
        this.f45030b = bVar;
        this.f45031c = tL_starGiftUnique;
        this.d = j3;
    }
}
