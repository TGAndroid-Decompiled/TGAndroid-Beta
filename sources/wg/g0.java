package wg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.ha;
import fi.r7;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.ww;
public final class g0 extends ug.f1 {
    public static g0 K2;
    public final yg.a I2;
    public final String J2;

    public g0(f2 f2Var, int i7, TLRPC.User user, ug.j jVar, String str, boolean z9, f6 f6Var) {
        super(f2Var, i7, user, jVar, null, f6Var);
        this.J2 = str;
        cc.a((FrameLayout) this.f28615b, new r7(15));
        if (!z9) {
            pj0 pj0Var = this.f36328k1;
            int i10 = this.f28645t0;
            pj0Var.setPadding(i10, 0, i10, org.telegram.messenger.g0.L(68.0f));
            yg.a aVar = new yg.a(getContext(), this.I0);
            this.I2 = aVar;
            aVar.setOnClickListener(new ii.g(this, 27));
            yg.a aVar2 = this.I2;
            aVar2.f59301e = true;
            fi.d dVar = aVar2.f59298a;
            dVar.setEnabled(true);
            dVar.i(hd.M0(2131749674, null), false, true);
            r6.i(k6.f27921h5, aVar2.f59299b, aVar2.f59300c);
            this.f28615b.addView(this.I2, ha.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        N();
    }

    public static void l1(g0 g0Var) {
        ww wwVar = new ww(org.telegram.ui.Cells.f1.h(3, "onlySelect", "dialogsType", true));
        wwVar.C2 = new org.telegram.ui.web.a0(22, g0Var, "https://t.me/giftcode/" + g0Var.J2);
        g0Var.f36330o1.presentFragment(wwVar);
        g0Var.dismiss();
    }

    @Override
    public final void K() {
        super.K();
        K2 = null;
    }

    @Override
    public final int f1() {
        return 6;
    }

    @Override
    public final void g1(View view) {
        ((yg.t) view).setSlug(this.J2);
    }

    @Override
    public final View h1(Context context, int i7) {
        if (i7 == 6) {
            yg.t tVar = new yg.t(context, this.I0);
            tVar.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
            return tVar;
        }
        return null;
    }

    @Override
    public final void j1(boolean z9) {
        super.j1(z9);
        this.H2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        ((ViewGroup.MarginLayoutParams) this.H2.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(14.0f);
        ((ViewGroup.MarginLayoutParams) this.H2.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(12.0f);
        this.H2.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.S2(hd.M0(2131749678, "GiftPremiumAboutThisLink"), k6.Uc, 0, new e0(this, 0), null), org.telegram.messenger.g0.X2(hd.M0(2131749677, "GiftPremiumAboutThisLinkEnd")), "%1$s"));
    }

    @Override
    public final void k1() {
        int i7 = this.X1;
        this.Y1 = i7;
        this.Z1 = i7 + 1;
        int i10 = i7 + 2;
        this.X1 = i10;
        this.f56446a2 = i10;
        this.f56447b2 = i10;
        int size = this.P1.size() + i10;
        this.f56448c2 = size;
        this.X1 = size + 1;
        this.d2 = size;
    }
}
