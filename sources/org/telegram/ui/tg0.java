package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class tg0 implements Runnable {
    public final int f40747a;
    public final ug0 f40748b;
    public final kg0 f40749c;

    public tg0(int i10, kg0 kg0Var, ug0 ug0Var) {
        this.f40747a = i10;
        this.f40748b = ug0Var;
        this.f40749c = kg0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f40747a;
        kg0 kg0Var = this.f40749c;
        ug0 ug0Var = this.f40748b;
        switch (i10) {
            case 0:
                int i11 = kg0.E;
                kg0Var.a();
                AndroidUtilities.runOnUIThread(new tg0(1, kg0Var, ug0Var), 150L);
                return;
            default:
                vg0 vg0Var = ug0Var.f41090a;
                vg0Var.h(null);
                RadialProgressView radialProgressView = vg0Var.V.N.d;
                RadialProgressView radialProgressView2 = kg0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f24093a = radialProgressView2.f24093a;
                radialProgressView.f24094b = radialProgressView2.f24094b;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.f24095c = radialProgressView2.f24095c;
                radialProgressView.f24098n = radialProgressView2.f24098n;
                radialProgressView.f24096e = radialProgressView2.f24096e;
                radialProgressView.f24103y = radialProgressView2.f24103y;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.b(85L);
                return;
        }
    }
}
