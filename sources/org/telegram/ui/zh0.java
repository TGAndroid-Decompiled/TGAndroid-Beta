package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class zh0 extends qy {
    public final int[] N;
    public final ni0 O;

    public zh0(ni0 ni0Var, yh0 yh0Var, int i10) {
        super(i10, yh0Var);
        this.O = ni0Var;
        this.N = new int[2];
    }

    @Override
    public final void g(py pyVar) {
        ni0 ni0Var = this.O;
        gi0 gi0Var = ni0Var.K;
        if (pyVar != null) {
            if (ni0Var.f39463l0 != null) {
                pyVar.f40222c = true;
                float f7 = (qy.f() * AndroidUtilities.density) / 1.3f;
                float f10 = f7 / 3.0f;
                pyVar.d = f10;
                pyVar.e = f10;
                pyVar.f40220a = Utilities.clamp(ni0Var.f39463l0.right - (0.75f * f7), AndroidUtilities.displaySize.x - f7, 0.0f);
                pyVar.f40221b = ni0Var.f39463l0.bottom - (f7 / 2.0f);
                return;
            }
            org.telegram.ui.Cells.u1 u1Var = ni0Var.Q;
            if (u1Var != null && u1Var.isAttachedToWindow() && ni0Var.Q.getMessageObject() != null && ni0Var.Q.getMessageObject().getId() == ni0Var.R) {
                org.telegram.ui.Cells.u1 u1Var2 = ni0Var.Q;
                int[] iArr = this.N;
                u1Var2.getLocationOnScreen(iArr);
                pyVar.f40222c = true;
                float f11 = (qy.f() * AndroidUtilities.density) / 1.3f;
                float f12 = f11 / 3.0f;
                pyVar.d = f12;
                pyVar.e = f12;
                float f13 = f11 / 2.0f;
                pyVar.f40220a = Utilities.clamp(((gi0Var.getScaleX() * ni0Var.Q.getTimeX()) + iArr[0]) - f13, AndroidUtilities.displaySize.x - f11, 0.0f);
                pyVar.f40221b = ((gi0Var.getScaleY() * ni0Var.Q.getTimeY()) + iArr[1]) - f13;
            }
        }
    }
}
