package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class si0 extends kz {
    public final int[] N;
    public final gj0 O;

    public si0(gj0 gj0Var, ri0 ri0Var, int i10) {
        super(i10, ri0Var);
        this.O = gj0Var;
        this.N = new int[2];
    }

    @Override
    public final void g(jz jzVar) {
        gj0 gj0Var = this.O;
        zi0 zi0Var = gj0Var.K;
        if (jzVar != null) {
            if (gj0Var.f36247l0 != null) {
                jzVar.f37175c = true;
                float f7 = (kz.f() * AndroidUtilities.density) / 1.3f;
                float f10 = f7 / 3.0f;
                jzVar.d = f10;
                jzVar.e = f10;
                jzVar.f37173a = Utilities.clamp(gj0Var.f36247l0.right - (0.75f * f7), AndroidUtilities.displaySize.x - f7, 0.0f);
                jzVar.f37174b = gj0Var.f36247l0.bottom - (f7 / 2.0f);
                return;
            }
            org.telegram.ui.Cells.u1 u1Var = gj0Var.Q;
            if (u1Var != null && u1Var.isAttachedToWindow() && gj0Var.Q.getMessageObject() != null && gj0Var.Q.getMessageObject().getId() == gj0Var.R) {
                org.telegram.ui.Cells.u1 u1Var2 = gj0Var.Q;
                int[] iArr = this.N;
                u1Var2.getLocationOnScreen(iArr);
                jzVar.f37175c = true;
                float f11 = (kz.f() * AndroidUtilities.density) / 1.3f;
                float f12 = f11 / 3.0f;
                jzVar.d = f12;
                jzVar.e = f12;
                float f13 = f11 / 2.0f;
                jzVar.f37173a = Utilities.clamp(((zi0Var.getScaleX() * gj0Var.Q.getTimeX()) + iArr[0]) - f13, AndroidUtilities.displaySize.x - f11, 0.0f);
                jzVar.f37174b = ((zi0Var.getScaleY() * gj0Var.Q.getTimeY()) + iArr[1]) - f13;
            }
        }
    }
}
