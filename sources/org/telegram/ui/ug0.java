package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class ug0 implements Runnable {
    public final int f37262a;
    public final vg0 f37263b;
    public final kg0 f37264c;

    public ug0(int i10, kg0 kg0Var, vg0 vg0Var) {
        this.f37262a = i10;
        this.f37263b = vg0Var;
        this.f37264c = kg0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f37262a;
        kg0 kg0Var = this.f37264c;
        vg0 vg0Var = this.f37263b;
        switch (i10) {
            case 0:
                int i11 = kg0.E;
                kg0Var.a();
                AndroidUtilities.runOnUIThread(new ug0(1, kg0Var, vg0Var), 150L);
                return;
            default:
                wg0 wg0Var = vg0Var.f37554a;
                wg0Var.h(null);
                RadialProgressView radialProgressView = wg0Var.V.N.d;
                RadialProgressView radialProgressView2 = kg0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f21232a = radialProgressView2.f21232a;
                radialProgressView.f21233b = radialProgressView2.f21233b;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.f21234c = radialProgressView2.f21234c;
                radialProgressView.f21236n = radialProgressView2.f21236n;
                radialProgressView.e = radialProgressView2.e;
                radialProgressView.f21241y = radialProgressView2.f21241y;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.b(85L);
                return;
        }
    }
}
