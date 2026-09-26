package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class uc implements Utilities.Callback {
    public final int f38426a;
    public final yc f38427b;

    public uc(yc ycVar, int i10) {
        this.f38426a = i10;
        this.f38427b = ycVar;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f38426a) {
            case 0:
                yc ycVar = this.f38427b;
                ycVar.getClass();
                ((org.telegram.ui.Components.i21) view).setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19147i5, ycVar.f40112b));
                return;
            default:
                if (view instanceof org.telegram.ui.Components.i21) {
                    org.telegram.ui.Components.i21 i21Var = (org.telegram.ui.Components.i21) view;
                    if (i21Var.G.f26860a.f18757b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f38427b.v;
                    }
                    i21Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}
