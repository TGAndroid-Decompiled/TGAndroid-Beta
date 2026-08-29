package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class rd implements TextView.OnEditorActionListener {
    public final int f42070a;
    public final Object f42071b;
    public final Object f42072c;

    public rd(int i10, Object obj, Object obj2) {
        this.f42070a = i10;
        this.f42071b = obj;
        this.f42072c = obj2;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        f2.n1 T;
        int b10;
        f2.n1 T2;
        int b11;
        switch (this.f42070a) {
            case 0:
                de deVar = (de) this.f42071b;
                t91 t91Var = (t91) this.f42072c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    nd ndVar = new nd(deVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.V = 1;
                    twoStepVerificationActivity.X = ndVar;
                    deVar.M0.setLoading(true);
                    twoStepVerificationActivity.s0(new od(deVar, t91Var, twoStepVerificationActivity, 1));
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.f42071b;
                org.telegram.ui.Components.u1 u1Var = (org.telegram.ui.Components.u1) this.f42072c;
                if ((i10 != 6 && keyEvent.getKeyCode() != 66) || !c2Var.isShowing()) {
                    return false;
                }
                u1Var.g(c2Var, 0);
                return true;
            case 2:
                org.telegram.ui.Components.ln lnVar = (org.telegram.ui.Components.ln) this.f42072c;
                org.telegram.ui.Components.on onVar = ((org.telegram.ui.Components.mn) this.f42071b).d;
                wa1 wa1Var = onVar.f31427s;
                if (i10 == 5) {
                    View F = wa1Var.F(lnVar);
                    if (F == null) {
                        T = null;
                    } else {
                        T = wa1Var.T(F);
                    }
                    if (T == null || (b10 = T.b()) == -1) {
                        return true;
                    }
                    int i11 = b10 - onVar.f31423p0;
                    int i12 = onVar.I;
                    int i13 = i12 - 1;
                    if (i11 == i13 && i12 < onVar.F) {
                        onVar.P();
                        return true;
                    } else if (i11 == i13) {
                        AndroidUtilities.hideKeyboard(lnVar.getTextView());
                        return true;
                    } else {
                        f2.n1 K = wa1Var.K(b10 + 1);
                        if (K == null) {
                            return true;
                        }
                        View view = K.f6432a;
                        if (!(view instanceof org.telegram.ui.Cells.a6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.a6) view).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
            default:
                su0 su0Var = (su0) this.f42072c;
                vu0 vu0Var = ((tu0) this.f42071b).d;
                if (i10 == 5) {
                    wa1 wa1Var2 = vu0Var.f43756c;
                    View F2 = wa1Var2.F(su0Var);
                    if (F2 == null) {
                        T2 = null;
                    } else {
                        T2 = wa1Var2.T(F2);
                    }
                    if (T2 == null || (b11 = T2.b()) == -1) {
                        return true;
                    }
                    int i14 = b11 - vu0Var.f43766j0;
                    int i15 = vu0Var.f43785y;
                    int i16 = i15 - 1;
                    if (i14 == i16 && i15 < vu0Var.f43769n) {
                        vu0Var.f0();
                        return true;
                    } else if (i14 == i16) {
                        AndroidUtilities.hideKeyboard(su0Var.getTextView());
                        return true;
                    } else {
                        f2.n1 K2 = vu0Var.f43756c.K(b11 + 1);
                        if (K2 == null) {
                            return true;
                        }
                        View view2 = K2.f6432a;
                        if (!(view2 instanceof org.telegram.ui.Cells.a6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.a6) view2).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
        }
    }
}
