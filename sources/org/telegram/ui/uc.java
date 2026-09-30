package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class uc implements Utilities.Callback {
    public final int f38427a;
    public final yc f38428b;

    public uc(yc ycVar, int i10) {
        this.f38427a = i10;
        this.f38428b = ycVar;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f38427a) {
            case 0:
                yc ycVar = this.f38428b;
                ycVar.getClass();
                ((org.telegram.ui.Components.j21) view).setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19149i5, ycVar.f40114b));
                return;
            default:
                if (view instanceof org.telegram.ui.Components.j21) {
                    org.telegram.ui.Components.j21 j21Var = (org.telegram.ui.Components.j21) view;
                    if (j21Var.G.f26842a.f18759b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f38428b.v;
                    }
                    j21Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}
