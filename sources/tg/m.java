package tg;

import ai.z3;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import ci.a9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.sc;
import org.telegram.ui.hw0;
public final class m extends e3 {
    public static m f48453e;
    public final k f48454b;
    public final y0 f48455c;
    public boolean d;

    public m(Activity activity, z zVar, y0 y0Var, d6 d6Var, boolean z10) {
        super(1, (Context) activity, d6Var, true);
        boolean z11;
        this.f48455c = y0Var;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.useBackgroundTopPadding = false;
        setBackgroundColor(0);
        fixNavigationBar();
        if (i0.a.f(h6.w0(h6.f20893h5, this.resourcesProvider)) > 0.699999988079071d) {
            z11 = true;
        } else {
            z11 = false;
        }
        AndroidUtilities.setLightStatusBar(this, z11);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        k kVar = new k(this, getContext(), y0Var, d6Var, zVar);
        this.f48454b = kVar;
        kVar.setOverScrollMode(2);
        kVar.setClipToPadding(false);
        kVar.setAdapter(new hw0(zVar, y0Var));
        kVar.setPosition(0);
        setCustomView(kVar);
        zVar.f48571t0 = new j(this, 0);
        zVar.f48569r0 = new n7.z0(this, y0Var, false, 17);
        y0Var.f48551u0 = new l(this, zVar, d6Var);
        y0Var.f48549s0 = new j(this, 1);
        if (!z10) {
            MessagesController.getInstance(this.currentAccount).getStoriesController().R();
        }
        sc.a(this.container, new a9(13));
    }

    public static void o(m2 m2Var, d6 d6Var, long j3, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        m2 m2Var2;
        if (f48453e != null) {
            return;
        }
        boolean z10 = d6Var instanceof ai.d;
        if (z10) {
            m2Var2 = new z3(m2Var);
        } else {
            m2Var2 = m2Var;
        }
        m mVar = new m(m2Var.getParentActivity(), new z(m2Var2, j3, prepaidGiveaway), new y0(m2Var2, j3), m2Var2.getResourceProvider(), z10);
        mVar.show();
        f48453e = mVar;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        f48453e = null;
    }

    @Override
    public final void onBackPressed() {
        k kVar = this.f48454b;
        if (kVar.getCurrentPosition() > 0) {
            y0 y0Var = this.f48455c;
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
        this.f48455c.onConfigurationChanged(configuration);
        if (getContext().getResources().getConfiguration().orientation == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        super.onConfigurationChanged(configuration);
    }
}
