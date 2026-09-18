package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class vc implements e2.h {
    public final int f38449a;
    public final zc f38450b;

    public vc(zc zcVar, int i10) {
        this.f38449a = i10;
        this.f38450b = zcVar;
    }

    @Override
    public final void accept(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f38449a) {
            case 0:
                zc zcVar = this.f38450b;
                zcVar.getClass();
                ((org.telegram.ui.Components.j21) view).setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19151i5, zcVar.f40075b));
                return;
            default:
                if (view instanceof org.telegram.ui.Components.j21) {
                    org.telegram.ui.Components.j21 j21Var = (org.telegram.ui.Components.j21) view;
                    if (j21Var.G.f26230a.f18775b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f38450b.v;
                    }
                    j21Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}
