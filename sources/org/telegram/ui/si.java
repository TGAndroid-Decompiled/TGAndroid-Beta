package org.telegram.ui;
public final class si implements org.telegram.ui.Components.ai0 {
    public boolean f41934a = true;
    public final org.telegram.ui.Components.nl0 f41935b;

    public si(org.telegram.ui.Components.nl0 nl0Var) {
        this.f41935b = nl0Var;
    }

    @Override
    public final void a(float f7, float f10) {
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        org.telegram.ui.Components.nl0 nl0Var = this.f41935b;
        if (i10 == 0 && !this.f41934a) {
            nl0Var.r(false);
            this.f41934a = true;
        } else if (f7 == 1.0f && this.f41934a) {
            nl0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.f41934a = false;
            }
        }
    }
}
