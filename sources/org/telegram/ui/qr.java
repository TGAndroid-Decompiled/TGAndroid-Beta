package org.telegram.ui;
public final class qr implements org.telegram.ui.Cells.z4, org.telegram.ui.Components.rv0 {
    public final int f39974a;
    public final rr f39975b;

    public qr(rr rrVar, int i10) {
        this.f39974a = i10;
        this.f39975b = rrVar;
    }

    @Override
    public boolean d(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        vr vrVar = this.f39975b.d;
        return vrVar.h0(vrVar.f41630a.E(((Integer) a5Var.getTag()).intValue()), !z10, a5Var);
    }

    @Override
    public void i(int i10) {
        boolean z10;
        switch (this.f39974a) {
            case 1:
                vr vrVar = this.f39975b.d;
                if (vrVar.f41671s != null) {
                    int i11 = vrVar.f41665p1;
                    if ((i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    vrVar.f41665p1 = i10;
                    if (z10) {
                        pr w02 = vrVar.w0();
                        vrVar.B0();
                        vrVar.A0(w02);
                    }
                    vrVar.f41630a.m(vrVar.P0);
                    return;
                }
                return;
            default:
                this.f39975b.d.f41673s1 = i10 + 1;
                return;
        }
    }

    @Override
    public void l() {
        int i10 = this.f39974a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
