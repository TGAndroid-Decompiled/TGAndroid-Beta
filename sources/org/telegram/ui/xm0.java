package org.telegram.ui;
public final class xm0 implements org.telegram.ui.ActionBar.z1 {
    public final int f39953a;
    public final cn0 f39954b;

    public xm0(cn0 cn0Var, int i10) {
        this.f39953a = i10;
        this.f39954b = cn0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f39953a) {
            case 0:
                cn0 cn0Var = this.f39954b;
                cn0Var.c(true);
                cn0Var.Q.finishFragment();
                return;
            default:
                cn0 cn0Var2 = this.f39954b;
                cn0Var2.c(true);
                cn0Var2.Q.K1(null, 0, true);
                return;
        }
    }
}
