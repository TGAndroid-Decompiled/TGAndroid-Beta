package org.telegram.ui;
public final class xi extends lg.b {
    public final int f44531n;
    public final qn f44532r;

    public xi(qn qnVar, org.telegram.ui.ActionBar.b6 b6Var, int i9, int i10) {
        super(i9, b6Var);
        this.f44531n = i10;
        this.f44532r = qnVar;
    }

    @Override
    public final int k() {
        int i9;
        int i10;
        switch (this.f44531n) {
            case 0:
                qn qnVar = this.f44532r;
                i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                if (!mg.c.c(i9, qnVar.f41848aa)) {
                    return i0.a.k(qnVar.getThemedColor(org.telegram.ui.ActionBar.f6.Sd), 255);
                }
                if (qnVar.f41848aa != null && !org.telegram.ui.ActionBar.f6.I.q()) {
                    return i0.a.k(this.d, 216);
                }
                return this.d;
            default:
                qn qnVar2 = this.f44532r;
                i10 = ((org.telegram.ui.ActionBar.o2) qnVar2).currentAccount;
                if (!mg.c.c(i10, qnVar2.f41848aa)) {
                    return i0.a.k(qnVar2.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6), 255);
                }
                if (qnVar2.f41848aa != null && !org.telegram.ui.ActionBar.f6.I.q()) {
                    return i0.a.k(this.d, 216);
                }
                return this.d;
        }
    }
}
