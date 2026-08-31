package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class t21 extends r61 {
    public final v21 a2;
    public final i61[] f41459b2;
    public final w21 f41460c2;

    public t21(w21 w21Var, w21 w21Var2, Activity activity, Integer num, v21 v21Var, i61[] i61VarArr) {
        super(w21Var2, activity, false, num, 2, null);
        this.f41460c2 = w21Var;
        this.a2 = v21Var;
        this.f41459b2 = i61VarArr;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l10 != null) {
            w21 w21Var = this.f41460c2;
            i10 = ((org.telegram.ui.ActionBar.p2) w21Var).currentAccount;
            MediaDataController mediaDataController = MediaDataController.getInstance(i10);
            mediaDataController.setDoubleTapReaction("animated_" + l10);
            v21 v21Var = this.a2;
            if (v21Var != null) {
                v21Var.a(true);
            }
            i61 i61Var = this.f41459b2[0];
            if (i61Var != null) {
                w21Var.f42367n = null;
                i61Var.dismiss();
            }
        }
    }

    @Override
    public final void r(a61 a61Var, ng.q0 q0Var) {
        int i10;
        w21 w21Var = this.f41460c2;
        i10 = ((org.telegram.ui.ActionBar.p2) w21Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(q0Var.f16178f);
        v21 v21Var = this.a2;
        if (v21Var != null) {
            v21Var.a(true);
        }
        i61 i61Var = this.f41459b2[0];
        if (i61Var != null) {
            w21Var.f42367n = null;
            i61Var.dismiss();
        }
    }
}
