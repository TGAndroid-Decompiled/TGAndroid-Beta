package org.telegram.ui;
public final class zm0 implements org.telegram.ui.ActionBar.a2 {
    public final int f40194a;
    public final en0 f40195b;

    public zm0(en0 en0Var, int i10) {
        this.f40194a = i10;
        this.f40195b = en0Var;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f40194a) {
            case 0:
                en0 en0Var = this.f40195b;
                en0Var.c(true);
                en0Var.Q.finishFragment();
                return;
            default:
                en0 en0Var2 = this.f40195b;
                en0Var2.c(true);
                en0Var2.Q.K1(null, 0, true);
                return;
        }
    }
}
