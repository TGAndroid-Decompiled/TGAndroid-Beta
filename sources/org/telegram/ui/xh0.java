package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class xh0 extends py {
    public final int[] J;
    public final li0 K;

    public xh0(li0 li0Var, wh0 wh0Var, int i9) {
        super(i9, wh0Var);
        this.K = li0Var;
        this.J = new int[2];
    }

    @Override
    public final void h(oy oyVar) {
        li0 li0Var = this.K;
        ei0 ei0Var = li0Var.G;
        if (oyVar != null) {
            if (li0Var.f40159h0 != null) {
                oyVar.f41264c = true;
                float f10 = (py.f() * AndroidUtilities.density) / 1.3f;
                float f11 = f10 / 3.0f;
                oyVar.d = f11;
                oyVar.f41265e = f11;
                oyVar.f41262a = Utilities.clamp(li0Var.f40159h0.right - (0.75f * f10), AndroidUtilities.displaySize.x - f10, 0.0f);
                oyVar.f41263b = li0Var.f40159h0.bottom - (f10 / 2.0f);
                return;
            }
            org.telegram.ui.Cells.t1 t1Var = li0Var.M;
            if (t1Var != null && t1Var.isAttachedToWindow() && li0Var.M.getMessageObject() != null && li0Var.M.getMessageObject().getId() == li0Var.N) {
                org.telegram.ui.Cells.t1 t1Var2 = li0Var.M;
                int[] iArr = this.J;
                t1Var2.getLocationOnScreen(iArr);
                oyVar.f41264c = true;
                float f12 = (py.f() * AndroidUtilities.density) / 1.3f;
                float f13 = f12 / 3.0f;
                oyVar.d = f13;
                oyVar.f41265e = f13;
                float f14 = f12 / 2.0f;
                oyVar.f41262a = Utilities.clamp(((ei0Var.getScaleX() * li0Var.M.getTimeX()) + iArr[0]) - f14, AndroidUtilities.displaySize.x - f12, 0.0f);
                oyVar.f41263b = ((ei0Var.getScaleY() * li0Var.M.getTimeY()) + iArr[1]) - f14;
            }
        }
    }
}
