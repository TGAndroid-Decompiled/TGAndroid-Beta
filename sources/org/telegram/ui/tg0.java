package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class tg0 implements Runnable {
    public final int f40775a;
    public final ug0 f40776b;
    public final kg0 f40777c;

    public tg0(int i10, kg0 kg0Var, ug0 ug0Var) {
        this.f40775a = i10;
        this.f40776b = ug0Var;
        this.f40777c = kg0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f40775a;
        kg0 kg0Var = this.f40777c;
        ug0 ug0Var = this.f40776b;
        switch (i10) {
            case 0:
                int i11 = kg0.E;
                kg0Var.a();
                AndroidUtilities.runOnUIThread(new tg0(1, kg0Var, ug0Var), 150L);
                return;
            default:
                vg0 vg0Var = ug0Var.f41118a;
                vg0Var.h(null);
                RadialProgressView radialProgressView = vg0Var.V.N.d;
                RadialProgressView radialProgressView2 = kg0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f24121a = radialProgressView2.f24121a;
                radialProgressView.f24122b = radialProgressView2.f24122b;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.f24123c = radialProgressView2.f24123c;
                radialProgressView.f24126n = radialProgressView2.f24126n;
                radialProgressView.f24124e = radialProgressView2.f24124e;
                radialProgressView.f24131y = radialProgressView2.f24131y;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.b(85L);
                return;
        }
    }
}
