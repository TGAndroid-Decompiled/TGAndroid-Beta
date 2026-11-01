package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class tc implements org.telegram.messenger.r20 {
    public final int f41614a;
    public final xc f41615b;

    public tc(xc xcVar, int i10) {
        this.f41614a = i10;
        this.f41615b = xcVar;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f41614a) {
            case 0:
                xc xcVar = this.f41615b;
                xcVar.getClass();
                if (view instanceof org.telegram.ui.Components.f11) {
                    view.setBackgroundColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21020i5, xcVar.f43339b));
                    return;
                }
                return;
            default:
                if (view instanceof org.telegram.ui.Components.f11) {
                    org.telegram.ui.Components.f11 f11Var = (org.telegram.ui.Components.f11) view;
                    if (f11Var.G.f25197a.f21560b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f41615b.f43345w;
                    }
                    f11Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}
