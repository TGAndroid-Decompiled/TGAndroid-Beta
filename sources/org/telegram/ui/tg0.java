package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class tg0 implements Runnable {
    public final int f37666a;
    public final ug0 f37667b;
    public final kg0 f37668c;

    public tg0(int i10, kg0 kg0Var, ug0 ug0Var) {
        this.f37666a = i10;
        this.f37667b = ug0Var;
        this.f37668c = kg0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f37666a;
        kg0 kg0Var = this.f37668c;
        ug0 ug0Var = this.f37667b;
        switch (i10) {
            case 0:
                int i11 = kg0.E;
                kg0Var.a();
                AndroidUtilities.runOnUIThread(new tg0(1, kg0Var, ug0Var), 150L);
                return;
            default:
                vg0 vg0Var = ug0Var.f37972a;
                vg0Var.h(null);
                RadialProgressView radialProgressView = vg0Var.V.N.d;
                RadialProgressView radialProgressView2 = kg0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f22144a = radialProgressView2.f22144a;
                radialProgressView.f22145b = radialProgressView2.f22145b;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.f22146c = radialProgressView2.f22146c;
                radialProgressView.f22148n = radialProgressView2.f22148n;
                radialProgressView.e = radialProgressView2.e;
                radialProgressView.f22153y = radialProgressView2.f22153y;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.b(85L);
                return;
        }
    }
}
