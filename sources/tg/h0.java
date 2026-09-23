package tg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ci.a9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.ry;
import w7.x5;
public final class h0 extends rg.k1 {
    public static h0 S0;
    public final vg.a Q0;
    public final String R0;

    public h0(n2 n2Var, int i10, TLRPC.User user, rg.k kVar, String str, boolean z10, d6 d6Var) {
        super(n2Var, i10, user, kVar, null, d6Var);
        this.R0 = str;
        qc.a((FrameLayout) this.containerView, new a9(15));
        if (!z10) {
            ml0 ml0Var = this.d;
            int i11 = this.backgroundPaddingLeft;
            ml0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(68.0f));
            vg.a aVar = new vg.a(getContext(), this.resourcesProvider);
            this.Q0 = aVar;
            aVar.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 11));
            vg.a aVar2 = this.Q0;
            aVar2.e = true;
            ci.d dVar = aVar2.f44247a;
            dVar.setEnabled(true);
            dVar.g(LocaleController.getString(R.string.GiftPremiumActivateForFree), false, true);
            aVar2.f44248b.setBackgroundColor(h6.v0(h6.f18859h5, aVar2.f44249c));
            this.containerView.addView(this.Q0, x5.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        fixNavigationBar();
    }

    public static void c0(h0 h0Var, TLRPC.TL_error tL_error) {
        h0Var.Q0.b(false);
        k.c(tL_error, (FrameLayout) h0Var.containerView, h0Var.resourcesProvider, new f0(h0Var, 0));
    }

    public static void d0(h0 h0Var) {
        rg.k1 k1Var = new rg.k1(h0Var.f22661n, UserConfig.selectedAccount, null, null, null, h0Var.resourcesProvider);
        k1Var.J0 = true;
        k1Var.K0 = true;
        k1Var.f42297c0 = true;
        h0Var.f22661n.showDialog(k1Var);
    }

    public static void e0(h0 h0Var) {
        ry ryVar = new ry(org.telegram.messenger.z0.e(3, "onlySelect", "dialogsType", true));
        ryVar.C2 = new d(4, h0Var, "https://t.me/giftcode/" + h0Var.R0);
        h0Var.f22661n.presentFragment(ryVar);
        h0Var.dismiss();
    }

    @Override
    public final int X() {
        return 6;
    }

    @Override
    public final void Y(View view) {
        ((vg.t) view).setSlug(this.R0);
    }

    @Override
    public final View Z(Context context, int i10) {
        if (i10 == 6) {
            vg.t tVar = new vg.t(context, this.resourcesProvider);
            tVar.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            return tVar;
        }
        return null;
    }

    @Override
    public final void a0(boolean z10) {
        super.a0(z10);
        this.P0.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        ((ViewGroup.MarginLayoutParams) this.P0.getLayoutParams()).bottomMargin = AndroidUtilities.dp(14.0f);
        ((ViewGroup.MarginLayoutParams) this.P0.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
        this.P0.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumAboutThisLink", R.string.GiftPremiumAboutThisLink), h6.gc, 0, new f0(this, 0)), AndroidUtilities.replaceTags(LocaleController.getString("GiftPremiumAboutThisLinkEnd", R.string.GiftPremiumAboutThisLinkEnd))));
    }

    @Override
    public final void b0() {
        int i10 = this.f42300f0;
        this.f42301g0 = i10;
        this.f42302h0 = i10 + 1;
        int i11 = i10 + 2;
        this.f42300f0 = i11;
        this.f42303i0 = i11;
        this.f42304j0 = i11;
        int size = this.X.size() + i11;
        this.f42305k0 = size;
        this.f42300f0 = size + 1;
        this.f42306l0 = size;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        S0 = null;
    }
}
