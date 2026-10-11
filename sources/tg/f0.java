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
import org.telegram.messenger.ai;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.sy;
import w7.x5;
public final class f0 extends rg.l1 {
    public static f0 S0;
    public final vg.a Q0;
    public final String R0;

    public f0(m2 m2Var, int i10, TLRPC.User user, rg.k kVar, String str, boolean z10, d6 d6Var) {
        super(m2Var, i10, user, kVar, null, d6Var);
        this.R0 = str;
        sc.a((FrameLayout) this.containerView, new a9(15));
        if (!z10) {
            rm0 rm0Var = this.d;
            int i11 = this.backgroundPaddingLeft;
            rm0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(68.0f));
            vg.a aVar = new vg.a(getContext(), this.resourcesProvider);
            this.Q0 = aVar;
            aVar.setOnClickListener(new org.telegram.ui.Components.voip.p(this, 11));
            vg.a aVar2 = this.Q0;
            aVar2.f49687e = true;
            ci.d dVar = aVar2.f49684a;
            dVar.setEnabled(true);
            dVar.g(LocaleController.getString(R.string.GiftPremiumActivateForFree), false, true);
            aVar2.f49685b.setBackgroundColor(h6.w0(h6.f20893h5, aVar2.f49686c));
            this.containerView.addView(this.Q0, x5.a(68.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 80));
        }
        fixNavigationBar();
    }

    public static void d0(f0 f0Var, TLRPC.TL_error tL_error) {
        f0Var.Q0.b(false);
        i.c(tL_error, (FrameLayout) f0Var.containerView, f0Var.resourcesProvider, new d0(f0Var, 0));
    }

    public static void e0(f0 f0Var) {
        rg.l1 l1Var = new rg.l1(f0Var.f25736n, UserConfig.selectedAccount, null, null, null, f0Var.resourcesProvider);
        l1Var.J0 = true;
        l1Var.K0 = true;
        l1Var.f47447c0 = true;
        f0Var.f25736n.showDialog(l1Var);
    }

    public static void f0(f0 f0Var) {
        sy syVar = new sy(ai.d(3, "onlySelect", "dialogsType", true));
        syVar.C2 = new q9.p(10, f0Var, "https://t.me/giftcode/" + f0Var.R0);
        f0Var.f25736n.presentFragment(syVar);
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
        int i10 = this.f47450f0;
        this.f47451g0 = i10;
        this.f47452h0 = i10 + 1;
        int i11 = i10 + 2;
        this.f47450f0 = i11;
        this.f47453i0 = i11;
        this.f47454j0 = i11;
        int size = this.X.size() + i11;
        this.f47455k0 = size;
        this.f47450f0 = size + 1;
        this.f47456l0 = size;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        S0 = null;
    }
}
