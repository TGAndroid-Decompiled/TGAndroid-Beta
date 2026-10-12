package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class ug0 implements Runnable {
    public final int f42518a;
    public final vg0 f42519b;
    public final lg0 f42520c;

    public ug0(int i10, lg0 lg0Var, vg0 vg0Var) {
        this.f42518a = i10;
        this.f42519b = vg0Var;
        this.f42520c = lg0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f42518a;
        lg0 lg0Var = this.f42520c;
        vg0 vg0Var = this.f42519b;
        switch (i10) {
            case 0:
                int i11 = lg0.E;
                lg0Var.a();
                AndroidUtilities.runOnUIThread(new ug0(1, lg0Var, vg0Var), 150L);
                return;
            default:
                wg0 wg0Var = vg0Var.f42785a;
                wg0Var.h(null);
                RadialProgressView radialProgressView = wg0Var.V.N.d;
                RadialProgressView radialProgressView2 = lg0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f24061a = radialProgressView2.f24061a;
                radialProgressView.f24062b = radialProgressView2.f24062b;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.f24063c = radialProgressView2.f24063c;
                radialProgressView.f24066n = radialProgressView2.f24066n;
                radialProgressView.f24064e = radialProgressView2.f24064e;
                radialProgressView.f24071y = radialProgressView2.f24071y;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.b(85L);
                return;
        }
    }
}
