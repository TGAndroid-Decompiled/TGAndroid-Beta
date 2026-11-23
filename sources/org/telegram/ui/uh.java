package org.telegram.ui;
public final class uh implements org.telegram.ui.Components.jf0 {
    public boolean f52555a = true;
    public final org.telegram.ui.Components.xi0 f52556b;

    public uh(org.telegram.ui.Components.xi0 xi0Var) {
        this.f52556b = xi0Var;
    }

    @Override
    public final void a(float f10, float f11) {
        int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        org.telegram.ui.Components.xi0 xi0Var = this.f52556b;
        if (i7 == 0 && !this.f52555a) {
            xi0Var.r(false);
            this.f52555a = true;
        } else if (f10 == 1.0f && this.f52555a) {
            xi0Var.setAlpha(1.0f - f11);
            if (f11 == 1.0f) {
                this.f52555a = false;
            }
        }
    }
}
