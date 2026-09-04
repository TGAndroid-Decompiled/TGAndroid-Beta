package org.telegram.ui;
public final class qr implements org.telegram.ui.Cells.z4, org.telegram.ui.Components.rv0 {
    public final int f39973a;
    public final rr f39974b;

    public qr(rr rrVar, int i10) {
        this.f39973a = i10;
        this.f39974b = rrVar;
    }

    @Override
    public boolean d(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        vr vrVar = this.f39974b.d;
        return vrVar.h0(vrVar.f41629a.E(((Integer) a5Var.getTag()).intValue()), !z10, a5Var);
    }

    @Override
    public void i(int i10) {
        boolean z10;
        switch (this.f39973a) {
            case 1:
                vr vrVar = this.f39974b.d;
                if (vrVar.f41670s != null) {
                    int i11 = vrVar.f41664p1;
                    if ((i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    vrVar.f41664p1 = i10;
                    if (z10) {
                        pr w02 = vrVar.w0();
                        vrVar.B0();
                        vrVar.A0(w02);
                    }
                    vrVar.f41629a.m(vrVar.P0);
                    return;
                }
                return;
            default:
                this.f39974b.d.f41672s1 = i10 + 1;
                return;
        }
    }

    @Override
    public void l() {
        int i10 = this.f39973a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
