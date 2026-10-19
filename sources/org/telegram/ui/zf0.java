package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public final class zf0 implements Runnable {
    public final int f43738a;
    public final ag0 f43739b;
    public final qf0 f43740c;

    public zf0(int i10, qf0 qf0Var, ag0 ag0Var) {
        this.f43738a = i10;
        this.f43739b = ag0Var;
        this.f43740c = qf0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f43738a;
        qf0 qf0Var = this.f43740c;
        ag0 ag0Var = this.f43739b;
        switch (i10) {
            case 0:
                int i11 = qf0.E;
                qf0Var.a();
                AndroidUtilities.runOnUIThread(new zf0(1, qf0Var, ag0Var), 150L);
                return;
            default:
                bg0 bg0Var = ag0Var.f35362a;
                bg0Var.h(null);
                RadialProgressView radialProgressView = bg0Var.V.N.d;
                RadialProgressView radialProgressView2 = qf0Var.h.d;
                radialProgressView.getClass();
                radialProgressView.f24325a = radialProgressView2.f24325a;
                radialProgressView.f24326b = radialProgressView2.f24326b;
                radialProgressView.H = radialProgressView2.H;
                radialProgressView.I = radialProgressView2.I;
                radialProgressView.J = radialProgressView2.J;
                radialProgressView.f24327c = radialProgressView2.f24327c;
                radialProgressView.f24329n = radialProgressView2.f24329n;
                radialProgressView.e = radialProgressView2.e;
                radialProgressView.f24334y = radialProgressView2.f24334y;
                radialProgressView.F = radialProgressView2.F;
                radialProgressView.G = radialProgressView2.G;
                radialProgressView.d = radialProgressView2.d;
                radialProgressView.E = radialProgressView2.E;
                radialProgressView.b(85L);
                return;
        }
    }
}
