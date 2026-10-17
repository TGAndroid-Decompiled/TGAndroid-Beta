package ug;

import ai.i5;
import ai.z4;
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
public final class l extends f3 {
    public static l e;
    public final j f47720b;
    public final x0 f47721c;
    public boolean d;

    public l(Activity activity, y yVar, x0 x0Var, d6 d6Var, boolean z10) {
        super(1, (Context) activity, d6Var, true);
        boolean z11;
        this.f47721c = x0Var;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.useBackgroundTopPadding = false;
        setBackgroundColor(0);
        fixNavigationBar();
        if (i0.b.h(h6.w0(h6.f21057h5, this.resourcesProvider)) > 0.699999988079071d) {
            z11 = true;
        } else {
            z11 = false;
        }
        AndroidUtilities.setLightStatusBar(this, z11);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        j jVar = new j(this, getContext(), x0Var, d6Var, yVar);
        this.f47720b = jVar;
        jVar.setOverScrollMode(2);
        jVar.setClipToPadding(false);
        jVar.setAdapter(new i5(yVar, x0Var));
        jVar.setPosition(0);
        setCustomView(jVar);
        yVar.f47833t0 = new i(this, 0);
        yVar.f47831r0 = new n2.e(this, x0Var, false, 20);
        x0Var.f47813u0 = new k(this, yVar, d6Var);
        x0Var.f47811s0 = new i(this, 1);
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
            n2Var2 = new z4(n2Var);
        } else {
            n2Var2 = n2Var;
        }
        l lVar = new l(n2Var.getParentActivity(), new y(n2Var2, j10, prepaidGiveaway), new x0(n2Var2, j10), n2Var2.getResourceProvider(), z10);
        lVar.show();
        e = lVar;
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
        j jVar = this.f47720b;
        if (jVar.getCurrentPosition() > 0) {
            x0 x0Var = this.f47721c;
            if (x0Var.T()) {
                return;
            }
            if (isKeyboardVisible()) {
                AndroidUtilities.hideKeyboard(x0Var.getContainerView());
            }
            jVar.D(0);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        boolean z10;
        this.f47721c.onConfigurationChanged(configuration);
        if (getContext().getResources().getConfiguration().orientation == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        super.onConfigurationChanged(configuration);
    }
}
