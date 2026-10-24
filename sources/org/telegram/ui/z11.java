package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class z11 extends a61 {
    public final b21 f44001e2;
    public final r51[] f44002f2;
    public final c21 f44003g2;

    public z11(c21 c21Var, c21 c21Var2, Activity activity, Integer num, b21 b21Var, r51[] r51VarArr) {
        super(c21Var2, activity, false, num, 2, null);
        this.f44003g2 = c21Var;
        this.f44001e2 = b21Var;
        this.f44002f2 = r51VarArr;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l4 != null) {
            c21 c21Var = this.f44003g2;
            i10 = ((org.telegram.ui.ActionBar.o2) c21Var).currentAccount;
            MediaDataController mediaDataController = MediaDataController.getInstance(i10);
            mediaDataController.setDoubleTapReaction("animated_" + l4);
            b21 b21Var = this.f44001e2;
            if (b21Var != null) {
                b21Var.a(true);
            }
            r51 r51Var = this.f44002f2[0];
            if (r51Var != null) {
                c21Var.f36201n = null;
                r51Var.dismiss();
            }
        }
    }

    @Override
    public final void r(j51 j51Var, ah.i1 i1Var) {
        int i10;
        c21 c21Var = this.f44003g2;
        i10 = ((org.telegram.ui.ActionBar.o2) c21Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(i1Var.f784f);
        b21 b21Var = this.f44001e2;
        if (b21Var != null) {
            b21Var.a(true);
        }
        r51 r51Var = this.f44002f2[0];
        if (r51Var != null) {
            c21Var.f36201n = null;
            r51Var.dismiss();
        }
    }
}
