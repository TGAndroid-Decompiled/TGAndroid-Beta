package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class rg0 implements Runnable {
    public final int f40117a;
    public final sg0 f40118b;
    public final ig0 f40119c;

    public rg0(int i10, ig0 ig0Var, sg0 sg0Var) {
        this.f40117a = i10;
        this.f40118b = sg0Var;
        this.f40119c = ig0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f40117a;
        ig0 ig0Var = this.f40119c;
        sg0 sg0Var = this.f40118b;
        switch (i10) {
            case 0:
                int i11 = ig0.E;
                ig0Var.a();
                AndroidUtilities.runOnUIThread(new rg0(1, ig0Var, sg0Var), 150L);
                return;
            default:
                tg0 tg0Var = sg0Var.f40478a;
                tg0Var.h(null);
                RadialProgressView radialProgressView = tg0Var.V.N.d;
                RadialProgressView radialProgressView2 = ig0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f24279a = radialProgressView2.f24279a;
                radialProgressView.f24280b = radialProgressView2.f24280b;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.f24281c = radialProgressView2.f24281c;
                radialProgressView.f24284n = radialProgressView2.f24284n;
                radialProgressView.f24282e = radialProgressView2.f24282e;
                radialProgressView.f24289y = radialProgressView2.f24289y;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.b(85L);
                return;
        }
    }
}
