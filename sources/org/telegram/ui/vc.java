package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class vc implements e2.h {
    public final int f38514a;
    public final zc f38515b;

    public vc(zc zcVar, int i10) {
        this.f38514a = i10;
        this.f38515b = zcVar;
    }

    @Override
    public final void accept(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f38514a) {
            case 0:
                zc zcVar = this.f38515b;
                zcVar.getClass();
                ((org.telegram.ui.Components.i21) view).setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19183i5, zcVar.f40171b));
                return;
            default:
                if (view instanceof org.telegram.ui.Components.i21) {
                    org.telegram.ui.Components.i21 i21Var = (org.telegram.ui.Components.i21) view;
                    if (i21Var.G.f26219a.f18808b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f38515b.v;
                    }
                    i21Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}
