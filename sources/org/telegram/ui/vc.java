package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class vc implements Utilities.Callback {
    public final int f42866a;
    public final zc f42867b;

    public vc(zc zcVar, int i10) {
        this.f42866a = i10;
        this.f42867b = zcVar;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f42866a) {
            case 0:
                zc zcVar = this.f42867b;
                zcVar.getClass();
                ((org.telegram.ui.Components.a31) view).setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20891i5, zcVar.f44584b));
                return;
            default:
                if (view instanceof org.telegram.ui.Components.a31) {
                    org.telegram.ui.Components.a31 a31Var = (org.telegram.ui.Components.a31) view;
                    if (a31Var.G.f25019a.f20510b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f42867b.v;
                    }
                    a31Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}
