package org.telegram.ui;
public final class si implements org.telegram.ui.Components.uh0 {
    public boolean f39829a = true;
    public final org.telegram.ui.Components.gl0 f39830b;

    public si(org.telegram.ui.Components.gl0 gl0Var) {
        this.f39830b = gl0Var;
    }

    @Override
    public final void a(float f7, float f10) {
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        org.telegram.ui.Components.gl0 gl0Var = this.f39830b;
        if (i10 == 0 && !this.f39829a) {
            gl0Var.r(false);
            this.f39829a = true;
        } else if (f7 == 1.0f && this.f39829a) {
            gl0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.f39829a = false;
            }
        }
    }
}
