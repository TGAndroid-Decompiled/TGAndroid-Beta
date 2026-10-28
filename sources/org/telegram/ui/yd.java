package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class yd implements TextView.OnEditorActionListener {
    public final int f45963a;
    public final Object f45964b;
    public final Object f45965c;

    public yd(int i10, Object obj, Object obj2) {
        this.f45963a = i10;
        this.f45964b = obj;
        this.f45965c = obj2;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        s4.e1 T;
        int b10;
        s4.e1 T2;
        int b11;
        switch (this.f45963a) {
            case 0:
                ke keVar = (ke) this.f45964b;
                y91 y91Var = (y91) this.f45965c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    ud udVar = new ud(keVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.Z = 1;
                    twoStepVerificationActivity.f36329b0 = udVar;
                    keVar.G0.setLoading(true);
                    twoStepVerificationActivity.t0(new vd(keVar, y91Var, twoStepVerificationActivity, 1));
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.f45964b;
                org.telegram.ui.Components.s1 s1Var = (org.telegram.ui.Components.s1) this.f45965c;
                if ((i10 != 6 && keyEvent.getKeyCode() != 66) || !e2Var.isShowing()) {
                    return false;
                }
                s1Var.h(e2Var, 0);
                return true;
            case 2:
                org.telegram.ui.Components.co coVar = (org.telegram.ui.Components.co) this.f45965c;
                org.telegram.ui.Components.go goVar = ((org.telegram.ui.Components.eo) this.f45964b).d;
                bb1 bb1Var = goVar.f28696s;
                if (i10 == 5) {
                    View F = bb1Var.F(coVar);
                    if (F == null) {
                        T = null;
                    } else {
                        T = bb1Var.T(F);
                    }
                    if (T == null || (b10 = T.b()) == -1) {
                        return true;
                    }
                    int i11 = b10 - goVar.f28698t0;
                    int i12 = goVar.M;
                    int i13 = i12 - 1;
                    if (i11 == i13 && i12 < goVar.J) {
                        goVar.S();
                        return true;
                    } else if (i11 == i13) {
                        AndroidUtilities.hideKeyboard(coVar.getTextView());
                        return true;
                    } else {
                        s4.e1 K = bb1Var.K(b10 + 1);
                        if (K == null) {
                            return true;
                        }
                        View view = K.f47773a;
                        if (!(view instanceof org.telegram.ui.Cells.h6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.h6) view).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
            default:
                lv0 lv0Var = (lv0) this.f45965c;
                ov0 ov0Var = ((mv0) this.f45964b).d;
                if (i10 == 5) {
                    bb1 bb1Var2 = ov0Var.f42211c;
                    View F2 = bb1Var2.F(lv0Var);
                    if (F2 == null) {
                        T2 = null;
                    } else {
                        T2 = bb1Var2.T(F2);
                    }
                    if (T2 == null || (b11 = T2.b()) == -1) {
                        return true;
                    }
                    int i14 = b11 - ov0Var.f42224n0;
                    int i15 = ov0Var.f42239y;
                    int i16 = i15 - 1;
                    if (i14 == i16 && i15 < ov0Var.f42223n) {
                        ov0Var.g0();
                        return true;
                    } else if (i14 == i16) {
                        AndroidUtilities.hideKeyboard(lv0Var.getTextView());
                        return true;
                    } else {
                        s4.e1 K2 = ov0Var.f42211c.K(b11 + 1);
                        if (K2 == null) {
                            return true;
                        }
                        View view2 = K2.f47773a;
                        if (!(view2 instanceof org.telegram.ui.Cells.h6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.h6) view2).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
        }
    }
}
