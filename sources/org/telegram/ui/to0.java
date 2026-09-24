package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class to0 implements Utilities.Callback {
    public final int f38141a = 0;
    public final zf.b f38142b;
    public final TL_stars.TL_starGiftUnique f38143c;
    public final long d;
    public final Object e;
    public final Object f38144f;

    public to0(tp0 tp0Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, qo0 qo0Var) {
        this.e = tp0Var;
        this.f38142b = bVar;
        this.f38143c = tL_starGiftUnique;
        this.d = j3;
        this.f38144f = qo0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38141a) {
            case 0:
                tp0.V((tp0) this.e, this.f38142b, this.f38143c, this.d, (qo0) this.f38144f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                xh.h4.U((xh.h4) this.e, (org.telegram.ui.ActionBar.a2) this.f38144f, this.f38142b, this.f38143c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public to0(xh.h4 h4Var, org.telegram.ui.ActionBar.a2 a2Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        this.e = h4Var;
        this.f38144f = a2Var;
        this.f38142b = bVar;
        this.f38143c = tL_starGiftUnique;
        this.d = j3;
    }
}
