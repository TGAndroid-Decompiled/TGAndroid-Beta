package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class uc implements Utilities.Callback {
    public final int f41921a;
    public final zc f41922b;

    public uc(zc zcVar, int i10) {
        this.f41921a = i10;
        this.f41922b = zcVar;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f41921a) {
            case 0:
                zc zcVar = this.f41922b;
                zcVar.getClass();
                ((org.telegram.ui.Components.q21) view).setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21075i5, zcVar.f43707b));
                return;
            default:
                if (view instanceof org.telegram.ui.Components.q21) {
                    org.telegram.ui.Components.q21 q21Var = (org.telegram.ui.Components.q21) view;
                    if (q21Var.G.f31898a.f20721b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f41922b.v;
                    }
                    q21Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}
