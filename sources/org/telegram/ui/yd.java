package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class yd implements TextView.OnEditorActionListener {
    public final int f40479a;
    public final Object f40480b;
    public final Object f40481c;

    public yd(int i10, Object obj, Object obj2) {
        this.f40479a = i10;
        this.f40480b = obj;
        this.f40481c = obj2;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        f2.l1 T;
        int b10;
        f2.l1 T2;
        int b11;
        switch (this.f40479a) {
            case 0:
                ke keVar = (ke) this.f40480b;
                ga1 ga1Var = (ga1) this.f40481c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    td tdVar = new td(keVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.W = 1;
                    twoStepVerificationActivity.Y = tdVar;
                    keVar.N0.setLoading(true);
                    twoStepVerificationActivity.s0(new ud(keVar, ga1Var, twoStepVerificationActivity, 1));
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f40480b;
                org.telegram.ui.Components.s1 s1Var = (org.telegram.ui.Components.s1) this.f40481c;
                if ((i10 != 6 && keyEvent.getKeyCode() != 66) || !d2Var.isShowing()) {
                    return false;
                }
                s1Var.i(d2Var, 0);
                return true;
            case 2:
                org.telegram.ui.Components.nn nnVar = (org.telegram.ui.Components.nn) this.f40481c;
                org.telegram.ui.Components.qn qnVar = ((org.telegram.ui.Components.on) this.f40480b).d;
                jb1 jb1Var = qnVar.f28188s;
                if (i10 == 5) {
                    View F = jb1Var.F(nnVar);
                    if (F == null) {
                        T = null;
                    } else {
                        T = jb1Var.T(F);
                    }
                    if (T == null || (b10 = T.b()) == -1) {
                        return true;
                    }
                    int i11 = b10 - qnVar.f28185q0;
                    int i12 = qnVar.J;
                    int i13 = i12 - 1;
                    if (i11 == i13 && i12 < qnVar.G) {
                        qnVar.P();
                        return true;
                    } else if (i11 == i13) {
                        AndroidUtilities.hideKeyboard(nnVar.getTextView());
                        return true;
                    } else {
                        f2.l1 K = jb1Var.K(b10 + 1);
                        if (K == null) {
                            return true;
                        }
                        View view = K.f5785a;
                        if (!(view instanceof org.telegram.ui.Cells.c6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.c6) view).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
            default:
                cv0 cv0Var = (cv0) this.f40481c;
                fv0 fv0Var = ((dv0) this.f40480b).d;
                if (i10 == 5) {
                    jb1 jb1Var2 = fv0Var.f34376c;
                    View F2 = jb1Var2.F(cv0Var);
                    if (F2 == null) {
                        T2 = null;
                    } else {
                        T2 = jb1Var2.T(F2);
                    }
                    if (T2 == null || (b11 = T2.b()) == -1) {
                        return true;
                    }
                    int i14 = b11 - fv0Var.f34386k0;
                    int i15 = fv0Var.f34404y;
                    int i16 = i15 - 1;
                    if (i14 == i16 && i15 < fv0Var.f34388n) {
                        fv0Var.f0();
                        return true;
                    } else if (i14 == i16) {
                        AndroidUtilities.hideKeyboard(cv0Var.getTextView());
                        return true;
                    } else {
                        f2.l1 K2 = fv0Var.f34376c.K(b11 + 1);
                        if (K2 == null) {
                            return true;
                        }
                        View view2 = K2.f5785a;
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
