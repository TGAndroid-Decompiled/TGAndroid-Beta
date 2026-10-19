package ug;

import ai.a5;
import ai.j5;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import ei.o8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.qc;
public final class m extends f3 {
    public static m e;
    public final k f47703b;
    public final y0 f47704c;
    public boolean d;

    public m(Activity activity, z zVar, y0 y0Var, d6 d6Var, boolean z10) {
        super(1, (Context) activity, d6Var, true);
        boolean z11;
        this.f47704c = y0Var;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.useBackgroundTopPadding = false;
        setBackgroundColor(0);
        fixNavigationBar();
        if (i0.a.h(h6.w0(h6.f21058h5, this.resourcesProvider)) > 0.699999988079071d) {
            z11 = true;
        } else {
            z11 = false;
        }
        AndroidUtilities.setLightStatusBar(this, z11);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        k kVar = new k(this, getContext(), y0Var, d6Var, zVar);
        this.f47703b = kVar;
        kVar.setOverScrollMode(2);
        kVar.setClipToPadding(false);
        kVar.setAdapter(new j5(zVar, y0Var));
        kVar.setPosition(0);
        setCustomView(kVar);
        zVar.f47816t0 = new j(this, 0);
        zVar.f47814r0 = new n2.e(this, y0Var, false, 20);
        y0Var.f47796u0 = new l(this, zVar, d6Var);
        y0Var.f47794s0 = new j(this, 1);
        if (!z10) {
            MessagesController.getInstance(this.currentAccount).getStoriesController().R();
        }
        qc.a(this.container, new o8(13));
    }

    public static void n(n2 n2Var, d6 d6Var, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        n2 n2Var2;
        if (e != null) {
            return;
        }
        boolean z10 = d6Var instanceof ci.b;
        if (z10) {
            n2Var2 = new a5(n2Var);
        } else {
            n2Var2 = n2Var;
        }
        m mVar = new m(n2Var.getParentActivity(), new z(n2Var2, j10, prepaidGiveaway), new y0(n2Var2, j10), n2Var2.getResourceProvider(), z10);
        mVar.show();
        e = mVar;
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
        k kVar = this.f47703b;
        if (kVar.getCurrentPosition() > 0) {
            y0 y0Var = this.f47704c;
            if (y0Var.T()) {
                return;
            }
            if (isKeyboardVisible()) {
                AndroidUtilities.hideKeyboard(y0Var.getContainerView());
            }
            kVar.D(0);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        boolean z10;
        this.f47704c.onConfigurationChanged(configuration);
        if (getContext().getResources().getConfiguration().orientation == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        super.onConfigurationChanged(configuration);
    }
}
