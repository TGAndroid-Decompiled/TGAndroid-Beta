package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class uc implements Utilities.Callback {
    public final int f42381a;
    public final zc f42382b;

    public uc(zc zcVar, int i10) {
        this.f42381a = i10;
        this.f42382b = zcVar;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f42381a) {
            case 0:
                zc zcVar = this.f42382b;
                zcVar.getClass();
                if (view instanceof org.telegram.ui.Components.u21) {
                    view.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21272i5, zcVar.f44062b));
                    return;
                }
                return;
            default:
                if (view instanceof org.telegram.ui.Components.u21) {
                    org.telegram.ui.Components.u21 u21Var = (org.telegram.ui.Components.u21) view;
                    if (u21Var.G.f30871a.f20886b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f42382b.v;
                    }
                    u21Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}
