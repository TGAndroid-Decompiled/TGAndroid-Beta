package org.telegram.ui;
public final class rh implements Runnable {
    public final int f40962a = 1;
    public final int f40963b;
    public final xn f40964c;
    public final boolean d;

    public rh(int i10, xn xnVar, boolean z4) {
        this.f40963b = i10;
        this.f40964c = xnVar;
        this.d = z4;
    }

    @Override
    public final void run() {
        switch (this.f40962a) {
            case 0:
                boolean z4 = this.d;
                this.f40964c.yc(this.f40963b, z4);
                return;
            default:
                int i10 = this.f40963b;
                xn xnVar = this.f40964c;
                if (i10 != 2) {
                    xnVar.U9();
                    xnVar.Yb();
                }
                th.o0.f(org.telegram.ui.Components.qc.a0(xnVar), i10, this.d);
                return;
        }
    }

    public rh(xn xnVar, boolean z4, int i10) {
        this.f40964c = xnVar;
        this.d = z4;
        this.f40963b = i10;
    }
}
