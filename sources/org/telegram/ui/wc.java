package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class wc implements e2.h {
    public final int f38685a;
    public final ad f38686b;

    public wc(ad adVar, int i10) {
        this.f38685a = i10;
        this.f38686b = adVar;
    }

    @Override
    public final void accept(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f38685a) {
            case 0:
                ad adVar = this.f38686b;
                adVar.getClass();
                ((org.telegram.ui.Components.v11) view).setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18952i5, adVar.f31829b));
                return;
            default:
                if (view instanceof org.telegram.ui.Components.v11) {
                    org.telegram.ui.Components.v11 v11Var = (org.telegram.ui.Components.v11) view;
                    if (v11Var.G.f25957a.f18619b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f38686b.v;
                    }
                    v11Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}
