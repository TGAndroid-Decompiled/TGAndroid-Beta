package org.telegram.ui;
public final class rm0 implements org.telegram.ui.ActionBar.z1 {
    public final int f41192a;
    public final wm0 f41193b;

    public rm0(wm0 wm0Var, int i10) {
        this.f41192a = i10;
        this.f41193b = wm0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f41192a) {
            case 0:
                wm0 wm0Var = this.f41193b;
                wm0Var.c(true);
                wm0Var.Q.finishFragment();
                return;
            default:
                wm0 wm0Var2 = this.f41193b;
                wm0Var2.c(true);
                wm0Var2.Q.J1(null, 0, true);
                return;
        }
    }
}
