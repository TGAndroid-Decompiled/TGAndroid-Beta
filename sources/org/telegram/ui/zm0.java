package org.telegram.ui;
public final class zm0 implements org.telegram.ui.ActionBar.b2 {
    public final int f46327a;
    public final en0 f46328b;

    public zm0(en0 en0Var, int i10) {
        this.f46327a = i10;
        this.f46328b = en0Var;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f46327a) {
            case 0:
                en0 en0Var = this.f46328b;
                en0Var.c(true);
                en0Var.Q.finishFragment();
                return;
            default:
                en0 en0Var2 = this.f46328b;
                en0Var2.c(true);
                en0Var2.Q.K1(null, 0, true);
                return;
        }
    }
}
