package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class zo0 implements Utilities.Callback {
    public final int f45063a = 0;
    public final zf.b f45064b;
    public final TL_stars.TL_starGiftUnique f45065c;
    public final long d;
    public final Object f45066e;
    public final Object f45067f;

    public zo0(zp0 zp0Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, wo0 wo0Var) {
        this.f45066e = zp0Var;
        this.f45064b = bVar;
        this.f45065c = tL_starGiftUnique;
        this.d = j3;
        this.f45067f = wo0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f45063a) {
            case 0:
                zp0.V((zp0) this.f45066e, this.f45064b, this.f45065c, this.d, (wo0) this.f45067f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                xh.h4.V((xh.h4) this.f45066e, (org.telegram.ui.ActionBar.a2) this.f45067f, this.f45064b, this.f45065c, this.d, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
        }
    }

    public zo0(xh.h4 h4Var, org.telegram.ui.ActionBar.a2 a2Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        this.f45066e = h4Var;
        this.f45067f = a2Var;
        this.f45064b = bVar;
        this.f45065c = tL_starGiftUnique;
        this.d = j3;
    }
}
