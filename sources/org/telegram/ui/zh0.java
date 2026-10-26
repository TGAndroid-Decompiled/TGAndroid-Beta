package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class zh0 extends oy {
    public final int[] N;
    public final ni0 O;

    public zh0(ni0 ni0Var, yh0 yh0Var, int i10) {
        super(i10, yh0Var);
        this.O = ni0Var;
        this.N = new int[2];
    }

    @Override
    public final void g(ny nyVar) {
        ni0 ni0Var = this.O;
        gi0 gi0Var = ni0Var.J;
        if (nyVar != null) {
            if (ni0Var.f41918k0 != null) {
                nyVar.f42021c = true;
                float f7 = (oy.f() * AndroidUtilities.density) / 1.3f;
                float f10 = f7 / 3.0f;
                nyVar.d = f10;
                nyVar.e = f10;
                nyVar.f42019a = Utilities.clamp(ni0Var.f41918k0.right - (0.75f * f7), AndroidUtilities.displaySize.x - f7, 0.0f);
                nyVar.f42020b = ni0Var.f41918k0.bottom - (f7 / 2.0f);
                return;
            }
            org.telegram.ui.Cells.s1 s1Var = ni0Var.P;
            if (s1Var != null && s1Var.isAttachedToWindow() && ni0Var.P.getMessageObject() != null && ni0Var.P.getMessageObject().getId() == ni0Var.Q) {
                org.telegram.ui.Cells.s1 s1Var2 = ni0Var.P;
                int[] iArr = this.N;
                s1Var2.getLocationOnScreen(iArr);
                nyVar.f42021c = true;
                float f11 = (oy.f() * AndroidUtilities.density) / 1.3f;
                float f12 = f11 / 3.0f;
                nyVar.d = f12;
                nyVar.e = f12;
                float f13 = f11 / 2.0f;
                nyVar.f42019a = Utilities.clamp(((gi0Var.getScaleX() * ni0Var.P.getTimeX()) + iArr[0]) - f13, AndroidUtilities.displaySize.x - f11, 0.0f);
                nyVar.f42020b = ((gi0Var.getScaleY() * ni0Var.P.getTimeY()) + iArr[1]) - f13;
            }
        }
    }
}
