package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

public final class td implements TextView.OnEditorActionListener {

    public final int f42902a;

    public final Object f42903b;

    public final Object f42904c;

    public td(int i10, Object obj, Object obj2) {
        this.f42902a = i10;
        this.f42903b = obj;
        this.f42904c = obj2;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        int iB;
        int iB2;
        switch (this.f42902a) {
            case 0:
                fe feVar = (fe) this.f42903b;
                q91 q91Var = (q91) this.f42904c;
                if (i10 != 5) {
                    return false;
                }
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                od odVar = new od(feVar, twoStepVerificationActivity, 1);
                twoStepVerificationActivity.V = 1;
                twoStepVerificationActivity.X = odVar;
                feVar.M0.setLoading(true);
                twoStepVerificationActivity.s0(new pd(feVar, q91Var, twoStepVerificationActivity, 1));
                return true;
            case 1:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f42903b;
                nh.p1 p1Var = (nh.p1) this.f42904c;
                if ((i10 != 6 && keyEvent.getKeyCode() != 66) || !b2Var.isShowing()) {
                    return false;
                }
                p1Var.f(b2Var, 0);
                return true;
            case 2:
                org.telegram.ui.Components.gn gnVar = (org.telegram.ui.Components.gn) this.f42903b;
                org.telegram.ui.Components.fn fnVar = (org.telegram.ui.Components.fn) this.f42904c;
                org.telegram.ui.Components.in inVar = gnVar.d;
                ta1 ta1Var = inVar.f29437s;
                if (i10 != 5) {
                    return false;
                }
                View viewF = ta1Var.F(fnVar);
                f2.o1 o1VarT = viewF == null ? null : ta1Var.T(viewF);
                if (o1VarT == null || (iB = o1VarT.b()) == -1) {
                    return true;
                }
                int i11 = iB - inVar.f29433p0;
                int i12 = inVar.I;
                int i13 = i12 - 1;
                if (i11 == i13 && i12 < inVar.F) {
                    inVar.P();
                    return true;
                }
                if (i11 == i13) {
                    AndroidUtilities.hideKeyboard(fnVar.getTextView());
                    return true;
                }
                f2.o1 o1VarK = ta1Var.K(iB + 1);
                if (o1VarK == null) {
                    return true;
                }
                View view = o1VarK.f5789a;
                if (!(view instanceof org.telegram.ui.Cells.z5)) {
                    return true;
                }
                ((org.telegram.ui.Cells.z5) view).getTextView().requestFocus();
                return true;
            default:
                wu0 wu0Var = (wu0) this.f42903b;
                vu0 vu0Var = (vu0) this.f42904c;
                yu0 yu0Var = wu0Var.d;
                if (i10 != 5) {
                    return false;
                }
                ta1 ta1Var2 = yu0Var.f44920c;
                View viewF2 = ta1Var2.F(vu0Var);
                f2.o1 o1VarT2 = viewF2 == null ? null : ta1Var2.T(viewF2);
                if (o1VarT2 == null || (iB2 = o1VarT2.b()) == -1) {
                    return true;
                }
                int i14 = iB2 - yu0Var.f44930j0;
                int i15 = yu0Var.f44949y;
                int i16 = i15 - 1;
                if (i14 == i16 && i15 < yu0Var.f44933n) {
                    yu0Var.f0();
                    return true;
                }
                if (i14 == i16) {
                    AndroidUtilities.hideKeyboard(vu0Var.getTextView());
                    return true;
                }
                f2.o1 o1VarK2 = yu0Var.f44920c.K(iB2 + 1);
                if (o1VarK2 == null) {
                    return true;
                }
                View view2 = o1VarK2.f5789a;
                if (!(view2 instanceof org.telegram.ui.Cells.z5)) {
                    return true;
                }
                ((org.telegram.ui.Cells.z5) view2).getTextView().requestFocus();
                return true;
        }
    }
}
