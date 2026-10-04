package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class rg0 implements Runnable {
    public final int f40118a;
    public final sg0 f40119b;
    public final ig0 f40120c;

    public rg0(int i10, ig0 ig0Var, sg0 sg0Var) {
        this.f40118a = i10;
        this.f40119b = sg0Var;
        this.f40120c = ig0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f40118a;
        ig0 ig0Var = this.f40120c;
        sg0 sg0Var = this.f40119b;
        switch (i10) {
            case 0:
                int i11 = ig0.E;
                ig0Var.a();
                AndroidUtilities.runOnUIThread(new rg0(1, ig0Var, sg0Var), 150L);
                return;
            default:
                tg0 tg0Var = sg0Var.f40479a;
                tg0Var.h(null);
                RadialProgressView radialProgressView = tg0Var.V.N.d;
                RadialProgressView radialProgressView2 = ig0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f24280a = radialProgressView2.f24280a;
                radialProgressView.f24281b = radialProgressView2.f24281b;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.f24282c = radialProgressView2.f24282c;
                radialProgressView.f24285n = radialProgressView2.f24285n;
                radialProgressView.f24283e = radialProgressView2.f24283e;
                radialProgressView.f24290y = radialProgressView2.f24290y;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.b(85L);
                return;
        }
    }
}
