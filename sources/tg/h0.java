package tg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ci.d9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.w1;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.uy;
import w7.x5;
public final class h0 extends rg.k1 {
    public static h0 S0;
    public final vg.a Q0;
    public final String R0;

    public h0(n2 n2Var, int i10, TLRPC.User user, rg.k kVar, String str, boolean z10, e6 e6Var) {
        super(n2Var, i10, user, kVar, null, e6Var);
        this.R0 = str;
        oc.a((FrameLayout) this.containerView, new d9(15));
        if (!z10) {
            ll0 ll0Var = this.d;
            int i11 = this.backgroundPaddingLeft;
            ll0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(68.0f));
            vg.a aVar = new vg.a(getContext(), this.resourcesProvider);
            this.Q0 = aVar;
            aVar.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 11));
            vg.a aVar2 = this.Q0;
            aVar2.e = true;
            ci.d dVar = aVar2.f44297a;
            dVar.setEnabled(true);
            dVar.g(LocaleController.getString(R.string.GiftPremiumActivateForFree), false, true);
            aVar2.f44298b.setBackgroundColor(i6.v0(i6.f18907h5, aVar2.f44299c));
            this.containerView.addView(this.Q0, x5.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        fixNavigationBar();
    }

    public static void c0(h0 h0Var, TLRPC.TL_error tL_error) {
        h0Var.Q0.b(false);
        k.c(tL_error, (FrameLayout) h0Var.containerView, h0Var.resourcesProvider, new f0(h0Var, 0));
    }

    public static void d0(h0 h0Var) {
        rg.k1 k1Var = new rg.k1(h0Var.f30528n, UserConfig.selectedAccount, null, null, null, h0Var.resourcesProvider);
        k1Var.J0 = true;
        k1Var.K0 = true;
        k1Var.f42346c0 = true;
        h0Var.f30528n.showDialog(k1Var);
    }

    public static void e0(h0 h0Var) {
        uy uyVar = new uy(w1.e(3, "onlySelect", "dialogsType", true));
        uyVar.C2 = new d(4, h0Var, "https://t.me/giftcode/" + h0Var.R0);
        h0Var.f30528n.presentFragment(uyVar);
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
        this.P0.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumAboutThisLink", R.string.GiftPremiumAboutThisLink), i6.gc, 0, new f0(this, 0)), AndroidUtilities.replaceTags(LocaleController.getString("GiftPremiumAboutThisLinkEnd", R.string.GiftPremiumAboutThisLinkEnd))));
    }

    @Override
    public final void b0() {
        int i10 = this.f42349f0;
        this.f42350g0 = i10;
        this.f42351h0 = i10 + 1;
        int i11 = i10 + 2;
        this.f42349f0 = i11;
        this.f42352i0 = i11;
        this.f42353j0 = i11;
        int size = this.X.size() + i11;
        this.f42354k0 = size;
        this.f42349f0 = size + 1;
        this.f42355l0 = size;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        S0 = null;
    }
}
