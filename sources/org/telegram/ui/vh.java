package org.telegram.ui;
public final class vh implements org.telegram.ui.Components.xe0 {
    public boolean f52227a = true;
    public final org.telegram.ui.Components.mi0 f52228b;

    public vh(org.telegram.ui.Components.mi0 mi0Var) {
        this.f52228b = mi0Var;
    }

    @Override
    public final void a(float f10, float f11) {
        int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        org.telegram.ui.Components.mi0 mi0Var = this.f52228b;
        if (i7 == 0 && !this.f52227a) {
            mi0Var.r(false);
            this.f52227a = true;
        } else if (f10 == 1.0f && this.f52227a) {
            mi0Var.setAlpha(1.0f - f11);
            if (f11 == 1.0f) {
                this.f52227a = false;
            }
        }
    }
}
