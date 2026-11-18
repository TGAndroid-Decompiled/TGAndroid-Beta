package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class tf0 extends nx {
    public final int[] O;
    public final eg0 P;

    public tf0(eg0 eg0Var, sf0 sf0Var, int i7) {
        super(i7, sf0Var);
        this.P = eg0Var;
        this.O = new int[2];
    }

    @Override
    public final void g(mx mxVar) {
        eg0 eg0Var = this.P;
        ag0 ag0Var = eg0Var.K;
        if (mxVar != null) {
            if (eg0Var.f47239l0 != null) {
                mxVar.f49993c = true;
                float f10 = (nx.f() * org.telegram.messenger.g0.f24120p) / 1.3f;
                float f11 = f10 / 3.0f;
                mxVar.d = f11;
                mxVar.f49994e = f11;
                mxVar.f49991a = Utilities.i(eg0Var.f47239l0.right - (0.75f * f10), org.telegram.messenger.g0.f24121q.x - f10, 0.0f);
                mxVar.f49992b = eg0Var.f47239l0.bottom - (f10 / 2.0f);
                return;
            }
            org.telegram.ui.Cells.q1 q1Var = eg0Var.Q;
            if (q1Var != null && q1Var.isAttachedToWindow() && eg0Var.Q.getMessageObject() != null && eg0Var.Q.getMessageObject().e1() == eg0Var.R) {
                org.telegram.ui.Cells.q1 q1Var2 = eg0Var.Q;
                int[] iArr = this.O;
                q1Var2.getLocationOnScreen(iArr);
                mxVar.f49993c = true;
                float f12 = (nx.f() * org.telegram.messenger.g0.f24120p) / 1.3f;
                float f13 = f12 / 3.0f;
                mxVar.d = f13;
                mxVar.f49994e = f13;
                float f14 = f12 / 2.0f;
                mxVar.f49991a = Utilities.i(((ag0Var.getScaleX() * eg0Var.Q.getTimeX()) + iArr[0]) - f14, org.telegram.messenger.g0.f24121q.x - f12, 0.0f);
                mxVar.f49992b = ((ag0Var.getScaleY() * eg0Var.Q.getTimeY()) + iArr[1]) - f14;
            }
        }
    }
}
