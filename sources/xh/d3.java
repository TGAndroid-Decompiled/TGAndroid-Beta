package xh;

import org.telegram.messenger.m9;
public final class d3 implements org.telegram.ui.ActionBar.u1, h3, m9 {
    public final j3 f53748a;

    public d3(j3 j3Var) {
        this.f53748a = j3Var;
    }

    @Override
    public void a(boolean z10) {
        j3 j3Var = this.f53748a;
        if (!j3Var.N()) {
            j3Var.J.e(0.0f);
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        this.f53748a.f30964b.dismiss();
    }

    @Override
    public Object l(Object obj) {
        boolean z10;
        Void r22 = (Void) obj;
        if (this.f53748a.f30964b.f24786l3.getKeyboardHeight() >= org.telegram.messenger.i0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
