package vg;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import bi.e5;
import bi.v4;
import fi.k8;
import m4.w1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.qc;
public final class n extends k3 {
    public static n e;
    public final l f50207b;
    public final z0 f50208c;
    public boolean d;

    public n(Activity activity, a0 a0Var, z0 z0Var, u6 u6Var, boolean z10) {
        super(1, (Context) activity, u6Var, true);
        boolean z11;
        this.f50208c = z0Var;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.useBackgroundTopPadding = false;
        setBackgroundColor(0);
        fixNavigationBar();
        if (i0.a.h(y6.w0(y6.f23427h5, this.resourcesProvider)) > 0.699999988079071d) {
            z11 = true;
        } else {
            z11 = false;
        }
        AndroidUtilities.setLightStatusBar(this, z11);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        l lVar = new l(this, getContext(), z0Var, u6Var, a0Var);
        this.f50207b = lVar;
        lVar.setOverScrollMode(2);
        lVar.setClipToPadding(false);
        lVar.setAdapter(new e5(a0Var, z0Var));
        lVar.setPosition(0);
        setCustomView(lVar);
        a0Var.f50136t0 = new k(this, 0);
        a0Var.f50134r0 = new w1(this, z0Var, false, 24);
        z0Var.f50300u0 = new m(this, a0Var, u6Var);
        z0Var.f50298s0 = new k(this, 1);
        if (!z10) {
            MessagesController.getInstance(this.currentAccount).getStoriesController().R();
        }
        qc.a(this.container, new k8(12));
    }

    public static void m(r2 r2Var, u6 u6Var, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        r2 r2Var2;
        if (e != null) {
            return;
        }
        boolean z10 = u6Var instanceof di.b;
        if (z10) {
            r2Var2 = new v4(r2Var);
        } else {
            r2Var2 = r2Var;
        }
        n nVar = new n(r2Var.getParentActivity(), new a0(r2Var2, j10, prepaidGiveaway), new z0(r2Var2, j10), r2Var2.getResourceProvider(), z10);
        nVar.show();
        e = nVar;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        e = null;
    }

    @Override
    public final void onBackPressed() {
        l lVar = this.f50207b;
        if (lVar.getCurrentPosition() > 0) {
            z0 z0Var = this.f50208c;
            if (z0Var.S()) {
                return;
            }
            if (isKeyboardVisible()) {
                AndroidUtilities.hideKeyboard(z0Var.getContainerView());
            }
            lVar.E(0);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        boolean z10;
        this.f50208c.onConfigurationChanged(configuration);
        if (getContext().getResources().getConfiguration().orientation == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        super.onConfigurationChanged(configuration);
    }
}
