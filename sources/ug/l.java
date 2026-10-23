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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.qc;
public final class l extends h3 {
    public static l e;
    public final j f48145b;
    public final x0 f48146c;
    public boolean d;

    public l(Activity activity, y yVar, x0 x0Var, g6 g6Var, boolean z10) {
        super(1, (Context) activity, g6Var, true);
        boolean z11;
        this.f48146c = x0Var;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.useBackgroundTopPadding = false;
        setBackgroundColor(0);
        fixNavigationBar();
        if (i0.a.h(k6.w0(k6.f21254h5, this.resourcesProvider)) > 0.699999988079071d) {
            z11 = true;
        } else {
            z11 = false;
        }
        AndroidUtilities.setLightStatusBar(this, z11);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        j jVar = new j(this, getContext(), x0Var, g6Var, yVar);
        this.f48145b = jVar;
        jVar.setOverScrollMode(2);
        jVar.setClipToPadding(false);
        jVar.setAdapter(new j5(yVar, x0Var));
        jVar.setPosition(0);
        setCustomView(jVar);
        yVar.f48258t0 = new i(this, 0);
        yVar.f48256r0 = new n2.e(this, x0Var, false, 19);
        x0Var.f48238u0 = new k(this, yVar, g6Var);
        x0Var.f48236s0 = new i(this, 1);
        if (!z10) {
            MessagesController.getInstance(this.currentAccount).getStoriesController().R();
        }
        qc.a(this.container, new o8(13));
    }

    public static void m(o2 o2Var, g6 g6Var, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        o2 o2Var2;
        if (e != null) {
            return;
        }
        boolean z10 = g6Var instanceof ci.b;
        if (z10) {
            o2Var2 = new a5(o2Var);
        } else {
            o2Var2 = o2Var;
        }
        l lVar = new l(o2Var.getParentActivity(), new y(o2Var2, j10, prepaidGiveaway), new x0(o2Var2, j10), o2Var2.getResourceProvider(), z10);
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
        j jVar = this.f48145b;
        if (jVar.getCurrentPosition() > 0) {
            x0 x0Var = this.f48146c;
            if (x0Var.S()) {
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
        this.f48146c.onConfigurationChanged(configuration);
        if (getContext().getResources().getConfiguration().orientation == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        super.onConfigurationChanged(configuration);
    }
}
