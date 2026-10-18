package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class wc implements Utilities.Callback {
    public final int f42507a;
    public final bd f42508b;

    public wc(bd bdVar, int i10) {
        this.f42507a = i10;
        this.f42508b = bdVar;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f42507a) {
            case 0:
                bd bdVar = this.f42508b;
                bdVar.getClass();
                ((org.telegram.ui.Components.p21) view).setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21081i5, bdVar.f35670b));
                return;
            default:
                if (view instanceof org.telegram.ui.Components.p21) {
                    org.telegram.ui.Components.p21 p21Var = (org.telegram.ui.Components.p21) view;
                    if (p21Var.G.f31896a.f20727b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f42508b.v;
                    }
                    p21Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}
