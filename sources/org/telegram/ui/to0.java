package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class to0 implements Utilities.Callback {
    public final int f38157a = 0;
    public final zf.b f38158b;
    public final TL_stars.TL_starGiftUnique f38159c;
    public final long d;
    public final Object e;
    public final Object f38160f;

    public to0(tp0 tp0Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, qo0 qo0Var) {
        this.e = tp0Var;
        this.f38158b = bVar;
        this.f38159c = tL_starGiftUnique;
        this.d = j3;
        this.f38160f = qo0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38157a) {
            case 0:
                tp0.V((tp0) this.e, this.f38158b, this.f38159c, this.d, (qo0) this.f38160f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                xh.h4.U((xh.h4) this.e, (org.telegram.ui.ActionBar.a2) this.f38160f, this.f38158b, this.f38159c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public to0(xh.h4 h4Var, org.telegram.ui.ActionBar.a2 a2Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        this.e = h4Var;
        this.f38160f = a2Var;
        this.f38158b = bVar;
        this.f38159c = tL_starGiftUnique;
        this.d = j3;
    }
}
