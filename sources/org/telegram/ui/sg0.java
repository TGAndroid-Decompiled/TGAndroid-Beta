package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class sg0 implements Runnable {
    public final int f41734a;
    public final tg0 f41735b;
    public final jg0 f41736c;

    public sg0(int i10, jg0 jg0Var, tg0 tg0Var) {
        this.f41734a = i10;
        this.f41735b = tg0Var;
        this.f41736c = jg0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f41734a;
        jg0 jg0Var = this.f41736c;
        tg0 tg0Var = this.f41735b;
        switch (i10) {
            case 0:
                int i11 = jg0.E;
                jg0Var.a();
                AndroidUtilities.runOnUIThread(new sg0(1, jg0Var, tg0Var), 150L);
                return;
            default:
                ug0 ug0Var = tg0Var.f42184a;
                ug0Var.h(null);
                RadialProgressView radialProgressView = ug0Var.V.N.d;
                RadialProgressView radialProgressView2 = jg0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f24275a = radialProgressView2.f24275a;
                radialProgressView.f24276b = radialProgressView2.f24276b;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.f24277c = radialProgressView2.f24277c;
                radialProgressView.f24280n = radialProgressView2.f24280n;
                radialProgressView.f24278e = radialProgressView2.f24278e;
                radialProgressView.f24285y = radialProgressView2.f24285y;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.b(85L);
                return;
        }
    }
}
