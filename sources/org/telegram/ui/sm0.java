package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class sm0 implements org.telegram.messenger.r20 {
    public final int f41394a = 0;
    public final sf.b f41395b;
    public final TL_stars.TL_starGiftUnique f41396c;
    public final long d;
    public final Object e;
    public final Object f41397f;

    public sm0(rn0 rn0Var, sf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, rm0 rm0Var) {
        this.e = rn0Var;
        this.f41395b = bVar;
        this.f41396c = tL_starGiftUnique;
        this.d = j10;
        this.f41397f = rm0Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f41394a) {
            case 0:
                rn0.a0((rn0) this.e, this.f41395b, this.f41396c, this.d, (rm0) this.f41397f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                ph.q3 q3Var = (ph.q3) this.e;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                ((org.telegram.ui.ActionBar.x1) this.f41397f).dismiss();
                if (tL_payments_paymentFormStarGift != null) {
                    rh.e3 e3Var = new rh.e3(this.f41395b, tL_payments_paymentFormStarGift);
                    Context context = q3Var.getContext();
                    org.telegram.ui.ActionBar.p6 p6Var = q3Var.I0;
                    int i10 = q3Var.f21584a;
                    StringBuilder sb2 = new StringBuilder();
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f41396c;
                    sb2.append(tL_starGiftUnique.title);
                    sb2.append(" #");
                    String k10 = i0.a.k(tL_starGiftUnique.num, ',', sb2);
                    long j10 = this.d;
                    new rh.g3(context, p6Var, tL_starGiftUnique, e3Var, i10, j10, k10, true, new org.telegram.ui.Components.q70(q3Var, tL_starGiftUnique, j10, 1)).b();
                    return;
                }
                return;
        }
    }

    public sm0(ph.q3 q3Var, org.telegram.ui.ActionBar.x1 x1Var, sf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        this.e = q3Var;
        this.f41397f = x1Var;
        this.f41395b = bVar;
        this.f41396c = tL_starGiftUnique;
        this.d = j10;
    }
}
