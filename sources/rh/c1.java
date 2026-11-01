package rh;

import android.content.Context;
import org.telegram.messenger.k20;
import org.telegram.messenger.r20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.tm0;
public final class c1 implements r20 {
    public final e4 f46710a;
    public final ph.k0 f46711b;
    public final sf.b f46712c;
    public final TL_stars.TL_starGiftUnique d;
    public final long e;
    public final TLRPC.TL_textWithEntities f46713f;
    public final boolean f46714g;

    public c1(e4 e4Var, ph.k0 k0Var, sf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10) {
        this.f46710a = e4Var;
        this.f46711b = k0Var;
        this.f46712c = bVar;
        this.d = tL_starGiftUnique;
        this.e = j10;
        this.f46713f = tL_textWithEntities;
        this.f46714g = z10;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
        final e4 e4Var = this.f46710a;
        e4Var.f46815c2.setLoading(false);
        final ph.k0 k0Var = this.f46711b;
        if (k0Var != null && k0Var.C1) {
            k0Var.C1 = false;
            k0Var.f45170y1.h(false);
        }
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        e3 e3Var = new e3(this.f46712c, tL_payments_paymentFormStarGift);
        Context context = e4Var.getContext();
        org.telegram.ui.ActionBar.p6 p6Var = e4Var.I0;
        int i10 = e4Var.f21584a;
        String z12 = e4Var.z1();
        final TL_stars.TL_starGiftUnique tL_starGiftUnique = this.d;
        final long j10 = this.e;
        final TLRPC.TL_textWithEntities tL_textWithEntities = this.f46713f;
        final boolean z10 = this.f46714g;
        new g3(context, p6Var, tL_starGiftUnique, e3Var, i10, j10, z12, false, new k20() {
            @Override
            public final void a(Object obj2, Object obj3) {
                e3 e3Var2 = (e3) obj2;
                gf.e eVar = (gf.e) obj3;
                eVar.d();
                e4 e4Var2 = e4.this;
                e6 x10 = e6.x(e4Var2.f21584a, e3Var2.f46808a);
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift2 = e3Var2.f46809b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                long j11 = j10;
                x10.h(tL_payments_paymentFormStarGift2, tL_starGiftUnique2, j11, tL_textWithEntities, z10, new tm0(e4Var2, eVar, tL_starGiftUnique2, j11, k0Var, 1));
            }
        }).b();
    }
}
