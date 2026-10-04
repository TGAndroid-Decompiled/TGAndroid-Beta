package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class wc implements Utilities.Callback {
    public final int f42053a;
    public final ad f42054b;

    public wc(ad adVar, int i10) {
        this.f42053a = i10;
        this.f42054b = adVar;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f42053a) {
            case 0:
                ad adVar = this.f42054b;
                adVar.getClass();
                ((org.telegram.ui.Components.s21) view).setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20908i5, adVar.f34780b));
                return;
            default:
                if (view instanceof org.telegram.ui.Components.s21) {
                    org.telegram.ui.Components.s21 s21Var = (org.telegram.ui.Components.s21) view;
                    if (s21Var.G.f29423a.f20501b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f42054b.v;
                    }
                    s21Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}
