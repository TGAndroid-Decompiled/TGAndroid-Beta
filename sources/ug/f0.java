package ug;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ei.o8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.lk;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.cy;
import w7.z5;
public final class f0 extends sg.m1 {
    public static f0 S0;
    public final wg.a Q0;
    public final String R0;

    public f0(n2 n2Var, int i10, TLRPC.User user, sg.k kVar, String str, boolean z10, d6 d6Var) {
        super(n2Var, i10, user, kVar, null, d6Var);
        this.R0 = str;
        qc.a((FrameLayout) this.containerView, new o8(15));
        if (!z10) {
            im0 im0Var = this.d;
            int i11 = this.backgroundPaddingLeft;
            im0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(68.0f));
            wg.a aVar = new wg.a(getContext(), this.resourcesProvider);
            this.Q0 = aVar;
            aVar.setOnClickListener(new hg.r0(this, 22));
            wg.a aVar2 = this.Q0;
            aVar2.e = true;
            ei.d dVar = aVar2.f48940a;
            dVar.setEnabled(true);
            dVar.g(LocaleController.getString(R.string.GiftPremiumActivateForFree), false, true);
            aVar2.f48941b.setBackgroundColor(h6.w0(h6.f21060h5, aVar2.f48942c));
            this.containerView.addView(this.Q0, z5.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        fixNavigationBar();
    }

    public static void d0(f0 f0Var, TLRPC.TL_error tL_error) {
        f0Var.Q0.b(false);
        i.c(tL_error, (FrameLayout) f0Var.containerView, f0Var.resourcesProvider, new d0(f0Var, 0));
    }

    public static void e0(f0 f0Var) {
        sg.m1 m1Var = new sg.m1(f0Var.f24899n, UserConfig.selectedAccount, null, null, null, f0Var.resourcesProvider);
        m1Var.J0 = true;
        m1Var.K0 = true;
        m1Var.f46322c0 = true;
        f0Var.f24899n.showDialog(m1Var);
    }

    public static void f0(f0 f0Var) {
        cy cyVar = new cy(lk.d(3, "onlySelect", "dialogsType", true));
        cyVar.C2 = new org.telegram.ui.web.m(17, f0Var, "https://t.me/giftcode/" + f0Var.R0);
        f0Var.f24899n.presentFragment(cyVar);
        f0Var.dismiss();
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
        this.P0.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumAboutThisLink", R.string.GiftPremiumAboutThisLink), h6.f21048gc, 0, new d0(this, 0)), AndroidUtilities.replaceTags(LocaleController.getString("GiftPremiumAboutThisLinkEnd", R.string.GiftPremiumAboutThisLinkEnd))));
    }

    @Override
    public final void c0() {
        int i10 = this.f46325f0;
        this.f46326g0 = i10;
        this.f46327h0 = i10 + 1;
        int i11 = i10 + 2;
        this.f46325f0 = i11;
        this.f46328i0 = i11;
        this.f46329j0 = i11;
        int size = this.X.size() + i11;
        this.f46330k0 = size;
        this.f46325f0 = size + 1;
        this.f46331l0 = size;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        S0 = null;
    }
}
