package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class vc implements e2.h {
    public final int f38535a;
    public final zc f38536b;

    public vc(zc zcVar, int i10) {
        this.f38535a = i10;
        this.f38536b = zcVar;
    }

    @Override
    public final void accept(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f38535a) {
            case 0:
                zc zcVar = this.f38536b;
                zcVar.getClass();
                ((org.telegram.ui.Components.k21) view).setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19198i5, zcVar.f40193b));
                return;
            default:
                if (view instanceof org.telegram.ui.Components.k21) {
                    org.telegram.ui.Components.k21 k21Var = (org.telegram.ui.Components.k21) view;
                    if (k21Var.G.f26155a.f18823b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f38536b.v;
                    }
                    k21Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}
