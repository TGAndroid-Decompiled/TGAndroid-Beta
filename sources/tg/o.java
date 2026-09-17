package tg;

import ai.y3;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import ci.d9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.oc;
import org.telegram.ui.kw0;
public final class o extends g3 {
    public static o e;
    public final m f43222b;
    public final a1 f43223c;
    public boolean d;

    public o(Activity activity, b0 b0Var, a1 a1Var, f6 f6Var, boolean z10) {
        super(1, (Context) activity, f6Var, true);
        boolean z11;
        this.f43223c = a1Var;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.useBackgroundTopPadding = false;
        setBackgroundColor(0);
        fixNavigationBar();
        if (i0.a.f(j6.v0(j6.f18933h5, this.resourcesProvider)) > 0.699999988079071d) {
            z11 = true;
        } else {
            z11 = false;
        }
        AndroidUtilities.setLightStatusBar(this, z11);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        m mVar = new m(this, getContext(), a1Var, f6Var, b0Var);
        this.f43222b = mVar;
        mVar.setOverScrollMode(2);
        mVar.setClipToPadding(false);
        mVar.setAdapter(new kw0(b0Var, a1Var));
        mVar.setPosition(0);
        setCustomView(mVar);
        b0Var.f43128t0 = new l(this, 0);
        b0Var.f43126r0 = new o0.a(this, a1Var, false, 17);
        a1Var.f43105u0 = new n(this, b0Var, f6Var);
        a1Var.f43103s0 = new l(this, 1);
        if (!z10) {
            MessagesController.getInstance(this.currentAccount).getStoriesController().R();
        }
        oc.a(this.container, new d9(13));
    }

    public static void m(o2 o2Var, f6 f6Var, long j3, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        o2 o2Var2;
        if (e != null) {
            return;
        }
        boolean z10 = f6Var instanceof ai.d;
        if (z10) {
            o2Var2 = new y3(o2Var);
        } else {
            o2Var2 = o2Var;
        }
        o oVar = new o(o2Var.getParentActivity(), new b0(o2Var2, j3, prepaidGiveaway), new a1(o2Var2, j3), o2Var2.getResourceProvider(), z10);
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
        m mVar = this.f43222b;
        if (mVar.getCurrentPosition() > 0) {
            a1 a1Var = this.f43223c;
            if (a1Var.S()) {
                return;
            }
            if (isKeyboardVisible()) {
                AndroidUtilities.hideKeyboard(a1Var.getContainerView());
            }
            mVar.E(0);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        boolean z10;
        this.f43223c.onConfigurationChanged(configuration);
        if (getContext().getResources().getConfiguration().orientation == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        super.onConfigurationChanged(configuration);
    }
}
