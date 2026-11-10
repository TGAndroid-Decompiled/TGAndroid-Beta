package org.telegram.ui;
public final class xh implements org.telegram.ui.Components.ue0 {
    public boolean f51725a = true;
    public final org.telegram.ui.Components.ii0 f51726b;

    public xh(org.telegram.ui.Components.ii0 ii0Var) {
        this.f51726b = ii0Var;
    }

    @Override
    public final void a(float f10, float f11) {
        int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        org.telegram.ui.Components.ii0 ii0Var = this.f51726b;
        if (i7 == 0 && !this.f51725a) {
            ii0Var.r(false);
            this.f51725a = true;
        } else if (f10 == 1.0f && this.f51725a) {
            ii0Var.setAlpha(1.0f - f11);
            if (f11 == 1.0f) {
                this.f51725a = false;
            }
        }
    }
}
