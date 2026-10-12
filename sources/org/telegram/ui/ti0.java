package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ti0 extends kz {
    public final int[] N;
    public final hj0 O;

    public ti0(hj0 hj0Var, si0 si0Var, int i10) {
        super(i10, si0Var);
        this.O = hj0Var;
        this.N = new int[2];
    }

    @Override
    public final void g(jz jzVar) {
        hj0 hj0Var = this.O;
        aj0 aj0Var = hj0Var.K;
        if (jzVar != null) {
            if (hj0Var.f36849l0 != null) {
                jzVar.f37461c = true;
                float f7 = (kz.f() * AndroidUtilities.density) / 1.3f;
                float f10 = f7 / 3.0f;
                jzVar.d = f10;
                jzVar.e = f10;
                jzVar.f37459a = Utilities.clamp(hj0Var.f36849l0.right - (0.75f * f7), AndroidUtilities.displaySize.x - f7, 0.0f);
                jzVar.f37460b = hj0Var.f36849l0.bottom - (f7 / 2.0f);
                return;
            }
            org.telegram.ui.Cells.u1 u1Var = hj0Var.Q;
            if (u1Var != null && u1Var.isAttachedToWindow() && hj0Var.Q.getMessageObject() != null && hj0Var.Q.getMessageObject().getId() == hj0Var.R) {
                org.telegram.ui.Cells.u1 u1Var2 = hj0Var.Q;
                int[] iArr = this.N;
                u1Var2.getLocationOnScreen(iArr);
                jzVar.f37461c = true;
                float f11 = (kz.f() * AndroidUtilities.density) / 1.3f;
                float f12 = f11 / 3.0f;
                jzVar.d = f12;
                jzVar.e = f12;
                float f13 = f11 / 2.0f;
                jzVar.f37459a = Utilities.clamp(((aj0Var.getScaleX() * hj0Var.Q.getTimeX()) + iArr[0]) - f13, AndroidUtilities.displaySize.x - f11, 0.0f);
                jzVar.f37460b = ((aj0Var.getScaleY() * hj0Var.Q.getTimeY()) + iArr[1]) - f13;
            }
        }
    }
}
