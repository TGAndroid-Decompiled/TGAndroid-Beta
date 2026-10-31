package xh;

import org.telegram.messenger.l9;
public final class r1 implements g3, l9, org.telegram.ui.ActionBar.u1 {
    public final m2 f54002a;

    public r1(m2 m2Var) {
        this.f54002a = m2Var;
    }

    @Override
    public void a(boolean z10) {
        m2 m2Var = this.f54002a;
        if (m2Var.f53881e0 && z10) {
            return;
        }
        m2Var.o(true);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        this.f54002a.o(false);
    }

    @Override
    public Object l(Object obj) {
        boolean z10;
        Void r22 = (Void) obj;
        if (this.f54002a.f53882f.getKeyboardHeight() >= org.telegram.messenger.i0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
