package ug;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import di.z8;
import ji.o4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.sk;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.yy;
import w7.z5;
public final class g0 extends sg.m1 {
    public static g0 S0;
    public final wg.a Q0;
    public final String R0;

    public g0(m2 m2Var, int i10, TLRPC.User user, sg.k kVar, String str, boolean z10, c6 c6Var) {
        super(m2Var, i10, user, kVar, null, c6Var);
        this.R0 = str;
        sc.a((FrameLayout) this.containerView, new z8(15));
        if (!z10) {
            mm0 mm0Var = this.d;
            int i11 = this.backgroundPaddingLeft;
            mm0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(68.0f));
            wg.a aVar = new wg.a(getContext(), this.resourcesProvider);
            this.Q0 = aVar;
            aVar.setOnClickListener(new o4(this, 12));
            wg.a aVar2 = this.Q0;
            aVar2.e = true;
            di.d dVar = aVar2.f47554a;
            dVar.setEnabled(true);
            dVar.g(LocaleController.getString(R.string.GiftPremiumActivateForFree), false, true);
            aVar2.f47555b.setBackgroundColor(g6.w0(g6.f19672h5, aVar2.f47556c));
            this.containerView.addView(this.Q0, z5.a(68.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 80));
        }
        fixNavigationBar();
    }

    public static void d0(g0 g0Var, TLRPC.TL_error tL_error) {
        g0Var.Q0.b(false);
        j.c(tL_error, (FrameLayout) g0Var.containerView, g0Var.resourcesProvider, new e0(g0Var, 0));
    }

    public static void e0(g0 g0Var) {
        sg.m1 m1Var = new sg.m1(g0Var.f24070n, UserConfig.selectedAccount, null, null, null, g0Var.resourcesProvider);
        m1Var.J0 = true;
        m1Var.K0 = true;
        m1Var.f45254c0 = true;
        g0Var.f24070n.showDialog(m1Var);
    }

    public static void f0(g0 g0Var) {
        yy yyVar = new yy(sk.d(3, "onlySelect", "dialogsType", true));
        yyVar.C2 = new org.telegram.ui.web.o0(15, g0Var, "https://t.me/giftcode/" + g0Var.R0);
        g0Var.f24070n.presentFragment(yyVar);
        g0Var.dismiss();
    }

    @Override
    public final int Y() {
        return 6;
    }

    @Override
    public final void Z(View view) {
        ((wg.t) view).setSlug(this.R0);
    }

    @Override
    public final View a0(Context context, int i10) {
        if (i10 == 6) {
            wg.t tVar = new wg.t(context, this.resourcesProvider);
            tVar.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            return tVar;
        }
        return null;
    }

    @Override
    public final void b0(boolean z10) {
        super.b0(z10);
        this.P0.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        ((ViewGroup.MarginLayoutParams) this.P0.getLayoutParams()).bottomMargin = AndroidUtilities.dp(14.0f);
        ((ViewGroup.MarginLayoutParams) this.P0.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
        this.P0.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumAboutThisLink", R.string.GiftPremiumAboutThisLink), g6.f19660gc, 0, new e0(this, 0)), AndroidUtilities.replaceTags(LocaleController.getString("GiftPremiumAboutThisLinkEnd", R.string.GiftPremiumAboutThisLinkEnd))));
    }

    @Override
    public final void c0() {
        int i10 = this.f45257f0;
        this.f45258g0 = i10;
        this.f45259h0 = i10 + 1;
        int i11 = i10 + 2;
        this.f45257f0 = i11;
        this.f45260i0 = i11;
        this.f45261j0 = i11;
        int size = this.X.size() + i11;
        this.f45262k0 = size;
        this.f45257f0 = size + 1;
        this.f45263l0 = size;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        S0 = null;
    }
}
