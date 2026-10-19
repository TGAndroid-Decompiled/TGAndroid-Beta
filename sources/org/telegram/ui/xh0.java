package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class xh0 extends oy {
    public final int[] N;
    public final li0 O;

    public xh0(li0 li0Var, wh0 wh0Var, int i10) {
        super(i10, wh0Var);
        this.O = li0Var;
        this.N = new int[2];
    }

    @Override
    public final void g(ny nyVar) {
        li0 li0Var = this.O;
        ei0 ei0Var = li0Var.K;
        if (nyVar != null) {
            if (li0Var.f38945l0 != null) {
                nyVar.f39701c = true;
                float f7 = (oy.f() * AndroidUtilities.density) / 1.3f;
                float f10 = f7 / 3.0f;
                nyVar.d = f10;
                nyVar.e = f10;
                nyVar.f39699a = Utilities.clamp(li0Var.f38945l0.right - (0.75f * f7), AndroidUtilities.displaySize.x - f7, 0.0f);
                nyVar.f39700b = li0Var.f38945l0.bottom - (f7 / 2.0f);
                return;
            }
            org.telegram.ui.Cells.u1 u1Var = li0Var.Q;
            if (u1Var != null && u1Var.isAttachedToWindow() && li0Var.Q.getMessageObject() != null && li0Var.Q.getMessageObject().getId() == li0Var.R) {
                org.telegram.ui.Cells.u1 u1Var2 = li0Var.Q;
                int[] iArr = this.N;
                u1Var2.getLocationOnScreen(iArr);
                nyVar.f39701c = true;
                float f11 = (oy.f() * AndroidUtilities.density) / 1.3f;
                float f12 = f11 / 3.0f;
                nyVar.d = f12;
                nyVar.e = f12;
                float f13 = f11 / 2.0f;
                nyVar.f39699a = Utilities.clamp(((ei0Var.getScaleX() * li0Var.Q.getTimeX()) + iArr[0]) - f13, AndroidUtilities.displaySize.x - f11, 0.0f);
                nyVar.f39700b = ((ei0Var.getScaleY() * li0Var.Q.getTimeY()) + iArr[1]) - f13;
            }
        }
    }
}
