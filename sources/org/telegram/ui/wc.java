package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class wc implements e2.h {
    public final int f37827a;
    public final ad f37828b;

    public wc(ad adVar, int i10) {
        this.f37827a = i10;
        this.f37828b = adVar;
    }

    @Override
    public final void accept(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f37827a) {
            case 0:
                ad adVar = this.f37828b;
                adVar.getClass();
                ((org.telegram.ui.Components.i21) view).setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18016i5, adVar.f30892b));
                return;
            default:
                if (view instanceof org.telegram.ui.Components.i21) {
                    org.telegram.ui.Components.i21 i21Var = (org.telegram.ui.Components.i21) view;
                    if (i21Var.G.f26733a.f17715b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f37828b.v;
                    }
                    i21Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}
