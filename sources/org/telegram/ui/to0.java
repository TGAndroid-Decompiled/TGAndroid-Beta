package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class to0 implements Utilities.Callback {
    public final int f43684a = 0;
    public final bg.b f43685b;
    public final TL_stars.TL_starGiftUnique f43686c;
    public final long d;
    public final Object e;
    public final Object f43687f;

    public to0(tp0 tp0Var, bg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, so0 so0Var) {
        this.e = tp0Var;
        this.f43685b = bVar;
        this.f43686c = tL_starGiftUnique;
        this.d = j10;
        this.f43687f = so0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43684a) {
            case 0:
                tp0.W((tp0) this.e, this.f43685b, this.f43686c, this.d, (so0) this.f43687f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                zh.g4.U((zh.g4) this.e, (org.telegram.ui.ActionBar.e2) this.f43687f, this.f43685b, this.f43686c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public to0(zh.g4 g4Var, org.telegram.ui.ActionBar.e2 e2Var, bg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        this.e = g4Var;
        this.f43687f = e2Var;
        this.f43685b = bVar;
        this.f43686c = tL_starGiftUnique;
        this.d = j10;
    }
}
