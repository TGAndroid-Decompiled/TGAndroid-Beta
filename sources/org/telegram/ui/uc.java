package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class uc implements Utilities.Callback {
    public final int f38048a;
    public final yc f38049b;

    public uc(yc ycVar, int i10) {
        this.f38048a = i10;
        this.f38049b = ycVar;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f38048a) {
            case 0:
                yc ycVar = this.f38049b;
                ycVar.getClass();
                ((org.telegram.ui.Components.t11) view).setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18877i5, ycVar.f39786b));
                return;
            default:
                if (view instanceof org.telegram.ui.Components.t11) {
                    org.telegram.ui.Components.t11 t11Var = (org.telegram.ui.Components.t11) view;
                    if (t11Var.G.f26253a.f18534b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f38049b.v;
                    }
                    t11Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}
