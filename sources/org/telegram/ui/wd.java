package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class wd implements TextView.OnEditorActionListener {
    public final int f42993a;
    public final Object f42994b;
    public final Object f42995c;

    public wd(int i10, Object obj, Object obj2) {
        this.f42993a = i10;
        this.f42994b = obj;
        this.f42995c = obj2;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        s4.b1 T;
        int b10;
        s4.b1 T2;
        int b11;
        switch (this.f42993a) {
            case 0:
                ie ieVar = (ie) this.f42994b;
                t91 t91Var = (t91) this.f42995c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    sd sdVar = new sd(ieVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.Z = 1;
                    twoStepVerificationActivity.f34242b0 = sdVar;
                    ieVar.Q0.setLoading(true);
                    twoStepVerificationActivity.s0(new td(ieVar, t91Var, twoStepVerificationActivity, 1));
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.f42994b;
                gi.q1 q1Var = (gi.q1) this.f42995c;
                if ((i10 != 6 && keyEvent.getKeyCode() != 66) || !c2Var.isShowing()) {
                    return false;
                }
                q1Var.g(c2Var, 0);
                return true;
            case 2:
                org.telegram.ui.Components.zn znVar = (org.telegram.ui.Components.zn) this.f42995c;
                org.telegram.ui.Components.co coVar = ((org.telegram.ui.Components.ao) this.f42994b).d;
                wa1 wa1Var = coVar.f25392s;
                if (i10 == 5) {
                    View F = wa1Var.F(znVar);
                    if (F == null) {
                        T = null;
                    } else {
                        T = wa1Var.T(F);
                    }
                    if (T == null || (b10 = T.b()) == -1) {
                        return true;
                    }
                    int i11 = b10 - coVar.f25394t0;
                    int i12 = coVar.M;
                    int i13 = i12 - 1;
                    if (i11 == i13 && i12 < coVar.J) {
                        coVar.S();
                        return true;
                    } else if (i11 == i13) {
                        AndroidUtilities.hideKeyboard(znVar.getTextView());
                        return true;
                    } else {
                        s4.b1 K = wa1Var.K(b10 + 1);
                        if (K == null) {
                            return true;
                        }
                        View view = K.f46342a;
                        if (!(view instanceof org.telegram.ui.Cells.d6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.d6) view).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
            default:
                ev0 ev0Var = (ev0) this.f42995c;
                hv0 hv0Var = ((fv0) this.f42994b).d;
                if (i10 == 5) {
                    wa1 wa1Var2 = hv0Var.f38034c;
                    View F2 = wa1Var2.F(ev0Var);
                    if (F2 == null) {
                        T2 = null;
                    } else {
                        T2 = wa1Var2.T(F2);
                    }
                    if (T2 == null || (b11 = T2.b()) == -1) {
                        return true;
                    }
                    int i14 = b11 - hv0Var.f38047n0;
                    int i15 = hv0Var.f38062y;
                    int i16 = i15 - 1;
                    if (i14 == i16 && i15 < hv0Var.f38046n) {
                        hv0Var.f0();
                        return true;
                    } else if (i14 == i16) {
                        AndroidUtilities.hideKeyboard(ev0Var.getTextView());
                        return true;
                    } else {
                        s4.b1 K2 = hv0Var.f38034c.K(b11 + 1);
                        if (K2 == null) {
                            return true;
                        }
                        View view2 = K2.f46342a;
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
