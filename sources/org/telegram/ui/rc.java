package org.telegram.ui;

import android.view.View;

public final class rc implements d5.d {

    public final int f41897a;

    public final vc f41898b;

    public rc(vc vcVar, int i10) {
        this.f41897a = i10;
        this.f41898b = vcVar;
    }

    @Override
    public final void accept(Object obj) {
        View view = (View) obj;
        switch (this.f41897a) {
            case 0:
                vc vcVar = this.f41898b;
                vcVar.getClass();
                ((org.telegram.ui.Components.b11) view).setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23143i5, vcVar.f43416b));
                break;
            default:
                if (view instanceof org.telegram.ui.Components.b11) {
                    org.telegram.ui.Components.b11 b11Var = (org.telegram.ui.Components.b11) view;
                    b11Var.setFallbackWallpaper(b11Var.C.f35316a.f22781b ? null : this.f41898b.v);
                }
                break;
        }
    }
}
