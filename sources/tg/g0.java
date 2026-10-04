package tg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ci.z8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.uy;
import w7.z5;
public final class g0 extends rg.m1 {
    public static g0 S0;
    public final vg.a Q0;
    public final String R0;

    public g0(n2 n2Var, int i10, TLRPC.User user, rg.k kVar, String str, boolean z10, d6 d6Var) {
        super(n2Var, i10, user, kVar, null, d6Var);
        this.R0 = str;
        rc.a((FrameLayout) this.containerView, new z8(15));
        if (!z10) {
            zl0 zl0Var = this.d;
            int i11 = this.backgroundPaddingLeft;
            zl0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(68.0f));
            vg.a aVar = new vg.a(getContext(), this.resourcesProvider);
            this.Q0 = aVar;
            aVar.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 11));
            vg.a aVar2 = this.Q0;
            aVar2.f48276e = true;
            ci.d dVar = aVar2.f48273a;
            dVar.setEnabled(true);
            dVar.g(LocaleController.getString(R.string.GiftPremiumActivateForFree), false, true);
            aVar2.f48274b.setBackgroundColor(i6.v0(i6.f20894h5, aVar2.f48275c));
            this.containerView.addView(this.Q0, z5.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        fixNavigationBar();
    }

    public static void c0(g0 g0Var, TLRPC.TL_error tL_error) {
        g0Var.Q0.b(false);
        i.c(tL_error, (FrameLayout) g0Var.containerView, g0Var.resourcesProvider, new e0(g0Var, 0));
    }

    public static void d0(g0 g0Var) {
        rg.m1 m1Var = new rg.m1(g0Var.f25309n, UserConfig.selectedAccount, null, null, null, g0Var.resourcesProvider);
        m1Var.J0 = true;
        m1Var.K0 = true;
        m1Var.f46195c0 = true;
        g0Var.f25309n.showDialog(m1Var);
    }

    public static void e0(g0 g0Var) {
        uy uyVar = new uy(bi.d(3, "onlySelect", "dialogsType", true));
        uyVar.C2 = new rg.x(6, g0Var, "https://t.me/giftcode/" + g0Var.R0);
        g0Var.f25309n.presentFragment(uyVar);
        g0Var.dismiss();
    }

    @Override
    public final int W() {
        return 6;
    }

    @Override
    public final void X(View view) {
        ((vg.t) view).setSlug(this.R0);
    }

    @Override
    public final View Y(Context context, int i10) {
        if (i10 == 6) {
            vg.t tVar = new vg.t(context, this.resourcesProvider);
            tVar.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            return tVar;
        }
        return null;
    }

    @Override
    public final void Z(boolean z10) {
        super.Z(z10);
        this.P0.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        ((ViewGroup.MarginLayoutParams) this.P0.getLayoutParams()).bottomMargin = AndroidUtilities.dp(14.0f);
        ((ViewGroup.MarginLayoutParams) this.P0.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
        this.P0.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumAboutThisLink", R.string.GiftPremiumAboutThisLink), i6.gc, 0, new e0(this, 0)), AndroidUtilities.replaceTags(LocaleController.getString("GiftPremiumAboutThisLinkEnd", R.string.GiftPremiumAboutThisLinkEnd))));
    }

    @Override
    public final void b0() {
        int i10 = this.f46198f0;
        this.f46199g0 = i10;
        this.f46200h0 = i10 + 1;
        int i11 = i10 + 2;
        this.f46198f0 = i11;
        this.f46201i0 = i11;
        this.f46202j0 = i11;
        int size = this.X.size() + i11;
        this.f46203k0 = size;
        this.f46198f0 = size + 1;
        this.f46204l0 = size;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        S0 = null;
    }
}
