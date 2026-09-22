package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class vg0 implements Runnable {
    public final int f38567a;
    public final wg0 f38568b;
    public final mg0 f38569c;

    public vg0(int i10, mg0 mg0Var, wg0 wg0Var) {
        this.f38567a = i10;
        this.f38568b = wg0Var;
        this.f38569c = mg0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f38567a;
        mg0 mg0Var = this.f38569c;
        wg0 wg0Var = this.f38568b;
        switch (i10) {
            case 0:
                int i11 = mg0.E;
                mg0Var.a();
                AndroidUtilities.runOnUIThread(new vg0(1, mg0Var, wg0Var), 150L);
                return;
            default:
                xg0 xg0Var = wg0Var.f39167a;
                xg0Var.h(null);
                RadialProgressView radialProgressView = xg0Var.V.N.d;
                RadialProgressView radialProgressView2 = mg0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f22384a = radialProgressView2.f22384a;
                radialProgressView.f22385b = radialProgressView2.f22385b;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.f22386c = radialProgressView2.f22386c;
                radialProgressView.f22388n = radialProgressView2.f22388n;
                radialProgressView.e = radialProgressView2.e;
                radialProgressView.f22393y = radialProgressView2.f22393y;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.b(85L);
                return;
        }
    }
}
