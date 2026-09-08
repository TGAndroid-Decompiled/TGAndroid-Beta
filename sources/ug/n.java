package ug;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import bi.l3;
import di.c9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.qc;
import org.telegram.ui.hw0;
public final class n extends f3 {
    public static n f47181e;
    public final l f47182b;
    public final a1 f47183c;
    public boolean d;

    public n(Activity activity, b0 b0Var, a1 a1Var, f6 f6Var, boolean z10) {
        super(1, (Context) activity, f6Var, true);
        boolean z11;
        this.f47183c = a1Var;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.useBackgroundTopPadding = false;
        setBackgroundColor(0);
        fixNavigationBar();
        if (i0.a.f(j6.v0(j6.f20761h5, this.resourcesProvider)) > 0.699999988079071d) {
            z11 = true;
        } else {
            z11 = false;
        }
        AndroidUtilities.setLightStatusBar(this, z11);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        l lVar = new l(this, getContext(), a1Var, f6Var, b0Var);
        this.f47182b = lVar;
        lVar.setOverScrollMode(2);
        lVar.setClipToPadding(false);
        lVar.setAdapter(new hw0(b0Var, a1Var));
        lVar.setPosition(0);
        setCustomView(lVar);
        b0Var.f47114t0 = new k(this, 0);
        b0Var.f47112r0 = new o0.a(this, a1Var, false, 17);
        a1Var.f47090u0 = new m(this, b0Var, f6Var);
        a1Var.f47088s0 = new k(this, 1);
        if (!z10) {
            MessagesController.getInstance(this.currentAccount).getStoriesController().R();
        }
        qc.a(this.container, new c9(13));
    }

    public static void m(n2 n2Var, f6 f6Var, long j3, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        n2 n2Var2;
        if (f47181e != null) {
            return;
        }
        boolean z10 = f6Var instanceof bi.b;
        if (z10) {
            n2Var2 = new l3(n2Var);
        } else {
            n2Var2 = n2Var;
        }
        n nVar = new n(n2Var.getParentActivity(), new b0(n2Var2, j3, prepaidGiveaway), new a1(n2Var2, j3), n2Var2.getResourceProvider(), z10);
        nVar.show();
        f47181e = nVar;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        f47181e = null;
    }

    @Override
    public final void onBackPressed() {
        l lVar = this.f47182b;
        if (lVar.getCurrentPosition() > 0) {
            a1 a1Var = this.f47183c;
            if (a1Var.S()) {
                return;
            }
            if (isKeyboardVisible()) {
                AndroidUtilities.hideKeyboard(a1Var.getContainerView());
            }
            lVar.D(0);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        boolean z10;
        this.f47183c.onConfigurationChanged(configuration);
        if (getContext().getResources().getConfiguration().orientation == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        super.onConfigurationChanged(configuration);
    }
}
