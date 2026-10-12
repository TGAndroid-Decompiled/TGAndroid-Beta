package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class zc implements Utilities.Callback {
    public final int f44716a;
    public final dd f44717b;

    public zc(dd ddVar, int i10) {
        this.f44716a = i10;
        this.f44717b = ddVar;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f44716a) {
            case 0:
                dd ddVar = this.f44717b;
                ddVar.getClass();
                ((org.telegram.ui.Components.f31) view).setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20650i5, ddVar.f36766b));
                return;
            default:
                if (view instanceof org.telegram.ui.Components.f31) {
                    org.telegram.ui.Components.f31 f31Var = (org.telegram.ui.Components.f31) view;
                    if (f31Var.G.f25449a.f20241b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f44717b.v;
                    }
                    f31Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}
