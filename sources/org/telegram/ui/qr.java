package org.telegram.ui;
public final class qr implements org.telegram.ui.Cells.z4, org.telegram.ui.Components.rv0 {
    public final int f40001a;
    public final rr f40002b;

    public qr(rr rrVar, int i10) {
        this.f40001a = i10;
        this.f40002b = rrVar;
    }

    @Override
    public boolean d(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        vr vrVar = this.f40002b.d;
        return vrVar.h0(vrVar.f41657a.E(((Integer) a5Var.getTag()).intValue()), !z10, a5Var);
    }

    @Override
    public void i(int i10) {
        boolean z10;
        switch (this.f40001a) {
            case 1:
                vr vrVar = this.f40002b.d;
                if (vrVar.f41698s != null) {
                    int i11 = vrVar.f41692p1;
                    if ((i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    vrVar.f41692p1 = i10;
                    if (z10) {
                        pr w02 = vrVar.w0();
                        vrVar.B0();
                        vrVar.A0(w02);
                    }
                    vrVar.f41657a.m(vrVar.P0);
                    return;
                }
                return;
            default:
                this.f40002b.d.f41700s1 = i10 + 1;
                return;
        }
    }

    @Override
    public void l() {
        int i10 = this.f40001a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
