package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class yd implements TextView.OnEditorActionListener {
    public final int f43598a;
    public final Object f43599b;
    public final Object f43600c;

    public yd(int i10, Object obj, Object obj2) {
        this.f43598a = i10;
        this.f43599b = obj;
        this.f43600c = obj2;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        f2.m1 T;
        int b10;
        f2.m1 T2;
        int b11;
        switch (this.f43598a) {
            case 0:
                ke keVar = (ke) this.f43599b;
                na1 na1Var = (na1) this.f43600c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    td tdVar = new td(keVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.W = 1;
                    twoStepVerificationActivity.Y = tdVar;
                    keVar.N0.setLoading(true);
                    twoStepVerificationActivity.s0(new ud(keVar, na1Var, twoStepVerificationActivity, 1));
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f43599b;
                org.telegram.ui.Components.s1 s1Var = (org.telegram.ui.Components.s1) this.f43600c;
                if ((i10 != 6 && keyEvent.getKeyCode() != 66) || !d2Var.isShowing()) {
                    return false;
                }
                s1Var.j(d2Var, 0);
                return true;
            case 2:
                org.telegram.ui.Components.on onVar = (org.telegram.ui.Components.on) this.f43600c;
                org.telegram.ui.Components.rn rnVar = ((org.telegram.ui.Components.pn) this.f43599b).d;
                qb1 qb1Var = rnVar.f30842s;
                if (i10 == 5) {
                    View F = qb1Var.F(onVar);
                    if (F == null) {
                        T = null;
                    } else {
                        T = qb1Var.T(F);
                    }
                    if (T == null || (b10 = T.b()) == -1) {
                        return true;
                    }
                    int i11 = b10 - rnVar.f30839q0;
                    int i12 = rnVar.J;
                    int i13 = i12 - 1;
                    if (i11 == i13 && i12 < rnVar.G) {
                        rnVar.P();
                        return true;
                    } else if (i11 == i13) {
                        AndroidUtilities.hideKeyboard(onVar.getTextView());
                        return true;
                    } else {
                        f2.m1 K = qb1Var.K(b10 + 1);
                        if (K == null) {
                            return true;
                        }
                        View view = K.f5875a;
                        if (!(view instanceof org.telegram.ui.Cells.c6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.c6) view).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
            default:
                jv0 jv0Var = (jv0) this.f43600c;
                mv0 mv0Var = ((kv0) this.f43599b).d;
                if (i10 == 5) {
                    qb1 qb1Var2 = mv0Var.f39093c;
                    View F2 = qb1Var2.F(jv0Var);
                    if (F2 == null) {
                        T2 = null;
                    } else {
                        T2 = qb1Var2.T(F2);
                    }
                    if (T2 == null || (b11 = T2.b()) == -1) {
                        return true;
                    }
                    int i14 = b11 - mv0Var.f39104k0;
                    int i15 = mv0Var.f39122y;
                    int i16 = i15 - 1;
                    if (i14 == i16 && i15 < mv0Var.f39106n) {
                        mv0Var.f0();
                        return true;
                    } else if (i14 == i16) {
                        AndroidUtilities.hideKeyboard(jv0Var.getTextView());
                        return true;
                    } else {
                        f2.m1 K2 = mv0Var.f39093c.K(b11 + 1);
                        if (K2 == null) {
                            return true;
                        }
                        View view2 = K2.f5875a;
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
