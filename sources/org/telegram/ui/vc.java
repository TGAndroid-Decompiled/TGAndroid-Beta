package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class vc implements Utilities.Callback {
    public final int f42822a;
    public final zc f42823b;

    public vc(zc zcVar, int i10) {
        this.f42822a = i10;
        this.f42823b = zcVar;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f42822a) {
            case 0:
                zc zcVar = this.f42823b;
                zcVar.getClass();
                ((org.telegram.ui.Components.z21) view).setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20887i5, zcVar.f44540b));
                return;
            default:
                if (view instanceof org.telegram.ui.Components.z21) {
                    org.telegram.ui.Components.z21 z21Var = (org.telegram.ui.Components.z21) view;
                    if (z21Var.G.f25082a.f20506b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f42823b.v;
                    }
                    z21Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}
