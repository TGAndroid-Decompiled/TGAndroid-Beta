package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class sg0 implements Runnable {
    public final int f41768a;
    public final tg0 f41769b;
    public final jg0 f41770c;

    public sg0(int i10, jg0 jg0Var, tg0 tg0Var) {
        this.f41768a = i10;
        this.f41769b = tg0Var;
        this.f41770c = jg0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f41768a;
        jg0 jg0Var = this.f41770c;
        tg0 tg0Var = this.f41769b;
        switch (i10) {
            case 0:
                int i11 = jg0.E;
                jg0Var.a();
                AndroidUtilities.runOnUIThread(new sg0(1, jg0Var, tg0Var), 150L);
                return;
            default:
                ug0 ug0Var = tg0Var.f42218a;
                ug0Var.h(null);
                RadialProgressView radialProgressView = ug0Var.V.N.d;
                RadialProgressView radialProgressView2 = jg0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f24311a = radialProgressView2.f24311a;
                radialProgressView.f24312b = radialProgressView2.f24312b;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.f24313c = radialProgressView2.f24313c;
                radialProgressView.f24316n = radialProgressView2.f24316n;
                radialProgressView.f24314e = radialProgressView2.f24314e;
                radialProgressView.f24321y = radialProgressView2.f24321y;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.b(85L);
                return;
        }
    }
}
