package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class uc implements Utilities.Callback {
    public final int f38408a;
    public final yc f38409b;

    public uc(yc ycVar, int i10) {
        this.f38408a = i10;
        this.f38409b = ycVar;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f38408a) {
            case 0:
                yc ycVar = this.f38409b;
                ycVar.getClass();
                ((org.telegram.ui.Components.h21) view).setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19133i5, ycVar.f40098b));
                return;
            default:
                if (view instanceof org.telegram.ui.Components.h21) {
                    org.telegram.ui.Components.h21 h21Var = (org.telegram.ui.Components.h21) view;
                    if (h21Var.G.f26557a.f18743b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f38409b.v;
                    }
                    h21Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}
