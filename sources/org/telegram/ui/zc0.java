package org.telegram.ui;
public final class zc0 implements org.telegram.ui.ActionBar.r1 {
    public final int f52404a;
    public final jd0 f52405b;

    public zc0(jd0 jd0Var, int i7) {
        this.f52404a = i7;
        this.f52405b = jd0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f52404a) {
            case 0:
                jd0 jd0Var = this.f52405b;
                jd0Var.c(true);
                jd0Var.f46985u0.M1(0, true, null, true);
                return;
            default:
                this.f52405b.f46985u0.M1(0, true, null, true);
                return;
        }
    }
}
