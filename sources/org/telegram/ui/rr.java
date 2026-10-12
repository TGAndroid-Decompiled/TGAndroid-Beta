package org.telegram.ui;
public final class rr implements org.telegram.ui.Cells.a5, org.telegram.ui.Components.bx0 {
    public final int f41708a;
    public final sr f41709b;

    public rr(sr srVar, int i10) {
        this.f41708a = i10;
        this.f41709b = srVar;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        wr wrVar = this.f41709b.d;
        return wrVar.h0(wrVar.f43608a.E(((Integer) b5Var.getTag()).intValue()), !z10, b5Var);
    }

    @Override
    public void g(int i10) {
        boolean z10;
        switch (this.f41708a) {
            case 1:
                wr wrVar = this.f41709b.d;
                if (wrVar.f43649s != null) {
                    int i11 = wrVar.f43643p1;
                    if ((i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    wrVar.f43643p1 = i10;
                    if (z10) {
                        pr w02 = wrVar.w0();
                        wrVar.B0();
                        wrVar.A0(w02);
                    }
                    wrVar.f43608a.m(wrVar.P0);
                    return;
                }
                return;
            default:
                this.f41709b.d.f43651s1 = i10 + 1;
                return;
        }
    }

    @Override
    public void l() {
        int i10 = this.f41708a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
