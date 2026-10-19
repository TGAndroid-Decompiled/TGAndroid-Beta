package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class uc implements Utilities.Callback {
    public final int f41937a;
    public final zc f41938b;

    public uc(zc zcVar, int i10) {
        this.f41937a = i10;
        this.f41938b = zcVar;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f41937a) {
            case 0:
                zc zcVar = this.f41938b;
                zcVar.getClass();
                ((org.telegram.ui.Components.q21) view).setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21077i5, zcVar.f43712b));
                return;
            default:
                if (view instanceof org.telegram.ui.Components.q21) {
                    org.telegram.ui.Components.q21 q21Var = (org.telegram.ui.Components.q21) view;
                    if (q21Var.G.f31900a.f20723b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f41938b.v;
                    }
                    q21Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}
