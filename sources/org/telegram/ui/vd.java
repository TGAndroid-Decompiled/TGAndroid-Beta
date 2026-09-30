package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class vd implements TextView.OnEditorActionListener {
    public final int f38781a;
    public final Object f38782b;
    public final Object f38783c;

    public vd(int i10, Object obj, Object obj2) {
        this.f38781a = i10;
        this.f38782b = obj;
        this.f38783c = obj2;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        s4.c1 T;
        int b10;
        s4.c1 T2;
        int b11;
        switch (this.f38781a) {
            case 0:
                je jeVar = (je) this.f38782b;
                sa1 sa1Var = (sa1) this.f38783c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    rd rdVar = new rd(jeVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.Z = 1;
                    twoStepVerificationActivity.f31951b0 = rdVar;
                    jeVar.Q0.setLoading(true);
                    twoStepVerificationActivity.s0(new sd(jeVar, sa1Var, twoStepVerificationActivity, 1));
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.f38782b;
                ei.u1 u1Var = (ei.u1) this.f38783c;
                if ((i10 != 6 && keyEvent.getKeyCode() != 66) || !a2Var.isShowing()) {
                    return false;
                }
                u1Var.f(a2Var, 0);
                return true;
            case 2:
                org.telegram.ui.Components.un unVar = (org.telegram.ui.Components.un) this.f38783c;
                org.telegram.ui.Components.xn xnVar = ((org.telegram.ui.Components.vn) this.f38782b).d;
                wb1 wb1Var = xnVar.f30414s;
                if (i10 == 5) {
                    View F = wb1Var.F(unVar);
                    if (F == null) {
                        T = null;
                    } else {
                        T = wb1Var.T(F);
                    }
                    if (T == null || (b10 = T.b()) == -1) {
                        return true;
                    }
                    int i11 = b10 - xnVar.f30416t0;
                    int i12 = xnVar.M;
                    int i13 = i12 - 1;
                    if (i11 == i13 && i12 < xnVar.J) {
                        xnVar.P();
                        return true;
                    } else if (i11 == i13) {
                        AndroidUtilities.hideKeyboard(unVar.getTextView());
                        return true;
                    } else {
                        s4.c1 K = wb1Var.K(b10 + 1);
                        if (K == null) {
                            return true;
                        }
                        View view = K.f43068a;
                        if (!(view instanceof org.telegram.ui.Cells.d6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.d6) view).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
            default:
                ov0 ov0Var = (ov0) this.f38783c;
                rv0 rv0Var = ((pv0) this.f38782b).d;
                if (i10 == 5) {
                    wb1 wb1Var2 = rv0Var.f37596c;
                    View F2 = wb1Var2.F(ov0Var);
                    if (F2 == null) {
                        T2 = null;
                    } else {
                        T2 = wb1Var2.T(F2);
                    }
                    if (T2 == null || (b11 = T2.b()) == -1) {
                        return true;
                    }
                    int i14 = b11 - rv0Var.f37609n0;
                    int i15 = rv0Var.f37624y;
                    int i16 = i15 - 1;
                    if (i14 == i16 && i15 < rv0Var.f37608n) {
                        rv0Var.f0();
                        return true;
                    } else if (i14 == i16) {
                        AndroidUtilities.hideKeyboard(ov0Var.getTextView());
                        return true;
                    } else {
                        s4.c1 K2 = rv0Var.f37596c.K(b11 + 1);
                        if (K2 == null) {
                            return true;
                        }
                        View view2 = K2.f43068a;
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
