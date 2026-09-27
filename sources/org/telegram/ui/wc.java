package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class wc implements Utilities.Callback {
    public final int f38906a;
    public final ad f38907b;

    public wc(ad adVar, int i10) {
        this.f38906a = i10;
        this.f38907b = adVar;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f38906a) {
            case 0:
                ad adVar = this.f38907b;
                adVar.getClass();
                ((org.telegram.ui.Components.j21) view).setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19146i5, adVar.f32048b));
                return;
            default:
                if (view instanceof org.telegram.ui.Components.j21) {
                    org.telegram.ui.Components.j21 j21Var = (org.telegram.ui.Components.j21) view;
                    if (j21Var.G.f26877a.f18801b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f38907b.v;
                    }
                    j21Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}
