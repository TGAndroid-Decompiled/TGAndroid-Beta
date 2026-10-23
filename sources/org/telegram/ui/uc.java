package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class uc implements Utilities.Callback {
    public final int f41931a;
    public final zc f41932b;

    public uc(zc zcVar, int i10) {
        this.f41931a = i10;
        this.f41932b = zcVar;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f41931a) {
            case 0:
                zc zcVar = this.f41932b;
                zcVar.getClass();
                ((org.telegram.ui.Components.r21) view).setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21082i5, zcVar.f43717b));
                return;
            default:
                if (view instanceof org.telegram.ui.Components.r21) {
                    org.telegram.ui.Components.r21 r21Var = (org.telegram.ui.Components.r21) view;
                    if (r21Var.G.f31854a.f20728b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f41932b.v;
                    }
                    r21Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}
