package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class wd implements TextView.OnEditorActionListener {
    public final int f38798a;
    public final Object f38799b;
    public final Object f38800c;

    public wd(int i10, Object obj, Object obj2) {
        this.f38798a = i10;
        this.f38799b = obj;
        this.f38800c = obj2;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        s4.c1 U;
        int b10;
        s4.c1 U2;
        int b11;
        switch (this.f38798a) {
            case 0:
                ke keVar = (ke) this.f38799b;
                za1 za1Var = (za1) this.f38800c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    sd sdVar = new sd(keVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.Z = 1;
                    twoStepVerificationActivity.f31835b0 = sdVar;
                    keVar.Q0.setLoading(true);
                    twoStepVerificationActivity.s0(new td(keVar, za1Var, twoStepVerificationActivity, 1));
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f38799b;
                ei.u1 u1Var = (ei.u1) this.f38800c;
                if ((i10 != 6 && keyEvent.getKeyCode() != 66) || !b2Var.isShowing()) {
                    return false;
                }
                u1Var.f(b2Var, 0);
                return true;
            case 2:
                org.telegram.ui.Components.rn rnVar = (org.telegram.ui.Components.rn) this.f38800c;
                org.telegram.ui.Components.un unVar = ((org.telegram.ui.Components.sn) this.f38799b).d;
                dc1 dc1Var = unVar.f28765s;
                if (i10 == 5) {
                    View G = dc1Var.G(rnVar);
                    if (G == null) {
                        U = null;
                    } else {
                        U = dc1Var.U(G);
                    }
                    if (U == null || (b10 = U.b()) == -1) {
                        return true;
                    }
                    int i11 = b10 - unVar.f28767t0;
                    int i12 = unVar.M;
                    int i13 = i12 - 1;
                    if (i11 == i13 && i12 < unVar.J) {
                        unVar.P();
                        return true;
                    } else if (i11 == i13) {
                        AndroidUtilities.hideKeyboard(rnVar.getTextView());
                        return true;
                    } else {
                        s4.c1 L = dc1Var.L(b10 + 1);
                        if (L == null) {
                            return true;
                        }
                        View view = L.f42929a;
                        if (!(view instanceof org.telegram.ui.Cells.d6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.d6) view).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
            default:
                xv0 xv0Var = (xv0) this.f38800c;
                aw0 aw0Var = ((yv0) this.f38799b).d;
                if (i10 == 5) {
                    dc1 dc1Var2 = aw0Var.f32165c;
                    View G2 = dc1Var2.G(xv0Var);
                    if (G2 == null) {
                        U2 = null;
                    } else {
                        U2 = dc1Var2.U(G2);
                    }
                    if (U2 == null || (b11 = U2.b()) == -1) {
                        return true;
                    }
                    int i14 = b11 - aw0Var.f32178n0;
                    int i15 = aw0Var.f32193y;
                    int i16 = i15 - 1;
                    if (i14 == i16 && i15 < aw0Var.f32177n) {
                        aw0Var.f0();
                        return true;
                    } else if (i14 == i16) {
                        AndroidUtilities.hideKeyboard(xv0Var.getTextView());
                        return true;
                    } else {
                        s4.c1 L2 = aw0Var.f32165c.L(b11 + 1);
                        if (L2 == null) {
                            return true;
                        }
                        View view2 = L2.f42929a;
                        if (!(view2 instanceof org.telegram.ui.Cells.d6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.d6) view2).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
        }
    }
}
