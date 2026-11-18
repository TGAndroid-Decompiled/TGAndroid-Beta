package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class uf0 extends nx {
    public final int[] O;
    public final fg0 P;

    public uf0(fg0 fg0Var, tf0 tf0Var, int i7) {
        super(i7, tf0Var);
        this.P = fg0Var;
        this.O = new int[2];
    }

    @Override
    public final void g(mx mxVar) {
        fg0 fg0Var = this.P;
        bg0 bg0Var = fg0Var.K;
        if (mxVar != null) {
            if (fg0Var.f47634l0 != null) {
                mxVar.f49967c = true;
                float f10 = (nx.f() * org.telegram.messenger.g0.f24117p) / 1.3f;
                float f11 = f10 / 3.0f;
                mxVar.d = f11;
                mxVar.f49968e = f11;
                mxVar.f49965a = Utilities.i(fg0Var.f47634l0.right - (0.75f * f10), org.telegram.messenger.g0.f24118q.x - f10, 0.0f);
                mxVar.f49966b = fg0Var.f47634l0.bottom - (f10 / 2.0f);
                return;
            }
            org.telegram.ui.Cells.r1 r1Var = fg0Var.Q;
            if (r1Var != null && r1Var.isAttachedToWindow() && fg0Var.Q.getMessageObject() != null && fg0Var.Q.getMessageObject().e1() == fg0Var.R) {
                org.telegram.ui.Cells.r1 r1Var2 = fg0Var.Q;
                int[] iArr = this.O;
                r1Var2.getLocationOnScreen(iArr);
                mxVar.f49967c = true;
                float f12 = (nx.f() * org.telegram.messenger.g0.f24117p) / 1.3f;
                float f13 = f12 / 3.0f;
                mxVar.d = f13;
                mxVar.f49968e = f13;
                float f14 = f12 / 2.0f;
                mxVar.f49965a = Utilities.i(((bg0Var.getScaleX() * fg0Var.Q.getTimeX()) + iArr[0]) - f14, org.telegram.messenger.g0.f24118q.x - f12, 0.0f);
                mxVar.f49966b = ((bg0Var.getScaleY() * fg0Var.Q.getTimeY()) + iArr[1]) - f14;
            }
        }
    }
}
