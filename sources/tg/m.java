package tg;

import ai.y3;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import ci.d9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.qc;
import org.telegram.ui.iw0;
public final class m extends f3 {
    public static m e;
    public final k f43404b;
    public final z0 f43405c;
    public boolean d;

    public m(Activity activity, a0 a0Var, z0 z0Var, e6 e6Var, boolean z10) {
        super(1, (Context) activity, e6Var, true);
        boolean z11;
        this.f43405c = z0Var;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.useBackgroundTopPadding = false;
        setBackgroundColor(0);
        fixNavigationBar();
        if (i0.a.f(j6.v0(j6.f19133h5, this.resourcesProvider)) > 0.699999988079071d) {
            z11 = true;
        } else {
            z11 = false;
        }
        AndroidUtilities.setLightStatusBar(this, z11);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        k kVar = new k(this, getContext(), z0Var, e6Var, a0Var);
        this.f43404b = kVar;
        kVar.setOverScrollMode(2);
        kVar.setClipToPadding(false);
        kVar.setAdapter(new iw0(a0Var, z0Var));
        kVar.setPosition(0);
        setCustomView(kVar);
        a0Var.f43339t0 = new j(this, 0);
        a0Var.f43337r0 = new o0.a(this, z0Var, false, 17);
        z0Var.f43501u0 = new l(this, a0Var, e6Var);
        z0Var.f43499s0 = new j(this, 1);
        if (!z10) {
            MessagesController.getInstance(this.currentAccount).getStoriesController().R();
        }
        qc.a(this.container, new d9(13));
    }

    public static void m(n2 n2Var, e6 e6Var, long j3, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        n2 n2Var2;
        if (e != null) {
            return;
        }
        boolean z10 = e6Var instanceof ai.d;
        if (z10) {
            n2Var2 = new y3(n2Var);
        } else {
            n2Var2 = n2Var;
        }
        m mVar = new m(n2Var.getParentActivity(), new a0(n2Var2, j3, prepaidGiveaway), new z0(n2Var2, j3), n2Var2.getResourceProvider(), z10);
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
        k kVar = this.f43404b;
        if (kVar.getCurrentPosition() > 0) {
            z0 z0Var = this.f43405c;
            if (z0Var.S()) {
                return;
            }
            if (isKeyboardVisible()) {
                AndroidUtilities.hideKeyboard(z0Var.getContainerView());
            }
            kVar.E(0);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        boolean z10;
        this.f43405c.onConfigurationChanged(configuration);
        if (getContext().getResources().getConfiguration().orientation == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        super.onConfigurationChanged(configuration);
    }
}
