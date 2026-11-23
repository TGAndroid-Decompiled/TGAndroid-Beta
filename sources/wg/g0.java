package wg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.na;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.cx;
import org.telegram.ui.wc1;
import ug.h1;
public final class g0 extends h1 {
    public static g0 O2;
    public final yg.a M2;
    public final String N2;

    public g0(g2 g2Var, int i7, TLRPC.User user, ug.j jVar, String str, boolean z10, h6 h6Var) {
        super(g2Var, i7, user, jVar, null, h6Var);
        this.N2 = str;
        gc.a((FrameLayout) this.f30142b, new bi.t(16));
        if (!z10) {
            ek0 ek0Var = this.f39487o1;
            int i10 = this.f30177u0;
            ek0Var.setPadding(i10, 0, i10, org.telegram.messenger.g0.L(68.0f));
            yg.a aVar = new yg.a(getContext(), this.J0);
            this.M2 = aVar;
            aVar.setOnClickListener(new tg.u(this, 4));
            yg.a aVar2 = this.M2;
            aVar2.f61213e = true;
            hi.d dVar = aVar2.f61210a;
            dVar.setEnabled(true);
            dVar.i(hd.N0(2131749502, null), false, true);
            t6.h(m6.f29420h5, aVar2.f61211b, aVar2.f61212c);
            this.f30142b.addView(this.M2, na.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        O();
    }

    public static void m1(g0 g0Var) {
        cx cxVar = new cx(org.telegram.ui.Cells.c0.l(3, "onlySelect", "dialogsType", true));
        cxVar.E2 = new wc1(25, g0Var, "https://t.me/giftcode/" + g0Var.N2);
        g0Var.f39491s1.presentFragment(cxVar);
        g0Var.dismiss();
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
        this.L2.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.R2(hd.N0(2131749506, "GiftPremiumAboutThisLink"), m6.Xc, 0, new e0(this, 0), null), org.telegram.messenger.g0.W2(hd.N0(2131749505, "GiftPremiumAboutThisLinkEnd")), "%1$s"));
    }

    @Override
    public final void l1() {
        int i7 = this.f58682b2;
        this.f58683c2 = i7;
        this.d2 = i7 + 1;
        int i10 = i7 + 2;
        this.f58682b2 = i10;
        this.f58684e2 = i10;
        this.f58685f2 = i10;
        int size = this.T1.size() + i10;
        this.f58686g2 = size;
        this.f58682b2 = size + 1;
        this.f58687h2 = size;
    }
}
