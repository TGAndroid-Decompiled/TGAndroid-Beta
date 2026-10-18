package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class yd implements TextView.OnEditorActionListener {
    public final int f43411a;
    public final Object f43412b;
    public final Object f43413c;

    public yd(int i10, Object obj, Object obj2) {
        this.f43411a = i10;
        this.f43412b = obj;
        this.f43413c = obj2;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        s4.b1 T;
        int b10;
        s4.b1 T2;
        int b11;
        switch (this.f43411a) {
            case 0:
                ke keVar = (ke) this.f43412b;
                r91 r91Var = (r91) this.f43413c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    ud udVar = new ud(keVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.Z = 1;
                    twoStepVerificationActivity.f33931b0 = udVar;
                    keVar.Q0.setLoading(true);
                    twoStepVerificationActivity.s0(new vd(keVar, r91Var, twoStepVerificationActivity, 1));
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f43412b;
                gi.q1 q1Var = (gi.q1) this.f43413c;
                if ((i10 != 6 && keyEvent.getKeyCode() != 66) || !b2Var.isShowing()) {
                    return false;
                }
                q1Var.g(b2Var, 0);
                return true;
            case 2:
                org.telegram.ui.Components.bo boVar = (org.telegram.ui.Components.bo) this.f43413c;
                org.telegram.ui.Components.fo foVar = ((org.telegram.ui.Components.co) this.f43412b).d;
                ua1 ua1Var = foVar.f26315s;
                if (i10 == 5) {
                    View F = ua1Var.F(boVar);
                    if (F == null) {
                        T = null;
                    } else {
                        T = ua1Var.T(F);
                    }
                    if (T == null || (b10 = T.b()) == -1) {
                        return true;
                    }
                    int i11 = b10 - foVar.f26317t0;
                    int i12 = foVar.M;
                    int i13 = i12 - 1;
                    if (i11 == i13 && i12 < foVar.J) {
                        foVar.S();
                        return true;
                    } else if (i11 == i13) {
                        AndroidUtilities.hideKeyboard(boVar.getTextView());
                        return true;
                    } else {
                        s4.b1 K = ua1Var.K(b10 + 1);
                        if (K == null) {
                            return true;
                        }
                        View view = K.f45958a;
                        if (!(view instanceof org.telegram.ui.Cells.c6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.c6) view).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
            default:
                ev0 ev0Var = (ev0) this.f43413c;
                hv0 hv0Var = ((fv0) this.f43412b).d;
                if (i10 == 5) {
                    ua1 ua1Var2 = hv0Var.f37666c;
                    View F2 = ua1Var2.F(ev0Var);
                    if (F2 == null) {
                        T2 = null;
                    } else {
                        T2 = ua1Var2.T(F2);
                    }
                    if (T2 == null || (b11 = T2.b()) == -1) {
                        return true;
                    }
                    int i14 = b11 - hv0Var.f37679n0;
                    int i15 = hv0Var.f37694y;
                    int i16 = i15 - 1;
                    if (i14 == i16 && i15 < hv0Var.f37678n) {
                        hv0Var.f0();
                        return true;
                    } else if (i14 == i16) {
                        AndroidUtilities.hideKeyboard(ev0Var.getTextView());
                        return true;
                    } else {
                        s4.b1 K2 = hv0Var.f37666c.K(b11 + 1);
                        if (K2 == null) {
                            return true;
                        }
                        View view2 = K2.f45958a;
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
