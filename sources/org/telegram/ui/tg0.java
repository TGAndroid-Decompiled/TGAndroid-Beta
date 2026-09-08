package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class tg0 implements Runnable {
    public final int f40774a;
    public final ug0 f40775b;
    public final kg0 f40776c;

    public tg0(int i10, kg0 kg0Var, ug0 ug0Var) {
        this.f40774a = i10;
        this.f40775b = ug0Var;
        this.f40776c = kg0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f40774a;
        kg0 kg0Var = this.f40776c;
        ug0 ug0Var = this.f40775b;
        switch (i10) {
            case 0:
                int i11 = kg0.E;
                kg0Var.a();
                AndroidUtilities.runOnUIThread(new tg0(1, kg0Var, ug0Var), 150L);
                return;
            default:
                vg0 vg0Var = ug0Var.f41117a;
                vg0Var.h(null);
                RadialProgressView radialProgressView = vg0Var.V.N.d;
                RadialProgressView radialProgressView2 = kg0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f24120a = radialProgressView2.f24120a;
                radialProgressView.f24121b = radialProgressView2.f24121b;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.f24122c = radialProgressView2.f24122c;
                radialProgressView.f24125n = radialProgressView2.f24125n;
                radialProgressView.f24123e = radialProgressView2.f24123e;
                radialProgressView.f24130y = radialProgressView2.f24130y;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.b(85L);
                return;
        }
    }
}
