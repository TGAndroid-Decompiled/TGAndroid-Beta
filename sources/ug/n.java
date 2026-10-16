package ug;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import bi.o3;
import di.z8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.sc;
import org.telegram.ui.nw0;
public final class n extends e3 {
    public static n e;
    public final l f46364b;
    public final z0 f46365c;
    public boolean d;

    public n(Activity activity, a0 a0Var, z0 z0Var, c6 c6Var, boolean z10) {
        super(1, (Context) activity, c6Var, true);
        boolean z11;
        this.f46365c = z0Var;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.useBackgroundTopPadding = false;
        setBackgroundColor(0);
        fixNavigationBar();
        if (i0.a.f(g6.w0(g6.f19672h5, this.resourcesProvider)) > 0.699999988079071d) {
            z11 = true;
        } else {
            z11 = false;
        }
        AndroidUtilities.setLightStatusBar(this, z11);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        l lVar = new l(this, getContext(), z0Var, c6Var, a0Var);
        this.f46364b = lVar;
        lVar.setOverScrollMode(2);
        lVar.setClipToPadding(false);
        lVar.setAdapter(new nw0(a0Var, z0Var));
        lVar.setPosition(0);
        setCustomView(lVar);
        a0Var.f46271t0 = new k(this, 0);
        a0Var.f46269r0 = new n3.b(this, z0Var, false, 19);
        z0Var.f46432u0 = new m(this, a0Var, c6Var);
        z0Var.f46430s0 = new k(this, 1);
        if (!z10) {
            MessagesController.getInstance(this.currentAccount).getStoriesController().R();
        }
        sc.a(this.container, new z8(13));
    }

    public static void n(m2 m2Var, c6 c6Var, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        m2 m2Var2;
        if (e != null) {
            return;
        }
        boolean z10 = c6Var instanceof bi.b;
        if (z10) {
            m2Var2 = new o3(m2Var);
        } else {
            m2Var2 = m2Var;
        }
        n nVar = new n(m2Var.getParentActivity(), new a0(m2Var2, j10, prepaidGiveaway), new z0(m2Var2, j10), m2Var2.getResourceProvider(), z10);
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
        l lVar = this.f46364b;
        if (lVar.getCurrentPosition() > 0) {
            z0 z0Var = this.f46365c;
            if (z0Var.T()) {
                return;
            }
            if (isKeyboardVisible()) {
                AndroidUtilities.hideKeyboard(z0Var.getContainerView());
            }
            lVar.D(0);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        boolean z10;
        this.f46365c.onConfigurationChanged(configuration);
        if (getContext().getResources().getConfiguration().orientation == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        super.onConfigurationChanged(configuration);
    }
}
