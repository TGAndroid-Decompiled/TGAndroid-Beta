package tg;

import ai.y3;
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
import org.telegram.ui.Components.qc;
import org.telegram.ui.zv0;
public final class m extends e3 {
    public static m e;
    public final k f43432b;
    public final z0 f43433c;
    public boolean d;

    public m(Activity activity, a0 a0Var, z0 z0Var, d6 d6Var, boolean z10) {
        super(1, (Context) activity, d6Var, true);
        boolean z11;
        this.f43433c = z0Var;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.useBackgroundTopPadding = false;
        setBackgroundColor(0);
        fixNavigationBar();
        if (i0.a.f(h6.v0(h6.f19129h5, this.resourcesProvider)) > 0.699999988079071d) {
            z11 = true;
        } else {
            z11 = false;
        }
        AndroidUtilities.setLightStatusBar(this, z11);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        k kVar = new k(this, getContext(), z0Var, d6Var, a0Var);
        this.f43432b = kVar;
        kVar.setOverScrollMode(2);
        kVar.setClipToPadding(false);
        kVar.setAdapter(new zv0(a0Var, z0Var));
        kVar.setPosition(0);
        setCustomView(kVar);
        a0Var.f43368t0 = new j(this, 0);
        a0Var.f43366r0 = new o0.a(this, z0Var, false, 17);
        z0Var.f43529u0 = new l(this, a0Var, d6Var);
        z0Var.f43527s0 = new j(this, 1);
        if (!z10) {
            MessagesController.getInstance(this.currentAccount).getStoriesController().R();
        }
        qc.a(this.container, new a9(13));
    }

    public static void m(m2 m2Var, d6 d6Var, long j3, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        m2 m2Var2;
        if (e != null) {
            return;
        }
        boolean z10 = d6Var instanceof ai.d;
        if (z10) {
            m2Var2 = new y3(m2Var);
        } else {
            m2Var2 = m2Var;
        }
        m mVar = new m(m2Var.getParentActivity(), new a0(m2Var2, j3, prepaidGiveaway), new z0(m2Var2, j3), m2Var2.getResourceProvider(), z10);
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
        k kVar = this.f43432b;
        if (kVar.getCurrentPosition() > 0) {
            z0 z0Var = this.f43433c;
            if (z0Var.S()) {
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
        this.f43433c.onConfigurationChanged(configuration);
        if (getContext().getResources().getConfiguration().orientation == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        super.onConfigurationChanged(configuration);
    }
}
