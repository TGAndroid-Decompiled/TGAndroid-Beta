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
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.qc;
import org.telegram.ui.bw0;
public final class o extends f3 {
    public static o e;
    public final m f43150b;
    public final a1 f43151c;
    public boolean d;

    public o(Activity activity, b0 b0Var, a1 a1Var, d6 d6Var, boolean z10) {
        super(1, (Context) activity, d6Var, true);
        boolean z11;
        this.f43151c = a1Var;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.useBackgroundTopPadding = false;
        setBackgroundColor(0);
        fixNavigationBar();
        if (i0.a.f(h6.v0(h6.f18859h5, this.resourcesProvider)) > 0.699999988079071d) {
            z11 = true;
        } else {
            z11 = false;
        }
        AndroidUtilities.setLightStatusBar(this, z11);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        m mVar = new m(this, getContext(), a1Var, d6Var, b0Var);
        this.f43150b = mVar;
        mVar.setOverScrollMode(2);
        mVar.setClipToPadding(false);
        mVar.setAdapter(new bw0(b0Var, a1Var));
        mVar.setPosition(0);
        setCustomView(mVar);
        b0Var.f43057t0 = new l(this, 0);
        b0Var.f43055r0 = new o0.a(this, a1Var, false, 17);
        a1Var.f43034u0 = new n(this, b0Var, d6Var);
        a1Var.f43032s0 = new l(this, 1);
        if (!z10) {
            MessagesController.getInstance(this.currentAccount).getStoriesController().R();
        }
        qc.a(this.container, new a9(13));
    }

    public static void m(n2 n2Var, d6 d6Var, long j3, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        n2 n2Var2;
        if (e != null) {
            return;
        }
        boolean z10 = d6Var instanceof ai.d;
        if (z10) {
            n2Var2 = new y3(n2Var);
        } else {
            n2Var2 = n2Var;
        }
        o oVar = new o(n2Var.getParentActivity(), new b0(n2Var2, j3, prepaidGiveaway), new a1(n2Var2, j3), n2Var2.getResourceProvider(), z10);
        oVar.show();
        e = oVar;
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
        m mVar = this.f43150b;
        if (mVar.getCurrentPosition() > 0) {
            a1 a1Var = this.f43151c;
            if (a1Var.S()) {
                return;
            }
            if (isKeyboardVisible()) {
                AndroidUtilities.hideKeyboard(a1Var.getContainerView());
            }
            mVar.D(0);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        boolean z10;
        this.f43151c.onConfigurationChanged(configuration);
        if (getContext().getResources().getConfiguration().orientation == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        super.onConfigurationChanged(configuration);
    }
}
