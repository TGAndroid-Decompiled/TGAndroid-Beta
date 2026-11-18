package org.telegram.ui;
public final class uh implements org.telegram.ui.Components.hf0 {
    public boolean f52567a = true;
    public final org.telegram.ui.Components.vi0 f52568b;

    public uh(org.telegram.ui.Components.vi0 vi0Var) {
        this.f52568b = vi0Var;
    }

    @Override
    public final void a(float f10, float f11) {
        int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        org.telegram.ui.Components.vi0 vi0Var = this.f52568b;
        if (i7 == 0 && !this.f52567a) {
            vi0Var.r(false);
            this.f52567a = true;
        } else if (f10 == 1.0f && this.f52567a) {
            vi0Var.setAlpha(1.0f - f11);
            if (f11 == 1.0f) {
                this.f52567a = false;
            }
        }
    }
}
