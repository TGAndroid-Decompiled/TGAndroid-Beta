package org.telegram.ui;
public final class ud0 implements org.telegram.ui.ActionBar.z1 {
    public final int f40651a;
    public final bh0 f40652b;

    public ud0(bh0 bh0Var, int i10) {
        this.f40651a = i10;
        this.f40652b = bh0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f40651a) {
            case 0:
                bh0 bh0Var = this.f40652b;
                bh0Var.f34545b[bh0Var.f34543a].d();
                bh0Var.k1(true, true);
                return;
            default:
                bh0 bh0Var2 = this.f40652b;
                bh0Var2.f34558l0 = true;
                if (bh0Var2.f34543a != 0) {
                    bh0Var2.u1(0, true, null, true);
                    return;
                }
                return;
        }
    }
}
