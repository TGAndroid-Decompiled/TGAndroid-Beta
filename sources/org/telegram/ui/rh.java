package org.telegram.ui;
public final class rh implements Runnable {
    public final int f38049a = 1;
    public final int f38050b;
    public final xn f38051c;
    public final boolean d;

    public rh(int i10, xn xnVar, boolean z4) {
        this.f38050b = i10;
        this.f38051c = xnVar;
        this.d = z4;
    }

    @Override
    public final void run() {
        switch (this.f38049a) {
            case 0:
                boolean z4 = this.d;
                this.f38051c.yc(this.f38050b, z4);
                return;
            default:
                int i10 = this.f38050b;
                xn xnVar = this.f38051c;
                if (i10 != 2) {
                    xnVar.U9();
                    xnVar.Yb();
                }
                sh.p0.f(org.telegram.ui.Components.qc.a0(xnVar), i10, this.d);
                return;
        }
    }

    public rh(xn xnVar, boolean z4, int i10) {
        this.f38051c = xnVar;
        this.d = z4;
        this.f38050b = i10;
    }
}
