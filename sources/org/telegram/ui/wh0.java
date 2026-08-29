package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class wh0 extends ry {
    public final int[] J;
    public final ki0 K;

    public wh0(ki0 ki0Var, vh0 vh0Var, int i10) {
        super(i10, vh0Var);
        this.K = ki0Var;
        this.J = new int[2];
    }

    @Override
    public final void h(qy qyVar) {
        ki0 ki0Var = this.K;
        di0 di0Var = ki0Var.G;
        if (qyVar != null) {
            if (ki0Var.f39884h0 != null) {
                qyVar.f41799c = true;
                float f9 = (ry.f() * AndroidUtilities.density) / 1.3f;
                float f10 = f9 / 3.0f;
                qyVar.d = f10;
                qyVar.f41800e = f10;
                qyVar.f41797a = Utilities.clamp(ki0Var.f39884h0.right - (0.75f * f9), AndroidUtilities.displaySize.x - f9, 0.0f);
                qyVar.f41798b = ki0Var.f39884h0.bottom - (f9 / 2.0f);
                return;
            }
            org.telegram.ui.Cells.s1 s1Var = ki0Var.M;
            if (s1Var != null && s1Var.isAttachedToWindow() && ki0Var.M.getMessageObject() != null && ki0Var.M.getMessageObject().getId() == ki0Var.N) {
                org.telegram.ui.Cells.s1 s1Var2 = ki0Var.M;
                int[] iArr = this.J;
                s1Var2.getLocationOnScreen(iArr);
                qyVar.f41799c = true;
                float f11 = (ry.f() * AndroidUtilities.density) / 1.3f;
                float f12 = f11 / 3.0f;
                qyVar.d = f12;
                qyVar.f41800e = f12;
                float f13 = f11 / 2.0f;
                qyVar.f41797a = Utilities.clamp(((di0Var.getScaleX() * ki0Var.M.getTimeX()) + iArr[0]) - f13, AndroidUtilities.displaySize.x - f11, 0.0f);
                qyVar.f41798b = ((di0Var.getScaleY() * ki0Var.M.getTimeY()) + iArr[1]) - f13;
            }
        }
    }
}
