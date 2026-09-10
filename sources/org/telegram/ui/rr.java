package org.telegram.ui;
public final class rr implements org.telegram.ui.Cells.a5, org.telegram.ui.Components.dw0 {
    public final int f36445a;
    public final sr f36446b;

    public rr(sr srVar, int i10) {
        this.f36445a = i10;
        this.f36446b = srVar;
    }

    @Override
    public boolean e(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        wr wrVar = this.f36446b.d;
        return wrVar.h0(wrVar.f38317a.E(((Integer) b5Var.getTag()).intValue()), !z10, b5Var);
    }

    @Override
    public void h(int i10) {
        boolean z10;
        switch (this.f36445a) {
            case 1:
                wr wrVar = this.f36446b.d;
                if (wrVar.f38357s != null) {
                    int i11 = wrVar.f38351p1;
                    if ((i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    wrVar.f38351p1 = i10;
                    if (z10) {
                        qr w02 = wrVar.w0();
                        wrVar.B0();
                        wrVar.A0(w02);
                    }
                    wrVar.f38317a.m(wrVar.P0);
                    return;
                }
                return;
            default:
                this.f36446b.d.f38359s1 = i10 + 1;
                return;
        }
    }

    @Override
    public void l() {
        int i10 = this.f36445a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
