package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class uc implements Utilities.Callback {
    public final int f42370a;
    public final zc f42371b;

    public uc(zc zcVar, int i10) {
        this.f42370a = i10;
        this.f42371b = zcVar;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f42370a) {
            case 0:
                zc zcVar = this.f42371b;
                zcVar.getClass();
                if (view instanceof org.telegram.ui.Components.v21) {
                    view.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21271i5, zcVar.f44108b));
                    return;
                }
                return;
            default:
                if (view instanceof org.telegram.ui.Components.v21) {
                    org.telegram.ui.Components.v21 v21Var = (org.telegram.ui.Components.v21) view;
                    if (v21Var.G.f32035a.f20885b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f42371b.v;
                    }
                    v21Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}
