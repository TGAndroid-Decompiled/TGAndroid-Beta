package org.telegram.ui;
public final class ri implements org.telegram.ui.Components.xf0 {
    public boolean f41093a = true;
    public final org.telegram.ui.Components.nj0 f41094b;

    public ri(org.telegram.ui.Components.nj0 nj0Var) {
        this.f41094b = nj0Var;
    }

    @Override
    public final void a(float f7, float f10) {
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        org.telegram.ui.Components.nj0 nj0Var = this.f41094b;
        if (i10 == 0 && !this.f41093a) {
            nj0Var.r(false);
            this.f41093a = true;
        } else if (f7 == 1.0f && this.f41093a) {
            nj0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.f41093a = false;
            }
        }
    }
}
