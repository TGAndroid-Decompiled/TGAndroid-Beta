package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class vc implements Utilities.Callback {
    public final int f44766a;
    public final zc f44767b;

    public vc(zc zcVar, int i10) {
        this.f44766a = i10;
        this.f44767b = zcVar;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f44766a) {
            case 0:
                zc zcVar = this.f44767b;
                zcVar.getClass();
                if (view instanceof org.telegram.ui.Components.d31) {
                    view.setBackgroundColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23447i5, zcVar.f46253b));
                    return;
                }
                return;
            default:
                if (view instanceof org.telegram.ui.Components.d31) {
                    org.telegram.ui.Components.d31 d31Var = (org.telegram.ui.Components.d31) view;
                    if (d31Var.G.f34793a.f22683b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f44767b.v;
                    }
                    d31Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}
