package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class rg0 implements Runnable {
    public final int f40095a;
    public final sg0 f40096b;
    public final ig0 f40097c;

    public rg0(int i10, ig0 ig0Var, sg0 sg0Var) {
        this.f40095a = i10;
        this.f40096b = sg0Var;
        this.f40097c = ig0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f40095a;
        ig0 ig0Var = this.f40097c;
        sg0 sg0Var = this.f40096b;
        switch (i10) {
            case 0:
                int i11 = ig0.E;
                ig0Var.a();
                AndroidUtilities.runOnUIThread(new rg0(1, ig0Var, sg0Var), 150L);
                return;
            default:
                tg0 tg0Var = sg0Var.f40493a;
                tg0Var.h(null);
                RadialProgressView radialProgressView = tg0Var.V.N.d;
                RadialProgressView radialProgressView2 = ig0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f24287a = radialProgressView2.f24287a;
                radialProgressView.f24288b = radialProgressView2.f24288b;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.f24289c = radialProgressView2.f24289c;
                radialProgressView.f24292n = radialProgressView2.f24292n;
                radialProgressView.f24290e = radialProgressView2.f24290e;
                radialProgressView.f24297y = radialProgressView2.f24297y;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.b(85L);
                return;
        }
    }
}
