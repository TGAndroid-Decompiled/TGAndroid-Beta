package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class wc implements Utilities.Callback {
    public final int f42076a;
    public final ad f42077b;

    public wc(ad adVar, int i10) {
        this.f42076a = i10;
        this.f42077b = adVar;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f42076a) {
            case 0:
                ad adVar = this.f42077b;
                adVar.getClass();
                ((org.telegram.ui.Components.t21) view).setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20917i5, adVar.f34841b));
                return;
            default:
                if (view instanceof org.telegram.ui.Components.t21) {
                    org.telegram.ui.Components.t21 t21Var = (org.telegram.ui.Components.t21) view;
                    if (t21Var.G.f29528a.f20510b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f42077b.v;
                    }
                    t21Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}
