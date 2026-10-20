package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class wd implements TextView.OnEditorActionListener {
    public final int f42537a;
    public final Object f42538b;
    public final Object f42539c;

    public wd(int i10, Object obj, Object obj2) {
        this.f42537a = i10;
        this.f42538b = obj;
        this.f42539c = obj2;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        s4.b1 T;
        int b10;
        s4.b1 T2;
        int b11;
        switch (this.f42537a) {
            case 0:
                ie ieVar = (ie) this.f42538b;
                p91 p91Var = (p91) this.f42539c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    sd sdVar = new sd(ieVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.Z = 1;
                    twoStepVerificationActivity.f33938b0 = sdVar;
                    ieVar.Q0.setLoading(true);
                    twoStepVerificationActivity.s0(new td(ieVar, p91Var, twoStepVerificationActivity, 1));
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f42538b;
                gi.q1 q1Var = (gi.q1) this.f42539c;
                if ((i10 != 6 && keyEvent.getKeyCode() != 66) || !b2Var.isShowing()) {
                    return false;
                }
                q1Var.g(b2Var, 0);
                return true;
            case 2:
                org.telegram.ui.Components.bo boVar = (org.telegram.ui.Components.bo) this.f42539c;
                org.telegram.ui.Components.fo foVar = ((org.telegram.ui.Components.co) this.f42538b).d;
                sa1 sa1Var = foVar.f26313s;
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
                    int i11 = b10 - foVar.f26315t0;
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
                        View view = K.f45917a;
                        if (!(view instanceof org.telegram.ui.Cells.c6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.c6) view).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
            default:
                cv0 cv0Var = (cv0) this.f42539c;
                fv0 fv0Var = ((dv0) this.f42538b).d;
                if (i10 == 5) {
                    sa1 sa1Var2 = fv0Var.f37101c;
                    View F2 = sa1Var2.F(cv0Var);
                    if (F2 == null) {
                        T2 = null;
                    } else {
                        T2 = sa1Var2.T(F2);
                    }
                    if (T2 == null || (b11 = T2.b()) == -1) {
                        return true;
                    }
                    int i14 = b11 - fv0Var.f37114n0;
                    int i15 = fv0Var.f37129y;
                    int i16 = i15 - 1;
                    if (i14 == i16 && i15 < fv0Var.f37113n) {
                        fv0Var.f0();
                        return true;
                    } else if (i14 == i16) {
                        AndroidUtilities.hideKeyboard(cv0Var.getTextView());
                        return true;
                    } else {
                        s4.b1 K2 = fv0Var.f37101c.K(b11 + 1);
                        if (K2 == null) {
                            return true;
                        }
                        View view2 = K2.f45917a;
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
