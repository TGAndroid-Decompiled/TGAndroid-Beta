package ph;

import org.telegram.ui.tz0;
public final class w9 extends y9 {
    public final int f42515g;
    public final Object h;

    public w9(Object obj, int i10) {
        this.f42515g = i10;
        this.h = obj;
    }

    @Override
    public final void e() {
        switch (this.f42515g) {
            case 0:
                tz0 tz0Var = (tz0) this.h;
                tz0Var.N = false;
                tz0Var.invalidate();
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
                p9Var.post(new org.telegram.ui.web.o0(p9Var, 29));
                return;
        }
    }

    @Override
    public final void f(boolean z4) {
        switch (this.f42515g) {
            case 0:
                tz0 tz0Var = (tz0) this.h;
                tz0Var.N = true;
                tz0Var.invalidate();
                return;
            case 1:
                nh.d4 t6 = ((nh.i9) this.h).t();
                if (t6 != null) {
                    t6.m0(false);
                }
                nh.i3 i3Var = this.f42634f;
                if (i3Var != null) {
                    i3Var.setTranslationX(0.0f);
                    this.f42634f.setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                ((org.telegram.ui.Components.p9) this.h).setVisibility(0);
                return;
        }
    }
}
