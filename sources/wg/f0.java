package wg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.na;
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.fc;
import org.telegram.ui.bx;
import org.telegram.ui.uc1;
import ug.h1;
public final class f0 extends h1 {
    public static f0 O2;
    public final yg.a M2;
    public final String N2;

    public f0(g2 g2Var, int i7, TLRPC.User user, ug.j jVar, String str, boolean z10, i6 i6Var) {
        super(g2Var, i7, user, jVar, null, i6Var);
        this.N2 = str;
        fc.a((FrameLayout) this.f30226b, new bi.t(16));
        if (!z10) {
            ek0 ek0Var = this.f39246o1;
            int i10 = this.f30261u0;
            ek0Var.setPadding(i10, 0, i10, org.telegram.messenger.g0.L(68.0f));
            yg.a aVar = new yg.a(getContext(), this.J0);
            this.M2 = aVar;
            aVar.setOnClickListener(new tg.a0(this, 4));
            yg.a aVar2 = this.M2;
            aVar2.f61332e = true;
            hi.e eVar = aVar2.f61329a;
            eVar.setEnabled(true);
            eVar.i(gd.N0(2131749502, null), false, true);
            u6.h(n6.f29524h5, aVar2.f61330b, aVar2.f61331c);
            this.f30226b.addView(this.M2, na.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        O();
    }

    public static void m1(f0 f0Var) {
        bx bxVar = new bx(org.telegram.ui.Cells.c0.l(3, "onlySelect", "dialogsType", true));
        bxVar.E2 = new uc1(25, f0Var, "https://t.me/giftcode/" + f0Var.N2);
        f0Var.f39250s1.presentFragment(bxVar);
        f0Var.dismiss();
    }

    @Override
    public final void L() {
        super.L();
        O2 = null;
    }

    @Override
    public final int g1() {
        return 6;
    }

    @Override
    public final void h1(View view) {
        ((yg.t) view).setSlug(this.N2);
    }

    @Override
    public final View i1(Context context, int i7) {
        if (i7 == 6) {
            yg.t tVar = new yg.t(context, this.J0);
            tVar.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
            return tVar;
        }
        return null;
    }

    @Override
    public final void k1(boolean z10) {
        super.k1(z10);
        this.L2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        ((ViewGroup.MarginLayoutParams) this.L2.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(14.0f);
        ((ViewGroup.MarginLayoutParams) this.L2.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(12.0f);
        this.L2.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.R2(gd.N0(2131749506, "GiftPremiumAboutThisLink"), n6.Xc, 0, new d0(this, 0), null), org.telegram.messenger.g0.W2(gd.N0(2131749505, "GiftPremiumAboutThisLinkEnd")), "%1$s"));
    }

    @Override
    public final void l1() {
        int i7 = this.f58797b2;
        this.f58798c2 = i7;
        this.d2 = i7 + 1;
        int i10 = i7 + 2;
        this.f58797b2 = i10;
        this.f58799e2 = i10;
        this.f58800f2 = i10;
        int size = this.T1.size() + i10;
        this.f58801g2 = size;
        this.f58797b2 = size + 1;
        this.f58802h2 = size;
    }
}
