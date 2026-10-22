package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class yh0 extends oy {
    public final int[] N;
    public final mi0 O;

    public yh0(mi0 mi0Var, xh0 xh0Var, int i10) {
        super(i10, xh0Var);
        this.O = mi0Var;
        this.N = new int[2];
    }

    @Override
    public final void g(ny nyVar) {
        mi0 mi0Var = this.O;
        fi0 fi0Var = mi0Var.J;
        if (nyVar != null) {
            if (mi0Var.f39272k0 != null) {
                nyVar.f39709c = true;
                float f7 = (oy.f() * AndroidUtilities.density) / 1.3f;
                float f10 = f7 / 3.0f;
                nyVar.d = f10;
                nyVar.e = f10;
                nyVar.f39707a = Utilities.clamp(mi0Var.f39272k0.right - (0.75f * f7), AndroidUtilities.displaySize.x - f7, 0.0f);
                nyVar.f39708b = mi0Var.f39272k0.bottom - (f7 / 2.0f);
                return;
            }
            org.telegram.ui.Cells.u1 u1Var = mi0Var.P;
            if (u1Var != null && u1Var.isAttachedToWindow() && mi0Var.P.getMessageObject() != null && mi0Var.P.getMessageObject().getId() == mi0Var.Q) {
                org.telegram.ui.Cells.u1 u1Var2 = mi0Var.P;
                int[] iArr = this.N;
                u1Var2.getLocationOnScreen(iArr);
                nyVar.f39709c = true;
                float f11 = (oy.f() * AndroidUtilities.density) / 1.3f;
                float f12 = f11 / 3.0f;
                nyVar.d = f12;
                nyVar.e = f12;
                float f13 = f11 / 2.0f;
                nyVar.f39707a = Utilities.clamp(((fi0Var.getScaleX() * mi0Var.P.getTimeX()) + iArr[0]) - f13, AndroidUtilities.displaySize.x - f11, 0.0f);
                nyVar.f39708b = ((fi0Var.getScaleY() * mi0Var.P.getTimeY()) + iArr[1]) - f13;
            }
        }
    }
}
