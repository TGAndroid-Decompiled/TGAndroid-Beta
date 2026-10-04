package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class rg0 implements Runnable {
    public final int f40123a;
    public final sg0 f40124b;
    public final ig0 f40125c;

    public rg0(int i10, ig0 ig0Var, sg0 sg0Var) {
        this.f40123a = i10;
        this.f40124b = sg0Var;
        this.f40125c = ig0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f40123a;
        ig0 ig0Var = this.f40125c;
        sg0 sg0Var = this.f40124b;
        switch (i10) {
            case 0:
                int i11 = ig0.E;
                ig0Var.a();
                AndroidUtilities.runOnUIThread(new rg0(1, ig0Var, sg0Var), 150L);
                return;
            default:
                tg0 tg0Var = sg0Var.f40484a;
                tg0Var.h(null);
                RadialProgressView radialProgressView = tg0Var.V.N.d;
                RadialProgressView radialProgressView2 = ig0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f24284a = radialProgressView2.f24284a;
                radialProgressView.f24285b = radialProgressView2.f24285b;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.f24286c = radialProgressView2.f24286c;
                radialProgressView.f24289n = radialProgressView2.f24289n;
                radialProgressView.f24287e = radialProgressView2.f24287e;
                radialProgressView.f24294y = radialProgressView2.f24294y;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.b(85L);
                return;
        }
    }
}
