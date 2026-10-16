package org.telegram.ui;
public final class tr implements org.telegram.ui.Cells.a5, org.telegram.ui.Components.rw0 {
    public final int f40200a;
    public final ur f40201b;

    public tr(ur urVar, int i10) {
        this.f40200a = i10;
        this.f40201b = urVar;
    }

    @Override
    public boolean d(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        yr yrVar = this.f40201b.d;
        return yrVar.h0(yrVar.f41889a.E(((Integer) b5Var.getTag()).intValue()), !z10, b5Var);
    }

    @Override
    public void h(int i10) {
        boolean z10;
        switch (this.f40200a) {
            case 1:
                yr yrVar = this.f40201b.d;
                if (yrVar.f41929s != null) {
                    int i11 = yrVar.f41923p1;
                    if ((i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    yrVar.f41923p1 = i10;
                    if (z10) {
                        sr w02 = yrVar.w0();
                        yrVar.B0();
                        yrVar.A0(w02);
                    }
                    yrVar.f41889a.m(yrVar.P0);
                    return;
                }
                return;
            default:
                this.f40201b.d.f41931s1 = i10 + 1;
                return;
        }
    }

    @Override
    public void m() {
        int i10 = this.f40200a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
