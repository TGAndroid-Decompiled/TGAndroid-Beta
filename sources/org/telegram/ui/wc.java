package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class wc implements Utilities.Callback {
    public final int f42483a;
    public final bd f42484b;

    public wc(bd bdVar, int i10) {
        this.f42483a = i10;
        this.f42484b = bdVar;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f42483a) {
            case 0:
                bd bdVar = this.f42484b;
                bdVar.getClass();
                ((org.telegram.ui.Components.p21) view).setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21074i5, bdVar.f35647b));
                return;
            default:
                if (view instanceof org.telegram.ui.Components.p21) {
                    org.telegram.ui.Components.p21 p21Var = (org.telegram.ui.Components.p21) view;
                    if (p21Var.G.f31889a.f20720b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f42484b.v;
                    }
                    p21Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}
