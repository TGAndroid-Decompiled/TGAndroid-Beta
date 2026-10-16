package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class xg0 implements Runnable {
    public final int f41563a;
    public final yg0 f41564b;
    public final og0 f41565c;

    public xg0(int i10, og0 og0Var, yg0 yg0Var) {
        this.f41563a = i10;
        this.f41564b = yg0Var;
        this.f41565c = og0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f41563a;
        og0 og0Var = this.f41565c;
        yg0 yg0Var = this.f41564b;
        switch (i10) {
            case 0:
                int i11 = og0.E;
                og0Var.a();
                AndroidUtilities.runOnUIThread(new xg0(1, og0Var, yg0Var), 150L);
                return;
            default:
                zg0 zg0Var = yg0Var.f41826a;
                zg0Var.h(null);
                RadialProgressView radialProgressView = zg0Var.V.N.d;
                RadialProgressView radialProgressView2 = og0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f22967a = radialProgressView2.f22967a;
                radialProgressView.f22968b = radialProgressView2.f22968b;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.f22969c = radialProgressView2.f22969c;
                radialProgressView.f22971n = radialProgressView2.f22971n;
                radialProgressView.e = radialProgressView2.e;
                radialProgressView.f22976y = radialProgressView2.f22976y;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.b(85L);
                return;
        }
    }
}
