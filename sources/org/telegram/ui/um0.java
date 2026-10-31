package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class um0 implements org.telegram.messenger.q20 {
    public final int f42165a = 0;
    public final sf.b f42166b;
    public final TL_stars.TL_starGiftUnique f42167c;
    public final long d;
    public final Object e;
    public final Object f42168f;

    public um0(tn0 tn0Var, sf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, tm0 tm0Var) {
        this.e = tn0Var;
        this.f42166b = bVar;
        this.f42167c = tL_starGiftUnique;
        this.d = j10;
        this.f42168f = tm0Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f42165a) {
            case 0:
                tn0.Z((tn0) this.e, this.f42166b, this.f42167c, this.d, (tm0) this.f42168f, (TLRPC.TL_payments_paymentFormStarGift) obj);
                return;
            default:
                ph.q3 q3Var = (ph.q3) this.e;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                ((org.telegram.ui.ActionBar.x1) this.f42168f).dismiss();
                if (tL_payments_paymentFormStarGift != null) {
                    rh.d3 d3Var = new rh.d3(this.f42166b, tL_payments_paymentFormStarGift);
                    Context context = q3Var.getContext();
                    org.telegram.ui.ActionBar.p6 p6Var = q3Var.I0;
                    int i10 = q3Var.f21583a;
                    StringBuilder sb2 = new StringBuilder();
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f42167c;
                    sb2.append(tL_starGiftUnique.title);
                    sb2.append(" #");
                    String k10 = i0.a.k(tL_starGiftUnique.num, ',', sb2);
                    long j10 = this.d;
                    new rh.g3(context, p6Var, tL_starGiftUnique, d3Var, i10, j10, k10, true, new org.telegram.ui.Components.q70(q3Var, tL_starGiftUnique, j10, 1)).b();
                    return;
                }
                return;
        }
    }

    public um0(ph.q3 q3Var, org.telegram.ui.ActionBar.x1 x1Var, sf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        this.e = q3Var;
        this.f42168f = x1Var;
        this.f42166b = bVar;
        this.f42167c = tL_starGiftUnique;
        this.d = j10;
    }
}
