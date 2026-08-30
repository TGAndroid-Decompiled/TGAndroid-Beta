package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class vc implements h5.d {
    public final int f39142a;
    public final zc f39143b;

    public vc(zc zcVar, int i10) {
        this.f39142a = i10;
        this.f39143b = zcVar;
    }

    @Override
    public final void accept(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f39142a) {
            case 0:
                zc zcVar = this.f39143b;
                zcVar.getClass();
                ((org.telegram.ui.Components.w11) view).setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19995i5, zcVar.f40756b));
                return;
            default:
                if (view instanceof org.telegram.ui.Components.w11) {
                    org.telegram.ui.Components.w11 w11Var = (org.telegram.ui.Components.w11) view;
                    if (w11Var.D.f26015a.f19664b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f39143b.v;
                    }
                    w11Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}
