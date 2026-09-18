package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class ug0 implements Runnable {
    public final int f37990a;
    public final vg0 f37991b;
    public final lg0 f37992c;

    public ug0(int i10, lg0 lg0Var, vg0 vg0Var) {
        this.f37990a = i10;
        this.f37991b = vg0Var;
        this.f37992c = lg0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f37990a;
        lg0 lg0Var = this.f37992c;
        vg0 vg0Var = this.f37991b;
        switch (i10) {
            case 0:
                int i11 = lg0.E;
                lg0Var.a();
                AndroidUtilities.runOnUIThread(new ug0(1, lg0Var, vg0Var), 150L);
                return;
            default:
                wg0 wg0Var = vg0Var.f38550a;
                wg0Var.h(null);
                RadialProgressView radialProgressView = wg0Var.V.N.d;
                RadialProgressView radialProgressView2 = lg0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f22333a = radialProgressView2.f22333a;
                radialProgressView.f22334b = radialProgressView2.f22334b;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.f22335c = radialProgressView2.f22335c;
                radialProgressView.f22337n = radialProgressView2.f22337n;
                radialProgressView.e = radialProgressView2.e;
                radialProgressView.f22342y = radialProgressView2.f22342y;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.b(85L);
                return;
        }
    }
}
