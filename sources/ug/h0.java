package ug;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import di.c9;
import ji.m4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.w1;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.uy;
import sg.o1;
import w7.x5;
public final class h0 extends o1 {
    public static h0 S0;
    public final wg.a Q0;
    public final String R0;

    public h0(n2 n2Var, int i10, TLRPC.User user, sg.k kVar, String str, boolean z10, f6 f6Var) {
        super(n2Var, i10, user, kVar, null, f6Var);
        this.R0 = str;
        qc.a((FrameLayout) this.containerView, new c9(15));
        if (!z10) {
            ll0 ll0Var = this.d;
            int i11 = this.backgroundPaddingLeft;
            ll0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(68.0f));
            wg.a aVar = new wg.a(getContext(), this.resourcesProvider);
            this.Q0 = aVar;
            aVar.setOnClickListener(new m4(this, 12));
            wg.a aVar2 = this.Q0;
            aVar2.f48526e = true;
            di.d dVar = aVar2.f48523a;
            dVar.setEnabled(true);
            dVar.g(LocaleController.getString(R.string.GiftPremiumActivateForFree), false, true);
            aVar2.f48524b.setBackgroundColor(j6.v0(j6.f20761h5, aVar2.f48525c));
            this.containerView.addView(this.Q0, x5.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        fixNavigationBar();
    }

    public static void c0(h0 h0Var, TLRPC.TL_error tL_error) {
        h0Var.Q0.b(false);
        j.c(tL_error, (FrameLayout) h0Var.containerView, h0Var.resourcesProvider, new f0(h0Var, 0));
    }

    public static void d0(h0 h0Var) {
        o1 o1Var = new o1(h0Var.f24676n, UserConfig.selectedAccount, null, null, null, h0Var.resourcesProvider);
        o1Var.J0 = true;
        o1Var.K0 = true;
        o1Var.f46224c0 = true;
        h0Var.f24676n.showDialog(o1Var);
    }

    public static void e0(h0 h0Var) {
        uy uyVar = new uy(w1.e(3, "onlySelect", "dialogsType", true));
        uyVar.C2 = new sg.x(6, h0Var, "https://t.me/giftcode/" + h0Var.R0);
        h0Var.f24676n.presentFragment(uyVar);
        h0Var.dismiss();
    }

    @Override
    public final int X() {
        return 6;
    }

    @Override
    public final void Y(View view) {
        ((wg.t) view).setSlug(this.R0);
    }

    @Override
    public final View Z(Context context, int i10) {
        if (i10 == 6) {
            wg.t tVar = new wg.t(context, this.resourcesProvider);
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
        this.P0.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumAboutThisLink", R.string.GiftPremiumAboutThisLink), j6.gc, 0, new f0(this, 0)), AndroidUtilities.replaceTags(LocaleController.getString("GiftPremiumAboutThisLinkEnd", R.string.GiftPremiumAboutThisLinkEnd))));
    }

    @Override
    public final void b0() {
        int i10 = this.f46227f0;
        this.f46228g0 = i10;
        this.f46229h0 = i10 + 1;
        int i11 = i10 + 2;
        this.f46227f0 = i11;
        this.f46230i0 = i11;
        this.f46231j0 = i11;
        int size = this.X.size() + i11;
        this.f46232k0 = size;
        this.f46227f0 = size + 1;
        this.f46233l0 = size;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        S0 = null;
    }
}
