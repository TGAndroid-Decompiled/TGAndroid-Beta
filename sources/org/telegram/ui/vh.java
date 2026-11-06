package org.telegram.ui;
public final class vh implements org.telegram.ui.Components.ue0 {
    public boolean f50719a = true;
    public final org.telegram.ui.Components.ii0 f50720b;

    public vh(org.telegram.ui.Components.ii0 ii0Var) {
        this.f50720b = ii0Var;
    }

    @Override
    public final void a(float f10, float f11) {
        int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        org.telegram.ui.Components.ii0 ii0Var = this.f50720b;
        if (i7 == 0 && !this.f50719a) {
            ii0Var.r(false);
            this.f50719a = true;
        } else if (f10 == 1.0f && this.f50719a) {
            ii0Var.setAlpha(1.0f - f11);
            if (f11 == 1.0f) {
                this.f50719a = false;
            }
        }
    }
}
