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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.vy;
import qg.x1;
import w7.w5;
public final class f0 extends rg.l1 {
    public static f0 S0;
    public final vg.a Q0;
    public final String R0;

    public f0(m2 m2Var, int i10, TLRPC.User user, rg.k kVar, String str, boolean z10, c6 c6Var) {
        super(m2Var, i10, user, kVar, null, c6Var);
        this.R0 = str;
        sc.a((FrameLayout) this.containerView, new a9(15));
        if (!z10) {
            wm0 wm0Var = this.d;
            int i11 = this.backgroundPaddingLeft;
            wm0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(68.0f));
            vg.a aVar = new vg.a(getContext(), this.resourcesProvider);
            this.Q0 = aVar;
            aVar.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 11));
            vg.a aVar2 = this.Q0;
            aVar2.f49794e = true;
            ci.d dVar = aVar2.f49791a;
            dVar.setEnabled(true);
            dVar.g(LocaleController.getString(R.string.GiftPremiumActivateForFree), false, true);
            aVar2.f49792b.setBackgroundColor(h6.w0(h6.f20630h5, aVar2.f49793c));
            this.containerView.addView(this.Q0, w5.a(68.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 80));
        }
        fixNavigationBar();
    }

    public static void d0(f0 f0Var, TLRPC.TL_error tL_error) {
        f0Var.Q0.b(false);
        i.c(tL_error, (FrameLayout) f0Var.containerView, f0Var.resourcesProvider, new d0(f0Var, 0));
    }

    public static void e0(f0 f0Var) {
        rg.l1 l1Var = new rg.l1(f0Var.f25297n, UserConfig.selectedAccount, null, null, null, f0Var.resourcesProvider);
        l1Var.J0 = true;
        l1Var.K0 = true;
        l1Var.f47537c0 = true;
        f0Var.f25297n.showDialog(l1Var);
    }

    public static void f0(f0 f0Var) {
        vy vyVar = new vy(org.telegram.messenger.v0.e(3, "onlySelect", "dialogsType", true));
        vyVar.C2 = new x1(10, f0Var, "https://t.me/giftcode/" + f0Var.R0);
        f0Var.f25297n.presentFragment(vyVar);
        f0Var.dismiss();
    }

    @Override
    public final int Y() {
        return 6;
    }

    @Override
    public final void Z(View view) {
        ((vg.t) view).setSlug(this.R0);
    }

    @Override
    public final View a0(Context context, int i10) {
        if (i10 == 6) {
            vg.t tVar = new vg.t(context, this.resourcesProvider);
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
        this.P0.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumAboutThisLink", R.string.GiftPremiumAboutThisLink), h6.gc, 0, new d0(this, 0)), AndroidUtilities.replaceTags(LocaleController.getString("GiftPremiumAboutThisLinkEnd", R.string.GiftPremiumAboutThisLinkEnd))));
    }

    @Override
    public final void c0() {
        int i10 = this.f47540f0;
        this.f47541g0 = i10;
        this.f47542h0 = i10 + 1;
        int i11 = i10 + 2;
        this.f47540f0 = i11;
        this.f47543i0 = i11;
        this.f47544j0 = i11;
        int size = this.X.size() + i11;
        this.f47545k0 = size;
        this.f47540f0 = size + 1;
        this.f47546l0 = size;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        S0 = null;
    }
}
