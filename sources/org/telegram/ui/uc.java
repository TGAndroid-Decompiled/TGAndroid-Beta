package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class uc implements Utilities.Callback {
    public final int f41927a;
    public final zc f41928b;

    public uc(zc zcVar, int i10) {
        this.f41927a = i10;
        this.f41928b = zcVar;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f41927a) {
            case 0:
                zc zcVar = this.f41928b;
                zcVar.getClass();
                ((org.telegram.ui.Components.r21) view).setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21078i5, zcVar.f43713b));
                return;
            default:
                if (view instanceof org.telegram.ui.Components.r21) {
                    org.telegram.ui.Components.r21 r21Var = (org.telegram.ui.Components.r21) view;
                    if (r21Var.G.f31849a.f20724b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f41928b.v;
                    }
                    r21Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}
