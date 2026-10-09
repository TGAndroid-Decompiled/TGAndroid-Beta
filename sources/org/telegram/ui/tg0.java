package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class tg0 implements Runnable {
    public final int f42003a;
    public final ug0 f42004b;
    public final kg0 f42005c;

    public tg0(int i10, kg0 kg0Var, ug0 ug0Var) {
        this.f42003a = i10;
        this.f42004b = ug0Var;
        this.f42005c = kg0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f42003a;
        kg0 kg0Var = this.f42005c;
        ug0 ug0Var = this.f42004b;
        switch (i10) {
            case 0:
                int i11 = kg0.E;
                kg0Var.a();
                AndroidUtilities.runOnUIThread(new tg0(1, kg0Var, ug0Var), 150L);
                return;
            default:
                vg0 vg0Var = ug0Var.f42427a;
                vg0Var.h(null);
                RadialProgressView radialProgressView = vg0Var.V.N.d;
                RadialProgressView radialProgressView2 = kg0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f24283a = radialProgressView2.f24283a;
                radialProgressView.f24284b = radialProgressView2.f24284b;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.f24285c = radialProgressView2.f24285c;
                radialProgressView.f24288n = radialProgressView2.f24288n;
                radialProgressView.f24286e = radialProgressView2.f24286e;
                radialProgressView.f24293y = radialProgressView2.f24293y;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.b(85L);
                return;
        }
    }
}
