package org.telegram.ui;
public final class vh implements org.telegram.ui.Components.if0 {
    public boolean f52968a = true;
    public final org.telegram.ui.Components.xi0 f52969b;

    public vh(org.telegram.ui.Components.xi0 xi0Var) {
        this.f52969b = xi0Var;
    }

    @Override
    public final void a(float f10, float f11) {
        int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        org.telegram.ui.Components.xi0 xi0Var = this.f52969b;
        if (i7 == 0 && !this.f52968a) {
            xi0Var.r(false);
            this.f52968a = true;
        } else if (f10 == 1.0f && this.f52968a) {
            xi0Var.setAlpha(1.0f - f11);
            if (f11 == 1.0f) {
                this.f52968a = false;
            }
        }
    }
}
