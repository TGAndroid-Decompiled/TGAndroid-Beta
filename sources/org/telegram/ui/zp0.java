package org.telegram.ui;
public final class zp0 extends org.telegram.ui.ActionBar.j {
    public final fq0 f43866a;

    public zp0(fq0 fq0Var) {
        this.f43866a = fq0Var;
    }

    @Override
    public final void b(int i10) {
        fq0 fq0Var = this.f43866a;
        if (i10 == -1) {
            fq0Var.finishFragment();
        } else if (i10 == 1) {
            if (fq0Var.V != null) {
                fq0Var.finishFragment(false);
                fq0Var.V.b();
            }
        } else if (i10 == 2) {
            fq0.S(fq0Var, null);
        }
    }
}
