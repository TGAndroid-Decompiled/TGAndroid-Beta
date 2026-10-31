package xh;

import org.telegram.messenger.l9;
public final class d3 implements org.telegram.ui.ActionBar.u1, g3, l9 {
    public final i3 f53730a;

    public d3(i3 i3Var) {
        this.f53730a = i3Var;
    }

    @Override
    public void a(boolean z10) {
        i3 i3Var = this.f53730a;
        if (!i3Var.N()) {
            i3Var.J.e(0.0f);
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        this.f53730a.f30947b.dismiss();
    }

    @Override
    public Object l(Object obj) {
        boolean z10;
        Void r22 = (Void) obj;
        if (this.f53730a.f30947b.f24695l3.getKeyboardHeight() >= org.telegram.messenger.i0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
