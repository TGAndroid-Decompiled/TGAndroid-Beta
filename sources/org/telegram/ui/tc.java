package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class tc implements org.telegram.messenger.q20 {
    public final int f41790a;
    public final xc f41791b;

    public tc(xc xcVar, int i10) {
        this.f41790a = i10;
        this.f41791b = xcVar;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f41790a) {
            case 0:
                xc xcVar = this.f41791b;
                xcVar.getClass();
                if (view instanceof org.telegram.ui.Components.e11) {
                    view.setBackgroundColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21019i5, xcVar.f43536b));
                    return;
                }
                return;
            default:
                if (view instanceof org.telegram.ui.Components.e11) {
                    org.telegram.ui.Components.e11 e11Var = (org.telegram.ui.Components.e11) view;
                    if (e11Var.G.f25123a.f21559b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f41791b.f43542w;
                    }
                    e11Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}
