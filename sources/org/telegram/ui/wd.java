package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class wd implements TextView.OnEditorActionListener {
    public final int f43007a;
    public final Object f43008b;
    public final Object f43009c;

    public wd(int i10, Object obj, Object obj2) {
        this.f43007a = i10;
        this.f43008b = obj;
        this.f43009c = obj2;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        s4.b1 T;
        int b10;
        s4.b1 T2;
        int b11;
        switch (this.f43007a) {
            case 0:
                ie ieVar = (ie) this.f43008b;
                u91 u91Var = (u91) this.f43009c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    sd sdVar = new sd(ieVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.Z = 1;
                    twoStepVerificationActivity.f34240b0 = sdVar;
                    ieVar.Q0.setLoading(true);
                    twoStepVerificationActivity.s0(new td(ieVar, u91Var, twoStepVerificationActivity, 1));
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.f43008b;
                gi.q1 q1Var = (gi.q1) this.f43009c;
                if ((i10 != 6 && keyEvent.getKeyCode() != 66) || !c2Var.isShowing()) {
                    return false;
                }
                q1Var.g(c2Var, 0);
                return true;
            case 2:
                org.telegram.ui.Components.bo boVar = (org.telegram.ui.Components.bo) this.f43009c;
                org.telegram.ui.Components.fo foVar = ((org.telegram.ui.Components.co) this.f43008b).d;
                xa1 xa1Var = foVar.f26420s;
                if (i10 == 5) {
                    View F = xa1Var.F(boVar);
                    if (F == null) {
                        T = null;
                    } else {
                        T = xa1Var.T(F);
                    }
                    if (T == null || (b10 = T.b()) == -1) {
                        return true;
                    }
                    int i11 = b10 - foVar.f26422t0;
                    int i12 = foVar.M;
                    int i13 = i12 - 1;
                    if (i11 == i13 && i12 < foVar.J) {
                        foVar.S();
                        return true;
                    } else if (i11 == i13) {
                        AndroidUtilities.hideKeyboard(boVar.getTextView());
                        return true;
                    } else {
                        s4.b1 K = xa1Var.K(b10 + 1);
                        if (K == null) {
                            return true;
                        }
                        View view = K.f46343a;
                        if (!(view instanceof org.telegram.ui.Cells.d6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.d6) view).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
            default:
                fv0 fv0Var = (fv0) this.f43009c;
                iv0 iv0Var = ((gv0) this.f43008b).d;
                if (i10 == 5) {
                    xa1 xa1Var2 = iv0Var.f38377c;
                    View F2 = xa1Var2.F(fv0Var);
                    if (F2 == null) {
                        T2 = null;
                    } else {
                        T2 = xa1Var2.T(F2);
                    }
                    if (T2 == null || (b11 = T2.b()) == -1) {
                        return true;
                    }
                    int i14 = b11 - iv0Var.f38390n0;
                    int i15 = iv0Var.f38405y;
                    int i16 = i15 - 1;
                    if (i14 == i16 && i15 < iv0Var.f38389n) {
                        iv0Var.f0();
                        return true;
                    } else if (i14 == i16) {
                        AndroidUtilities.hideKeyboard(fv0Var.getTextView());
                        return true;
                    } else {
                        s4.b1 K2 = iv0Var.f38377c.K(b11 + 1);
                        if (K2 == null) {
                            return true;
                        }
                        View view2 = K2.f46343a;
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
