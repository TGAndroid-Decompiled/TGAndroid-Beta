package wg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.ja;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Wallet.k8;
import org.telegram.ui.yw;
import tg.h2;
import ug.g1;
public final class e0 extends g1 {
    public static e0 O2;
    public final yg.a M2;
    public final String N2;

    public e0(e2 e2Var, int i7, TLRPC.User user, ug.j jVar, String str, boolean z10, e6 e6Var) {
        super(e2Var, i7, user, jVar, null, e6Var);
        this.N2 = str;
        xb.a((FrameLayout) this.f29682b, new bi.t(16));
        if (!z10) {
            uj0 uj0Var = this.f35931o1;
            int i10 = this.f29717u0;
            uj0Var.setPadding(i10, 0, i10, org.telegram.messenger.g0.L(68.0f));
            yg.a aVar = new yg.a(getContext(), this.J0);
            this.M2 = aVar;
            aVar.setOnClickListener(new h2(this, 3));
            yg.a aVar2 = this.M2;
            aVar2.f60635e = true;
            hi.d dVar = aVar2.f60632a;
            dVar.setEnabled(true);
            dVar.i(hd.M0(2131749675, null), false, true);
            q6.h(j6.f28922h5, aVar2.f60633b, aVar2.f60634c);
            this.f29682b.addView(this.M2, ja.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        O();
    }

    public static void l1(e0 e0Var) {
        yw ywVar = new yw(org.telegram.ui.Cells.y0.j(3, "onlySelect", "dialogsType", true));
        ywVar.E2 = new k8(27, e0Var, "https://t.me/giftcode/" + e0Var.N2);
        e0Var.f35935s1.presentFragment(ywVar);
        e0Var.dismiss();
    }

    @Override
    public final void L() {
        super.L();
        O2 = null;
    }

    @Override
    public final int f1() {
        return 6;
    }

    @Override
    public final void g1(View view) {
        ((yg.t) view).setSlug(this.N2);
    }

    @Override
    public final View h1(Context context, int i7) {
        if (i7 == 6) {
            yg.t tVar = new yg.t(context, this.J0);
            tVar.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
            return tVar;
        }
        return null;
    }

    @Override
    public final void j1(boolean z10) {
        super.j1(z10);
        this.L2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        ((ViewGroup.MarginLayoutParams) this.L2.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(14.0f);
        ((ViewGroup.MarginLayoutParams) this.L2.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(12.0f);
        this.L2.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.S2(hd.M0(2131749679, "GiftPremiumAboutThisLink"), j6.Xc, 0, new c0(this, 0), null), org.telegram.messenger.g0.X2(hd.M0(2131749678, "GiftPremiumAboutThisLinkEnd")), "%1$s"));
    }

    @Override
    public final void k1() {
        int i7 = this.f58088b2;
        this.f58089c2 = i7;
        this.d2 = i7 + 1;
        int i10 = i7 + 2;
        this.f58088b2 = i10;
        this.f58090e2 = i10;
        this.f58091f2 = i10;
        int size = this.T1.size() + i10;
        this.f58092g2 = size;
        this.f58088b2 = size + 1;
        this.f58093h2 = size;
    }
}
