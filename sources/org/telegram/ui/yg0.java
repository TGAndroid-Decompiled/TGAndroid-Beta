package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class yg0 implements Runnable {
    public final int f42159a;
    public final zg0 f42160b;
    public final pg0 f42161c;

    public yg0(int i10, pg0 pg0Var, zg0 zg0Var) {
        this.f42159a = i10;
        this.f42160b = zg0Var;
        this.f42161c = pg0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f42159a;
        pg0 pg0Var = this.f42161c;
        zg0 zg0Var = this.f42160b;
        switch (i10) {
            case 0:
                int i11 = pg0.E;
                pg0Var.a();
                AndroidUtilities.runOnUIThread(new yg0(1, pg0Var, zg0Var), 150L);
                return;
            default:
                ah0 ah0Var = zg0Var.f42617a;
                ah0Var.h(null);
                RadialProgressView radialProgressView = ah0Var.V.N.d;
                RadialProgressView radialProgressView2 = pg0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f23267a = radialProgressView2.f23267a;
                radialProgressView.f23268b = radialProgressView2.f23268b;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.f23269c = radialProgressView2.f23269c;
                radialProgressView.f23271n = radialProgressView2.f23271n;
                radialProgressView.e = radialProgressView2.e;
                radialProgressView.f23276y = radialProgressView2.f23276y;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.b(85L);
                return;
        }
    }
}
