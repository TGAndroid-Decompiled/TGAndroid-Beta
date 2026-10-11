package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class uc implements Utilities.Callback {
    public final int f42522a;
    public final yc f42523b;

    public uc(yc ycVar, int i10) {
        this.f42522a = i10;
        this.f42523b = ycVar;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f42522a) {
            case 0:
                yc ycVar = this.f42523b;
                ycVar.getClass();
                ((org.telegram.ui.Components.b31) view).setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20876i5, ycVar.f44310b));
                return;
            default:
                if (view instanceof org.telegram.ui.Components.b31) {
                    org.telegram.ui.Components.b31 b31Var = (org.telegram.ui.Components.b31) view;
                    if (b31Var.G.f25002a.f20468b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f42523b.v;
                    }
                    b31Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}
