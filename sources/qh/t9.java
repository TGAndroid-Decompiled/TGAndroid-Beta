package qh;

import org.telegram.ui.a01;
public final class t9 extends w9 {
    public final int f46146g;
    public final Object h;

    public t9(Object obj, int i10) {
        this.f46146g = i10;
        this.h = obj;
    }

    @Override
    public final void e() {
        switch (this.f46146g) {
            case 0:
                a01 a01Var = (a01) this.h;
                a01Var.N = false;
                a01Var.invalidate();
                return;
            case 1:
                oh.f4 t6 = ((oh.i9) this.h).t();
                if (t6 != null) {
                    t6.m0(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.p9 p9Var = (org.telegram.ui.Components.p9) this.h;
                p9Var.post(new u9(p9Var, 0));
                return;
        }
    }

    @Override
    public final void f(boolean z4) {
        switch (this.f46146g) {
            case 0:
                a01 a01Var = (a01) this.h;
                a01Var.N = true;
                a01Var.invalidate();
                return;
            case 1:
                oh.f4 t6 = ((oh.i9) this.h).t();
                if (t6 != null) {
                    t6.m0(false);
                }
                oh.j3 j3Var = this.f46280f;
                if (j3Var != null) {
                    j3Var.setTranslationX(0.0f);
                    this.f46280f.setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                ((org.telegram.ui.Components.p9) this.h).setVisibility(0);
                return;
        }
    }
}
