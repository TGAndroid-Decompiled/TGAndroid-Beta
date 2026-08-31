package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class vc implements h5.d {
    public final int f42198a;
    public final zc f42199b;

    public vc(zc zcVar, int i10) {
        this.f42198a = i10;
        this.f42199b = zcVar;
    }

    @Override
    public final void accept(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f42198a) {
            case 0:
                zc zcVar = this.f42199b;
                zcVar.getClass();
                ((org.telegram.ui.Components.x11) view).setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21749i5, zcVar.f43893b));
                return;
            default:
                if (view instanceof org.telegram.ui.Components.x11) {
                    org.telegram.ui.Components.x11 x11Var = (org.telegram.ui.Components.x11) view;
                    if (x11Var.D.f28796a.f21359b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f42199b.v;
                    }
                    x11Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}
