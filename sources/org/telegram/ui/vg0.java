package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class vg0 implements Runnable {
    public final int f38546a;
    public final wg0 f38547b;
    public final mg0 f38548c;

    public vg0(int i10, mg0 mg0Var, wg0 wg0Var) {
        this.f38546a = i10;
        this.f38547b = wg0Var;
        this.f38548c = mg0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f38546a;
        mg0 mg0Var = this.f38548c;
        wg0 wg0Var = this.f38547b;
        switch (i10) {
            case 0:
                int i11 = mg0.E;
                mg0Var.a();
                AndroidUtilities.runOnUIThread(new vg0(1, mg0Var, wg0Var), 150L);
                return;
            default:
                xg0 xg0Var = wg0Var.f39146a;
                xg0Var.h(null);
                RadialProgressView radialProgressView = xg0Var.V.N.d;
                RadialProgressView radialProgressView2 = mg0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f22368a = radialProgressView2.f22368a;
                radialProgressView.f22369b = radialProgressView2.f22369b;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.f22370c = radialProgressView2.f22370c;
                radialProgressView.f22372n = radialProgressView2.f22372n;
                radialProgressView.e = radialProgressView2.e;
                radialProgressView.f22377y = radialProgressView2.f22377y;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.b(85L);
                return;
        }
    }
}
