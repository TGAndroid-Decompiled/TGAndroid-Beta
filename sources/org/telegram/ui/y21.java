package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class y21 extends w61 {
    public final a31 a2;
    public final n61[] f43519b2;
    public final b31 f43520c2;

    public y21(b31 b31Var, b31 b31Var2, Activity activity, Integer num, a31 a31Var, n61[] n61VarArr) {
        super(b31Var2, activity, false, num, 2, null);
        this.f43520c2 = b31Var;
        this.a2 = a31Var;
        this.f43519b2 = n61VarArr;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l10 != null) {
            b31 b31Var = this.f43520c2;
            i10 = ((org.telegram.ui.ActionBar.p2) b31Var).currentAccount;
            MediaDataController mediaDataController = MediaDataController.getInstance(i10);
            mediaDataController.setDoubleTapReaction("animated_" + l10);
            a31 a31Var = this.a2;
            if (a31Var != null) {
                a31Var.a(true);
            }
            n61 n61Var = this.f43519b2[0];
            if (n61Var != null) {
                b31Var.f35341n = null;
                n61Var.dismiss();
            }
        }
    }

    @Override
    public final void r(f61 f61Var, ng.q0 q0Var) {
        int i10;
        b31 b31Var = this.f43520c2;
        i10 = ((org.telegram.ui.ActionBar.p2) b31Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(q0Var.f16180f);
        a31 a31Var = this.a2;
        if (a31Var != null) {
            a31Var.a(true);
        }
        n61 n61Var = this.f43519b2[0];
        if (n61Var != null) {
            b31Var.f35341n = null;
            n61Var.dismiss();
        }
    }
}
