package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class zh0 extends sy {
    public final int[] J;
    public final ni0 K;

    public zh0(ni0 ni0Var, yh0 yh0Var, int i10) {
        super(i10, yh0Var);
        this.K = ni0Var;
        this.J = new int[2];
    }

    @Override
    public final void h(ry ryVar) {
        ni0 ni0Var = this.K;
        gi0 gi0Var = ni0Var.G;
        if (ryVar == null) {
            return;
        }
        if (ni0Var.f40852h0 != null) {
            ryVar.f42361c = true;
            float f10 = (sy.f() * AndroidUtilities.density) / 1.3f;
            float f11 = f10 / 3.0f;
            ryVar.d = f11;
            ryVar.f42362e = f11;
            ryVar.f42359a = Utilities.clamp(ni0Var.f40852h0.right - (0.75f * f10), AndroidUtilities.displaySize.x - f10, 0.0f);
            ryVar.f42360b = ni0Var.f40852h0.bottom - (f10 / 2.0f);
            return;
        }
        org.telegram.ui.Cells.s1 s1Var = ni0Var.M;
        if (s1Var == null || !s1Var.isAttachedToWindow() || ni0Var.M.getMessageObject() == null || ni0Var.M.getMessageObject().getId() != ni0Var.N) {
            return;
        }
        org.telegram.ui.Cells.s1 s1Var2 = ni0Var.M;
        int[] iArr = this.J;
        s1Var2.getLocationOnScreen(iArr);
        ryVar.f42361c = true;
        float f12 = (sy.f() * AndroidUtilities.density) / 1.3f;
        float f13 = f12 / 3.0f;
        ryVar.d = f13;
        ryVar.f42362e = f13;
        float f14 = f12 / 2.0f;
        ryVar.f42359a = Utilities.clamp(((gi0Var.getScaleX() * ni0Var.M.getTimeX()) + iArr[0]) - f14, AndroidUtilities.displaySize.x - f12, 0.0f);
        ryVar.f42360b = ((gi0Var.getScaleY() * ni0Var.M.getTimeY()) + iArr[1]) - f14;
    }
}
