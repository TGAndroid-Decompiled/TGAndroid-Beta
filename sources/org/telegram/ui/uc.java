package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class uc implements Utilities.Callback {
    public final int f42556a;
    public final yc f42557b;

    public uc(yc ycVar, int i10) {
        this.f42556a = i10;
        this.f42557b = ycVar;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f42556a) {
            case 0:
                yc ycVar = this.f42557b;
                ycVar.getClass();
                ((org.telegram.ui.Components.a31) view).setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20912i5, ycVar.f44344b));
                return;
            default:
                if (view instanceof org.telegram.ui.Components.a31) {
                    org.telegram.ui.Components.a31 a31Var = (org.telegram.ui.Components.a31) view;
                    if (a31Var.G.f25058a.f20504b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f42557b.v;
                    }
                    a31Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}
