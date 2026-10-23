package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class wd implements TextView.OnEditorActionListener {
    public final int f42541a;
    public final Object f42542b;
    public final Object f42543c;

    public wd(int i10, Object obj, Object obj2) {
        this.f42541a = i10;
        this.f42542b = obj;
        this.f42543c = obj2;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        s4.b1 T;
        int b10;
        s4.b1 T2;
        int b11;
        switch (this.f42541a) {
            case 0:
                ie ieVar = (ie) this.f42542b;
                p91 p91Var = (p91) this.f42543c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    sd sdVar = new sd(ieVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.Z = 1;
                    twoStepVerificationActivity.f33943b0 = sdVar;
                    ieVar.Q0.setLoading(true);
                    twoStepVerificationActivity.s0(new td(ieVar, p91Var, twoStepVerificationActivity, 1));
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f42542b;
                gi.q1 q1Var = (gi.q1) this.f42543c;
                if ((i10 != 6 && keyEvent.getKeyCode() != 66) || !b2Var.isShowing()) {
                    return false;
                }
                q1Var.g(b2Var, 0);
                return true;
            case 2:
                org.telegram.ui.Components.bo boVar = (org.telegram.ui.Components.bo) this.f42543c;
                org.telegram.ui.Components.fo foVar = ((org.telegram.ui.Components.co) this.f42542b).d;
                sa1 sa1Var = foVar.f26317s;
                if (i10 == 5) {
                    View F = sa1Var.F(boVar);
                    if (F == null) {
                        T = null;
                    } else {
                        T = sa1Var.T(F);
                    }
                    if (T == null || (b10 = T.b()) == -1) {
                        return true;
                    }
                    int i11 = b10 - foVar.f26319t0;
                    int i12 = foVar.M;
                    int i13 = i12 - 1;
                    if (i11 == i13 && i12 < foVar.J) {
                        foVar.S();
                        return true;
                    } else if (i11 == i13) {
                        AndroidUtilities.hideKeyboard(boVar.getTextView());
                        return true;
                    } else {
                        s4.b1 K = sa1Var.K(b10 + 1);
                        if (K == null) {
                            return true;
                        }
                        View view = K.f45921a;
                        if (!(view instanceof org.telegram.ui.Cells.c6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.c6) view).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
            default:
                cv0 cv0Var = (cv0) this.f42543c;
                fv0 fv0Var = ((dv0) this.f42542b).d;
                if (i10 == 5) {
                    sa1 sa1Var2 = fv0Var.f37106c;
                    View F2 = sa1Var2.F(cv0Var);
                    if (F2 == null) {
                        T2 = null;
                    } else {
                        T2 = sa1Var2.T(F2);
                    }
                    if (T2 == null || (b11 = T2.b()) == -1) {
                        return true;
                    }
                    int i14 = b11 - fv0Var.f37119n0;
                    int i15 = fv0Var.f37134y;
                    int i16 = i15 - 1;
                    if (i14 == i16 && i15 < fv0Var.f37118n) {
                        fv0Var.f0();
                        return true;
                    } else if (i14 == i16) {
                        AndroidUtilities.hideKeyboard(cv0Var.getTextView());
                        return true;
                    } else {
                        s4.b1 K2 = fv0Var.f37106c.K(b11 + 1);
                        if (K2 == null) {
                            return true;
                        }
                        View view2 = K2.f45921a;
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
