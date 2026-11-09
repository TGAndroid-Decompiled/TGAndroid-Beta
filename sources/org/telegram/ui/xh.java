package org.telegram.ui;
public final class xh implements org.telegram.ui.Components.ve0 {
    public boolean f51662a = true;
    public final org.telegram.ui.Components.ji0 f51663b;

    public xh(org.telegram.ui.Components.ji0 ji0Var) {
        this.f51663b = ji0Var;
    }

    @Override
    public final void a(float f10, float f11) {
        int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        org.telegram.ui.Components.ji0 ji0Var = this.f51663b;
        if (i7 == 0 && !this.f51662a) {
            ji0Var.r(false);
            this.f51662a = true;
        } else if (f10 == 1.0f && this.f51662a) {
            ji0Var.setAlpha(1.0f - f11);
            if (f11 == 1.0f) {
                this.f51662a = false;
            }
        }
    }
}
