package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class uc implements e2.h {
    public final int f37973a;
    public final yc f37974b;

    public uc(yc ycVar, int i10) {
        this.f37973a = i10;
        this.f37974b = ycVar;
    }

    @Override
    public final void accept(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f37973a) {
            case 0:
                yc ycVar = this.f37974b;
                ycVar.getClass();
                ((org.telegram.ui.Components.u11) view).setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18925i5, ycVar.f39838b));
                return;
            default:
                if (view instanceof org.telegram.ui.Components.u11) {
                    org.telegram.ui.Components.u11 u11Var = (org.telegram.ui.Components.u11) view;
                    if (u11Var.G.f25994a.f18590b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f37974b.v;
                    }
                    u11Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}
