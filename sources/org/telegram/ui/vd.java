package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class vd implements TextView.OnEditorActionListener {
    public final int f38692a;
    public final Object f38693b;
    public final Object f38694c;

    public vd(int i10, Object obj, Object obj2) {
        this.f38692a = i10;
        this.f38693b = obj;
        this.f38694c = obj2;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        s4.c1 T;
        int b10;
        s4.c1 T2;
        int b11;
        switch (this.f38692a) {
            case 0:
                je jeVar = (je) this.f38693b;
                sa1 sa1Var = (sa1) this.f38694c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    rd rdVar = new rd(jeVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.Z = 1;
                    twoStepVerificationActivity.f31878b0 = rdVar;
                    jeVar.Q0.setLoading(true);
                    twoStepVerificationActivity.s0(new sd(jeVar, sa1Var, twoStepVerificationActivity, 1));
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.f38693b;
                ei.u1 u1Var = (ei.u1) this.f38694c;
                if ((i10 != 6 && keyEvent.getKeyCode() != 66) || !a2Var.isShowing()) {
                    return false;
                }
                u1Var.f(a2Var, 0);
                return true;
            case 2:
                org.telegram.ui.Components.sn snVar = (org.telegram.ui.Components.sn) this.f38694c;
                org.telegram.ui.Components.vn vnVar = ((org.telegram.ui.Components.tn) this.f38693b).d;
                wb1 wb1Var = vnVar.f29215s;
                if (i10 == 5) {
                    View F = wb1Var.F(snVar);
                    if (F == null) {
                        T = null;
                    } else {
                        T = wb1Var.T(F);
                    }
                    if (T == null || (b10 = T.b()) == -1) {
                        return true;
                    }
                    int i11 = b10 - vnVar.f29217t0;
                    int i12 = vnVar.M;
                    int i13 = i12 - 1;
                    if (i11 == i13 && i12 < vnVar.J) {
                        vnVar.P();
                        return true;
                    } else if (i11 == i13) {
                        AndroidUtilities.hideKeyboard(snVar.getTextView());
                        return true;
                    } else {
                        s4.c1 K = wb1Var.K(b10 + 1);
                        if (K == null) {
                            return true;
                        }
                        View view = K.f42961a;
                        if (!(view instanceof org.telegram.ui.Cells.d6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.d6) view).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
            default:
                ov0 ov0Var = (ov0) this.f38694c;
                rv0 rv0Var = ((pv0) this.f38693b).d;
                if (i10 == 5) {
                    wb1 wb1Var2 = rv0Var.f37501c;
                    View F2 = wb1Var2.F(ov0Var);
                    if (F2 == null) {
                        T2 = null;
                    } else {
                        T2 = wb1Var2.T(F2);
                    }
                    if (T2 == null || (b11 = T2.b()) == -1) {
                        return true;
                    }
                    int i14 = b11 - rv0Var.f37514n0;
                    int i15 = rv0Var.f37529y;
                    int i16 = i15 - 1;
                    if (i14 == i16 && i15 < rv0Var.f37513n) {
                        rv0Var.f0();
                        return true;
                    } else if (i14 == i16) {
                        AndroidUtilities.hideKeyboard(ov0Var.getTextView());
                        return true;
                    } else {
                        s4.c1 K2 = rv0Var.f37501c.K(b11 + 1);
                        if (K2 == null) {
                            return true;
                        }
                        View view2 = K2.f42961a;
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
