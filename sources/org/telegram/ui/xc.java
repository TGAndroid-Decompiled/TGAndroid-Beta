package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class xc implements h5.d {
    public final int f39957a;
    public final bd f39958b;

    public xc(bd bdVar, int i10) {
        this.f39957a = i10;
        this.f39958b = bdVar;
    }

    @Override
    public final void accept(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f39957a) {
            case 0:
                bd bdVar = this.f39958b;
                bdVar.getClass();
                ((org.telegram.ui.Components.w11) view).setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19970i5, bdVar.f32841b));
                return;
            default:
                if (view instanceof org.telegram.ui.Components.w11) {
                    org.telegram.ui.Components.w11 w11Var = (org.telegram.ui.Components.w11) view;
                    if (w11Var.D.f25749a.f19639b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f39958b.v;
                    }
                    w11Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}
