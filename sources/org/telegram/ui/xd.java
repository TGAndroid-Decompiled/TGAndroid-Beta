package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class xd implements TextView.OnEditorActionListener {
    public final int f39526a;
    public final Object f39527b;
    public final Object f39528c;

    public xd(int i10, Object obj, Object obj2) {
        this.f39526a = i10;
        this.f39527b = obj;
        this.f39528c = obj2;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        s4.c1 U;
        int b10;
        s4.c1 U2;
        int b11;
        switch (this.f39526a) {
            case 0:
                le leVar = (le) this.f39527b;
                ab1 ab1Var = (ab1) this.f39528c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    td tdVar = new td(leVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.Z = 1;
                    twoStepVerificationActivity.f31604b0 = tdVar;
                    leVar.Q0.setLoading(true);
                    twoStepVerificationActivity.s0(new ud(leVar, ab1Var, twoStepVerificationActivity, 1));
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.f39527b;
                ei.u1 u1Var = (ei.u1) this.f39528c;
                if ((i10 != 6 && keyEvent.getKeyCode() != 66) || !c2Var.isShowing()) {
                    return false;
                }
                u1Var.f(c2Var, 0);
                return true;
            case 2:
                org.telegram.ui.Components.rn rnVar = (org.telegram.ui.Components.rn) this.f39528c;
                org.telegram.ui.Components.un unVar = ((org.telegram.ui.Components.sn) this.f39527b).d;
                fc1 fc1Var = unVar.f28441s;
                if (i10 == 5) {
                    View G = fc1Var.G(rnVar);
                    if (G == null) {
                        U = null;
                    } else {
                        U = fc1Var.U(G);
                    }
                    if (U == null || (b10 = U.b()) == -1) {
                        return true;
                    }
                    int i11 = b10 - unVar.f28443t0;
                    int i12 = unVar.M;
                    int i13 = i12 - 1;
                    if (i11 == i13 && i12 < unVar.J) {
                        unVar.P();
                        return true;
                    } else if (i11 == i13) {
                        AndroidUtilities.hideKeyboard(rnVar.getTextView());
                        return true;
                    } else {
                        s4.c1 L = fc1Var.L(b10 + 1);
                        if (L == null) {
                            return true;
                        }
                        View view = L.f42697a;
                        if (!(view instanceof org.telegram.ui.Cells.c6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.c6) view).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
            default:
                zv0 zv0Var = (zv0) this.f39528c;
                cw0 cw0Var = ((aw0) this.f39527b).d;
                if (i10 == 5) {
                    fc1 fc1Var2 = cw0Var.f32934c;
                    View G2 = fc1Var2.G(zv0Var);
                    if (G2 == null) {
                        U2 = null;
                    } else {
                        U2 = fc1Var2.U(G2);
                    }
                    if (U2 == null || (b11 = U2.b()) == -1) {
                        return true;
                    }
                    int i14 = b11 - cw0Var.f32947n0;
                    int i15 = cw0Var.f32962y;
                    int i16 = i15 - 1;
                    if (i14 == i16 && i15 < cw0Var.f32946n) {
                        cw0Var.f0();
                        return true;
                    } else if (i14 == i16) {
                        AndroidUtilities.hideKeyboard(zv0Var.getTextView());
                        return true;
                    } else {
                        s4.c1 L2 = cw0Var.f32934c.L(b11 + 1);
                        if (L2 == null) {
                            return true;
                        }
                        View view2 = L2.f42697a;
                        if (!(view2 instanceof org.telegram.ui.Cells.c6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.c6) view2).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
        }
    }
}
