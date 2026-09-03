package org.telegram.ui;
public final class th implements Runnable {
    public final int f38517a = 1;
    public final int f38518b;
    public final zn f38519c;
    public final boolean d;

    public th(int i10, zn znVar, boolean z4) {
        this.f38518b = i10;
        this.f38519c = znVar;
        this.d = z4;
    }

    @Override
    public final void run() {
        switch (this.f38517a) {
            case 0:
                boolean z4 = this.d;
                this.f38519c.yc(this.f38518b, z4);
                return;
            default:
                int i10 = this.f38518b;
                zn znVar = this.f38519c;
                if (i10 != 2) {
                    znVar.U9();
                    znVar.Yb();
                }
                sh.o0.f(org.telegram.ui.Components.qc.a0(znVar), i10, this.d);
                return;
        }
    }

    public th(zn znVar, boolean z4, int i10) {
        this.f38519c = znVar;
        this.d = z4;
        this.f38518b = i10;
    }
}
