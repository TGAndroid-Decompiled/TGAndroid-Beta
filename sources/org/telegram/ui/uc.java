package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class uc implements h5.d {
    public final int f41796a;
    public final zc f41797b;

    public uc(zc zcVar, int i10) {
        this.f41796a = i10;
        this.f41797b = zcVar;
    }

    @Override
    public final void accept(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f41796a) {
            case 0:
                zc zcVar = this.f41797b;
                zcVar.getClass();
                ((org.telegram.ui.Components.w11) view).setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21751i5, zcVar.f43892b));
                return;
            default:
                if (view instanceof org.telegram.ui.Components.w11) {
                    org.telegram.ui.Components.w11 w11Var = (org.telegram.ui.Components.w11) view;
                    if (w11Var.D.f28819a.f21361b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f41797b.v;
                    }
                    w11Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}
