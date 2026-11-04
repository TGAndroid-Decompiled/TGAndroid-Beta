package org.telegram.ui;
public final class rh implements org.telegram.ui.Components.we0 {
    public boolean f49226a = true;
    public final org.telegram.ui.Components.li0 f49227b;

    public rh(org.telegram.ui.Components.li0 li0Var) {
        this.f49227b = li0Var;
    }

    @Override
    public final void a(float f10, float f11) {
        int i3 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        org.telegram.ui.Components.li0 li0Var = this.f49227b;
        if (i3 == 0 && !this.f49226a) {
            li0Var.r(false);
            this.f49226a = true;
        } else if (f10 == 1.0f && this.f49226a) {
            li0Var.setAlpha(1.0f - f11);
            if (f11 == 1.0f) {
                this.f49226a = false;
            }
        }
    }
}
