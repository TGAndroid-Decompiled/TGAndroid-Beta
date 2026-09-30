package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class uc implements Utilities.Callback {
    public final int f38517a;
    public final yc f38518b;

    public uc(yc ycVar, int i10) {
        this.f38517a = i10;
        this.f38518b = ycVar;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f38517a) {
            case 0:
                yc ycVar = this.f38518b;
                ycVar.getClass();
                ((org.telegram.ui.Components.k21) view).setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19164i5, ycVar.f40219b));
                return;
            default:
                if (view instanceof org.telegram.ui.Components.k21) {
                    org.telegram.ui.Components.k21 k21Var = (org.telegram.ui.Components.k21) view;
                    if (k21Var.G.f27160a.f18774b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f38518b.v;
                    }
                    k21Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}
