package org.telegram.ui;
public final class ri implements org.telegram.ui.Components.xf0 {
    public boolean f41234a = true;
    public final org.telegram.ui.Components.mj0 f41235b;

    public ri(org.telegram.ui.Components.mj0 mj0Var) {
        this.f41235b = mj0Var;
    }

    @Override
    public final void a(float f7, float f10) {
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        org.telegram.ui.Components.mj0 mj0Var = this.f41235b;
        if (i10 == 0 && !this.f41234a) {
            mj0Var.r(false);
            this.f41234a = true;
        } else if (f7 == 1.0f && this.f41234a) {
            mj0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.f41234a = false;
            }
        }
    }
}
