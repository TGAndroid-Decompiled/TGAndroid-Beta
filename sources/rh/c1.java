package rh;

import android.content.Context;
import org.telegram.messenger.j20;
import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.vm0;
public final class c1 implements q20 {
    public final e4 f46696a;
    public final ph.k0 f46697b;
    public final sf.b f46698c;
    public final TL_stars.TL_starGiftUnique d;
    public final long e;
    public final TLRPC.TL_textWithEntities f46699f;
    public final boolean f46700g;

    public c1(e4 e4Var, ph.k0 k0Var, sf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10) {
        this.f46696a = e4Var;
        this.f46697b = k0Var;
        this.f46698c = bVar;
        this.d = tL_starGiftUnique;
        this.e = j10;
        this.f46699f = tL_textWithEntities;
        this.f46700g = z10;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
        final e4 e4Var = this.f46696a;
        e4Var.f46801c2.setLoading(false);
        final ph.k0 k0Var = this.f46697b;
        if (k0Var != null && k0Var.C1) {
            k0Var.C1 = false;
            k0Var.f45159y1.h(false);
        }
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        d3 d3Var = new d3(this.f46698c, tL_payments_paymentFormStarGift);
        Context context = e4Var.getContext();
        org.telegram.ui.ActionBar.p6 p6Var = e4Var.I0;
        int i10 = e4Var.f21583a;
        String z12 = e4Var.z1();
        final TL_stars.TL_starGiftUnique tL_starGiftUnique = this.d;
        final long j10 = this.e;
        final TLRPC.TL_textWithEntities tL_textWithEntities = this.f46699f;
        final boolean z10 = this.f46700g;
        new g3(context, p6Var, tL_starGiftUnique, d3Var, i10, j10, z12, false, new j20() {
            @Override
            public final void a(Object obj2, Object obj3) {
                d3 d3Var2 = (d3) obj2;
                gf.e eVar = (gf.e) obj3;
                eVar.d();
                e4 e4Var2 = e4.this;
                e6 x10 = e6.x(e4Var2.f21583a, d3Var2.f46756a);
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift2 = d3Var2.f46757b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                long j11 = j10;
                x10.h(tL_payments_paymentFormStarGift2, tL_starGiftUnique2, j11, tL_textWithEntities, z10, new vm0(e4Var2, eVar, tL_starGiftUnique2, j11, k0Var, 1));
            }
        }).b();
    }
}
