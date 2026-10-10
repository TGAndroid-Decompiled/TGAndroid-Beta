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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.ty;
import qg.x1;
import w7.x5;
public final class g0 extends rg.l1 {
    public static g0 S0;
    public final vg.a Q0;
    public final String R0;

    public g0(n2 n2Var, int i10, TLRPC.User user, rg.k kVar, String str, boolean z10, e6 e6Var) {
        super(n2Var, i10, user, kVar, null, e6Var);
        this.R0 = str;
        tc.a((FrameLayout) this.containerView, new a9(15));
        if (!z10) {
            rm0 rm0Var = this.d;
            int i11 = this.backgroundPaddingLeft;
            rm0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(68.0f));
            vg.a aVar = new vg.a(getContext(), this.resourcesProvider);
            this.Q0 = aVar;
            aVar.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 11));
            vg.a aVar2 = this.Q0;
            aVar2.f49610e = true;
            ci.d dVar = aVar2.f49607a;
            dVar.setEnabled(true);
            dVar.g(LocaleController.getString(R.string.GiftPremiumActivateForFree), false, true);
            aVar2.f49608b.setBackgroundColor(i6.w0(i6.f20872h5, aVar2.f49609c));
            this.containerView.addView(this.Q0, x5.a(68.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 80));
        }
        fixNavigationBar();
    }

    public static void d0(g0 g0Var, TLRPC.TL_error tL_error) {
        g0Var.Q0.b(false);
        i.c(tL_error, (FrameLayout) g0Var.containerView, g0Var.resourcesProvider, new e0(g0Var, 0));
    }

    public static void e0(g0 g0Var) {
        rg.l1 l1Var = new rg.l1(g0Var.f25985n, UserConfig.selectedAccount, null, null, null, g0Var.resourcesProvider);
        l1Var.J0 = true;
        l1Var.K0 = true;
        l1Var.f47367c0 = true;
        g0Var.f25985n.showDialog(l1Var);
    }

    public static void f0(g0 g0Var) {
        ty tyVar = new ty(bi.d(3, "onlySelect", "dialogsType", true));
        tyVar.C2 = new x1(9, g0Var, "https://t.me/giftcode/" + g0Var.R0);
        g0Var.f25985n.presentFragment(tyVar);
        g0Var.dismiss();
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
        this.P0.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumAboutThisLink", R.string.GiftPremiumAboutThisLink), i6.gc, 0, new e0(this, 0)), AndroidUtilities.replaceTags(LocaleController.getString("GiftPremiumAboutThisLinkEnd", R.string.GiftPremiumAboutThisLinkEnd))));
    }

    @Override
    public final void c0() {
        int i10 = this.f47370f0;
        this.f47371g0 = i10;
        this.f47372h0 = i10 + 1;
        int i11 = i10 + 2;
        this.f47370f0 = i11;
        this.f47373i0 = i11;
        this.f47374j0 = i11;
        int size = this.X.size() + i11;
        this.f47375k0 = size;
        this.f47370f0 = size + 1;
        this.f47376l0 = size;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        S0 = null;
    }
}
