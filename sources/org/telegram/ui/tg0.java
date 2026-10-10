package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class tg0 implements Runnable {
    public final int f42049a;
    public final ug0 f42050b;
    public final kg0 f42051c;

    public tg0(int i10, kg0 kg0Var, ug0 ug0Var) {
        this.f42049a = i10;
        this.f42050b = ug0Var;
        this.f42051c = kg0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f42049a;
        kg0 kg0Var = this.f42051c;
        ug0 ug0Var = this.f42050b;
        switch (i10) {
            case 0:
                int i11 = kg0.E;
                kg0Var.a();
                AndroidUtilities.runOnUIThread(new tg0(1, kg0Var, ug0Var), 150L);
                return;
            default:
                vg0 vg0Var = ug0Var.f42473a;
                vg0Var.h(null);
                RadialProgressView radialProgressView = vg0Var.V.N.d;
                RadialProgressView radialProgressView2 = kg0Var.h.d;
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
