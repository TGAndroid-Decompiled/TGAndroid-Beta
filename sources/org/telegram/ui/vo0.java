package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class vo0 implements Utilities.Callback {
    public final int f38438a = 0;
    public final zf.b f38439b;
    public final TL_stars.TL_starGiftUnique f38440c;
    public final long d;
    public final Object e;
    public final Object f38441f;

    public vo0(up0 up0Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, so0 so0Var) {
        this.e = up0Var;
        this.f38439b = bVar;
        this.f38440c = tL_starGiftUnique;
        this.d = j3;
        this.f38441f = so0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38438a) {
            case 0:
                up0.V((up0) this.e, this.f38439b, this.f38440c, this.d, (so0) this.f38441f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                xh.h4.U((xh.h4) this.e, (org.telegram.ui.ActionBar.b2) this.f38441f, this.f38439b, this.f38440c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public vo0(xh.h4 h4Var, org.telegram.ui.ActionBar.b2 b2Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        this.e = h4Var;
        this.f38441f = b2Var;
        this.f38439b = bVar;
        this.f38440c = tL_starGiftUnique;
        this.d = j3;
    }
}
