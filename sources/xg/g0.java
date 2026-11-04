package xg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.na1;
import org.telegram.ui.uw;
import vg.h1;
public final class g0 extends h1 {
    public static g0 L2;
    public final zg.a J2;
    public final String K2;

    public g0(d2 d2Var, int i3, TLRPC.User user, vg.j jVar, String str, boolean z10, e6 e6Var) {
        super(d2Var, i3, user, jVar, null, e6Var);
        this.K2 = str;
        ac.a((FrameLayout) this.f28586b, new ai.y(16));
        if (!z10) {
            tj0 tj0Var = this.f36102l1;
            int i10 = this.f28618u0;
            tj0Var.setPadding(i10, 0, i10, org.telegram.messenger.g0.L(68.0f));
            zg.a aVar = new zg.a(getContext(), this.J0);
            this.J2 = aVar;
            aVar.setOnClickListener(new vg.b1(this, 1));
            zg.a aVar2 = this.J2;
            aVar2.f60464e = true;
            gi.d dVar = aVar2.f60461a;
            dVar.setEnabled(true);
            dVar.i(bd.M0(2131749683, null), false, true);
            r6.i(k6.f27954h5, aVar2.f60462b, aVar2.f60463c);
            this.f28586b.addView(this.J2, mf.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        N();
    }

    public static void l1(g0 g0Var) {
        uw uwVar = new uw(f1.l(3, "onlySelect", "dialogsType", true));
        uwVar.D2 = new na1(26, g0Var, "https://t.me/giftcode/" + g0Var.K2);
        g0Var.f36105p1.presentFragment(uwVar);
        g0Var.dismiss();
    }

    @Override
    public final void K() {
        super.K();
        L2 = null;
    }

    @Override
    public final int f1() {
        return 6;
    }

    @Override
    public final void g1(View view) {
        ((zg.t) view).setSlug(this.K2);
    }

    @Override
    public final View h1(Context context, int i3) {
        if (i3 == 6) {
            zg.t tVar = new zg.t(context, this.J0);
            tVar.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
            return tVar;
        }
        return null;
    }

    @Override
    public final void j1(boolean z10) {
        super.j1(z10);
        this.I2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        ((ViewGroup.MarginLayoutParams) this.I2.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(14.0f);
        ((ViewGroup.MarginLayoutParams) this.I2.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(12.0f);
        this.I2.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.S2(bd.M0(2131749687, "GiftPremiumAboutThisLink"), k6.Uc, 0, new e0(this, 0), null), org.telegram.messenger.g0.X2(bd.M0(2131749686, "GiftPremiumAboutThisLinkEnd")), "%1$s"));
    }

    @Override
    public final void k1() {
        int i3 = this.Y1;
        this.Z1 = i3;
        this.f56624a2 = i3 + 1;
        int i10 = i3 + 2;
        this.Y1 = i10;
        this.f56625b2 = i10;
        this.c2 = i10;
        int size = this.Q1.size() + i10;
        this.f56626d2 = size;
        this.Y1 = size + 1;
        this.f56627e2 = size;
    }
}
