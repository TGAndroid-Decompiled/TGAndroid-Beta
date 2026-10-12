package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class ug0 implements Runnable {
    public final int f42516a;
    public final vg0 f42517b;
    public final kg0 f42518c;

    public ug0(int i10, kg0 kg0Var, vg0 vg0Var) {
        this.f42516a = i10;
        this.f42517b = vg0Var;
        this.f42518c = kg0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f42516a;
        kg0 kg0Var = this.f42518c;
        vg0 vg0Var = this.f42517b;
        switch (i10) {
            case 0:
                int i11 = kg0.E;
                kg0Var.a();
                AndroidUtilities.runOnUIThread(new ug0(1, kg0Var, vg0Var), 150L);
                return;
            default:
                wg0 wg0Var = vg0Var.f42783a;
                wg0Var.h(null);
                RadialProgressView radialProgressView = wg0Var.V.N.d;
                RadialProgressView radialProgressView2 = kg0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f24060a = radialProgressView2.f24060a;
                radialProgressView.f24061b = radialProgressView2.f24061b;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.f24062c = radialProgressView2.f24062c;
                radialProgressView.f24065n = radialProgressView2.f24065n;
                radialProgressView.f24063e = radialProgressView2.f24063e;
                radialProgressView.f24070y = radialProgressView2.f24070y;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.b(85L);
                return;
        }
    }
}
