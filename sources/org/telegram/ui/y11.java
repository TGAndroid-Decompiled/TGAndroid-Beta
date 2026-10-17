package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class y11 extends z51 {
    public final a21 f43309d2;
    public final q51[] f43310e2;
    public final b21 f43311f2;

    public y11(b21 b21Var, b21 b21Var2, Activity activity, Integer num, a21 a21Var, q51[] q51VarArr) {
        super(b21Var2, activity, false, num, 2, null);
        this.f43311f2 = b21Var;
        this.f43309d2 = a21Var;
        this.f43310e2 = q51VarArr;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l4 != null) {
            b21 b21Var = this.f43311f2;
            i10 = ((org.telegram.ui.ActionBar.n2) b21Var).currentAccount;
            MediaDataController mediaDataController = MediaDataController.getInstance(i10);
            mediaDataController.setDoubleTapReaction("animated_" + l4);
            a21 a21Var = this.f43309d2;
            if (a21Var != null) {
                a21Var.a(true);
            }
            q51 q51Var = this.f43310e2[0];
            if (q51Var != null) {
                b21Var.f35556n = null;
                q51Var.dismiss();
            }
        }
    }

    @Override
    public final void r(i51 i51Var, ah.i1 i1Var) {
        int i10;
        b21 b21Var = this.f43311f2;
        i10 = ((org.telegram.ui.ActionBar.n2) b21Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(i1Var.f785f);
        a21 a21Var = this.f43309d2;
        if (a21Var != null) {
            a21Var.a(true);
        }
        q51 q51Var = this.f43310e2[0];
        if (q51Var != null) {
            b21Var.f35556n = null;
            q51Var.dismiss();
        }
    }
}
