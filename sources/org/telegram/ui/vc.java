package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class vc implements e2.h {
    public final int f41512a;
    public final zc f41513b;

    public vc(zc zcVar, int i10) {
        this.f41512a = i10;
        this.f41513b = zcVar;
    }

    @Override
    public final void accept(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f41512a) {
            case 0:
                zc zcVar = this.f41513b;
                zcVar.getClass();
                ((org.telegram.ui.Components.t11) view).setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20753i5, zcVar.f43370b));
                return;
            default:
                if (view instanceof org.telegram.ui.Components.t11) {
                    org.telegram.ui.Components.t11 t11Var = (org.telegram.ui.Components.t11) view;
                    if (t11Var.G.f27883a.f20363b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f41513b.v;
                    }
                    t11Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}
