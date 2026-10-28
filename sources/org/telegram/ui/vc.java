package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class vc implements Utilities.Callback {
    public final int f44242a;
    public final zc f44243b;

    public vc(zc zcVar, int i10) {
        this.f44242a = i10;
        this.f44243b = zcVar;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f44242a) {
            case 0:
                zc zcVar = this.f44243b;
                zcVar.getClass();
                if (view instanceof org.telegram.ui.Components.e31) {
                    view.setBackgroundColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23448i5, zcVar.f46219b));
                    return;
                }
                return;
            default:
                if (view instanceof org.telegram.ui.Components.e31) {
                    org.telegram.ui.Components.e31 e31Var = (org.telegram.ui.Components.e31) view;
                    if (e31Var.G.f35124a.f22684b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f44243b.v;
                    }
                    e31Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}
