package tg;

import ai.y3;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import ci.d9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.pc;
import org.telegram.ui.iw0;
public final class m extends f3 {
    public static m e;
    public final k f43469b;
    public final z0 f43470c;
    public boolean d;

    public m(Activity activity, a0 a0Var, z0 z0Var, f6 f6Var, boolean z10) {
        super(1, (Context) activity, f6Var, true);
        boolean z11;
        this.f43470c = z0Var;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.useBackgroundTopPadding = false;
        setBackgroundColor(0);
        fixNavigationBar();
        if (i0.a.f(j6.v0(j6.f19180h5, this.resourcesProvider)) > 0.699999988079071d) {
            z11 = true;
        } else {
            z11 = false;
        }
        AndroidUtilities.setLightStatusBar(this, z11);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        k kVar = new k(this, getContext(), z0Var, f6Var, a0Var);
        this.f43469b = kVar;
        kVar.setOverScrollMode(2);
        kVar.setClipToPadding(false);
        kVar.setAdapter(new iw0(a0Var, z0Var));
        kVar.setPosition(0);
        setCustomView(kVar);
        a0Var.f43404t0 = new j(this, 0);
        a0Var.f43402r0 = new m5.e(this, z0Var, false, 22);
        z0Var.f43566u0 = new l(this, a0Var, f6Var);
        z0Var.f43564s0 = new j(this, 1);
        if (!z10) {
            MessagesController.getInstance(this.currentAccount).getStoriesController().R();
        }
        pc.a(this.container, new d9(13));
    }

    public static void m(n2 n2Var, f6 f6Var, long j3, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        n2 n2Var2;
        if (e != null) {
            return;
        }
        boolean z10 = f6Var instanceof ai.d;
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
        k kVar = this.f43469b;
        if (kVar.getCurrentPosition() > 0) {
            z0 z0Var = this.f43470c;
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
        this.f43470c.onConfigurationChanged(configuration);
        if (getContext().getResources().getConfiguration().orientation == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        super.onConfigurationChanged(configuration);
    }
}
