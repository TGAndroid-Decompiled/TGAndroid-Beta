package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class r21 extends q61 {
    public final t21 a2;
    public final g61[] f37908b2;
    public final u21 f37909c2;

    public r21(u21 u21Var, u21 u21Var2, Activity activity, Integer num, t21 t21Var, g61[] g61VarArr) {
        super(u21Var2, activity, false, num, 2, null);
        this.f37909c2 = u21Var;
        this.a2 = t21Var;
        this.f37908b2 = g61VarArr;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l10 != null) {
            u21 u21Var = this.f37909c2;
            i10 = ((org.telegram.ui.ActionBar.p2) u21Var).currentAccount;
            MediaDataController mediaDataController = MediaDataController.getInstance(i10);
            mediaDataController.setDoubleTapReaction("animated_" + l10);
            t21 t21Var = this.a2;
            if (t21Var != null) {
                t21Var.a(true);
            }
            g61 g61Var = this.f37908b2[0];
            if (g61Var != null) {
                u21Var.f38833n = null;
                g61Var.dismiss();
            }
        }
    }

    @Override
    public final void r(y51 y51Var, mg.q0 q0Var) {
        int i10;
        u21 u21Var = this.f37909c2;
        i10 = ((org.telegram.ui.ActionBar.p2) u21Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(q0Var.f14107f);
        t21 t21Var = this.a2;
        if (t21Var != null) {
            t21Var.a(true);
        }
        g61 g61Var = this.f37908b2[0];
        if (g61Var != null) {
            u21Var.f38833n = null;
            g61Var.dismiss();
        }
    }
}
