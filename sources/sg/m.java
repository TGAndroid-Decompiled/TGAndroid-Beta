package sg;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import bi.fa;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.pc;
import org.telegram.ui.kw0;
public final class m extends h3 {
    public static m e;
    public final k f41953b;
    public final c1 f41954c;
    public boolean d;

    public m(Activity activity, a0 a0Var, c1 c1Var, f6 f6Var, boolean z10) {
        super(1, (Context) activity, f6Var, true);
        boolean z11;
        this.f41954c = c1Var;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.useBackgroundTopPadding = false;
        setBackgroundColor(0);
        fixNavigationBar();
        if (i0.a.f(j6.v0(j6.f17998h5, this.resourcesProvider)) > 0.699999988079071d) {
            z11 = true;
        } else {
            z11 = false;
        }
        AndroidUtilities.setLightStatusBar(this, z11);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        k kVar = new k(this, getContext(), c1Var, f6Var, a0Var);
        this.f41953b = kVar;
        kVar.setOverScrollMode(2);
        kVar.setClipToPadding(false);
        kVar.setAdapter(new kw0(a0Var, c1Var));
        kVar.setPosition(0);
        setCustomView(kVar);
        a0Var.f41864t0 = new j(this, 0);
        a0Var.f41862r0 = new n7.a1(this, c1Var, false, 17);
        c1Var.f41898u0 = new l(this, a0Var, f6Var);
        c1Var.f41896s0 = new j(this, 1);
        if (!z10) {
            MessagesController.getInstance(this.currentAccount).getStoriesController().R();
        }
        pc.a(this.container, new fa(13));
    }

    public static void m(p2 p2Var, f6 f6Var, long j3, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        p2 p2Var2;
        if (e != null) {
            return;
        }
        boolean z10 = f6Var instanceof zh.b;
        if (z10) {
            p2Var2 = new bi.o1(p2Var);
        } else {
            p2Var2 = p2Var;
        }
        m mVar = new m(p2Var.getParentActivity(), new a0(p2Var2, j3, prepaidGiveaway), new c1(p2Var2, j3), p2Var2.getResourceProvider(), z10);
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
        k kVar = this.f41953b;
        if (kVar.getCurrentPosition() > 0) {
            c1 c1Var = this.f41954c;
            if (c1Var.S()) {
                return;
            }
            if (isKeyboardVisible()) {
                AndroidUtilities.hideKeyboard(c1Var.getContainerView());
            }
            kVar.D(0);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        boolean z10;
        this.f41954c.onConfigurationChanged(configuration);
        if (getContext().getResources().getConfiguration().orientation == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        super.onConfigurationChanged(configuration);
    }
}
