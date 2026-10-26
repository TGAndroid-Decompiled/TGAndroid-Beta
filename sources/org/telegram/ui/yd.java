package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class yd implements TextView.OnEditorActionListener {
    public final int f46032a;
    public final Object f46033b;
    public final Object f46034c;

    public yd(int i10, Object obj, Object obj2) {
        this.f46032a = i10;
        this.f46033b = obj;
        this.f46034c = obj2;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        s4.e1 T;
        int b10;
        s4.e1 T2;
        int b11;
        switch (this.f46032a) {
            case 0:
                ke keVar = (ke) this.f46033b;
                w91 w91Var = (w91) this.f46034c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    ud udVar = new ud(keVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.Z = 1;
                    twoStepVerificationActivity.f36305b0 = udVar;
                    keVar.G0.setLoading(true);
                    twoStepVerificationActivity.t0(new vd(keVar, w91Var, twoStepVerificationActivity, 1));
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.f46033b;
                org.telegram.ui.Components.s1 s1Var = (org.telegram.ui.Components.s1) this.f46034c;
                if ((i10 != 6 && keyEvent.getKeyCode() != 66) || !e2Var.isShowing()) {
                    return false;
                }
                s1Var.h(e2Var, 0);
                return true;
            case 2:
                org.telegram.ui.Components.co coVar = (org.telegram.ui.Components.co) this.f46034c;
                org.telegram.ui.Components.go goVar = ((org.telegram.ui.Components.eo) this.f46033b).d;
                za1 za1Var = goVar.f28649s;
                if (i10 == 5) {
                    View F = za1Var.F(coVar);
                    if (F == null) {
                        T = null;
                    } else {
                        T = za1Var.T(F);
                    }
                    if (T == null || (b10 = T.b()) == -1) {
                        return true;
                    }
                    int i11 = b10 - goVar.f28651t0;
                    int i12 = goVar.M;
                    int i13 = i12 - 1;
                    if (i11 == i13 && i12 < goVar.J) {
                        goVar.S();
                        return true;
                    } else if (i11 == i13) {
                        AndroidUtilities.hideKeyboard(coVar.getTextView());
                        return true;
                    } else {
                        s4.e1 K = za1Var.K(b10 + 1);
                        if (K == null) {
                            return true;
                        }
                        View view = K.f47738a;
                        if (!(view instanceof org.telegram.ui.Cells.h6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.h6) view).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
            default:
                jv0 jv0Var = (jv0) this.f46034c;
                mv0 mv0Var = ((kv0) this.f46033b).d;
                if (i10 == 5) {
                    za1 za1Var2 = mv0Var.f41679c;
                    View F2 = za1Var2.F(jv0Var);
                    if (F2 == null) {
                        T2 = null;
                    } else {
                        T2 = za1Var2.T(F2);
                    }
                    if (T2 == null || (b11 = T2.b()) == -1) {
                        return true;
                    }
                    int i14 = b11 - mv0Var.f41692n0;
                    int i15 = mv0Var.f41707y;
                    int i16 = i15 - 1;
                    if (i14 == i16 && i15 < mv0Var.f41691n) {
                        mv0Var.g0();
                        return true;
                    } else if (i14 == i16) {
                        AndroidUtilities.hideKeyboard(jv0Var.getTextView());
                        return true;
                    } else {
                        s4.e1 K2 = mv0Var.f41679c.K(b11 + 1);
                        if (K2 == null) {
                            return true;
                        }
                        View view2 = K2.f47738a;
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
