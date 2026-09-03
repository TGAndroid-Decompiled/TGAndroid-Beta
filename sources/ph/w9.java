package ph;

import org.telegram.ui.a01;
public final class w9 extends y9 {
    public final int f42549g;
    public final Object h;

    public w9(Object obj, int i10) {
        this.f42549g = i10;
        this.h = obj;
    }

    @Override
    public final void e() {
        switch (this.f42549g) {
            case 0:
                a01 a01Var = (a01) this.h;
                a01Var.N = false;
                a01Var.invalidate();
                return;
            case 1:
                nh.d4 t6 = ((nh.i9) this.h).t();
                if (t6 != null) {
                    t6.m0(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.p9 p9Var = (org.telegram.ui.Components.p9) this.h;
                p9Var.post(new org.telegram.ui.web.q0(p9Var, 29));
                return;
        }
    }

    @Override
    public final void f(boolean z4) {
        switch (this.f42549g) {
            case 0:
                a01 a01Var = (a01) this.h;
                a01Var.N = true;
                a01Var.invalidate();
                return;
            case 1:
                nh.d4 t6 = ((nh.i9) this.h).t();
                if (t6 != null) {
                    t6.m0(false);
                }
                nh.i3 i3Var = this.f42674f;
                if (i3Var != null) {
                    i3Var.setTranslationX(0.0f);
                    this.f42674f.setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                ((org.telegram.ui.Components.p9) this.h).setVisibility(0);
                return;
        }
    }
}
