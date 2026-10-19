package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class w11 extends x51 {
    public final y11 f42433d2;
    public final o51[] f42434e2;
    public final z11 f42435f2;

    public w11(z11 z11Var, z11 z11Var2, Activity activity, Integer num, y11 y11Var, o51[] o51VarArr) {
        super(z11Var2, activity, false, num, 2, null);
        this.f42435f2 = z11Var;
        this.f42433d2 = y11Var;
        this.f42434e2 = o51VarArr;
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        if (l4 != null) {
            z11 z11Var = this.f42435f2;
            i10 = ((org.telegram.ui.ActionBar.n2) z11Var).currentAccount;
            MediaDataController mediaDataController = MediaDataController.getInstance(i10);
            mediaDataController.setDoubleTapReaction("animated_" + l4);
            y11 y11Var = this.f42433d2;
            if (y11Var != null) {
                y11Var.a(true);
            }
            o51 o51Var = this.f42434e2[0];
            if (o51Var != null) {
                z11Var.f43601n = null;
                o51Var.dismiss();
            }
        }
    }

    @Override
    public final void r(g51 g51Var, ah.i1 i1Var) {
        int i10;
        z11 z11Var = this.f42435f2;
        i10 = ((org.telegram.ui.ActionBar.n2) z11Var).currentAccount;
        MediaDataController.getInstance(i10).setDoubleTapReaction(i1Var.f783f);
        y11 y11Var = this.f42433d2;
        if (y11Var != null) {
            y11Var.a(true);
        }
        o51 o51Var = this.f42434e2[0];
        if (o51Var != null) {
            z11Var.f43601n = null;
            o51Var.dismiss();
        }
    }
}
