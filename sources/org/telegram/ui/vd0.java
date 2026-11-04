package org.telegram.ui;

import org.telegram.ui.Components.RadialProgressView;
public final class vd0 implements Runnable {
    public final int f50463a;
    public final f f50464b;
    public final md0 f50465c;

    public vd0(int i3, f fVar, md0 md0Var) {
        this.f50463a = i3;
        this.f50464b = fVar;
        this.f50465c = md0Var;
    }

    @Override
    public final void run() {
        int i3 = this.f50463a;
        md0 md0Var = this.f50465c;
        f fVar = this.f50464b;
        switch (i3) {
            case 0:
                int i10 = md0.G;
                md0Var.a();
                org.telegram.messenger.g0.i3(new vd0(1, fVar, md0Var), 150L);
                return;
            default:
                wd0 wd0Var = (wd0) fVar.f45115b;
                wd0Var.h(null);
                RadialProgressView radialProgressView = wd0Var.f50785b0.O.d;
                RadialProgressView radialProgressView2 = md0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f31571a = radialProgressView2.f31571a;
                radialProgressView.f31572b = radialProgressView2.f31572b;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.K = radialProgressView2.K;
                radialProgressView.f31573c = radialProgressView2.f31573c;
                radialProgressView.f31576n = radialProgressView2.f31576n;
                radialProgressView.f31574e = radialProgressView2.f31574e;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.b(85L);
                return;
        }
    }
}
