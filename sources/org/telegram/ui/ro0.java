package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ro0 implements Utilities.Callback {
    public final int f43198a = 0;
    public final bg.b f43199b;
    public final TL_stars.TL_starGiftUnique f43200c;
    public final long d;
    public final Object e;
    public final Object f43201f;

    public ro0(rp0 rp0Var, bg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, qo0 qo0Var) {
        this.e = rp0Var;
        this.f43199b = bVar;
        this.f43200c = tL_starGiftUnique;
        this.d = j10;
        this.f43201f = qo0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43198a) {
            case 0:
                rp0.W((rp0) this.e, this.f43199b, this.f43200c, this.d, (qo0) this.f43201f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                zh.g4.U((zh.g4) this.e, (org.telegram.ui.ActionBar.e2) this.f43201f, this.f43199b, this.f43200c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public ro0(zh.g4 g4Var, org.telegram.ui.ActionBar.e2 e2Var, bg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        this.e = g4Var;
        this.f43201f = e2Var;
        this.f43199b = bVar;
        this.f43200c = tL_starGiftUnique;
        this.d = j10;
    }
}
