package tg;

import ai.z3;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import ci.a9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.tc;
import org.telegram.ui.iw0;
public final class m extends f3 {
    public static m f48349e;
    public final k f48350b;
    public final z0 f48351c;
    public boolean d;

    public m(Activity activity, a0 a0Var, z0 z0Var, e6 e6Var, boolean z10) {
        super(1, (Context) activity, e6Var, true);
        boolean z11;
        this.f48351c = z0Var;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.useBackgroundTopPadding = false;
        setBackgroundColor(0);
        fixNavigationBar();
        if (i0.a.f(i6.w0(i6.f20868h5, this.resourcesProvider)) > 0.699999988079071d) {
            z11 = true;
        } else {
            z11 = false;
        }
        AndroidUtilities.setLightStatusBar(this, z11);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        k kVar = new k(this, getContext(), z0Var, e6Var, a0Var);
        this.f48350b = kVar;
        kVar.setOverScrollMode(2);
        kVar.setClipToPadding(false);
        kVar.setAdapter(new iw0(a0Var, z0Var));
        kVar.setPosition(0);
        setCustomView(kVar);
        a0Var.f48282t0 = new j(this, 0);
        a0Var.f48280r0 = new b5(16, this, z0Var);
        z0Var.f48451u0 = new l(this, a0Var, e6Var);
        z0Var.f48449s0 = new j(this, 1);
        if (!z10) {
            MessagesController.getInstance(this.currentAccount).getStoriesController().R();
        }
        tc.a(this.container, new a9(13));
    }

    public static void o(n2 n2Var, e6 e6Var, long j3, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        n2 n2Var2;
        if (f48349e != null) {
            return;
        }
        boolean z10 = e6Var instanceof ai.d;
        if (z10) {
            n2Var2 = new z3(n2Var);
        } else {
            n2Var2 = n2Var;
        }
        m mVar = new m(n2Var.getParentActivity(), new a0(n2Var2, j3, prepaidGiveaway), new z0(n2Var2, j3), n2Var2.getResourceProvider(), z10);
        mVar.show();
        f48349e = mVar;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        f48349e = null;
    }

    @Override
    public final void onBackPressed() {
        k kVar = this.f48350b;
        if (kVar.getCurrentPosition() > 0) {
            z0 z0Var = this.f48351c;
            if (z0Var.T()) {
                return;
            }
            if (isKeyboardVisible()) {
                AndroidUtilities.hideKeyboard(z0Var.getContainerView());
            }
            kVar.D(0);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        boolean z10;
        this.f48351c.onConfigurationChanged(configuration);
        if (getContext().getResources().getConfiguration().orientation == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        super.onConfigurationChanged(configuration);
    }
}
