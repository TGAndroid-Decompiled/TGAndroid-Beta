package org.telegram.ui;
public final class tr implements org.telegram.ui.Cells.a5, org.telegram.ui.Components.rw0 {
    public final int f40475a;
    public final ur f40476b;

    public tr(ur urVar, int i10) {
        this.f40475a = i10;
        this.f40476b = urVar;
    }

    @Override
    public boolean d(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        yr yrVar = this.f40476b.d;
        return yrVar.h0(yrVar.f42212a.E(((Integer) b5Var.getTag()).intValue()), !z10, b5Var);
    }

    @Override
    public void f(int i10) {
        boolean z10;
        switch (this.f40475a) {
            case 1:
                yr yrVar = this.f40476b.d;
                if (yrVar.f42252s != null) {
                    int i11 = yrVar.f42246p1;
                    if ((i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    yrVar.f42246p1 = i10;
                    if (z10) {
                        sr w02 = yrVar.w0();
                        yrVar.B0();
                        yrVar.A0(w02);
                    }
                    yrVar.f42212a.m(yrVar.P0);
                    return;
                }
                return;
            default:
                this.f40476b.d.f42254s1 = i10 + 1;
                return;
        }
    }

    @Override
    public void m() {
        int i10 = this.f40475a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
