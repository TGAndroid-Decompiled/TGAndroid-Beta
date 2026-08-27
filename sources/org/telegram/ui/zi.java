package org.telegram.ui;

public final class zi extends mg.b {

    public final int f45186n;

    public final rn f45187r;

    public zi(rn rnVar, org.telegram.ui.ActionBar.c6 c6Var, int i10, int i11) {
        super(i10, c6Var);
        this.f45186n = i11;
        this.f45187r = rnVar;
    }

    @Override
    public final int p2() {
        switch (this.f45186n) {
            case 0:
                rn rnVar = this.f45187r;
                if (ng.c.c(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, rnVar.f41983aa)) {
                    return (rnVar.f41983aa == null || org.telegram.ui.ActionBar.g6.I.q()) ? this.d : i0.b.k(this.d, 216);
                }
                return i0.b.k(rnVar.getThemedColor(org.telegram.ui.ActionBar.g6.Sd), 255);
            default:
                rn rnVar2 = this.f45187r;
                if (ng.c.c(((org.telegram.ui.ActionBar.n2) rnVar2).currentAccount, rnVar2.f41983aa)) {
                    return (rnVar2.f41983aa == null || org.telegram.ui.ActionBar.g6.I.q()) ? this.d : i0.b.k(this.d, 216);
                }
                return i0.b.k(rnVar2.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6), 255);
        }
    }
}
