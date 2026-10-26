package vg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import fi.k8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.vh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.cy;
import org.telegram.ui.zg1;
public final class g0 extends tg.m1 {
    public static g0 S0;
    public final xg.a Q0;
    public final String R0;

    public g0(r2 r2Var, int i10, TLRPC.User user, tg.k kVar, String str, boolean z10, u6 u6Var) {
        super(r2Var, i10, user, kVar, null, u6Var);
        this.R0 = str;
        qc.a((FrameLayout) this.containerView, new k8(14));
        if (!z10) {
            mm0 mm0Var = this.d;
            int i11 = this.backgroundPaddingLeft;
            mm0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(68.0f));
            xg.a aVar = new xg.a(getContext(), this.resourcesProvider);
            this.Q0 = aVar;
            aVar.setOnClickListener(new ig.d0(this, 23));
            xg.a aVar2 = this.Q0;
            aVar2.e = true;
            fi.d dVar = aVar2.f51751a;
            dVar.setEnabled(true);
            dVar.i(LocaleController.getString(R.string.GiftPremiumActivateForFree), false, true);
            f7.i(y6.f23427h5, aVar2.f51752b, aVar2.f51753c);
            this.containerView.addView(this.Q0, gb1.h(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        fixNavigationBar();
    }

    public static void i0(g0 g0Var, TLRPC.TL_error tL_error) {
        g0Var.Q0.b(false);
        j.c(tL_error, (FrameLayout) g0Var.containerView, g0Var.resourcesProvider, new e0(g0Var, 0));
    }

    public static void j0(g0 g0Var) {
        tg.m1 m1Var = new tg.m1(g0Var.f26811n, UserConfig.selectedAccount, null, null, null, g0Var.resourcesProvider);
        m1Var.J0 = true;
        m1Var.K0 = true;
        m1Var.f48935c0 = true;
        g0Var.f26811n.showDialog(m1Var);
    }

    public static void k0(g0 g0Var) {
        cy cyVar = new cy(vh.c(3, "onlySelect", "dialogsType", true));
        cyVar.C2 = new zg1(23, g0Var, "https://t.me/giftcode/" + g0Var.R0);
        g0Var.f26811n.presentFragment(cyVar);
        g0Var.dismiss();
    }

    @Override
    public final int c0() {
        return 6;
    }

    @Override
    public final void d0(View view) {
        ((xg.t) view).setSlug(this.R0);
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        S0 = null;
    }

    @Override
    public final View e0(Context context, int i10) {
        if (i10 == 6) {
            xg.t tVar = new xg.t(context, this.resourcesProvider);
            tVar.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            return tVar;
        }
        return null;
    }

    @Override
    public final void g0(boolean z10) {
        super.g0(z10);
        this.P0.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        ((ViewGroup.MarginLayoutParams) this.P0.getLayoutParams()).bottomMargin = AndroidUtilities.dp(14.0f);
        ((ViewGroup.MarginLayoutParams) this.P0.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
        this.P0.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumAboutThisLink", R.string.GiftPremiumAboutThisLink), y6.gc, 0, new e0(this, 0)), AndroidUtilities.replaceTags(LocaleController.getString("GiftPremiumAboutThisLinkEnd", R.string.GiftPremiumAboutThisLinkEnd))));
    }

    @Override
    public final void h0() {
        int i10 = this.f48938f0;
        this.f48939g0 = i10;
        this.f48940h0 = i10 + 1;
        int i11 = i10 + 2;
        this.f48938f0 = i11;
        this.f48941i0 = i11;
        this.f48942j0 = i11;
        int size = this.X.size() + i11;
        this.f48943k0 = size;
        this.f48938f0 = size + 1;
        this.f48944l0 = size;
    }
}
